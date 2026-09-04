import java.io.*;
import java.util.*;

public class WordFrequency {

    public static void main(String[] args) {

        HashMap<String, Integer> map = new HashMap<>();

        try {
            BufferedReader reader =
                    new BufferedReader(
                            new FileReader("input.txt"));

            String line;

            while ((line = reader.readLine()) != null) {

                String[] words =
                        line.toLowerCase().split("\\s+");

                for (String word : words) {
                    map.put(word,
                            map.getOrDefault(word, 0) + 1);
                }
            }

            reader.close();

            BufferedWriter writer =
                    new BufferedWriter(
                            new FileWriter("output.txt"));

            for (Map.Entry<String, Integer> entry :
                    map.entrySet()) {

                writer.write(entry.getKey()
                        + " : "
                        + entry.getValue());

                writer.newLine();
            }

            writer.close();

            System.out.println("Word frequency written to output.txt");

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
