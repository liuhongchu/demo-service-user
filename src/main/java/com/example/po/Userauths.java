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
public class Userauths {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int  id;
    /**user表对应的id*/
    private  int user_id;
    /**身份类型（站内username 邮箱email 手机mobile 或者第三方的qq weibo weixin等）*/
    private  String identity_type;
    /**身份唯一标识（存储唯一标识，比如账号、邮箱、手机号、第三方获取的唯一标识等）*/
    private  String identifier;
    /**授权凭证token*/
    private  String token;
    /**密码*/
    private String passworld;
    /**是否已经验证（存储 1、0 来区分是否已经验证通过）*/
    private  String verified;
    /**创建时间*/
    private Date inserttime;
    /**更新时间*/
    private Date updatetime;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public String getIdentity_type() {
        return identity_type;
    }

    public void setIdentity_type(String identity_type) {
        this.identity_type = identity_type;
    }

    public String getIdentifier() {
        return identifier;
    }

    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }

    public String getVerified() {
        return verified;
    }

    public void setVerified(String verified) {
        this.verified = verified;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String getPassworld() {
        return passworld;
    }

    public void setPassworld(String passworld) {
        this.passworld = passworld;
    }

    public Date getInserttime() {
        return inserttime;
    }

    public void setInserttime(Date inserttime) {
        this.inserttime = inserttime;
    }
    public Date getUpdatetime() {
        return updatetime;
    }

    public void setUpdatetime(Date updatetime) {
        this.updatetime = updatetime;
    }
}
