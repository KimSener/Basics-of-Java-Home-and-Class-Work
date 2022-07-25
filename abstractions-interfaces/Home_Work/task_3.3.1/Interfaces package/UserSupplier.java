package Interfaces;

public class UserSupplier extends User implements Administrator {


    public UserSupplier() {
        super(" Hallo", "Tom", "Nina", "Marry", "Harry");

    }

    @Override
    public void overdueNotification() {
        System.out.print("Администратор" + " " + nameAdmin + " " + "часто проверяет просрочку книг у" + " ");
        System.out.print("Читателя" + " " + nameReader + " " + " так как книга" + " " + nameBook + " " + "была просрочена");
    }

}
