package com.demo.service.serviceimpl;

import com.demo.ApplicationTests;
import com.demo.pojo.User;
import com.demo.service.UserService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Date;

import static org.junit.Assert.*;

/**
 * @Auther: tianchao
 * @Date: 2019/10/1 14:02
 * @Description:
 */
public class UserServiceImplTest extends ApplicationTests {

    @Autowired
    private UserService userService;

    @Test
    public void queryById() {
        System.out.println(userService.queryById(1L));
    }

    @Test
    public void insertUser() {
        User user = new User();
        user.setAge(12)
                .setBirthday(new Date())
                .setCreated(new Date())
                .setUpdated(new Date())
                .setName("Tom")
                .setPassword("123456")
                .setSex(1)
                .setUserName("tom_123456")
                .setNote("xxxxxxdsadasdasdsad");
        userService.insertUser(user);
    }
}