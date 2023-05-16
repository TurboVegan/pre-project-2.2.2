package web.dao;

import org.springframework.stereotype.Component;
import web.models.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class CarDao {

    private List<Car> cars;

    {
        cars = new ArrayList<>();

        cars.add(new Car(1, "Model1", 1));
        cars.add(new Car(2, "Model2", 2));
        cars.add(new Car(3, "Model3", 3));
        cars.add(new Car(4, "Model4", 4));
        cars.add(new Car(5, "Model5", 5));
    }

    public List<Car> getCars(Integer count){
       return cars.stream().limit(count).collect(Collectors.toList());
    }
}
