import java.io.*;
import java.util.*;

public class WordCount {

    public static void main(String[] args) {

        try {
            BufferedReader reader =
                    new BufferedReader(
                            new FileReader("input.txt"));

            String line;
            int count = 0;

            while ((line = reader.readLine()) != null) {
                String[] words = line.split("\\s+");
                count += words.length;
            }

            reader.close();

            System.out.println(
                    "Total Words: " + count);

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
