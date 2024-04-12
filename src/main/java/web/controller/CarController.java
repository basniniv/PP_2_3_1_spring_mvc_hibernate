package web.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;
import web.service.CarService;


@Controller
public class CarController {
    @Autowired
    public CarService carService;
    @GetMapping(value = "/cars")
    public String calcPage(@RequestParam(value = "count",required = false) Integer count,
            Model model) {
        int listSize = carService.getSizeList();
        if (count == null || count >= listSize) {
            count = listSize;
        }
        List<Car> carsLimit = carService.listCars(count);
        model.addAttribute("answer", carsLimit);
        return "/cars";
    }
}
