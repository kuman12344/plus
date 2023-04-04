package com.zhiyi.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.zhiyi.domain.User;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository

public interface UserMapper extends BaseMapper<User> {
    List<User> selectAllUser();
}
