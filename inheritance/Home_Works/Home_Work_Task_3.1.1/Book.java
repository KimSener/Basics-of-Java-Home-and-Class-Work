public class Book {
    protected String title;
    protected Status status;

    public Book(String title) {
        this.title = title;
        this.status =  Status.AVAILABLE;
    }

    public String getTitle() {

    return title;
}
public void setTitle(String title) {
        this.title = title;
}
    public Status getStatusBook() {
        return status;
    }

    public void setStatusBook(Status status) {
        this.status = status;
    }


}