package Task2;

import java.math.BigDecimal;

public class VATaxType extends TaxType {
    @Override
    public BigDecimal calculateTaxFor(BigDecimal amount) {
        BigDecimal bigDecimal = amount.multiply(new BigDecimal(0.18));
        return bigDecimal;
    }
}
