package Interfaces;

public class UserAdministrator extends User implements Administrator, Reader {


    public UserAdministrator(String name, String nameBook) {
        super(name, nameBook);

    }

    @Override
    public void overdueNotification(Reader reader) {
        System.out.println("Администратор" + " " + getName() + " " + "обнаружила в читательском билете у" + " " +
                reader + " " + "книгу которую не сдал" + " " + reader + ".");
    }

    @Override
    public void outBook(Reader reader) {
        System.out.println("Администратор" + " " + getName() + " " + "отдала книгу" + " " + getNameBook() + " " +
                "Читателю" + " " + reader);
    }

    @Override
    public void searchBook(Reader reader) {
        System.out.println("Читатель" + " " + reader + " " + "попросил у Администратора" + " " + getName() + " " +
                "найти книгу" + " " + getNameBook());
    }

    @Override
    public void takeBook(Reader reader) {
        System.out.println("Читатель" + " " + reader + " " + "взял книгу " + " " + getNameBook() + " " +
                "у Администратора" + " " + getName());
    }

    @Override
    public void returnBook(Librarian librarian) {
        System.out.println("Администратор" + " " + getName() + " " + "приняла возврат книги" + " " + getNameBook() + " " +
                "у Библиотекаря" + " " + librarian);
    }
}
