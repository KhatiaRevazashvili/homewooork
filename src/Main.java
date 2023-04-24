import java.io.FileNotFoundException;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try {
            Fileess methods = new Fileess();
            methods.readFile();

        } catch (IOException | InvalidNumberException e) {
            e.printStackTrace();
        }

        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        Fileess methods = new Fileess();
        System.out.println("sum of numbers: " + methods.sumNumbers(arr));


    }
}