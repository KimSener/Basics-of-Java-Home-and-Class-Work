import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Storage storageOne = new Storage("first", "street Worlds 17 ");
        Storage storageTwo = new Storage("second", "street Pushkin 23 ");


        Products milk = new Products("123", "Paris", 80);
        Products tea = new Products("456", "Green", 150);
        Products potato = new Products("789", "Crazy_Potato", 20);


        Map<Products, Integer> productMap1 = new HashMap<>();
        productMap1.put(milk, 100);
        productMap1.put(tea, 200);


        Map<Products, Integer> productMap2 = new HashMap<>();
        productMap2.put(potato, 300);
        productMap2.put(tea, 500);

        Map<Storage, Map<Products, Integer>> storageMap = new HashMap<>();
        storageMap.put(storageOne, productMap1);
        storageMap.put(storageTwo, productMap2);

        displayAll(storageMap);
        System.out.println();
        searchProduct(storageMap, "123", );

    }

    private static void searchProduct(Map<Storage, Map<Products, Integer>> storageMap, String productNumber, String storageName) {
        Map<Products, Integer> productMap = storageMap.get(new Storage(storageName));
        if (productMap != null) {
            Integer amount = productMap.get(new Products(productNumber));
            if (amount != null) {
                System.out.println(" На складе " + storageName + " найдено " +
                        amount + "единиц товара");
            }
        }
    }

    private static void displayAll(Map<Storage, Map<Products, Integer>> storageMap) {
        for (Map.Entry<Storage, Map<Products, Integer>> storageMapEntry : storageMap.entrySet()) {
            for (Map.Entry<Products, Integer> productsEntry : storageMapEntry.getValue().entrySet()) {
                System.out.println(" На складе " + storageMapEntry.getKey().getName() + " Найдено " +
                        productsEntry.getValue() + " единиц товара " + productsEntry.getKey().getName());
            }
            System.out.println("___________________________________________");

        }

    }
}
