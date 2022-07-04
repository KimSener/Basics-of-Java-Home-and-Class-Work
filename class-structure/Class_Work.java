
public class Main {
    public static void main(String[] args) {
        System.out.println(Test.muFanc(10));
        f();
        System.out.println(mainField);
        Singer singer = new Singer();
        singer.name = "2Pac";
        singer.age = 25;
        singer.rating = 5;
        System.out.println(singer.isTooYoung());
        singer.happyBirthday();
        System.out.println(singer.age);

        System.out.println(singer.name);
        Singer singer2 = new Singer();
        singer2.name = "Vasya";
        singer2.age = 7;
        System.out.println(singer2.isTooYoung());
    }
    public static void f(){
        System.out.println("Hello, Main");
    }
    public static int mainField =3;
}
