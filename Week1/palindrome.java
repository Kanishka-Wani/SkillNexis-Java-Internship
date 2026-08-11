import java.util.Scanner;

public class palindrome{
    public static void main(String[] args){
        int no, rev=0, r, temp;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter any number: ");
        int num = scanner.nextInt();

        scanner.close();

        temp = num;

        while(num>0){
            r= num%10;
            rev = rev*10+r ;
            num= num/10;
        }

        if(temp == rev){
            System.out.println(temp + " is Palindrome");
        }

        else{
            System.out.println(temp + " is not Palindrome");
        }

    }
}