interface Shape {
    void area();
    void perimeter();
}

class Circle implements Shape {
    double radius = 5;

    public void area() {
        double result = 3.14 * radius * radius;
        System.out.println("Area of Circle: " + result);
    }

    public void perimeter() {
        double result = 2 * 3.14 * radius;
        System.out.println("Perimeter of Circle: " + result);
    }

    public static void main(String[] args) {
        Circle c = new Circle();

        c.area();
        c.perimeter();
    }
}
