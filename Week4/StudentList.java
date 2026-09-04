import java.util.ArrayList;

public class StudentList {

    public static void main(String[] args) {

        ArrayList<String> students = new ArrayList<>();

        students.add("Kanishka");
        students.add("Rahul");
        students.add("Amit");
        students.add("Sneha");

        System.out.println("Student List:");

        for(String student : students) {
            System.out.println(student);
        }
    }
}
