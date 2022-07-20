
public class Book {
    private final String title;// переменная константа которые нельзя изменить
    private final Genre[] genres;

    public Book(String title, Genre[] genres) {
        this.title = title;
        this.genres = genres;
    }

    public Genre[] getGenres() {
        return genres;
    }

    public String getTitle() {
        return title;
    }

    public String toString() {
        return this.title;
    }

}

