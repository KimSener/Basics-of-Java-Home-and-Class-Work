package Interfaces;

public class User {


    protected String nameBook;
    protected String nameReader;
    protected String nameLibrarian;
    protected String nameAdmin;
    protected String nameSupplier;

    public User(String nameBook, String nameReader, String nameLibrarian, String nameAdmin, String nameSupplier) {
        this.nameAdmin = nameAdmin;
        this.nameBook = nameBook;
        this.nameLibrarian = nameLibrarian;
        this.nameReader = nameReader;
        this.nameSupplier = nameSupplier;


    }

    public String getNameBook() {
        return nameBook;
    }

    public String getNameReader() {
        return nameReader;
    }

    public String getNameLibrarian() {
        return nameLibrarian;
    }

    public String getNameAdmin() {
        return nameAdmin;
    }

    public String getNameSupplier() {
        return nameSupplier;
    }


}
