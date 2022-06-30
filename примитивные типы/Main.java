import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int earnings = 0;
        int spending = 0;

        while (true) {
            System.out.println("Выберите операцию и введите её номер:");
            System.out.println("1. Добавить новый доход");
            System.out.println("2. Добавить новый расход");
            System.out.println("3. Выбрать ситему налогооблажения");

            String input = scanner.nextLine();
            if ("end".equals(input)) {
                break;
            }
            int operation = Integer.parseInt(input);
            switch (operation) {
                case 1: {
                    System.out.println("Введите сумму дохода:");
                    String moneyStr = scanner.nextLine();
                    int money = Integer.parseInt(moneyStr);
                    earnings += money;

                }
                break;
                case 2: {
                    System.out.println("Введите сумму расхода");
                    String moneyStr = scanner.nextLine();
                    int money = Integer.parseInt(moneyStr);
                    spending += money;
                }
                break;
                case 3: {
                    int taxOne = taxEarningsMinusSpending(earnings, spending);
                    int taxTwo = taxEarningsMultiplyPermTax(earnings);
                    int result = taxOne - taxTwo;
                    if (taxOne < taxTwo) {
                        System.out.println("Мы советуем вам: УСН Доходы минус Расходы!!!");
                    } else if (taxOne > taxTwo) {
                        System.out.println("Мы советуем вам: УСН Доходы!!!");

                    }
                    System.out.println("Ваш налог составит:" + " " + taxTwo);
                    System.out.println("Налог на другой системе:" + " " + taxOne);
                    System.out.println("Экономия: " + result);
                }
                break;
                default:
                    System.out.println("Введите корректный номер операций!!! ");
            }
        }
        System.out.println("Программа завершена");
    }

    public static int taxEarningsMinusSpending(int earnings, int spending) {
        int tax = (earnings - spending) * 15 / 100;//0.15%
        return Math.max(tax, 0);//if (tax >= 0) { return tax;} else { return 0;}
    }

    public static int taxEarningsMultiplyPermTax(int earnings) {
        int tax = (6 * earnings) / 100;// 6/100;
        return Math.max(tax, 0);//if (tax >= 0) { return tax;} else { return 0;}
    }
}