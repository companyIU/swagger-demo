package com.example.swaggerdemo.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author weibing
 * @create 2023-08-09 18:51
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Order {
    private String name;
    private Integer age;
}
