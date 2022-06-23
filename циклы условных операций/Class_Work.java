class Main {

   public static void main(String[] args) {
      int x = 3;
      if (x == 2) {
         System.out.println("Двоика это плохо");
      }
      else if (x==3) {
         System.out.println("Тоже нехорошо");
      }
      else if (x==4) {
         System.out.println("Тоже нехорошо");
      }
      else if(x==5){
         System.out.println("Отлично");
      }
      else {
         System.out.println("Что то странно......");
      }
      System.out.println("Bye!");
      switch (x) {
         case 2:
            System.out.println("Двоика это плохо");
            break;
         case 3:
            System.out.println("Тоже нехорошо");
            break;
         case 4:
            System.out.println("Тоже нехорошо");
            break;
         case 5:
            System.out.println("Отлично");
            break;
         default:
            System.out.println("Что то странное.....");

      }
      int x = 0;
      while(true) {
         x++;
         System.out.println("Hi" + x + "!!");
      }
      while (x<20) {
         x++;
       if (x==10) {
          continue;
       }
       if (x%2==0) {
          System.out.println("Hi" + x + "!!");
       }
      }
   }
}


