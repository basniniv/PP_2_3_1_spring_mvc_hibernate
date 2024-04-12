package web.service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import org.springframework.stereotype.Service;
import web.model.Car;

@Service
public final class CarServiceImpl implements CarService {

    List<Car> cars = new ArrayList<>();

    public CarServiceImpl() {
        Car car1 = new Car("Toyota", 2023, "Red");
        Car car2 = new Car("Honda", 2022, "Blue");
        Car car3 = new Car("Ford", 2021, "Black");
        Car car4 = new Car("BMW", 2019, "Silver");
        Car car5 = new Car("Chevrolet", 2020, "White");

        cars.add(car1);
        cars.add(car2);
        cars.add(car3);
        cars.add(car4);
        cars.add(car5);

    }

    @Override
    public List<Car> listCars(int number) {
        return cars.stream()
                .limit(number)
                .collect(Collectors.toList());
    }

    public int getSizeList() {
        return cars.size();
    }
}

