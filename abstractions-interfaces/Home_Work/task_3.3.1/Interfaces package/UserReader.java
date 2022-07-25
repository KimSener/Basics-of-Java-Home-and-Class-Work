package Interfaces;

public class UserReader extends User implements Librarian {


    public UserReader() {
        super("Super Man", "Tom", "Nina", "Marry", "Harry");


    }

    @Override
    public void ordersBooks() {
        System.out.print("Библиотекарь" + " " + nameLibrarian + " " + "заказала книгу" + " " + nameBook + " ");
        System.out.print("у Поставщика книг" + " " + nameSupplier + " " + "лично для Читателя" + " " + nameReader);
    }
}
