package Interfaces;

public class UserLibrarian extends User implements Reader {


    public UserLibrarian() {
        super("Hallo", "Tom", "Nika", "Marry", "Harry");

    }

    @Override
    public void readerReads() {
        System.out.print("Читатель" + " " + getNameReader() + " " + "сдал прочитанную книгу" + " " + getNameBook() + " ");
        System.out.print("Библиотекарю" + " " + getNameLibrarian());
    }


}
