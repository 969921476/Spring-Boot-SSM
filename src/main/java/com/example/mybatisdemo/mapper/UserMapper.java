package com.example.mybatisdemo.mapper;

import com.example.mybatisdemo.pojo.User;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.mapping.FetchType;

/**
 * @author： cjn
 * @create： 2020-07-01 15:29
 * @Description：
 * @Modified By:
 */
public interface UserMapper {
    //one to one
    @Select("select * from user where userId = #{userId}")
    @Results({
            @Result(id=true,column="userId",property="userId"),
            @Result(column="userName",property="userName"),
            @Result(column="userPassword",property="userPassword"),
            @Result(column="userAge",property="userAge"),
            @Result(column="userEmail",property="userEmail"),
            @Result(column="userId",property="userAddress",
                    one=@One(select="com.cr.mapper.AddressMapper.getAddressByUserId",fetchType= FetchType.EAGER))
    })
    public User getUserById(int userId);

    //one to many
    @Select("select * from user where userId=#{userId}")
    @Results({
            @Result(id=true,column="userId",property="userId"),
            @Result(column="userName",property="userName"),
            @Result(column="userPassword",property="userPassword"),
            @Result(column="userAge",property="userAge"),
            @Result(column="userEmail",property="userEmail"),
            @Result(column="userId",property="books",
                    many=@Many(select="com.cr.mapper.BookMapper.getBooksByUserId",fetchType= FetchType.EAGER))
    })
    public User getUserAndBooksById(int userId);




}
