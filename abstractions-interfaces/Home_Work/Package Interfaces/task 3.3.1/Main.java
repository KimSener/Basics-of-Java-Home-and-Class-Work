package Interfaces;

public class Main {
    public static void main(String[] args) {

        UserLibrarian librarian = new UserLibrarian("Nina", "Lord of the Rings");
        UserSupplier supplier = new UserSupplier("Mike Taylor", "Harry Potter");
        UserReader reader = new UserReader("Tom", "Hallo");
        UserAdministrator administrator = new UserAdministrator("Marry", "Witcher");

        librarian.orderBooks(supplier);
        librarian.bringsBooks(administrator);

        administrator.overdueNotification(reader);
        administrator.outBook(reader);
        administrator.searchBook(reader);
        administrator.takeBook(reader);
        administrator.returnBook(librarian);

        supplier.bringsBooks(administrator);
        supplier.returnBook(librarian);
        supplier.takeBook(reader);

        reader.orderBooks(supplier);
        reader.takeBook(reader);
        reader.returnBook(librarian);


    }

}
