import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Введите первое число (для выхода введите end)");
            String input = scanner.next().trim();
            if ("end".equals(input)) {
                System.out.println("Программа завершена!!!");
                break;
            }
            long value1 = Long.parseLong(input);
            System.out.println("Введите второе число");
            long value2 = Long.parseLong(scanner.next().trim());
            System.out.println("Выберите операцию abs, div, div_round, pow");
            Operation operation = Operation.valueOf(scanner.next().trim());
            calculate(value1, value2, operation);
        }
    }

    public enum Operation {
        div,
        abs,
        div_round,
        pow
    }

    private static void calculate(long value1, long value2, Operation operation) {
        switch (operation) {
            case abs:
                System.out.printf("value1 abs = %s %n", Math.abs(value1));
                System.out.printf("value2 abs = %s %n", Math.abs(value2));
                break;
            case div:
                System.out.printf("div = %s %n", (double) value1 / value2);
                break;
            case div_round:
                System.out.printf("round div = %s %n", Math.round((double) value1 / value2));
                break;
            case pow:
                System.out.printf("pow = %s %n", Math.pow(value1, value2));
                break;
        }
        System.out.println("-----------------------------------------------");

    }
}


