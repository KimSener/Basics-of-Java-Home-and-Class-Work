public class Car extends Transport {

    public Car() {
        super(100);
    }
    @Override
    public  void move(String name, String from,String to) {
        System.out.println(name + " " + "Переехал из" + " " + from + " " + to);
    }
}
