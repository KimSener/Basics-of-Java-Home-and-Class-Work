import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Masha");
        list.add("Natasha");
        list.add("Petya");
       // System.out.println(list.get(1)); // Petya


        TreeMap<Country,String> map = new TreeMap<>();

        map.put(new Country("Russia",143),"Masha");
        map.put(new Country("USA",360),"Petya");
        map.put(new Country("Ukraine",40),"Kolya");
       for(Country country : map.keySet()) {
           System.out.println(country);
       }
    }
}
