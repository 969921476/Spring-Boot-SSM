package com.example.mybatisdemo;

import com.example.mybatisdemo.mapper.AddressMapper;
import com.example.mybatisdemo.mapper.BookMapper;
import com.example.mybatisdemo.mapper.UserMapper;
import com.example.mybatisdemo.pojo.Address;
import com.example.mybatisdemo.pojo.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class MybatisDemoApplicationTests {
    @Autowired
    private AddressMapper addressMapper;

    @Autowired
    private BookMapper bookMapper;

    @Autowired
    private UserMapper userMapper;
    @Test
    void contextLoads() {
        User userAndBooksById = userMapper.getUserAndBooksById(2);

        System.out.println(userAndBooksById);
    }

}
