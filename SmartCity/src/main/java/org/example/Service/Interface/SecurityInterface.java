package org.example.Service.Interface;

import org.example.Entity.Admin;
import org.example.Entity.User;

import java.util.List;

public interface SecurityInterface {


    public List<Admin> singUpAdmin(List<Admin>list);

    public void loginAdmin(List<Admin>list);

    public List<User> singUpUser(List<User>list);

    public User loginUser(List<User>list);


}