public class BorrowedStatus extends BookMover {
    public void moveToStatus(Book book, Status requestedStatus) {
        if (book.getStatusBook() == Status.BORROWED) {
            switch (requestedStatus) {

                case AVAILABLE:
                    book.setStatusBook(requestedStatus);
                    System.out.println("Перевод книги из статуса BORROWED в статус AVAILABLE возможен" + " ");
                    System.out.print("Текущий статус книги:" + " ");
                    break;
                case ARCHIVED:
                    book.setStatusBook(requestedStatus);
                    System.out.println("Перевод книги из статуса BORROWED в статус ARCHIVED возможен" + " ");
                    System.out.print("Текущий статус книги:" + " ");
                    break;
                case OVERDUED:
                    book.setStatusBook(requestedStatus);
                    System.out.println("Перевод книги из статуса BORROWED в статус OVERDUED возможен" + " ");
                    System.out.print("Текущий статус книги: BORROWED ");
                    break;
            }


        }
    }
}




