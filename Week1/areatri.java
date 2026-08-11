//program to find area of triangle with 3 different sides
public class areatri{
    public static void main(String[] args){
        double a=10, b=9, c=9.5;

        double s=(a+b+c)/2;
        double area=Math.sqrt(s*(s-a)*(s-b)*(s-c));

        System.out.println("Area of triangle is : "+ area );

    }
}