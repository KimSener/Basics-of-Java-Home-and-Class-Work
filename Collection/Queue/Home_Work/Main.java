
import java.util.*;
import java.util.Scanner;

public class Main {
    private final static int MAX_FLOORS = 25;
    private final static int EXIT = 0;
    private final static int WAIT_DOORS_IN_SECONDS = 10;
    private final static int WAIT_MOVE_IN_SECONDS = 5;
    private final static int PREVIOUS_FLOOR = -1;

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Queue<Integer> elevator = new LinkedList<>();
        int totalSeconds = 0;
        while (true) {

            System.out.println("Ожидаю ввода этажа: (для завершения введите 0)");
            int floorNumber = scanner.nextInt();
            if (floorNumber == EXIT) {
                System.out.println("Выход");
                break;
            } else if (floorNumber < EXIT || floorNumber > MAX_FLOORS) {
                System.out.println("Такого этажа нет в доме");
                System.out.println();
                continue;
            }
            elevator.offer(floorNumber);
            totalSeconds += Math.abs(floorNumber - PREVIOUS_FLOOR) * WAIT_MOVE_IN_SECONDS;
            totalSeconds += WAIT_DOORS_IN_SECONDS;

        }
        System.out.println("Лифт прошелся по следующим этажам :");
        printFloors(elevator);
        System.out.println();
        System.out.println("Время затраченное лифтом на маршрут = " + totalSeconds + " с.");

    }

    public static void printFloors(Queue<Integer> elevator) {
        while (!elevator.isEmpty()) {
            int floors = elevator.poll();
            System.out.printf("Этаж %d -> ", floors);
        }
        System.out.print("Этаж 0");
    }


}



