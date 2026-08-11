import java.util.Scanner;

public class sqcube{
    public static void main(String[] args){
      
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter any number: ");
        int n = sc.nextInt();

        int square = (n*n);
        int cube = (n*n*n);

        System.out.println("Square is : "+ square);
        System.out.println("Cube is : "+ cube);

        sc.close();
    }
}