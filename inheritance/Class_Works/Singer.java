public class Singer extends Human {

    protected int rating;
    public Singer(String name,int age,int rating) {
      super(name,age);
      this.rating = rating;
    }
    protected int getRating() {
        return rating;
    }
   @Override
    public void happyBirthday() {
        System.out.println("Я пою себе о др!");
        age++;
    }
    @Override
    public String toString() {
        return "[" + rating + "]" + name + " " +
                age  + "годиков";
    }
}
