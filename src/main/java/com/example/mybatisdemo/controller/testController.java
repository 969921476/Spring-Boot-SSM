package com.example.mybatisdemo.controller;

import com.example.mybatisdemo.mapper.AddressMapper;
import com.example.mybatisdemo.mapper.BookMapper;
import com.example.mybatisdemo.mapper.UserMapper;
import com.example.mybatisdemo.pojo.User;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.HashMap;
import java.util.Map;

/**
 * @author： cjn
 * @create： 2020-07-01 15:27
 * @Description：
 * @Modified By:
 */
@Controller
public class testController {
    @Autowired
    private AddressMapper addressMapper;

    @Autowired
    private BookMapper bookMapper;

    @Autowired
    private UserMapper userMapper;
  @RequestMapping("/sss")
  @ResponseBody
  public Map<String, Object> get(){
      User userAndBooksById = userMapper.getUserAndBooksById(1);
      Map<String, Object> map = new HashMap<>();
      map.put("ss",map);
      return map;
  }
}
