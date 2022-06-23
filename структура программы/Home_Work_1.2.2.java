

import java.util.Scanner;
public class Main {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Введите радиус окружности в сантиметрах: ");
    int radius = scanner.nextInt();
    double area = calculateCircleArea(radius);
    double length = calculateCircleLength(radius);
    System.out.println("Площадь круга: " + area +  " см.кв.");
    System.out.println("Длина окружности: " + length +  " см.");
  }
  public static final double pi = 3.14;
  public static double calculateCircleArea(int radius) {
    return  pi * radius * radius;
  }
  public static double calculateCircleLength(int radius) {
    return 2 * pi * radius;
  }

}



