package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Service
public class CarServiceImpl {
    List<Car> cars;

    {
        cars = new ArrayList<>();
        cars.add(new Car("audi", "black", 2018));
        cars.add(new Car("volvo", "white", 2020));
        cars.add(new Car("changan", "red", 2022));
        cars.add(new Car("bmw", "brown", 2018));
        cars.add(new Car("omoda", "green", 2023));
    }

    public List<Car> yearOfRelease() {
        return cars;
    }
}
