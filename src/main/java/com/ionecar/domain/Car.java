package com.ionecar.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.time.LocalDateTime; // Car.java에 필요

@Data
public class Car {
    private Long id;
    private String modelName;
    private String manufacturer;
} 