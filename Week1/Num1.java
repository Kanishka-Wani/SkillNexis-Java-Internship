//Check if a number is divisible by both 3 and 5.

import java.util.Scanner;
public class Num1{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter any Number: ");
        int num = sc.nextInt();

        if(num%3 ==0 && num%5==0)//(num%3 ==0 ||  num%5==0) -  to check if number divisible by 3 or 5
            System.out.println("Number is divisible by both 3 and 5");
        else
            System.out.println("Number is not divisble by 3 and 5");
    }
}