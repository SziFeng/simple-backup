package com.maple.simple.Service;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.maple.simple.Mapper.UserMapper;
import com.maple.simple.Vo.User;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @DESCRIPTION:
 * @Author maple
 * @Date 2021/10/28
 */

@Service
public class UserService extends ServiceImpl<UserMapper, User> {

    public List<User> getAllUser(){
        return lambdaQuery().list();
    }
}
