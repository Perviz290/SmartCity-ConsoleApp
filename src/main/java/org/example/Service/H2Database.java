package org.example.Service;

import org.example.Entity.*;
import org.example.Entity.Enum.Role;

import java.util.ArrayList;
import java.util.List;

public class H2Database {

    //Qeyd bu service static database kimi istifade olunur;


    InputService inputService=new InputService();
    public List<City> setCity(){
        Specification specification1=new Specification(7,6,
                6,5,3);
        City city1=new City("Turkey","Istanbul",450,15,specification1);
        Specification specification2=new Specification(9,8,
                9,6,9);
        City city2=new City("Italy","Roma",850,20,specification2);
        ArrayList<City> list = new ArrayList<>(List.of(city1, city2));
       return list;
    }

public  List<User>setUser(){
    Security security1=new Security("perviz","1234", Role.USER);
    User user1=new User("Perviz","Veliyev","Back-end program",26,security1,0);
   user1.setCity("Roma");
    Security security2=new Security("oktay","1234", Role.USER);
    User user2=new User("oktay","verdiyev","Full-stack program",20,security2,0);
    user2.setCity("Istanbul");
    ArrayList<User> list = new ArrayList<>(List.of(user1, user2));
    return list;
}


    public List<Admin> setAdmin() {
        Security security1=new Security("ali","1234", Role.ADMIN);
        Admin admin=new Admin("Aliakbar","Heyderov",security1);
        ArrayList<Admin> list = new ArrayList<>(List.of(admin));
        return list;
    }










}





