import java.sql.*;
import java.util.Scanner;

public class StudentManagementSystem {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {

            Connection con =
                    DBConnection.getConnection();

            System.out.print("Student ID: ");
            int id = sc.nextInt();
            sc.nextLine();

            System.out.print("Name: ");
            String name = sc.nextLine();

            System.out.print("Course: ");
            String course = sc.nextLine();

            String insert =
                    "INSERT INTO students VALUES(?,?,?)";

            PreparedStatement ps =
                    con.prepareStatement(insert);

            ps.setInt(1, id);
            ps.setString(2, name);
            ps.setString(3, course);

            ps.executeUpdate();

            System.out.println("Student Added Successfully!");

            ResultSet rs =
                    con.createStatement()
                            .executeQuery("SELECT * FROM students");

            System.out.println("\nStudent Records:");

            while(rs.next()) {

                System.out.println(
                        rs.getInt(1) + " " +
                        rs.getString(2) + " " +
                        rs.getString(3)
                );
            }

            con.close();

        } catch(Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
