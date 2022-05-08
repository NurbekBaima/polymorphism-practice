package Task2;

import java.math.BigDecimal;

public class ProgressiveTaxType extends TaxType {
    @Override
    public BigDecimal calculateTaxFor(BigDecimal amount) {
        if (amount.compareTo(new BigDecimal(100000)) <= 0) {
            BigDecimal bigDecimal = amount.multiply(new BigDecimal(0.1));
            return bigDecimal;
        }
        return amount.multiply(new BigDecimal(0.15));
    }
}
