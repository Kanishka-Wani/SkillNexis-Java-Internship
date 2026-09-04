import java.util.HashMap;

public class StudentMap {

    public static void main(String[] args) {

        HashMap<Integer, String> students = new HashMap<>();

        students.put(101, "Kanishka");
        students.put(102, "Rahul");
        students.put(103, "Amit");

        for(Integer rollNo : students.keySet()) {
            System.out.println(
                    "Roll No: " + rollNo +
                    " Name: " + students.get(rollNo));
        }
    }
}
