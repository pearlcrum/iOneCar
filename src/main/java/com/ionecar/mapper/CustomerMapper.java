package com.ionecar.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import com.ionecar.domain.Customer;

@Mapper
public interface CustomerMapper {
    @Select("SELECT * FROM customers WHERE edps_csn = #{edpsCsn}")
    Customer findById(String edpsCsn);
}
