public class Main {
    public static void main(String[] args) {
        // параметризируем класс типом String
        BoxTwo<String> sample1 = new BoxTwo<>("Нетология");
        System.out.println(sample1);
        // параметризируем класс типом Integer
        BoxTwo<Integer> sample2 = new BoxTwo<>(1);// ошибка тип данных String нужно Integer;
        System.out.println(sample2);
        // параметризируем класс типом Boolean
        BoxTwo<Boolean> sample3 = new BoxTwo<>(Boolean.TRUE);
        System.out.println(sample3);
    }
}
