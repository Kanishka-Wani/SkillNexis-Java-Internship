class StudentInfo{
    String name;
    int age;
    double marks;

    void display(){
        System.out.println("Name: "+ name);
        System.out.println("Age: "+age);
        System.out.println("Marks: "+ marks);
    }

}
public class Student{
    public static void main(String[] args){
        StudentInfo s = new StudentInfo();
        s.name="abc";
        s.age= 34;
        s.marks = 89.90;

        s.display();
    }
}
