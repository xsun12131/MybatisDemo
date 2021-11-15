package com.multiple.demo.entity;

import java.util.Date;
import java.io.Serializable;

/**
 * (TSales)实体类
 *
 * @author makejava
 * @since 2021-11-15 14:33:25
 */
public class TSales implements Serializable {
    private static final long serialVersionUID = 454437046807840933L;
    
    private Integer id;
    /**
     * 用户名
     */
    private String username;
    /**
     * 密码 MD5存储
     */
    private String password;
    /**
     * 注册时间
     */
    private Date registerTime;
    /**
     * 用户类型 1,2,3,4 随机
     */
    private Integer type;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Date getRegisterTime() {
        return registerTime;
    }

    public void setRegisterTime(Date registerTime) {
        this.registerTime = registerTime;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

}

