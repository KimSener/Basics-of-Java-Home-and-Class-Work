import java.util.ArrayDeque;

public class Main {
    public static void main(String[] args) {
        Bank bank = new Bank(
                new ArrayDeque<>()
        );
        Account accountVasya = new Account("1", "Vasya", 5000);
        Account accountPetya = new Account("2", "Petya", 10000);

        addTransactionToBank(bank, accountPetya, accountVasya, 500);
        bank.executesAllTransaction();
    }

    public static void addTransactionToBank(Bank bank, Account source, Account destination, int money) {
        bank.addTransaction(
                new Transaction(
                        source, destination, money
                )
        );
    }
}
