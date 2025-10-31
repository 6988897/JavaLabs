package company;
import Exceptions.OkladException;
import Exceptions.PremiyaException;

public class ShtatnySotrudnik extends Sotrudnik {
    private double premiya;

    public ShtatnySotrudnik(String fio, String position, double oklad, double premiya) throws OkladException {
        super(fio, position, oklad);
        this.premiya = premiya;
    }

    public double getPremiya() {
        return premiya;
    }

    public void setPremiya(double premiya) {
        this.premiya = premiya;
    }

    @Override
    public double rasschitatZarplatu() {
        try {
            if (premiya < 0) throw new PremiyaException("Отрицательное значение премии");
            return getOklad() + premiya;
        } catch (PremiyaException e) {
            System.out.println("Ошибка: " + e.getMessage());
            return getOklad();
        } catch (Exception e) {
            System.out.println("Ошибка расчета зарплаты: " + e.getMessage());
            return 0;
        }
    }

}