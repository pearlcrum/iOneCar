package com.ionecar.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Select;
import java.util.List;
import com.ionecar.domain.Car;

@Mapper
public interface CarMapper {
    @Insert("INSERT INTO cars(model_name, manufacturer) VALUES(#{modelName}, #{manufacturer})")
    @Options(useGeneratedKeys = true, keyProperty = "id")
    void insert(Car car);

    @Select("SELECT * FROM cars")
    List<Car> findAll();
    
    @Select("SELECT * FROM cars WHERE id = #{id}")
    Car findById(Long id);
}