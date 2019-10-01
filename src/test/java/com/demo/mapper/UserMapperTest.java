package com.demo.mapper;

import com.demo.pojo.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

/**
 * @Auther: tianchao
 * @Date: 2019/10/1 13:53
 * @Description:
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class UserMapperTest {
    @Autowired
    private UserMapper userMapper;

    @Test
    public void testQuery(){
        User user = userMapper.selectByPrimaryKey(1L);
        System.out.println(user);
    }
}