class Bill {
    protected double amount;
    protected TaxType taxType;
    protected TaxService taxService;

    public Bill(double amount, TaxType taxType, TaxService taxService) {
        this.amount = amount;
        this.taxType = taxType;
        this.taxService = taxService;
    }

    public void payTaxes() {

        taxService.payOut(amount, taxType);

    }
}