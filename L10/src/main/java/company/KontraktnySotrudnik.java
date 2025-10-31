package company;
import Exceptions.OkladException;

public class KontraktnySotrudnik extends Sotrudnik {
    public KontraktnySotrudnik(String fio, String position, double oklad) throws OkladException {
        super(fio, position, oklad);
    }

    @Override
    public double rasschitatZarplatu() {
        try {
            return getOklad();
        } catch (Exception e) {
            System.out.println("Ошибка расчета зарплаты: " + e.getMessage());
            return 0;
        }
    }
}