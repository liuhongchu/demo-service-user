package com.example.po;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

/**
 * Created by liuhongchun on 2017/10/24.
 */
@Entity
public class Users {
    /**id*/
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    /**昵称*/
    private String nickname;
    /**图像*/
    private String avatar;
    /**性别 1男0 女*/
    private int sex;
    /**年龄*/
    private int age;
    /**邮箱*/
    private String email;
    /**手机号码*/
    private String mobile;
    /**状态 0 正常 1 不正常*/
    private int status;
    /**创建时间*/
    private Date  insettime;
    /**更新时间*/
    private Date  updatetime;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public int getSex() {
        return sex;
    }

    public void setSex(int sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public Date getInsettime() {
        return insettime;
    }

    public void setInsettime(Date insettime) {
        this.insettime = insettime;
    }

    public Date getUpdatetime() {
        return updatetime;
    }

    public void setUpdatetime(Date updatetime) {
        this.updatetime = updatetime;
    }
}
