import java.io.*;
import java.util.*;

class Employee {
    private int id;
    private String name;
    private String department;
    private double salary;

    public Employee(int id, String name, String department, double salary) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return id + "," + name + "," + department + "," + salary;
    }

    public static Employee fromString(String data) {
        String[] parts = data.split(",");
        return new Employee(
                Integer.parseInt(parts[0]),
                parts[1],
                parts[2],
                Double.parseDouble(parts[3]));
    }
}

public class EmployeeManagementSystem {

    static ArrayList<Employee> employees = new ArrayList<>();
    static final String FILE_NAME = "employees.txt";
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        int choice;

        do {
            System.out.println("\n===== Employee Management System =====");
            System.out.println("1. Add Employee");
            System.out.println("2. View Employees");
            System.out.println("3. Save Employees");
            System.out.println("4. Load Employees");
            System.out.println("5. Search Employee");
            System.out.println("6. Exit");
            System.out.print("Enter choice: ");

            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    addEmployee();
                    break;
                case 2:
                    displayEmployees();
                    break;
                case 3:
                    saveEmployees();
                    break;
                case 4:
                    loadEmployees();
                    break;
                case 5:
                    searchEmployee();
                    break;
                case 6:
                    System.out.println("Thank You!");
                    break;
                default:
                    System.out.println("Invalid Choice!");
            }

        } while (choice != 6);
    }

    static void addEmployee() {
        try {
            System.out.print("Enter Employee ID: ");
            int id = sc.nextInt();
            sc.nextLine();

            System.out.print("Enter Name: ");
            String name = sc.nextLine();

            System.out.print("Enter Department: ");
            String dept = sc.nextLine();

            System.out.print("Enter Salary: ");
            double salary = sc.nextDouble();

            employees.add(new Employee(id, name, dept, salary));

            System.out.println("Employee Added Successfully!");

        } catch (InputMismatchException e) {
            System.out.println("Invalid Input!");
            sc.nextLine();
        }
    }

    static void displayEmployees() {

        if (employees.isEmpty()) {
            System.out.println("No Employees Found!");
            return;
        }

        System.out.println("\nEmployee Records:");

        for (Employee emp : employees) {
            System.out.println(emp);
        }
    }

    static void saveEmployees() {

        try (BufferedWriter writer =
                     new BufferedWriter(new FileWriter(FILE_NAME))) {

            for (Employee emp : employees) {
                writer.write(emp.toString());
                writer.newLine();
            }

            System.out.println("Employees Saved Successfully!");

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    static void loadEmployees() {

        employees.clear();

        try (BufferedReader reader =
                     new BufferedReader(new FileReader(FILE_NAME))) {

            String line;

            while ((line = reader.readLine()) != null) {
                employees.add(Employee.fromString(line));
            }

            System.out.println("Employees Loaded Successfully!");

        } catch (IOException e) {
            System.out.println("File Not Found!");
        }
    }

    static void searchEmployee() {

        System.out.print("Enter Employee ID to Search: ");
        int id = sc.nextInt();

        for (Employee emp : employees) {
            if (emp.getId() == id) {
                System.out.println("Employee Found:");
                System.out.println(emp);
                return;
            }
        }

        System.out.println("Employee Not Found!");
    }
}
