package com.example.mybatisdemo.mapper;

import com.example.mybatisdemo.pojo.Book;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @author： cjn
 * @create： 2020-07-01 15:29
 * @Description：
 * @Modified By:
 */
public interface BookMapper {
//    @Select("select * from book where userId = #{userId}")
    public List<Book> getBooksByUserId(int userId);
}
