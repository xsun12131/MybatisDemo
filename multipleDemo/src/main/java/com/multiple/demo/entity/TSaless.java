package com.multiple.demo.entity;

import java.util.Date;
import java.io.Serializable;

/**
 * (TSaless)ʵ����
 *
 * @author makejava
 * @since 2021-11-15 14:33:50
 */
public class TSaless implements Serializable {
    private static final long serialVersionUID = 623159145754530180L;
    
    private Integer id;
    /**
     * �û���
     */
    private String username;
    /**
     * ���� MD5�洢
     */
    private String password;
    /**
     * ע��ʱ��
     */
    private Date registerTime;
    /**
     * �û����� 1,2,3,4 ���
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

