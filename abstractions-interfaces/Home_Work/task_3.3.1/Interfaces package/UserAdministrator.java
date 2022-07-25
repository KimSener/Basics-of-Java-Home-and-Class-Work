package Interfaces;

public class UserAdministrator extends User implements Supplier {

    public UserAdministrator() {
        super("Lord of The Rings", "Rob", "Nona", "Viktoriya", "Ali");
    }

    @Override
    public void bringsBookstoreLibrary() {
        System.out.print("Поставщик" + " " + getNameSupplier() + " " + "заказал книгу" + " " + getNameBook() + " ");
        System.out.print("для Администратора" + " " + getNameAdmin());
    }
}

