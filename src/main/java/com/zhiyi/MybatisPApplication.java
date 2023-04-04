package com.zhiyi;

import com.zhiyi.domain.User;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages="com.zhiyi.dao")
public class MybatisPApplication {

    public static void main(String[] args) {

        SpringApplication.run(MybatisPApplication.class, args);
    }

}
