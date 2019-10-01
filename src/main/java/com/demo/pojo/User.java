package com.demo.pojo;

import lombok.Data;
import lombok.experimental.Accessors;
import tk.mybatis.mapper.annotation.KeySql;

import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;
import java.util.Date;

/**
 * @Auther: tianchao
 * @Date: 2019/9/30 23:41
 * @Description:
 */
@Data
@Accessors(chain = true)
@Table(name="tb_user")
public class User {
    @Id
    @KeySql(useGeneratedKeys = true)
    private Long id;
    private String userName;
    private String password;
    private String name;
    private Integer age;
    private Integer sex;
    private Date birthday;
    private Date created;
    private Date updated;
    @Transient
    private String note;

}
