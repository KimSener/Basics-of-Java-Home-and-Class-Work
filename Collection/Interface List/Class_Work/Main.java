import java.util.*;

public class Main {
    public static void main(String[] args) {
        Fruit orangeFruit = new Fruit("Orange", 150);
        List<Fruit> fruitsArray = new ArrayList<>();
        List<Fruit> fruitsLinked = new LinkedList<>();
        addFruitToCollections(new Fruit("Apple", 300), fruitsArray, fruitsLinked);
        addFruitToCollections(orangeFruit, fruitsArray, fruitsLinked);
        addFruitToCollections(new Fruit("Banana", 150), fruitsArray, fruitsLinked);
        fruitsArray.remove(orangeFruit);
        System.out.println("Все фрукты ArrayList");
        print(fruitsArray);
        System.out.println("Все фрукты LinkedList");
        print(fruitsLinked);
        System.out.println("Индекс Апельсина в коллекций" + "\n" + fruitsLinked.indexOf(orangeFruit));
    }

    private static void addFruitToCollections(Fruit fruit, List<Fruit> list1, List<Fruit> list2) {
        list1.add(fruit);
        list2.add(fruit);

    }

    private static void print(Collection<Fruit> list) {
        for (Fruit fruit : list) {
            System.out.println(fruit);

        }

    }

}
