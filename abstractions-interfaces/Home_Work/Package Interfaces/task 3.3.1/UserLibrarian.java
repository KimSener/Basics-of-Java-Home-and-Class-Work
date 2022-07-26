package Interfaces;

public class UserLibrarian extends User implements Supplier, Librarian {

    public UserLibrarian(String name, String nameBook) {
        super(name, nameBook);
    }

    @Override
    public void orderBooks(Supplier supplier) {
        System.out.println("Библиотекарь" + " " + getName() + " " + "заказал книгу" + " " + getNameBook() + " " +
                "у Поставщика" + " " + supplier + ".");
    }

    @Override
    public void bringsBooks(Administrator administrator) {
        System.out.println("Библиотекарь" + " " + getName() + " " + "попросила у Администратора" + " " + administrator +
                " " + "найти книгу" + " " + getNameBook() + ".");
    }
}
