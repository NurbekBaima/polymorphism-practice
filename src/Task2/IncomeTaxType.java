package Task2;

import java.math.BigDecimal;

public class IncomeTaxType extends TaxType {
    @Override
    public BigDecimal calculateTaxFor(BigDecimal amount) {
        BigDecimal bigDecimal = amount.multiply(new BigDecimal(0.13));
        return bigDecimal;
    }
}
