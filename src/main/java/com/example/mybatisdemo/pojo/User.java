package com.example.mybatisdemo.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * @author： cjn
 * @create： 2020-07-01 15:29
 * @Description：
 * @Modified By:
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {
    private Integer userId;
    private String userName;
    private String userPassword;
    private int userAge;
    private String userEmail;
    private Address userAddress;
    private List<Book> books;
}
