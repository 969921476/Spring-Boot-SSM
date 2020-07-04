package com.example.mybatisdemo.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author： cjn
 * @create： 2020-07-01 15:29
 * @Description：
 * @Modified By:
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Book {

    private Integer bookId;
    private String bookName;
    private Integer totalPage;
    private Integer price;
}
