class Calculator {

    // Method Overloading
    int add(int a, int b) {
        return a + b;
    }

    int add(int a, int b, int c) {
        return a + b + c;
    }
}

class AdvancedCalculator extends Calculator {

    // Method Overriding
    @Override
    int add(int a, int b) {
        return a + b + 10;
    }

    public static void main(String[] args) {

        AdvancedCalculator obj = new AdvancedCalculator();

        System.out.println("Overloaded method:");
        System.out.println(obj.add(10, 20, 30));

        System.out.println("Overridden method:");
        System.out.println(obj.add(10, 20));
    }
}
