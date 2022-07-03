import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите текст:");
        String input = scanner.nextLine();
        String result = extraTrim(input);
        System.out.println(result);
    }

    static String extraTrim(String input) {
        Pattern pattern = Pattern.compile("\\s+");
        Matcher matcher = pattern.matcher(input);
        boolean found = matcher.matches();
        if (found)
            System.out.println("Пробелы не Удалены");
        else
            System.out.println("Пробелы Удалены");
        String strRemoveSpaceStartEnd = input.trim();
        return strRemoveSpaceStartEnd.replaceAll("\\s+", " ");
    }
}