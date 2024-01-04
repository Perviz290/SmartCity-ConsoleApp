package org.example.Service;

import org.example.Entity.Admin;
import org.example.Service.Interface.RegisterAdminInterface;
import java.util.List;

public class RegisterAdminService implements RegisterAdminInterface {

    SecurityService securityService=new SecurityService(); //Dependency injection
    InputService inputService=new InputService();//Dependency injection

    @Override
    public List<Admin> register(List<Admin>list) {
        System.out.println("Welcome to Admin Panel");
        System.out.println("1.Sing-Up? or 2.Login?");
        int getChose = inputService.getInputInteger("Choose one");
        switch (getChose) {
            case 1:
                System.out.println("Welcome to Admin Panel");
                list = securityService.singUpAdmin(list);
                securityService.loginAdmin(list);
                break;
            case 2:
                System.out.println("Welcome to Admin Panel");
                securityService.loginAdmin(list);
                break;
            default:
                System.out.println("The number you selected is not correct!");
        }
        return list;
    }





}
