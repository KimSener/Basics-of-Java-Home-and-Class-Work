import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int total = 0;
        Scanner scanner = new Scanner(System.in);
        while (true) {
            total++;
            int year = scanner.nextInt();
            int day = scanner.nextInt();
            if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0 && day == 366 || day == 365) {
                System.out.println("Правильно!!!");
            } else {
                System.out.println("Неправильно!!!");
                System.out.print("Набранно очков:" + " " + total);
                break;
            }
        }
    }
}