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
            long valueOne = Long.parseLong(input);
            System.out.println("Введите второе число");
            long valueTwo = Long.parseLong(scanner.next().trim());
            System.out.println("Выберите операцию abs, div, div_round, pow");
            Operation operation = Operation.valueOf(scanner.next().trim());
            calculate(valueOne, valueTwo, operation);
        }
    }

    public enum Operation {
        div,
        abs,
        div_round,
        pow
    }

    private static void calculate(long valueOne, long valueTwo, Operation operation) {
        switch (operation) {
            case abs:
                System.out.printf("valueOne abs = %s %n", Math.abs(valueOne));
                System.out.printf("valueTwo abs = %s %n", Math.abs(valueTwo));
                break;
            case div:
                System.out.printf("div = %s %n", (double) valueOne / valueTwo);
                break;
            case div_round:
                System.out.printf("round div = %s %n", Math.round((double) valueOne / valueTwo));
                break;
            case pow:
                System.out.printf("pow = %s %n", Math.pow(valueOne, valueTwo));
                break;
        }
        System.out.println("-----------------------------------------------");

    }
}


