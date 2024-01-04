package org.example.Entity;

import lombok.*;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class User{

    private String name;
    private String surname;
    private String profession;
    private int age;
    private Security security;
    private String city;
    private Integer money;




    public User(String name, String surname, String profession, int age, Security security,Integer money) {
        this.name = name;
        this.surname = surname;
        this.profession = profession;
        this.age = age;
        this.security = security;
        this.money=money;
    }



}
