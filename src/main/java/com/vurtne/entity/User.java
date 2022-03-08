package com.vurtne.entity;

import lombok.Data;

/**
 * @author oxotn3
 * @create 2022-03-08
 * @description
 */
@Data
public class User {
    int id;
    String name;
    String password;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
