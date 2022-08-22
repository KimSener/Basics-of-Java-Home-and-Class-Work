import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        PhoneBook phoneBook = new PhoneBook();
        MissedCalls missedCalls = new MissedCalls();

        while (true) {

            System.out.println("Создайте группу для добавления в нее контактов");
            String inputGroup = scanner.nextLine();
            phoneBook.addGroup(inputGroup);
            System.out.println("Группа" + " " + inputGroup + " " + "создана" + "\n");
            System.out.println("Для создания еще одной группы / нажмите (y) / (n) для выхода /" + " или / (enter) чтобы продолжить /");
            String inputGroupAgain = scanner.nextLine();
            if (inputGroupAgain.equals("y")) {
                continue;
            } else if (inputGroupAgain.equals("n")) {
                break;
            }

            System.out.println("Введите контакт");
            String inputContact = scanner.nextLine();
            System.out.println("Введите номер телефона");
            String phoneNumber = scanner.nextLine();
            Contact contact = new Contact(inputContact, phoneNumber);
            System.out.println("Контакт" + " " + contact + " " + "добавлен в Группу" + " " + inputGroup);

            phoneBook.contactsAdd(new Contact(inputContact, phoneNumber), inputGroup);
            missedCalls.addMissedContact("\n" + phoneNumber);
            System.out.println("\nДля завершения введите end для продолжения enter");
            String inputExit = scanner.nextLine();
            if ("end".equals(inputExit)) {
                break;
            }

        }
        System.out.println(missedCalls.toString(phoneBook) + "\n");
        System.out.println(phoneBook);

    }

}
