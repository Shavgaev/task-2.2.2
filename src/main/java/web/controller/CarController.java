package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;
import web.service.CarService;

import java.util.List;

@Controller
public class CarController {
    private final CarService carService;

    public CarController(CarService carService) {
        this.carService = carService;
    }

    @GetMapping("/cars")
    public String getNumberOfCars(@RequestParam(value = "count", defaultValue = "5") int number, Model model) {


        if (number > 5) {
            List<Car> list = carService.getAllCars();
            model.addAttribute("message", list);
        } else {
            List<Car> listResult = carService.getNumberOfCars(number);
            model.addAttribute("message2", listResult);
        }

        return "cars";
    }
}