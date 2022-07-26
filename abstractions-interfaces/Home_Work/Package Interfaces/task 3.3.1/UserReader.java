package Interfaces;

public class UserReader extends User implements Reader, Librarian {

    public UserReader(String name, String nameBook) {
        super(name, nameBook);
    }

    @Override
    public void orderBooks(Supplier supplier) {
        System.out.println("Читатель" + " " + getName() + " " + "заказал книгу" + " " +
                "у Поставщика" + " " + supplier);
    }

    @Override
    public void takeBook(Reader reader) {
        System.out.println("Читатель" + " " + getName() + " " + "читает книгу" + " " + getNameBook() + " " + "в Библиотеке");
    }

    @Override
    public void returnBook(Librarian librarian) {
        System.out.println("Читатель" + " " + getName() + " " + "вернул спустя 2 недели книгу" + " " +
                getNameBook() + " " + "Библиотекарю" + " " + librarian);
    }

    @Override
    public String getNameBook() {
        return super.getNameBook();
    }
}
