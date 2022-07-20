import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        while (true) {
            Scanner scanner = new Scanner(System.in);

            Player player = new Player();
            // Как настоящие программисты мы имеем в виду, что исчисление начинается с 0
            System.out.format("У игрока %d слотов с оружием,"
                            + " введите номер, чтобы выстрелить,"
                            + " -1 чтобы выйти%n",
                    player.getSlotsCount()
            );

            System.out.println("____________________________________________________________________________");
            System.out.println("Слот 1 Пистолет!!!");
            System.out.println("Слот 2 Винтовка!!!");
            System.out.println("Слот 3 Граната!!!");
            System.out.println("Слот 4 РПГ Стингер!!!");
            System.out.println("Слот 5 Автоматическая винтовка!!!");
            System.out.println("____________________________________________________________________________");
            System.out.println("Введите номер слота оружия для выстрела из оружия в данном слоте!!!");
            System.out.println("____________________________________________________________________________");

            int slot = scanner.nextInt();
            if (slot == -1) break;
            switch (slot) {
                case 1:
                    System.out.print("Выстрел Пистолета:");
                    player.shotWithWeapon(0);
                    break;
                case 2:
                    System.out.print("Выстрел Винтовки:");
                    player.shotWithWeapon(1);
                    break;
                case 3:
                    System.out.print("Взрыв Гранаты:");
                    player.shotWithWeapon(2);
                    break;
                case 4:
                    System.out.print("Запуск РПГ Стингер:");
                    player.shotWithWeapon(3);
                    break;
                case 5:
                    System.out.print("Выстрел из Автоматической Винтовки:");
                    player.shotWithWeapon(4);
                    break;
                default:
                    System.out.println("Введите корректный номер слота оружия");
                    break;
            }
            System.out.println("____________________________________________________________________________");

            // TODO главный цикл игры:
            // запрашивать номер с клавиатуры
            // с помощью scanner.nextInt(),
            // пока не будет введено -1
        }
        System.out.println("Game over!");
    }
}

