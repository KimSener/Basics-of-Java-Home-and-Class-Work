package Interfaces;

public abstract class User {


    protected String nameBook;
    protected String nameReader;
    protected String nameLibrarian;
    protected String nameAdmin;
    protected String nameSupplier;


    public void setNameBook(String nameBook) {
        this.nameBook = nameBook;
    }

    public String getNameBook() {
        return nameBook;
    }

    public User(String nameBook, String nameReader, String nameLibrarian, String nameAdmin, String nameSupplier) {
        this.nameAdmin = nameAdmin;
        this.nameBook = nameBook;
        this.nameLibrarian = nameLibrarian;
        this.nameReader = nameReader;
        this.nameSupplier = nameSupplier;


    }
}
