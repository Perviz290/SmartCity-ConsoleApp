package org.example.Service.Interface;

import org.example.Entity.City;
import org.example.Entity.User;

import java.util.List;

public interface BeanInterface {


    public void ChangeList(List<User>userList,User newUser);

    public City optionalList(String inputString,List<City>list);





}
