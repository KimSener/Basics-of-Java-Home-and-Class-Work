
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PhoneBook phoneBook = new PhoneBook();
        while (true) {

            System.out.println("Программа справочник:");
            System.out.println();

            System.out.println("Создайте группу ");
            String inputGroup = scanner.nextLine();
            phoneBook.addGroup(inputGroup);

            System.out.println("Введите контакт");
            String contactName = scanner.nextLine();

            System.out.println("Введите номер");
            String phoneNumber = scanner.nextLine();

            phoneBook.contactsAdd(new Contact(contactName, phoneNumber), inputGroup);

            System.out.println("Для завершения введите end для продолжения enter");
            String input = scanner.nextLine();
            if ("end".equals(input)) {
                break;
            }
        }
        System.out.println(phoneBook);

    }


}
