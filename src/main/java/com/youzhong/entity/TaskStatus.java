package com.youzhong.entity;

public class TaskStatus {
    private Integer id;//0：新建，1：已做完，2：关闭，3：撤销

    private String name;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }
}