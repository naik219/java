class Vehicle {
    String car_company;
    String car_model;
    long car_price;
    int seating_capacity;
    boolean petrol;
    Vehicle(String car_company, String car_model, long car_price, int seating_capacity, boolean petrol) {
        this.car_company = car_company;
        this.car_model = car_model;
        this.car_price = car_price;
        this.seating_capacity = seating_capacity;
        this.petrol = petrol;
    }
    void displayInfo() {
        System.out.println("Car company: " + car_company);
        System.out.println("Car model: " + car_model);
        System.out.println("Car price: " + car_price);
        System.out.println("Car seating capacity: " + seating_capacity);
        System.out.println("Car uses petrol: " + petrol);
    }
}
class Car extends Vehicle {
    Car(String car_company, String car_model, long car_price, int seating_capacity, boolean petrol) {
        super(car_company, car_model, car_price, seating_capacity, petrol)
   }
}
public class Main {
    public static void main(String[] args) {
        // Creating a Car object with correct arguments
        Car c1 = new Car("Toyota", "Camry", 3000000, 5, true);
        c1.displayInfo();  // Display car details
    }
}
