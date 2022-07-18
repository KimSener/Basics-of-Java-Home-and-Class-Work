public class Main {

    public static void main(String[] args) {
        //Создадим первую книгу с тремя жанрами

        Book book1 = new Book("Властелин колец", new Genre[]{new StoryGenre(), new ProseGenre(), new FantasticGenre()});
        //Создадим вторую книгу с двумя жанрами
        Book book2 = new Book("Шерлок Холмс", new Genre[]{new NovelGenre(), new DetectiveGenre()});

        //Создадим объект `BookService` - для фильтрации
        BookService bookService = new BookService();

        //Вызовем метод фильтрации, куда передадим список книг и жанр фильтрации в качестве аргументов
        bookService.filterBookByGenre(new Book[]{book1, book2}, new StoryGenre());
        bookService.filterBookByGenre(new Book[]{book1, book2}, new DetectiveGenre());
        bookService.filterBookByGenre(new Book[]{book1, book2}, new NarrativeGenre());
        bookService.filterBookByGenre(new Book[]{book1, book2}, new VerseGenre());
    }
}

