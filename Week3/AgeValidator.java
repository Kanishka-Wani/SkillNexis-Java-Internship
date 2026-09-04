public class AgeValidator {

    static void validate(int age)
            throws InvalidAgeException {

        if (age < 18) {
            throw new InvalidAgeException(
                    "Age must be 18 or above");
        }

        System.out.println("Valid age");
    }

    public static void main(String[] args) {

        try {
            validate(15);
        } catch (InvalidAgeException e) {
            System.out.println(e.getMessage());
        }
    }
}
