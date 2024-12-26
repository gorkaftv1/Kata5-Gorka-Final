package software.ulpgc.control.pojo;

import java.util.List;

public record RandomCar(
        int id,
        String vin,
        String make_and_model,
        String color,
        String drive_type,
        String transmission,
        String fuel_type,
        String car_type,
        String doors,
        int kilometrage,
        String license_plate,
        List<String> car_options,
        List<String> specs
) {
}
