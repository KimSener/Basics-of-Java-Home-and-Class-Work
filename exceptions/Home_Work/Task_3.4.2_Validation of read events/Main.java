package Task2;

public class Main {
    public static void main(String[] args) throws RuntimeException {

        for (Event event : getMovies()) {
            validEvent(event);
        }
        for (Event event : getTheatres()) {
            validEvent(event);
        }
        System.out.println("Все события корректны");
    }

    public static void validEvent(Event event) throws RuntimeException {
        if (event.getAge() == 0 || event.getReleaseYear() == 0 || event.getTitle() == null) {
            throw new RuntimeException("Неверные события");
        }

    }

    public static Movie[] getMovies() {
        return new Movie[]{
                new Movie("Щелкунчик", 2005, 12),
                // new Movie(null, 2015, 7),
                new Movie("Иллюзия", 2008, 14),


        };
    }

    public static Theatre[] getTheatres() {
        return new Theatre[]{
                new Theatre("Анна Каренина", 2008, 12),
                new Theatre("Щелкунчик", 2000, 24),
                new Theatre("Мастер и Маргарита", 0, 30),

        };
    }
}
