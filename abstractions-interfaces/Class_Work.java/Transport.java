public abstract class Transport implements Mover {
    protected int fuel;

    public Transport(int fuel) {
        this.fuel = fuel;
    }

    public abstract void move(String name, String from, String to);


    public void spendFuel(int fuel) {
        this.fuel -= fuel;
    }
}
