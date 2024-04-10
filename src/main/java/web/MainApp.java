package web;

import java.util.ArrayList;
import java.util.List;
import web.model.Car;

public class MainApp {

    public static void main(String[] args) {
        List<Car> cars = new ArrayList<>();
        Car car1 = new Car ("Toyota", 2023, "Red");
        Car car2 = new Car ("Honda", 2022, "Blue");
        Car car3 = new Car ("Ford", 2021, "Black");
        Car car4 = new Car ("BMW", 2019, "Silver");
        Car car5 = new Car ("Chevrolet", 2020, "White");
        cars.add(car1);
        cars.add(car2);
        cars.add(car3);
        cars.add(car4);
        cars.add(car5);


        for (Car car : cars) {
            System.out.println(car);
        }

    }

}
