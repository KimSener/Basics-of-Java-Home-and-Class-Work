public class CheckingAccount extends Account {
    public CheckingAccount(int balance) {
        super(balance);
    }

    @Override
    public void pay(int amount) {
        if (amount < balance) {
            System.out.println("Транзакция на сумму" + " " + amount + "$" + " " + "успешна завершена");
            balance -= amount;
        }
    }

    @Override
    public void transfer(Account account, int amount) {
        if (amount > balance) {
            System.out.println("На вашем" + " " + account + " " + "недостаточно средств пополните" + " " +
                    "баланс или же выберите другую операцию");
        } else {
            System.out.println("Перевод" + " " + amount + "$" + " " + "суммы на" + " " + account + " " + "завершена");
            balance -= amount;
        }


    }

    public String toString() {
        return "Расчетный счет";
    }

    @Override
    public void addMoney(int amount) {
        System.out.println("Ваш Расчетный счет пополнен на" + " " + amount + "$");
        balance += amount;

    }

    @Override
    public void showBalance(Account account) {
        System.out.println("Ваш Баланс" + " " + " " + account + " " + balance + "$");
    }
}
