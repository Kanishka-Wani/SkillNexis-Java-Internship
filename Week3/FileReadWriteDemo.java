import java.io.*;

public class FileReadWriteDemo {
    public static void main(String[] args) {
        try {
            FileWriter writer = new FileWriter("sample.txt");
            writer.write("Hello SkillNexis");
            writer.close();

            BufferedReader reader =
                    new BufferedReader(new FileReader("sample.txt"));

            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }

            reader.close();

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
