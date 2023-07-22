package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;
import web.service.CarServiceImpl;

import java.util.ArrayList;
import java.util.List;

@Controller
public class CarController {
    private final CarServiceImpl carServiceImpl;

    public CarController(CarServiceImpl carServiceImpl) {
        this.carServiceImpl = carServiceImpl;
    }
    @GetMapping("/cars")
    public String numberOfCars(@RequestParam(value = "count", defaultValue = "5") int number,
                               Model model) {
        List<Car> list = carServiceImpl.yearOfRelease();
        List<Car> listResult = new ArrayList();

        if (number > 0 && number <= 5) {
            for (int i = 0; i < number; i++) {
                listResult.add(list.get(i));
            }
            model.addAttribute("message2", listResult);
        }
        else if (number > 5) {
            model.addAttribute("message",list);
        }
        return "cars";
    }
}

