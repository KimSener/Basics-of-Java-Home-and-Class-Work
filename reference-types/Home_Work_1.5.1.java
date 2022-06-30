import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Введите название задачи и время на ее выполнение:");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        int startPos = input.indexOf("начинается в");
        String startTimeString = input.substring(startPos + 12, startPos + 15);
        startTimeString = startTimeString.trim();
        int startTime = Integer.parseInt(startTimeString);
        int endPos = input.indexOf("заканчивается в");
        String endTimeString = input.substring(endPos + 15, endPos + 18);
        endTimeString = endTimeString.trim();
        int endTime = Integer.parseInt(endTimeString);
        int result = endTime - startTime;
        if (result < 0) {
            System.out.println("Формат введенных данных неверный");
        } else if (result > 0) {
            System.out.println(result + " " + "ч.");
        }
    }
}

