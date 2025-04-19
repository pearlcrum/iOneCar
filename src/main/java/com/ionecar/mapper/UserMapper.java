package com.ionecar.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Options;
import com.ionecar.domain.User;
import com.ionecar.util.PasswordEncoder;

@Mapper
public interface UserMapper {
    @Select("SELECT * FROM users WHERE username = #{username}")
    User findByUsername(String username);
    
    @Insert("INSERT INTO users(username, password, enabled, role) VALUES(#{username}, #{encodedPassword}, #{enabled}, #{role})")
    @Options(useGeneratedKeys = true, keyProperty = "id")
    default void save(User user) {
        // 비밀번호를 BCrypt로 인코딩
        String encodedPassword = PasswordEncoder.encode(user.getPassword());
        user.setPassword(encodedPassword);
        
        // 인코딩된 비밀번호로 저장
        insertUser(user);
    }
    
    @Insert("INSERT INTO users(username, password, enabled, role) VALUES(#{username}, #{password}, #{enabled}, #{role})")
    @Options(useGeneratedKeys = true, keyProperty = "id")
    void insertUser(User user);
}