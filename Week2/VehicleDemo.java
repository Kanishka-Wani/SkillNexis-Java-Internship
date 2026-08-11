class Vehicle {

    void start() {
        System.out.println("Vehicle is starting");
    }

    void stop() {
        System.out.println("Vehicle is stopping");
    }
}

class Car extends Vehicle {

    @Override
    void start() {
        System.out.println("Car starts with a key");
    }

    @Override
    void stop() {
        System.out.println("Car stops using brakes");
    }
}

class Bike extends Vehicle {

    @Override
    void start() {
        System.out.println("Bike starts with a self-start button");
    }

    @Override
    void stop() {
        System.out.println("Bike stops using brakes");
    }
}

public class VehicleDemo {

    public static void main(String[] args) {

        Car car = new Car();
        Bike bike = new Bike();

        System.out.println("Car:");
        car.start();
        car.stop();

        System.out.println();

        System.out.println("Bike:");
        bike.start();
        bike.stop();
    }
}
