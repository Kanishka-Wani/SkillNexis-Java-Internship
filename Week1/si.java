import java.util.Scanner;
public class si{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter principate amount, rate of interest and time:  ");
        double p= sc.nextDouble();
        double r= sc.nextDouble();
        double t= sc.nextDouble();

        double si= (p*r*t)/100.0;

        System.out.println("The simple interest is : "+ si);

        sc.close();
        
    }
}