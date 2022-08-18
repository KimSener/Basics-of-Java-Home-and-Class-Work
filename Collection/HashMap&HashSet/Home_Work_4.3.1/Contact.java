import java.util.Objects;

public class Contact {
    private String name;
    private String phoneNumber;


    public Contact(String name, String phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
    }


    @Override
    public String toString() {
        return name + ":" + phoneNumber;
    }


}


