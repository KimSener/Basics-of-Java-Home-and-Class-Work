public class Main {

    public static void main(String[] args) {
        TaxService taxService = new TaxService();


        Bill[] payments = new Bill[]{
                new Bill(12_500, new IncomeTaxType(), taxService),
                new Bill(54_000, new VATaxType(), taxService),
                new Bill(85_555, new ProgressiveTaxType(), taxService),
                new Bill(102_000, new ProgressiveTaxType(), taxService)
        };

        for (Bill bill : payments) {
            bill.payTaxes();
        }

    }


}
