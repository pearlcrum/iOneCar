package com.ionecar.service;

import com.ionecar.domain.User;
import com.ionecar.mapper.UserMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserMapper userMapper;

    public void registerUser(User user) {
        userMapper.insertUser(user);
    }
}