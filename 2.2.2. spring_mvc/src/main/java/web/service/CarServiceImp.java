package web.service;

import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class CarServiceImp implements CarService {

    @Override
    public List<Car> getListCar() {
        List<Car> cars = new ArrayList<>();
        cars.add(new Car("BMW", "M8", 1100));
        cars.add(new Car("MB", "Maybach", 1150));
        cars.add(new Car("Toyota", "Land-Cruser", 1000));
        cars.add(new Car("Cherry", "Tiggo", 800));
        cars.add(new Car("Chevrolet", "Camaro", 1100));
        return cars;
    }

    @Override
    public List<Car> getCars(int id) {
        List<Car> carGetFirstList = getListCar();
        return carGetFirstList
                .stream()
                .limit(id)
                .collect(Collectors.toList());
    }
}
