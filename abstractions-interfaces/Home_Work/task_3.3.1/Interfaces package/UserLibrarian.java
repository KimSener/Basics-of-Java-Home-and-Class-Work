package Interfaces;

public class UserLibrarian extends User implements Reader {


    public UserLibrarian() {
        super("Hallo", "Tom", "Nina", "Marry", "Harry");

    }

    @Override
    public void readerReads() {
        System.out.print("Читатель" + " " + nameReader + " " + "сдал прочитанную книгу" + " " + nameBook + " ");
        System.out.print("Библиотекарю" + " " + nameLibrarian);
    }


}
