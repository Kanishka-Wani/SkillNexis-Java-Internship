import java.util.*;

public class StudentMarks {

    public static void main(String[] args) {

        ArrayList<Integer> marks = new ArrayList<>();

        marks.add(78);
        marks.add(92);
        marks.add(65);
        marks.add(88);
        marks.add(95);

        System.out.println("Marks: " + marks);

        int highest = Collections.max(marks);
        int lowest = Collections.min(marks);

        System.out.println("Highest Marks: " + highest);
        System.out.println("Lowest Marks: " + lowest);
    }
}
