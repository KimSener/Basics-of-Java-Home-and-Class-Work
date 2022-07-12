import java.util.Scanner;

public class Store {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] basket = new int[3];
        int sumProducts = 0;
        String[] products = {"Хлеб", "Торт", "Сок"};
        int[] prices = {1000, 2000, 3000};
        System.out.println("Список возможных товаров для покупки");
        for (int i = 0; i < products.length; i++) {
            System.out.println((i + 1) + " " + products[i] + " " + prices[i]);
        }

        while (true) {
            System.out.println("Выберите товар и количество шт или введите `end`");
            String inputString = scanner.nextLine();
            if ("end".equals(inputString)) {
                break;
            }
            int productNumber = Integer.parseInt(inputString);
            System.out.println("Введите количество шт:");
            String productCount = scanner.nextLine();
            System.out.println("Вы ввели:" + " ");
            System.out.println(productCount + " " + "шт.");

            int productCountOne = Integer.parseInt(inputString);
            sumProducts = sumProducts + (prices[productNumber - 1] * productCountOne);
            basket[productNumber - 1] += productCountOne;
        }
        for (int i = 0; i < products.length; i++) {
            if (basket[i] > 0) {
                int priceProduct = basket[i] * prices[i];
                System.out.println(" ");
                System.out.printf("%10s %20s %20s %9s\n", "Ваша Корзина", "Наименование продукта", "Стоимость еденицы товара", "Стоимость");
                System.out.println("________________________________________________________________________");
                System.out.printf("%5s %20.5s %20.5s %18.10s\n", (basket[i]), products[i], prices[i], priceProduct);
                System.out.println("________________________________________________________________________");
            }
        }
        System.out.println("Общая стоимость: " + " " + "______________________________" + " " + sumProducts + " " + "сумм.");

    }
}
