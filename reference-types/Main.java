import java.util.ArrayList;

public class Main {
    public static final int mon = 1;
    public static final int tue = 2;
    public static final int wed = 3;
    public static final int thu = 4;
    public static final int fri = 5;
    public static final int sat = 6;
    public static final int sun = 7;

    public static void main(String[] args) {
        int day = 6;//wed//3;
        System.out.println(isDayOff(day));
        String s = "Hello";
        String s2 = s+"!";
        StringBuilder sb =new StringBuilder();
        sb.append("Hello");
        sb.append("World");
        String s = sb.toString();
        System.out.println(s);
        int x = 5;
        x += 2;
        ArrayList list1 = new ArrayList();
        list1.add("Vasya");
        list1.add("Yulya");
        list1.add("Petya");
        System.out.println(list1);
        ArrayList list2 = list1;
        list2.add("Tanya");
        System.out.println(list1);
        f(x:2);
        isTooBig(list1);

        ArrayList list1 = new ArrayList();
        list1.add("Vasya");
        list1.add("Yulya");
        list1.add("Petya");
        System.out.println(list1);

        ArrayList list2 = new ArrayList();
        list2.add("Vasya");
        list2.add("Yulya");
        list2.add("Petya");
        System.out.println(list2==list1);
        System.out.println(list1.equals(list2));
    }
public static boolean isDayOff(int day) {
        if (day==sat||day==sun) {
            return true;
        }else {
            return false;
        }
}
    public static int f(int x) {
        int x = 2;
        return 2 * x;
    }
    public static boolean isTooBig(ArrayList list) {
        if(list.size() >1_000) {
            return true;
        } else {
            return false;
        }
    }
}
