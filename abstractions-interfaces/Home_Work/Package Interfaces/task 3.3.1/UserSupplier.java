package Interfaces;

public class UserSupplier extends User implements Reader, Supplier {

    public UserSupplier(String name, String nameBook) {
        super(name, nameBook);
    }


    @Override
    public void takeBook(Reader reader) {
        System.out.println("Поставщик" + " " + getName() + " " + "привез заказную книгу" + " " + getNameBook() + " " +
                "Читателю" + " " + reader + " " + "которую он заказал 2 недели назад");
    }

    @Override
    public void returnBook(Librarian librarian) {
        System.out.println("Поставщик" + " " + getName() + " " + "вернул книгу" + " " + getNameBook() + " " +
                "Библиотекарю" + " " + librarian);
    }

    @Override
    public void bringsBooks(Administrator administrator) {
        System.out.println("Поставщик" + " " + getName() + " " + "принес книгу" + " " + getNameBook() + " " +
                "Администратору" + " " + administrator);
    }

    @Override
    public String getNameBook() {
        return super.getNameBook();
    }
}
