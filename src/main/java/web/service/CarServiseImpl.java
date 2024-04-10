package web.service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import web.model.Car;

public class CarServiseImpl implements CarService{
//    public List<Car> listCars(List<Car> cars, int lim) {
//        List<Car> result = new ArrayList<>();
//        for (int i = 0; i < cars.size() && i < lim; i++) {
//            result.add(cars.get(i));
//        }
//        return result;
//    }
    @Override
    public List<Car> listCars(List<Car> cars, int lim) {
        return cars.stream()
                .limit(lim)
                .collect(Collectors.toList());
    }

}

