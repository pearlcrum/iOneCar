package com.ionecar.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.time.LocalDateTime; // Car.java에 필요

@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {
    private Long id; //id
    private String username;
    private String password;
    private boolean enabled;
    private String role;
}