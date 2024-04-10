package web.service;

import java.util.List;
import web.model.Car;

public interface CarService {
    List<Car> listCars(List<Car> cars,int number);
}
