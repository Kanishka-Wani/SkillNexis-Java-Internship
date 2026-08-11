//Calculate the total price after adding 18% GST to a product price entered by the user.


import java.util.Scanner;

public class Gst{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter product price: ");
        int price = sc.nextInt();
        double gst=  (price * 18.0)/100;

        System.out.println("Total price after adding 18% GST is: " + (price+ gst));

        sc.close();
    }
}