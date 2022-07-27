public class CreditAccount extends Account {
    protected int limit = 30_000;


    public CreditAccount(int balance) {
        super(balance);

    }

    @Override
    public void pay(int amount) {
        if (amount + Math.abs(balance) > limit) {
            System.out.println("Вы превысили разрешенный лимит в" + " " + limit + "$" + " " + "на данном счету");
        } else {
            System.out.println("Оплата на сумму" + " " + amount + "$" + " " + "успешна завершена");
            balance -= amount;

        }
    }

    @Override
    public void transfer(Account account, int amount) {
        System.out.println("Транзакция суммы" + " " + amount + "$" + " " + "на" + " " + account + " " + "успешно завершена");
        balance -= amount;

    }

    public String toString() {
        return "Кредитный счет";
    }

    @Override
    public void addMoney(int amount) {
        System.out.println("Ваш Кредитный счет пополнен на сумму" + " " + amount + "$");
        balance += amount;

    }

    @Override
    public void showBalance(Account account) {
        System.out.println("Ваш Баланс" + " " + " " + account + " " + getBalance() + "$");
    }

}
