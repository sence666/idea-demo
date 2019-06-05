package com.hxzy.service;





import com.hxzy.mapper.UserMapper;
import com.hxzy.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class UserService {

    @Autowired
    public UserMapper userMapper;

    public User queryUserById(Long userId) {
        return this.userMapper.selectByPrimaryKey(userId);
    }

    public List<User> findAll() {

        return userMapper.selectAll();

    }
}
