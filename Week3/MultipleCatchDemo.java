public class MultipleCatchDemo {
    public static void main(String[] args) {

        try {
            int[] arr = {1, 2, 3};

            System.out.println(arr[5]);

            int x = 10 / 0;

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array index error!");
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic error!");
        } catch (Exception e) {
            System.out.println("General exception!");
        }
    }
}
