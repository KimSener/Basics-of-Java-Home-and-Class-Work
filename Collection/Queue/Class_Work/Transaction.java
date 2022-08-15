package CLassWork;

public class Transaction  {
    public final Account source;
    public final Account destination;
    public final int transferMoney;

    public Transaction(Account source, Account destination, int transferMoney) {
        this.source = source;
        this.destination = destination;
        this.transferMoney = transferMoney;
    }
    public void executs() {
        // TODO;
        if(!checkBalance()) {
            System.out.printf("Недостаточно средств на счету %s (нужно) %d рублей \n",source,transferMoney);
            return;
        };
source.setMoney(
            source.getMoney() - transferMoney
        );
        destination.setMoney (
            source.getMoney() + transferMoney
        );
        System.out.println("Деньги со счета на счет успешно переведены");
    }
    private boolean checkBalance() {
        return  transferMoney > source.getMoney();

        }
    }

