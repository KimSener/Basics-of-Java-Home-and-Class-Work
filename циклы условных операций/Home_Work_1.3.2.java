import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int total = 0;
        Scanner scanner = new Scanner(System.in);
        while (true) {
            total++;
            System.out.println("Введите год и количество дней в формате yyyy число");
            int year = scanner.nextInt();
            System.out.println("Вы ввели:" + " " + year + " " + "год");
            int day = scanner.nextInt();
            System.out.println("Вы ввели количество дней равное:" + " " + day);
            if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0 && day == 366 || day == 365) {
                System.out.println("Ответ правильный!!!");
            } else {
                System.out.println("Ответ Неправильный!!!");
                System.out.print("Набранно очков:" + " " + total);
                break;
            }
        }
    }
}
