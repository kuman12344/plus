package com.zhiyi;


import com.zhiyi.dao.UserMapper;
import com.zhiyi.domain.TestPlusPP;
import com.zhiyi.domain.User;
import com.zhiyi.service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.*;

@SpringBootTest
class MybatisPApplicationTests {

    @Autowired
    private UserMapper userMapper;

    @Autowired
    private UserService userService;



    @Test
    void contextLoads() {
    }

    @Test
    public void test(){
        List<User> userList = userMapper.selectList(null);

        for(User user:userList){
            System.out.println(user);
        }

    }

    @Test
    public void test1(){

        User user=new User();
        user.setName("lisi2");
        user.setAge(1999);
        int i = userMapper.insert(user);

        System.out.println(user);
    }

    @Test
    public void test2(){

        int i = userMapper.deleteById(1641983361247473665L);
        System.out.println(i);

    }

    @Test
    public void test3(){
        List<Long> list = Arrays.asList(1641986507101237249L, 1642697155091136514L);
        int i = userMapper.deleteBatchIds(list);
        System.out.println(i);
    }

    @Test
    public void test4(){

        Map<String,Object> map=new HashMap<>();
        map.put("name","zhangsan");
        map.put("age",13);
        userMapper.deleteByMap(map);
    }

    @Test
    public void test5(){
        User user=new User();
        user.setId(2222L);
        user.setName("lisi");
        user.setAge(15);
        userMapper.updateById(user);

    }

    @Test
    public void test6(){
        List<Long> list = Arrays.asList(1641986209171443713L, 1642697044013416449L);
        List<User> userList = userMapper.selectBatchIds(list);
        for (User user:userList){
            System.out.println(user);
        }
    }

    @Test
    public void test7(){

        Map<String,Object> map=new HashMap<>();
        map.put("name","zhangsan");
        map.put("age",12);
        List<User> list = userMapper.selectByMap(map);
        for (User user:list){
            System.out.println(user);
        }


    }

    @Test
    public void test8(){
        List<User> userList = userMapper.selectAllUser();
        for (User user:userList){
            System.out.println(user);
        }
    }

    @Test
    public void test9(){

        long l = userService.count();
        System.out.println(l);

    }

    @Test
    public void test10(){

        List<User> list=new ArrayList<>();
        User user=null;
        for (int i=1;i<=10;i++){
            user =new User();
            user.setAge(1+1);
            list.add(user);
        }
        boolean b = userService.saveBatch(list);
        System.out.println(b);
    }


    @Test
    public void test11() {
        List<User> userList = userService.queryAllUser();
        for (User user : userList) {
            System.out.println(user);
        }
    }





}
