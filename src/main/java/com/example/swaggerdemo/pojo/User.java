package com.example.swaggerdemo.pojo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * @author weibing
 * @create 2023-07-12 14:05
 */
@ApiModel("用户实体")
public class User {
    @ApiModelProperty("姓名")
    private String name;
    @ApiModelProperty("年龄")
    private int age;
}
