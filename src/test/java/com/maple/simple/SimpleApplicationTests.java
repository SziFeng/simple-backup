package com.maple.simple;

import com.maple.simple.Mapper.UserMapper;
import com.maple.simple.Vo.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class SimpleApplicationTests {

    @Autowired
    public UserMapper userMapper;

    @Test
    void contextLoads() {
        List<User> userList = userMapper.selectList(null);
        System.out.println(userList.get(0));
    }

}
