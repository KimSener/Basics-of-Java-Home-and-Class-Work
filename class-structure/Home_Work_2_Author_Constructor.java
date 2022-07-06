public class Author {

    public String name;
    public static int yearPublication;
    public static int yearPublicationTwo;
    public static int yearPublicationThree;
    public String nameWriter;
    public String nameWriterTwo;
    public String nameWriterThree;
    public int cost;

    public String toString() {
        return name + " (" + nameWriter + ") " + " (" + nameWriterTwo + ") " + " (" + nameWriterThree + ") ";
    }

    public int year() {
        return yearPublication;
    }

    public int yearTwo() {
        return yearPublicationTwo;
    }

    public int yearThree() {
        return yearPublicationThree;
    }

    public Author(String name, String nameWriter, int cost) {
        this.name = name;
        yearPublication = 2015;
        this.nameWriter = nameWriter;
        this.cost = cost;
    }

    public Author(String name) {
        this.name = name;
        yearPublicationTwo = 1987;
        this.nameWriterTwo = "George Lukas";
        this.cost = 8000;
    }

    public Author(String name, int cost) {
        this.name = name;
        this.cost = cost;
        this.nameWriterThree = "Tim Hard";
        yearPublicationThree = 2008;
    }

}

