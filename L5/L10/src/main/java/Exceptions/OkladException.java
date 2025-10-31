package Exceptions;

public class OkladException extends Exception {
    public OkladException(double oklad) {
        super("Невозможно создать сотрудника – указан отрицательный оклад: " + oklad);
    }
}
