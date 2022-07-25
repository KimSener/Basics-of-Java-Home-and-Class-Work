public class Ship extends Transport {
    public Ship() {
        super(120);
    }

    @Override
    public void move(String name, String from, String to) {
        System.out.println(name + " " + "Переплыл из" + " " + from + " " + to);
    }
}
