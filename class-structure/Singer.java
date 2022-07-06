public class Singer {
    public String name;
    public int age;
    public int rating;
    public boolean isTooYoung(){
    return age<18;
}
    public void happyBirthday() {
        age++;
    }
    public String toString() {
        return name;
    }
    public Singer(String name,int age,int rating) {
        this.name = name;
        this.age = age;
        this.rating = rating;
    }
    public Singer(String name, int age) {
        this(name,age,3);
    }
}
