package org.example.Entity;

import lombok.*;


public class Admin {

    private String name;
    private String surname;
    private Security security;


    public Admin(String name, String surname, Security security) {
        this.name = name;
        this.surname = surname;
        this.security = security;
    }

    public Admin() {

    }

    @Override
    public String toString() {
        return "Admin{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", security=" + security +
                '}';
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

    public Security getSecurity() {
        return security;
    }

    public void setSecurity(Security security) {
        this.security = security;
    }
}
