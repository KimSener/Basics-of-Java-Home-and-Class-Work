public class AvailableStatus extends BookMover {

    public void moveToStatus(Book book, Status requestedStatus) {
        if (book.getStatusBook() == Status.AVAILABLE) {
            switch (requestedStatus) {

                case BORROWED:
                    book.setStatusBook(requestedStatus);
                    System.out.println("Перевод книги из статуса AVAILABLE статус BORROWED возможен" + " ");
                    System.out.print("Текущий статус книги:" + " ");

                    break;
                case ARCHIVED:
                    book.setStatusBook(requestedStatus);
                    System.out.println("Перевод книги из статуса AVAILABLE в статус ARCHIVED возможен" + " ");
                    System.out.print("Текущий статус книги:" + " ");
                    break;
                default:
                    System.out.println("Перевод из статуса AVAILABLE в статус OVERDUED невозможен");
                    System.out.print("Текущий статус книги: ");
                    break;

            }


        }
    }
}