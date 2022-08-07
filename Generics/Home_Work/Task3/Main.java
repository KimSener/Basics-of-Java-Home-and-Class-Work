package hometask;

import hometask.fruitBox.Apple;
import hometask.fruitBox.Banana;
import hometask.vegetableBox.Cabbage;
import hometask.vegetableBox.Onions;
import hometask.vegetableBox.Potato;

public class Main {
    public static void main(String[] args) {
        System.out.println("Box Fruit______________________________________________________________");

        BoxFruit<String, Fruit> fruitBoxFruit = new BoxFruit<>("fruit", new Fruit());
        fruitBoxFruit.getObj().printClass();

        BoxFruit<String, Banana> bananaBoxFruit = new BoxFruit<>("banana", new Banana());
        bananaBoxFruit.getObj().printClass();

        BoxFruit<String, Apple> appleBoxFruit = new BoxFruit<>("apple", new Apple());
        appleBoxFruit.getObj().printClass();

        System.out.println("Box Vegetable__________________________________________________________");

        VegetableBox<String, Vegetable> vegetableBox = new VegetableBox<>("vegetable", new Vegetable());
        vegetableBox.getObj().printClass();

        VegetableBox<String, Cabbage> cabbageBox = new VegetableBox<>("cabbage", new Cabbage());
        cabbageBox.getObj().printClass();

        VegetableBox<String, Potato> potatoBox = new VegetableBox<>("potato", new Potato());
        potatoBox.getObj().printClass();

        VegetableBox<String, Onions> onionsBox = new VegetableBox<>("onions", new Onions());
        onionsBox.getObj().printClass();


    }
}
