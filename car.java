class Car {
    private String carColor; 
    private String carBrand; 
    private String fuelType; 
    private int mileage;

    public Car(String carColor, String carBrand, String fuelType, int mileage) {        // Constructor
        this.carColor = carColor; 
        this.carBrand = carBrand; 
        this.fuelType = fuelType; 
        this.mileage = mileage;
    } 

    public void displayCarDetails() {    // Display Car Details
        System.out.println("Car Details: " + this.carBrand + " | Color: " + this.carColor + 
                           " | Fuel Type: " + this.fuelType + " | Mileage: " + this.mileage + " km/l");
        System.out.println();
    }

    public void start() {      // Method to start the car          
        System.out.println(this.carBrand + " is starting...");
    }

    public void service() {      // Method to service the car      
        System.out.println("Your car is at our service.");
        System.out.println("Car Color: " + this.carColor);
        System.out.println("Fuel Type: " + this.fuelType);
        System.out.println("Mileage: " + this.mileage + " km/l");
    }

    public void stop() {      // Method to stop the car  
        System.out.println(this.carBrand + " is stopping...\n");
    }

    public String getCarColor() { return carColor; }    // Getter Methods
    public String getCarBrand() { return carBrand; }
    public String getFuelType() { return fuelType; }
    public int getMileage() { return mileage; }

    public static void main(String[] args) {                // Creating Car objects
        Car car1 = new Car("Red", "Maruti", "Diesel", 20);
        System.out.println("Welcome to the Car Garage!");
        car1.displayCarDetails();
        car1.start();
        car1.service();
        car1.stop();

        Car car2 = new Car("Black", "Mercedes", "Diesel", 40);
        car2.displayCarDetails();
        car2.start();
        car2.service();
        car2.stop();

        Car car3 = new Car("White", "Mahindra", "Diesel", 30);
        car3.displayCarDetails();
        car3.start();
        car3.service();
        car3.stop();
    }
}