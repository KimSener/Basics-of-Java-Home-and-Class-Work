import java.util.Scanner;
public class Main {

  public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);
     System.out.print("Введите первое число: ");
     int value1 = scanner.nextInt();
     System.out.print("Введите второе число: ");
     int value2 = scanner.nextInt();
     System.out.print("Введите третье число: ");
     int value3 = scanner.nextInt();
     int result = sum(value1,value2,value3);
     System.out.println("Сумма чисел равна: " + result);
  }
  public static int sum(int value1, int value2, int value3) {
     return value1 + value2 +value3;
  }
}