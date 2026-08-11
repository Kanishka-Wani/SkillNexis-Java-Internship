//Check whether two numbers are equal

import java.util.Scanner;

public class Equal{
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter 1st number: ");
        int num1 =sc.nextInt();
        System.out.println("Enter 2nd number: ");
        int num2 =sc.nextInt();

        if(num1 == num2 )
            System.out.println("Numbers are equal");
        else
            System.out.println("Numbers are not equal");
    }
}