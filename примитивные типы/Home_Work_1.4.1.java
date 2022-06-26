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
                double val1 = scanner.nextDouble();
                System.out.println("Введите второре положительное число формата 1.11d");
                double val2 = scanner.nextDouble();
                double result = val1 - val2;
                if (result == 0) {
                    System.out.println("Числа равны");
                } else if (val1 > result) {
                    System.out.println("Числа не равны!!! Число 1 больше числа 2 на " + result);
                } else if (val1 < result) {
                    System.out.println("Числа не равны!!! Число 1 меньше числа 2 на " + result);
                } else if (val2 > result) {
                    System.out.println("Числа не равны!!! Число 2 больше числа 1 на " + result);
                } else if (val2 < result) {
                    System.out.println("Числа не равны!!! Число 2 меньше числа 1 на " + result);
                } else {
                    System.out.println("Числа не равны");
                }
            } break;
            case 2 : {
                System.out.println("Введите первое положительное число формата 1.1f");
                float val7 = scanner.nextFloat();
                System.out.println("Введите второре положительное число формата 1.1f");
                float val8 = scanner.nextFloat();
                double result2 = val7 - val8;
                if (result2 == 0) {
                    System.out.println("Числа равны");
                } else if (val7 > result2) {
                    System.out.println("Числа не равны!!! Число 1 больше числа 2 на " + result2);
                } else if (val7 < result2) {
                    System.out.println("Числа не равны!!! Число 1 меньше числа 2 на " + result2);
                } else if (val8 > result2) {
                    System.out.println("Числа не равны!!! Число 2 больше числа 1 на " + result2);
                } else if (val8 < result2) {
                    System.out.println("Числа не равны!!! Число 2 меньше числа 1 на " + result2);
                } else {
                    System.out.println("Числа не равны");
                }
            } break;
            case 3 : {
                System.out.println("Введите первое положительное число формата 1.11d");
                double val3 = scanner.nextDouble();
                System.out.println("Введите второе положительное число формата 1.1f");
                float val4 = scanner.nextFloat();
                System.out.println(Math.round(val3));
                System.out.println(Math.round(val4));
            } break;
            case 4 : {
                System.out.println("Введите первое положительное число формата 1.11d");
                double val5 = scanner.nextDouble();
                System.out.println("Введите второе положительное число формата 1.11f");
                float val6 = scanner.nextFloat();
                long b = (long) val5;
                long d = (long) val6;
                System.out.println(b);
                System.out.println(d);
            }break;
        }
    }
}



