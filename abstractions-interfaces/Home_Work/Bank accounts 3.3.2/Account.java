public abstract class Account implements Balances {
    protected int balance;

    public Account(int balance) {
        this.balance = balance;
    }

    public void pay(int amount) {

    }

    public void transfer(Account account, int amount) {

    }

    public void addMoney(int amount) {

    }

    public int getBalance() {
        return balance;
    }

}
