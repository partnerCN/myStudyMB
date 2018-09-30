package com.partnerCN.model;

/*
 * @Author:YKK_LiaoJJ
 * @Time:2018-08-28(17:00)
 * @Content:
 */
public class User {

    private Integer id;
    private String userName;
    private String password;
    private String name;
    private String sex;
    private int age;
    private String qq;
    private String email;
    private String registerTime;

    public User() {
        super();
    }

    public User(String userName, String password, String name, String sex, int age, String qq, String email, String registerTime) {
        this.userName = userName;
        this.password = password;
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.qq = qq;
        this.email = email;
        this.registerTime = registerTime;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getQq() {
        return qq;
    }

    public void setQq(String qq) {
        this.qq = qq;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getRegisterTime() {
        return registerTime;
    }

    public void setRegisterTime(String registerTime) {
        this.registerTime = registerTime;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                ", name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", age=" + age +
                ", qq='" + qq + '\'' +
                ", email='" + email + '\'' +
                ", registerTime='" + registerTime + '\'' +
                '}';
    }
}
