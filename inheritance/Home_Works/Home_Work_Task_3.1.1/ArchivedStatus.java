public class ArchivedStatus {

    public void moveToStatus(Book book, Status requestedStatus) {
        if (book.getStatusBook() == Status.ARCHIVED) {
            if (requestedStatus == Status.AVAILABLE) {
                book.setStatusBook(requestedStatus);
                System.out.println("Перевод книги из статуса ARCHIVED в статус AVAILABLE возможен" + " ");
            } else {
                System.out.println("Перевод книги из статуса ARCHIVED в статус OVERDUED и BORROWED  невозможен");
            }
            System.out.print("Текущий статус: ");

        }
    }



}
