import java.util.ArrayList;
import java.util.Collections;

public class NumberSorting {

    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(45);
        numbers.add(12);
        numbers.add(89);
        numbers.add(5);
        numbers.add(23);

        System.out.println("Before Sorting:");
        System.out.println(numbers);

        Collections.sort(numbers);

        System.out.println("After Sorting:");
        System.out.println(numbers);
    }
}
