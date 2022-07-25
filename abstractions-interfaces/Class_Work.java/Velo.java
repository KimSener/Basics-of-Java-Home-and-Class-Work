public abstract class Velo implements Mover {
    @Override
    public void move(String name, String from, String to) {
        System.out.println(name + " " + "Прокатился из" + " " + from + " " + to);

    }
}