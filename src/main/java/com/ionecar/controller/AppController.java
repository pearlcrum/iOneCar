package com.ionecar.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import com.ionecar.service.CarService;

@Controller
@RequestMapping("/app")
public class AppController {
    
    @Autowired
    private CarService carService;
    
    @GetMapping("/dashboard")
    public String dashboard(Model model) {
        // Authentication 객체 제거
        model.addAttribute("username", "사용자"); // 임시 사용자명
        model.addAttribute("cars", carService.getAllCars());
        return "app/dashboard";
    }
    
    @GetMapping("/car/{id}")
    public String carDetail(@PathVariable Long id, Model model) {
        model.addAttribute("car", carService.getCarById(id));
        return "app/car-detail";
    }
}