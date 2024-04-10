package web.controller;

import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;
import web.service.CarServiseImpl;

@Controller
public class CarController {

    //public String printWelcome(ModelMap model) {
//    List<String> messages = new ArrayList<>();
//    messages.add("Cars!");
//    messages.add("Работает норм");
//    messages.add("Можно идти спать ");
//    model.addAttribute("messages", messages);
//    return "/cars";
//}
    @GetMapping(value = "/cars")
    public String calcPage(@RequestParam(value = "count",required = false) Integer count,
            Model model) {
        List<Car> cars = new ArrayList<>();
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
        if (count == null || count >= 5) {
            count = cars.size();
        }

        List<Car> carsLimit = new CarServiseImpl().listCars(cars,count);
        model.addAttribute("answer", carsLimit);
        return "/cars";
    }

}
