package software.ulpgc.control.pojo;

import software.ulpgc.control.CarpAdapter;
import software.ulpgc.model.Car;

public class RandomCarAdapter implements CarpAdapter<RandomCar> {
    @Override
    public Car from(RandomCar object) {
        return new Car(
                object.id(),
                object.vin(),
                object.make_and_model(),
                Car.Color.valueOf(object.color().trim().replace(" ", "").replace("-", "")),
                Car.Transmision.valueOf(object.transmission().trim().replace(" ", "").replace("-", "")),
                Car.Fuel.valueOf(object.fuel_type().trim().replace(" ", "").replace("-", "").replace("/", "")),
                Car.CarType.valueOf(object.car_type().trim().replace(" ", "").replace("-", "")),
                object.license_plate(),
                object.car_options() != null ? String.join(", ", object.car_options()) : "Standard",
                object.specs() != null ? String.join(", ", object.specs()) : "None extra specs",
                object.kilometrage()
        );
    }
}
