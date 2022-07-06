public class User {
    public String email;
    public String name;
    public String surname;
    public int totalPeople;
    public int totalPeopleTwo;
    public int totalPeopleThree;


    public User(String email,String name,String surname,int totalPeople) {
        this.email = email;
        this.name = name;
        this.surname = surname;
        this.totalPeople = totalPeople;
    }
    public User(String surname) {
        this.name = "Terry";
        this.surname = surname;
        this.email = "MyJob@.com";
        totalPeopleTwo = 1;
    }
    public User(String name, String surname) {
        this.email = "OxyGen@.kr";
        this.name = name;
        this.surname = surname;
        totalPeopleThree = 1;

    }


    public static int totalPeople(int totalPeople,int totalPeopleTwo,int totalPeopleThree ) {
        return totalPeople + totalPeopleTwo + totalPeopleThree;
    }

    public String toString() {
            return name;
    }


    }

