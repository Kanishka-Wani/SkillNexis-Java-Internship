// comparison between pre increment and post increment

public class Increment{
    public static void main(String[] args){

        int a=10;

        System.out.println(a++); //10 - post increment 
        System.out.println(a); //11

        int b=10;

        System.out.println(++b); //11 - pre increment
        System.out.println(b); //11

    }
}