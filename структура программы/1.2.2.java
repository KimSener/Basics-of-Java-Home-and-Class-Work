import java.util.Scanner;
public class Task {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Введите радиус окружности в сантиметрах: ");
    int radius = scanner.nextInt();
    double Area = calculateCircleArea(radius);
    double Length = calculateCircleLength(radius);
    System.out.println("Площадь круга: " + Area +  " см.кв.");
    System.out.println("Длина окружности: " + Length +  " см.");
  }
  public static final double Pi = 3.14;
  public static double calculateCircleArea(int radius) {
    return  Pi * radius * radius;
  }
  public static double calculateCircleLength(int radius) {
    return 2 * Pi * radius;
  }

}
