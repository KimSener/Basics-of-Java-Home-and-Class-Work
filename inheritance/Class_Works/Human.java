public class Human {
    protected String name;
    protected int age;

    public Human(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age < 0 || age > 200) {
            System.out.println("Возраст должен быть от 0 до 200");
            return;
        }
        this.age = age;
    }

    public void happyBirthday() {
        System.out.println("С др!");
        age++;
    }
}