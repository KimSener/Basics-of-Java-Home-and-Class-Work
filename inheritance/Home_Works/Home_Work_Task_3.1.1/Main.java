public class Main {
    public static void main(String[] args) {
        Book book = new Book("The Lord of the Rings");
        book.setTitle("Star Wars");
        System.out.println(book.getTitle());

        AvailableStatus availableStatus = new AvailableStatus();
        BorrowedStatus borrowedStatus = new BorrowedStatus();
        ArchivedStatus archivedStatus = new ArchivedStatus();
        OverduedStatus overduedStatus = new OverduedStatus();


        availableStatus.moveToStatus(book, Status.BORROWED);
        System.out.println(book.getStatusBook());
        borrowedStatus.moveToStatus(book, Status.ARCHIVED);
        System.out.println(book.getStatusBook());
        archivedStatus.moveToStatus(book, Status.AVAILABLE);
        System.out.println(book.getStatusBook());
        overduedStatus.moveToStatus(book, Status.OVERDUED);
        System.out.println(book.getStatusBook());
    }

}
