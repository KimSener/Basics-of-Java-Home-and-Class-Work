public abstract class TaxType {
    public static final double INCOMETYPE = 0.13;
    public static final double VATYPE = 0.18;
    public static final double PROGRESSIVETYPEONE = 0.10;
    public static final double PROGRESSIVETYPETWO = 0.15;

    public double calculateTaxFor(double amount) {
        // TODO override me!
        return 0.0;
    }
}
