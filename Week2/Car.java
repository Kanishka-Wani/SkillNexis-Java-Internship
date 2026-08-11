class Vehicle{
    void start(){
        System.out.println("Vehicle is Starting...");
    }

    void stop(){
        System.out.println("Vehicle is Stopping...");
    }
}

public class Car extends Vehicle{
    void drive(){
        System.out.println("Car is Driving...");
    
       }   public static void main(String[] args){
            Car c= new Car();
            c.start();
            c.stop();
            c.drive();
        }
     
}
