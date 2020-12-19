package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import web.model.Car;
import web.service.CarService;
import web.service.CarServiceImp;

import java.util.List;

@Controller
public class CarController {
    CarService carService = new CarServiceImp();

    @GetMapping(value = "/cars")
    public String printWelcome(Integer count, Model model) {

        if (count == null) {
            List<Car> listIfNullCount = carService.getListCar();
            model.addAttribute("cars", listIfNullCount);
        } else {
            List<Car> carCount = carService.getCars(count);
            model.addAttribute("cars", carCount);
        }
        return "cars";
    }
}
