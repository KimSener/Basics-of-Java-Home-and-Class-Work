import java.util.*;
import java.util.Scanner;

public class Main {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        List<String> noteBooks = new ArrayList<>();
        while (true) {
            System.out.println("Выберите действие:\n" + "1. Добавить задачу\n" +
                    "2. Вывести список задач\n" + "3. Удалить задачу\n" + "0. Выход\n");
            int operation = scanner.nextInt();
            if (operation == 0) {
                break;
            }
            switch (operation) {
                case 1:
                    addTask(noteBooks);
                    System.out.println("Задача добавлена");
                    System.out.println();
                    break;
                case 2:
                    printTasks(noteBooks);
                    System.out.println("Все текущие задачи");
                    System.out.println();
                    break;
                case 3:
                    deleteTask(noteBooks);
                    System.out.println("Задача удалена");
                    System.out.println();
                    break;
                default:
                    System.out.println("Введите корректный номер операций из списка");
                    System.out.println();
            }

        }

    }


    public static void addTask(List<String> noteBooks) {
        System.out.println("Введите задачу для планирования:");
        String inputTask = scanner.next();
        noteBooks.add(inputTask);

    }

    public static void deleteTask(List<String> noteBooks) {
        printTasks(noteBooks);
        int numberTasks = scanner.nextInt();
        noteBooks.remove(numberTasks - 1);

    }

    public static void printTasks(List<String> noteBooks) {
        for (int i = 0; i < noteBooks.size(); i++) {
            System.out.println(i + 1 + " " + noteBooks.get(i));
        }
    }

}
