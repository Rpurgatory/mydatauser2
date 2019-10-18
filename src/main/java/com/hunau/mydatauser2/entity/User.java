package com.hunau.mydatauser2.entity;

/**
 * @param $params$
 * @Description:
 * @Return: $returns$
 * @Author: 曹佳怡
 * @单位：湖南农业大学物联网工程专业
 * @Date: $date$ $time$
 * 开发版本：综合练习V0.1
 */


import javax.persistence.*;
import org.hibernate.validator.constraints.NotBlank;

import java.text.SimpleDateFormat;
import java.util.Date;
import org.hibernate.validator.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.util.List;
@Entity
@Table(name="tb_user")
public class User {
    @Id
    @GeneratedValue
    private Integer id;
    @NotEmpty(message="名字不能为空")
    @Column(length=40)
    private String name;
    @NotEmpty(message="密码不能为空")
    @Column(length=50)
    private String pwd;
    private String sexy;
    private Date birthday;
    private boolean isuse;
    private int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

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
        this.name = name==null?null:name.trim();
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd==null?null:pwd.trim();
    }

    public boolean isIsuse() {
        return isuse;
    }

    public void setIsuse(boolean isuse)
    {
        this.isuse = isuse;
    }

    public String getSexy() {
        return sexy;
    }

    public void setSexy(String sexy) {
        this.sexy = sexy;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    @Override
    public String toString() {
        return "User{" +
                "学号=" + id +
                ", 姓名='" + name + '\'' +
                ", 密码='" + pwd + '\'' +
                ", 性别='" + sexy + '\'' +
                ", 生日=" +new SimpleDateFormat("yyyy年MM月dd日").format(birthday)  +'\''+
                ",年龄="+age+'\''+
                ", 是否有效=" + isuse +
                '}';
    }
}


