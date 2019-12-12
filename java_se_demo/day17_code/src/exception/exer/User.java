package com.tdsson.exception.exer;
//1、声明一个用户类：包含属性：用户名和密码、电话、邮箱
public class User {
    private String name;
    private String password;
    private String phone;
    private String email;

    public User(String name, String password, String phone, String email) {
        this.name = name;
        this.password = password;
        this.phone = phone;
        this.email = email;
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

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "用户{" +
                "用户名='" + name + '\'' +
                ", 密码='" + password + '\'' +
                ", 电话='" + phone + '\'' +
                ", 邮箱='" + email + '\'' +
                '}';
    }
}
