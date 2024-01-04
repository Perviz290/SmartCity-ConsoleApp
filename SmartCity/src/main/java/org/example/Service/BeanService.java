package org.example.Service;

import org.example.Entity.City;
import org.example.Entity.User;
import org.example.Service.Interface.BeanInterface;

import java.util.List;

public class BeanService implements BeanInterface {


    @Override
    public void ChangeList(List<User> userList, User newUser) {

        for (int i = 0; i < userList.size(); i++) {
            if (userList.get(i).getSecurity().getUsername().equals(newUser.getSecurity().getUsername())) {
                userList.remove(i);
                break;
            }
        }
        userList.add(newUser);
    }


    @Override
    public City optionalList(String inputString, List<City> list) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getCityName().equalsIgnoreCase(inputString)) {
                return list.get(i);
            }
        }
        return null;
    }








}
