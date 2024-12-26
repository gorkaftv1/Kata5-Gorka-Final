package software.ulpgc.control;

import software.ulpgc.model.Car;

import java.io.IOException;
import java.util.List;

public interface CarProvider {
    List<Car> newCar(int quantity) throws IOException;
}
