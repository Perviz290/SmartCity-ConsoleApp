package org.example.Service.Interface;

import org.example.Entity.City;
import org.example.Entity.User;

import java.util.List;

public interface RegisterUserInterface {

    public User register(List<User>adminList);

    public void chooseCity(User user,List<City>cityList,List<User>userList);



}
