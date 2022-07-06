import java.util.Scanner;

public class Book {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Вас приветствует Электронная библиотека!!!");
        System.out.println("Выберите номер операций в Библиотеке");
        System.out.println("Нажмите цифру 1 для вывода списка книг и года издания:");
        System.out.println("Нажимте цифру 2 для списка Писателей:");
        System.out.println("Нажмите цифру 3 для расчета самой низкую цену на книгу:");
        System.out.println("Нажмите цифру 4 для просмотра количества онлайн пользователей:");
        Author author = new Author("Son of the Mars", "Martin Phillips", 6000);
        Author authorTwo = new Author("Star Wars");
        Author authorThree = new Author("Gods of Wars", 7000);
        User totalOnline = new User("Mandarin@.eu", "Sara", "Finch", 1);
        User totalOnlineTwo = new User("Johnson");
        User totalOnlineThree = new User("Harry", "Potter");
        int onLine = User.totalPeople(1, 1, 1);
        int operation = scanner.nextInt();

        switch (operation) {
            case 1:
                System.out.print("Книга" + " " + author + " ");
                System.out.println(author.year() + " " + "года.");
                System.out.print("Книга" + " " + authorTwo + " ");
                System.out.println(authorTwo.yearTwo() + " " + "года.");
                System.out.print("Книга" + " " + authorThree + " ");
                System.out.println(authorThree.yearThree() + " " + "года.");
                break;
            case 2:
                System.out.println("Писатель" + " " + author.nameWriter);
                System.out.println("Писатель" + " " + authorTwo.nameWriterTwo);
                System.out.println("Писатель" + " " + authorThree.nameWriterThree);
                break;
            case 3:
                if (author.cost < authorTwo.cost) {
                    System.out.println(author.cost);
                } else if (authorTwo.cost < authorThree.cost || authorTwo.cost > authorThree.cost) {
                    System.out.println(authorTwo.cost);
                } else {
                    System.out.println(author.cost > authorThree.cost);
                }
                break;
            case 4:
                System.out.println("Количество пользователей онлайн равно:" + " " + onLine);
                System.out.println(totalOnline);
                System.out.println(totalOnlineTwo);
                System.out.println(totalOnlineThree);
                break;
        }
    }
}
