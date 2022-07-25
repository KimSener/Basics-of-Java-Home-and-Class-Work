public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        car.move("Петя", "Спб", "Москву");
        spbToMoscow("Petya",new Car());
    }
    public static void spbToMoscow(String name,Mover mover) {
        mover.move(name,"spb","Moscow");
    }
}
