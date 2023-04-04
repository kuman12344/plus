package com.zhiyi;

import com.zhiyi.domain.User;
import com.zhiyi.service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
public class MybatisPlusServiceTest {

    @Autowired
    UserService userService;

    @Test
    public void test1(){
        List<User> userList = userService.queryAllUser();
        for (User user:userList){
            System.out.println(user);
        }



    }
}
