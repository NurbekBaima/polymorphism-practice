package Task2;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        TaxService taxService = new TaxService();
        Bill[] payments = new Bill[]{
                new Bill(new BigDecimal(100000), new VATaxType(), taxService),
                new Bill(new BigDecimal(50000), new IncomeTaxType(), taxService),
                new Bill(new BigDecimal(9595), new ProgressiveTaxType(), taxService),
                new Bill(new BigDecimal(15165489), new ProgressiveTaxType(), taxService),
        };
        for (Bill bill : payments) {
            bill.payTaxes();
        }
    }
}