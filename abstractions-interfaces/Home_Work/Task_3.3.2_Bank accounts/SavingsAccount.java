public class SavingsAccount extends Account {


    public SavingsAccount(int balance) {
        super(balance);

    }

    @Override
    public void pay(int amount) {
        System.out.println("К сожалению платежные операций с данного счета невозможны");
    }

    @Override
    public void transfer(Account account, int amount) {
        if (amount > balance) {
            System.out.println("На вашем" + " " + account + " " + "недостаточно средств пополните" + " " +
                    "баланс или же выберите другую операцию");
        } else {
            System.out.println("Перевод" + " " + amount + "$" + " " + "на" + " " + account + " " + "завершена");
            balance -= amount;
        }


    }

    public String toString() {
        return "Сберегательный счет";
    }

    @Override
    public void addMoney(int amount) {
        System.out.println("Ваш Сберегательный счет пополнен на" + " " + amount + "$");
        balance += amount;

    }

    @Override
    public void showBalance(Account account) {
        System.out.println("Ваш Баланс" + " " + " " + account + " " + balance + "$");
    }
}
