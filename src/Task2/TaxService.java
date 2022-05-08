package Task2;

import java.math.BigDecimal;

public class TaxService {
    public void payOut(BigDecimal TaxAmount) {
        System.out.format("Уплачен налог в размере %.2f%n", TaxAmount);
    }
}