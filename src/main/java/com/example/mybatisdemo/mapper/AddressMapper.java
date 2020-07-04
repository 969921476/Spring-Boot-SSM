package com.example.mybatisdemo.mapper;

import com.example.mybatisdemo.pojo.Address;
import org.apache.ibatis.annotations.Select;

import javax.annotation.Resource;

/**
 * @author： cjn
 * @create： 2020-07-01 15:29
 * @Description：
 * @Modified By:
 */
public interface AddressMapper {
//    @Select("select * from address where userId=#{userId}")
    public Address getAddressByUserId(int userId);
}
