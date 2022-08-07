import java.util.ArrayList;
import java.util.List;

public class Start {
    public static void main(String[] args) {
        List<Animal> listOfAnimal = new ArrayList<>();
        listOfAnimal.add(new Animal(1));
        listOfAnimal.add(new Animal(2));

        List<Dog> listOfDogs = new ArrayList<>();
        listOfDogs.add(new Dog(1));
        listOfDogs.add(new Dog(2));

        test(listOfAnimal);
        test(listOfDogs);
    }

    public static void test(List<? extends Animal> list) { // super будет ссылаться на родительский класс Animal Object
        for (Animal animal : list) {
            animal.eat();
            System.out.println(animal);
        }
    }
}
