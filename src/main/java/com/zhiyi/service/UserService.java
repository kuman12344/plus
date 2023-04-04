package com.zhiyi.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.zhiyi.domain.User;

import java.util.List;

public interface UserService extends IService<User> {

    List<User> queryAllUser();


}
