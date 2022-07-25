package Interfaces;

public class UserAdministrator extends User implements Supplier {


    public UserAdministrator() {
        super("Lord of the Rings", "Tom", "Nina", "Marry", "Harry");
    }

    @Override
    public void bringsBookstoreLibrary() {
        System.out.print("Поставщик" + " " + nameSupplier + " " + "заказал книгу" + " " + nameBook + " ");
        System.out.print("для Администратора" + " " + nameAdmin);
    }
}
