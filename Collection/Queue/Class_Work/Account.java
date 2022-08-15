package CLassWork;

public class Account {
    private  String number;
    private  String name;
    private int money;



    public Account(String number, String name) {
        this.number = number;
        this.name = name;
        this.money = 0;
    }

    public Account(String number, String name, int money) {
        this.number = number;
        this.name = name;
        this.money = money;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    @Override
    public String toString() {
        return name;
    }
}
