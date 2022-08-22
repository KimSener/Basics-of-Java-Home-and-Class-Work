import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Set<Student> listStudents = new HashSet<>();
        System.out.println("Введите информацию о студенте в формате: \n " +
                "ФИО, номер группы, номер студенческого билета");
        System.out.println("===========================================================================");

        while (true) {

            System.out.println("Введите информацию о студенте" +
                    "(Для завершения работы программы введите \"end\")");
            System.out.println("Введите ФИO студента");
            String inputFullName = scanner.nextLine();
            if ("end".equals(inputFullName)) {
                break;
            }
            System.out.println("Введите номер группы");
            String inputGroup = scanner.nextLine();
            System.out.println("Введите номер ID");
            String inputId = scanner.nextLine();

            Student student = new Student(inputFullName, inputGroup, inputId);

            if (listStudents.contains(student)) {
                System.out.println("Данный студент уже существует");
            } else {
                listStudents.add(student);
            }

        }
        for (Student printList : listStudents) {
            System.out.println(printList);
        }


    }

}



