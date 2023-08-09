package com.example.swaggerdemo.config;

import org.springframework.context.EnvironmentAware;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;
import org.springframework.core.env.Profiles;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.ArrayList;

/**
 * @author weibing
 * @create 2023-07-11 18:57
 */
@Configuration
@EnableSwagger2 //开启swagger2，swagger是旧版本
public class SwaggerConfig {


    /**
     * 创建docket实例，把这个东西看成记录者
     * @return
     */
    @Bean
    public Docket docket(Environment environment) {

//        boolean flag = environment.acceptsProfiles(Profiles.of("dev", "prod"));


        //需要一个文档类型参数，其实就是对swagger的描述、元数据
        //.api:添加api文档信息
        //配置接口扫描
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())
                .select()//配置扫描接口
                .apis(RequestHandlerSelectors.basePackage("com.example.swaggerdemo"))//指定要扫描哪些东西
                .build()
                .groupName("weibing")//配置api分组
                .enable(true);//是否启用swagger，默认是true启用
    }

    /**
     * api的文档描述信息
     * @return
     */
    private ApiInfo apiInfo() {
        Contact contact = new Contact("韦兵", "访问地址", "邮箱");

        //虽然有很多信息要填，但是有用的其实就2个：文档标题、描述信息
        return new ApiInfo("标题", "描述", "版本", "组织地址",
                contact, "许可", "许可地址", new ArrayList<>());
    }

}
