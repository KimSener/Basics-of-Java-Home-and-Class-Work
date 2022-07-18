public class OverduedStatus {

    public void moveToStatus(Book book, Status requestedStatus) {
        if (book.getStatusBook() == Status.OVERDUED) {
            switch (requestedStatus) {

                case AVAILABLE:
                    book.setStatusBook(requestedStatus);
                    System.out.println("Перевод книги из статуса OVERDUED в статус AVAILABLE возможен" + " ");
                    System.out.print("Текущий статус " + " ");
                    break;
                case ARCHIVED:
                    book.setStatusBook(requestedStatus);
                    System.out.println("Перевод книги из статуса OVERDUED в статус ARCHIVED возможен" + " ");
                    System.out.print("Текущий статус " + " ");
                    break;
                default:
                    System.out.println("Перевод из книги из статуса OVERDUED в статус BORROWED невозможен");
                    System.out.print("Текущий статус: ");
                    break;
            }


        }
    }




}
