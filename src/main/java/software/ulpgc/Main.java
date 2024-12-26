package software.ulpgc;

import software.ulpgc.control.RandomCarProvider;
import software.ulpgc.model.Car;
import software.ulpgc.viewmodel.CarPrinter;

import java.io.IOException;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        RandomCarProvider provider = new RandomCarProvider("https://random-data-api.com/api/vehicle/random_vehicle?size=");
        try {
            List<Car> cars = provider.newCar(5);
            cars.forEach(CarPrinter::report);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
