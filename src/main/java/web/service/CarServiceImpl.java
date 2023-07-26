package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Service
public class CarServiceImpl implements CarService {
    private List<Car> cars;

    {
        cars = new ArrayList<>();
        cars.add(new Car("audi", "black", 2018));
        cars.add(new Car("volvo", "white", 2020));
        cars.add(new Car("changan", "red", 2022));
        cars.add(new Car("bmw", "brown", 2018));
        cars.add(new Car("omoda", "green", 2023));
    }

    @Override
    public List<Car> getAllCars() {
        return cars;
    }

    @Override
    public List<Car> getNumberOfCars(int number) {
        List<Car> resultCar = new ArrayList<>();
        for (int i = 0; i < number; i++) {
            resultCar.add(i, cars.get(i));
        }
        return resultCar;
    }
}
