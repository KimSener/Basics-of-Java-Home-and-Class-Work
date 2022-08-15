package ClassWork;

import java.util.Objects;

public class Products {
    private final String number;
    private final String name;
    private int price;

    public Products(String number, String name, int price) {
        this.number = number;
        this.name = name;
        this.price = price;
    }

    private Products(String number, String name) {
        this.number = number;
        this.name = name;
    }

    public String getNumber() {
        return number;
    }


    private Products(String number, String name) {
        this.number = number;
        this.name = name;
    }


    public String getName() {
        return name;
    }



    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Products)) return false;
        Products products = (Products) o;
        return getName().equals(products.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName());
    }
}
