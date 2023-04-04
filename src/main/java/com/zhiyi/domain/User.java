package com.zhiyi.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
//@TableName("t_user")
public class User {

//    @TableId(value = "uid",type = IdType.AUTO)
    @TableId(value = "uid")
    private Long id;

    private String name;

    private int age;

}
