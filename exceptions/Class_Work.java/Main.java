//import java.io.File;

import java.io.FileInputStream;
//import java.io.FileNotFoundException;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try {
            readFile();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    //        File file = new File("file.txt");
//        int value;
//
//        try (FileInputStream fis = new FileInputStream(file)) {
//
//            while ((value = fis.read()) != -1) {
//                System.out.println(value);
//            }
//        } catch (FileNotFoundException exception) {
//            System.out.println("Произошла ошибка файл не найден");
//        } catch (IOException exception) {
//            System.out.println("Произошла ошибка ввода - вывода");
//        }
//    }
    private static void readFile() throws IOException {

        final FileInputStream fileInputStream = new FileInputStream("file.txt");
        int value;
        while ((value = fileInputStream.read()) != -1) {
            System.out.println(value);
        }
    }
}
