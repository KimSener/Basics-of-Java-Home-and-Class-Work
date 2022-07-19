
public class Book {
    private final String title;   //Т.к. массив – это объект, то final означает, что после присвоения ссылки на объект, 
                                  //уже нельзя ее изменить, но можно изменять состояние объекта.
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

