package com.youzhong.entity;

import java.util.Date;

public class Account {
    private Integer id;

    private String username;

    private String password;

    private Integer weixinId;

    private Date ctime;

    private Date mtime;
    
    private Weixin weixin;
    
    

    public Weixin getWeixin() {
		return weixin;
	}

	public void setWeixin(Weixin weixin) {
		this.weixin = weixin;
	}

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
        this.username = username == null ? null : username.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public Integer getWeixinId() {
        return weixinId;
    }

    public void setWeixinId(Integer weixinId) {
        this.weixinId = weixinId;
    }

    public Date getCtime() {
        return ctime;
    }

    public void setCtime(Date ctime) {
        this.ctime = ctime;
    }

    public Date getMtime() {
        return mtime;
    }

    public void setMtime(Date mtime) {
        this.mtime = mtime;
    }
}