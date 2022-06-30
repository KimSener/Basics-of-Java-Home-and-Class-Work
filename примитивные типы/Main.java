import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        System.out.println("Введите номер операций: ");
        System.out.println("Введите цифру 1 для Сравнения чисел типа double:");
        System.out.println("Введите цифру 2 для Сравнения чисел типа float:");
        System.out.println("Введите цифру 3 для Округления.");
        System.out.println("Введите цифру 4 для Отбрасывания дробной части.");
        Scanner scanner = new Scanner(System.in);
        int numbs = scanner.nextInt();
        switch (numbs) {
            case 1 : {
                System.out.println("Введите первое положительное число формата 1.11d");
                double valOne = scanner.nextDouble();
                System.out.println("Введите второре положительное число формата 1.11d");
                double valTwo = scanner.nextDouble();
                double result = valOne - valTwo;
                if (result == 0) {
                    System.out.println("Числа равны");
                } else if (valOne > result) {
                    System.out.println("Числа не равны!!! Число 1 больше числа 2 на " + result);
                } else if (valOne < result) {
                    System.out.println("Числа не равны!!! Число 1 меньше числа 2 на " + result);
                } else if (valTwo > result) {
                    System.out.println("Числа не равны!!! Число 2 больше числа 1 на " + result);
                } else if (valTwo < result) {
                    System.out.println("Числа не равны!!! Число 2 меньше числа 1 на " + result);
                } else {
                    System.out.println("Числа не равны");
                }
            } break;
            case 2 : {
                System.out.println("Введите первое положительное число формата 1.1f");
                float valSeven = scanner.nextFloat();
                System.out.println("Введите второре положительное число формата 1.1f");
                float valEight = scanner.nextFloat();
                double result2 = valSeven - valEight;
                if (result2 == 0) {
                    System.out.println("Числа равны");
                } else if (valSeven > result2) {
                    System.out.println("Числа не равны!!! Число 1 больше числа 2 на " + result2);
                } else if (valSeven < result2) {
                    System.out.println("Числа не равны!!! Число 1 меньше числа 2 на " + result2);
                } else if (valEight > result2) {
                    System.out.println("Числа не равны!!! Число 2 больше числа 1 на " + result2);
                } else if (valEight < result2) {
                    System.out.println("Числа не равны!!! Число 2 меньше числа 1 на " + result2);
                } else {
                    System.out.println("Числа не равны");
                }
            } break;
            case 3 : {
                System.out.println("Введите первое положительное число формата 1.11d");
                double valThree = scanner.nextDouble();
                System.out.println("Введите второе положительное число формата 1.1f");
                float valFour = scanner.nextFloat();
                System.out.println(Math.round(valThree));
                System.out.println(Math.round(valFour));
            } break;
            case 4 : {
                System.out.println("Введите первое положительное число формата 1.11d");
                double valFive = scanner.nextDouble();
                System.out.println("Введите второе положительное число формата 1.11f");
                float valSix = scanner.nextFloat();
                long b = (long) valFive;
                long d = (long) valSix;
                System.out.println(b);
                System.out.println(d);
            }break;
            default:
                System.out.println("Введите корректный номер операций");
        }
    }
}


