class Car {
    String model;
    int year;
    static int numberOfCars = 0;

    Car(String model, int year) {
        this.model = model;
        this.year = year;
        numberOfCars++;
    }

    void display() {
        System.out.println("Car Model: " + model + ", Year: " + year);
    }
}

public class Main2 {
    public static void main(String[] args) {
        Car car1 = new Car("BMW", 2000);
        Car car2 = new Car("TOYOTA", 2020);

        car1.display();
        car2.display();

        System.out.println("Total number of cars created: " + Car.numberOfCars);
    }
}
