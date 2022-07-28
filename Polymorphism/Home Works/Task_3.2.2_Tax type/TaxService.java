class TaxService {

    public void payOut(double amount, TaxType taxType) {
        System.out.format("Уплачен налог в размере %.2f%n", taxType.calculateTaxFor(amount));

    }
}

