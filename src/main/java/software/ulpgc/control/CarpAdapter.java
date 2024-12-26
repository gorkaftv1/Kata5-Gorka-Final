package software.ulpgc.control;

import software.ulpgc.model.Car;

public interface CarpAdapter<T>{
    Car from(T object);
}
