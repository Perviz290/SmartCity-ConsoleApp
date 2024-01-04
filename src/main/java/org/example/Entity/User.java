package org.example.Entity;

import lombok.*;



public class User{

    private String name;
    private String surname;
    private String profession;
    private int age;
    private Security security;
    private String city;
    private Integer money;


    public User(){

    }


    public User(String name, String surname, String profession, int age, Security security,Integer money) {
        this.name = name;
        this.surname = surname;
        this.profession = profession;
        this.age = age;
        this.security = security;
        this.money=money;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Security getSecurity() {
        return security;
    }

    public void setSecurity(Security security) {
        this.security = security;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Integer getMoney() {
        return money;
    }

    public void setMoney(Integer money) {
        this.money = money;
    }
}
