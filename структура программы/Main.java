import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        int valueOne = scanner.nextInt();
        System.out.print("Введите второе число: ");
        int valueTwo = scanner.nextInt();
        System.out.print("Введите третье число: ");
        int valueThree = scanner.nextInt();
        int result = sum(valueOne,valueTwo,valueThree);
        System.out.println("Сумма чисел равна: " + result);
    }
    public static int sum(int valueOne, int valueTwo, int valueThree) {
        return valueOne + valueTwo +valueThree;
    }
}