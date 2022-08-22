
public class Contact {
    private String name;
    private String phoneNumber;


    public Contact(String name, String phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
    }


    public String getPhoneNumber() {
        return phoneNumber;
    }

    @Override
    public String toString() {
        return name + ":" + " " + phoneNumber;
    }


}


