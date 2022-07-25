package Interfaces;

public class UserReader extends User implements Librarian {


    public UserReader() {
        super("Super Man", "Tom", "Nika", "Marina", "Paul");


    }

    @Override
    public void ordersBooks() {
        System.out.print("Библиотекарь" + " " + getNameLibrarian() + " " + "заказала книгу" + " " + getNameBook() + " ");
        System.out.print("у Поставщика книг" + " " + nameSupplier + " " + "лично для Читателя" + " " + getNameReader());
    }
}
