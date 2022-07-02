import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int year = scanner.nextInt();
        System.out.println(year % 4 == 0 && year % 100 != 0 || year % 400 == 0 ? "В году 365 дней" : "В году 366 дней");
    }
}



