public class Main {
    public static void main(String[] args) {
        CheckingAccount checkingAccount = new CheckingAccount(0);
        CreditAccount creditAccount = new CreditAccount(0);
        SavingsAccount savingsAccount = new SavingsAccount(0);

        checkingAccount.addMoney(15_000);
        checkingAccount.pay(2_000);
        checkingAccount.transfer(creditAccount, 1_000);
        checkingAccount.showBalance(checkingAccount);
        System.out.println();
        creditAccount.addMoney(10_500);
        creditAccount.pay(11_500);
        creditAccount.transfer(savingsAccount, 500);
        creditAccount.showBalance(creditAccount);
        System.out.println();
        savingsAccount.addMoney(8_000);
        savingsAccount.pay(4_000);
        savingsAccount.transfer(checkingAccount, 1_000);
        savingsAccount.showBalance(savingsAccount);


    }
}
