package software.ulpgc.control;

import com.google.gson.Gson;
import org.jsoup.Connection;
import org.jsoup.Jsoup;
import software.ulpgc.control.pojo.RandomCar;
import software.ulpgc.control.pojo.RandomCarAdapter;
import software.ulpgc.model.Car;

import java.io.IOException;
import java.util.List;
import java.util.stream.Stream;

public class RandomCarProvider implements CarProvider {
    private final CarpAdapter<RandomCar> adapter;
    private final String connectionName;

    public RandomCarProvider(String connection){
        this.connectionName = connection;
        adapter = new RandomCarAdapter();
    }
    @Override
    public List<Car> newCar(int quantity) throws IOException {
        Connection connection = Jsoup.connect(connectionName + quantity).ignoreContentType(true);
        RandomCar[] randomCars = new Gson().fromJson(connection.get().text(), RandomCar[].class);
        return Stream.of(randomCars).map(adapter::from).toList();
    }
}
