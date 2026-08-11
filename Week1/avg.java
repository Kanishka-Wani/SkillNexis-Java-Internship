import java.util.Scanner;

public class avg{
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter 3 numbers: ");
        int a= sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();

        double avg = (a+b+c)/3.0; // 3.0 is essential otherwise it will give you integer divison 

         System.out.println("Average of 3 numbers is: " + avg);

         sc.close();
    }
}