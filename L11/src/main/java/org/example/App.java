package org.example;
import java.io.*;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;

        while (true) {

            System.out.println("1.");
            System.out.println("2.");
            System.out.println("3.");
            System.out.println("0. Выход");
            System.out.print("Выберите пункт: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1 -> taskAboutMe();
                case 2 -> taskTemperature();
                case 3 -> taskRemoveNegatives();
                case 0 -> {
                    System.out.println("Выход из программы...");
                    return;
                }
                default -> System.out.println("Неверный выбор.");
            }
        }
    }

    private static void taskAboutMe() {
        String fileName = "about_me.txt";
        String myInfo = """
                ФИО: Киселёва Анастасия Сергеевна
                Группа: Т-319
                Специальность: ПОИТ
                """;

        try (FileWriter writer = new FileWriter(fileName)) {
            writer.write(myInfo);
            System.out.println("Файл успешно создан и записан: " + fileName);
        } catch (IOException e) {
            System.out.println("Ошибка при записи в файл: " + e.getMessage());
        }

        File file = new File(fileName);
        System.out.println("\nИнформация о файле:");
        System.out.println("Имя файла: " + file.getName());
        System.out.println("Путь: " + file.getPath());
        System.out.println("Абсолютный путь: " + file.getAbsolutePath());
        System.out.println("Размер: " + file.length() + " байт");
        System.out.println("Файл существует: " + file.exists());
        System.out.println("Можно читать: " + file.canRead());
        System.out.println("Можно записывать: " + file.canWrite());
        System.out.println("Это каталог: " + file.isDirectory());
        System.out.println("Последнее изменение: " + file.lastModified());

        System.out.println("\nСодержимое файла:");
        try (FileReader reader = new FileReader(fileName)) {
            int c;
            while ((c = reader.read()) != -1) {
                System.out.print((char) c);
            }
        } catch (IOException e) {
            System.out.println("Ошибка при чтении файла: " + e.getMessage());
        }
    }

    private static void taskTemperature() {
        Scanner sc = new Scanner(System.in);
        String fileName = "temperature.txt";

        try (FileWriter writer = new FileWriter(fileName)) {
            System.out.println("Введите 15 вещественных значений температуры (через Enter):");
            for (int i = 1; i <= 15; i++) {
                System.out.print(i + ") ");
                String input = sc.nextLine().trim().replace(',', '.');
                writer.write(input + System.lineSeparator());
            }
            writer.flush();
            System.out.println("Температуры записаны в файл " + fileName);
        } catch (IOException e) {
            System.out.println("Ошибка при записи файла: " + e.getMessage());
            return;
        }

        System.out.println("\nСодержимое файла:");
        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("Ошибка при чтении файла: " + e.getMessage());
        }

        double sum = 0;
        int count = 0;

        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = br.readLine()) != null) {
                line = line.trim().replace(',', '.');
                if (line.isEmpty()) continue;
                try {
                    double value = Double.parseDouble(line);
                    sum += value;
                    count++;
                } catch (NumberFormatException e) {
                    System.out.println("Пропущено некорректное значение: " + line);
                }
            }
        } catch (IOException e) {
            System.out.println("Ошибка при чтении файла: " + e.getMessage());
            return;
        }

        if (count > 0) {
            double avg = sum / count;
            System.out.printf("Средняя температура: %.2f°C%n", avg);
        } else {
            System.out.println("Файл пуст или содержит неверные данные.");
        }
    }

    private static void taskRemoveNegatives() {
        Scanner sc = new Scanner(System.in);
        String inputFile = "numbers.txt";
        String outputFile = "numbers_positive.txt";

        try (FileWriter writer = new FileWriter(inputFile)) {
            System.out.print("Введите количество чисел: ");
            int n = sc.nextInt();
            System.out.println("Введите " + n + " целых чисел (через Enter):");
            for (int i = 1; i <= n; i++) {
                System.out.print(i + ") ");
                writer.write(sc.nextInt() + System.lineSeparator());
            }
            writer.flush();
            System.out.println("Числа записаны в файл " + inputFile);
        } catch (IOException e) {
            System.out.println("Ошибка при записи: " + e.getMessage());
            return;
        }

        try (BufferedReader reader = new BufferedReader(new FileReader(inputFile));
             FileWriter writer = new FileWriter(outputFile)) {

            String line;
            int removed = 0;
            while ((line = reader.readLine()) != null) {
                line = line.trim();
                if (line.isEmpty()) continue;
                try {
                    int number = Integer.parseInt(line);
                    if (number >= 0) {
                        writer.write(number + System.lineSeparator());
                    } else {
                        removed++;
                    }
                } catch (NumberFormatException e) {
                    System.out.println("Некорректное значение: " + line);
                }
            }
            writer.flush();

            System.out.println("Новый файл создан: " + outputFile);
            System.out.println("Удалено отрицательных чисел: " + removed);

        } catch (IOException e) {
            System.out.println("Ошибка при обработке файла: " + e.getMessage());
        }

        System.out.println("\nСодержимое нового файла:");
        try (BufferedReader br = new BufferedReader(new FileReader(outputFile))) {
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("Ошибка при чтении результата: " + e.getMessage());
        }
    }
}
