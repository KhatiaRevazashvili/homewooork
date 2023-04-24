import java.io.*;
public class Fileess {
        public void readFile () throws IOException, InvalidNumberException {
            File file = new File("file.txt");
            FileReader toReadFile = new FileReader(file);
            BufferedReader toRead = new BufferedReader(toReadFile);
            int[] arr = new int[10];
            String line = toRead.readLine();

            while (line != null) {
                int i = 0;
                arr[i] = Integer.parseInt(line);
                if (arr[i] < 0) {
                    throw new InvalidNumberException();
                }
                System.out.println(arr[i]);
                line = toRead.readLine();
            }
            toRead.close();

        }
        public int sumNumbers ( int[] arr){
            int sum = 0;
            for (int i = 0; i < arr.length; i++) {
                sum += arr[i];
            }
        return sum;
    }
}