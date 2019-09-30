package com.demo.pojo;

import lombok.Data;

import java.util.Date;

/**
 * @Auther: tianchao
 * @Date: 2019/9/30 23:41
 * @Description:
 */
@Data
public class User {
    private Long id;
    private String userName;
    private String password;
    private String name;
    private Integer age;
    private Integer sex;
    private Date birthday;
    private Date created;
    private Date updated;

}
