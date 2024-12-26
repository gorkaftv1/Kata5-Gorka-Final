package software.ulpgc.viewmodel;

import software.ulpgc.model.Car;

public class CarPrinter {
    public static void report(Car car){
        System.out.println("--------------------------");
        System.out.println("Plate: " +  car.plate());
        System.out.println("Model: " +  car.makeAndModel());
        System.out.println("Option: " +  car.options());
        System.out.println("Specs: " +  car.specs());
        System.out.println("Fuel: " +  car.fuel());
        System.out.println("Kms: " +  car.kilometrage());
        System.out.println("--------------------------");
    }
}
