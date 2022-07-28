public class ProgressiveTaxType extends TaxType {
    @Override
    public double calculateTaxFor(double amount) {
        double value = amount >= 100_000 ? PROGRESSIVETYPETWO : PROGRESSIVETYPEONE;
        return amount * value;
    }
}
