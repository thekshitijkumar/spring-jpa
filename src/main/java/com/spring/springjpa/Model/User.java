package com.spring.springjpa.Model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name="user")
//@IdClass(UserPrimaryKey.class)
public class User  {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
//    @Id
    private String name;
//    @Column(name = "desh(country)")
    private String country;
    private int age;

    public User() {
    }

    public User(int id, String name, String country, int age) {
        this.id = id;
        this.name = name;
        this.country = country;
        this.age = age;
    }

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

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
