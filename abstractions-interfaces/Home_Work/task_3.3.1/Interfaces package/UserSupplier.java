package Interfaces;

public class UserSupplier extends User implements Administrator {


    public UserSupplier() {
        super(" Green Land", "Tim", "Norry", "Vanessa", "John");

    }

    @Override
    public void overdueNotification() {
        System.out.print("Администратор" + " " + getNameAdmin() + " " + "часто проверяет просрочку книг у" + " ");
        System.out.print("Читателя" + " " + getNameReader() + " " + " так как книга" + " " + getNameBook() + " " + "была просрочена");
    }

}
