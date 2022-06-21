import java.util.Scanner;
   public class Main {

      public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
      int year = scanner.nextInt();
      if (year%400==0) {
        System.out.println("В году 366 дней");
      }
      else if(year/100==0) {
        System.out.println("В году 365 дней");
      }
      else if(year/4==0) {
        System.out.println("В году 366 дней");
      }
      else {
          System.out.println("В году 365 дней");
        }
      }
   }



