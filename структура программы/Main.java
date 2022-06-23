class Main {

   public static void main(String[] args) {
      java.util.Scanner myScanner = new java.util.Scanner(System.in);
      System.out.println("Введите пожалуйста первое слогаемое:");
      int val1 = myScanner.nextInt();
      System.out.println("Введите пожалуйста второе слогаемое:");
      int val2 = myScanner.nextInt();
      int result = sunMethod(val1, val2);
      System.out.println("Сумма двух чисел равна: " + result);
   }
   static int sunMethod(int val1, int val2) {
      return val1 + val2;
   }
}


