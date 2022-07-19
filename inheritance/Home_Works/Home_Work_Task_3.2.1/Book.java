
public class Book {
    private final String title;// модификатор final создает переменную для каждого обьекта, а модификатор static final создает переменную только один раз экономяя память
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

