package com.maple.simple.Controller;

import com.maple.simple.Service.UserService;
import com.maple.simple.Vo.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @DESCRIPTION:
 * @Author maple
 * @Date 2021/10/28
 */

@RestController
@RequestMapping("/api/login")
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("getLoginUser")
    public List<User> getLoginUser(){
        List<User> userList = userService.getAllUser();
        return userList;
    }

//    @GetMapping("getLoginUser")
//    public String getLoginUser(){
//        return "123";
//    }
}
