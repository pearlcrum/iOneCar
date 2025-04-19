package com.ionecar.service;

import org.springframework.stereotype.Service;
import lombok.RequiredArgsConstructor;
import java.util.List;
import com.ionecar.domain.Car;
import com.ionecar.mapper.CarMapper;

@Service
@RequiredArgsConstructor
public class CarService {
    private final CarMapper carMapper; //test

    public List<Car> getAllCars() {
        return carMapper.findAll();
    }

    public Car getCarById(Long id) {
        return carMapper.findById(id);
    }

    public void registerCar(Car car) {
        carMapper.insert(car);
    }
}