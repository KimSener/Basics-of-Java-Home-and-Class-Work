package Interfaces;

public abstract class User {


    protected String name;
    protected String nameBook;

    public User(String name, String nameBook) {
        this.name = name;
        this.nameBook = nameBook;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNameBook() {
        return nameBook;
    }

    @Override
    public String toString() {
        return name;

    }
}
