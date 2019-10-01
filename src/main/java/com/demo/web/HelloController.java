package com.demo.web;

import com.demo.pojo.User;
import com.demo.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Auther: tianchao
 * @Date: 2019/9/30 23:52
 * @Description:
 */
@RestController
@Slf4j
@RequestMapping("user")
public class HelloController {

    @Autowired
    private UserService userService;

    @GetMapping("{id}")
    public User hello(@PathVariable("id") Long id){
        return userService.queryById(id);
    }
}
