package org.example.Service;

import org.example.Entity.City;
import org.example.Entity.User;
import org.example.Service.Interface.RegisterUserInterface;

import java.util.List;

public class RegisterUserService implements RegisterUserInterface {

    SecurityService securityService = new SecurityService(); //Dependency injection
    InputService inputService = new InputService();//Dependency injection
    BeanService beanService=new BeanService();//Dependency injection
    MoneyService moneyService=new MoneyService();//Dependency injection

    @Override
    public User register(List<User>list) {
        User user=new User();
        System.out.println("Welcome to User Panel");
        System.out.println("1.Sing-Up? or 2.Login?");
        int getChose = inputService.getInputInteger("Choose one");
        switch (getChose) {
            case 1:
                System.out.println("Welcome to User Panel");
                list = securityService.singUpUser(list);
                user=securityService.loginUser(list);
                break;
            case 2:
                System.out.println("Welcome to User Panel");
               user= securityService.loginUser(list);
                break;
            default:
                System.out.println("The number you selected is not correct!");
        }
        return user;
    }



    @Override
    public void chooseCity(User user,List<City>listCity,List<User>userList) {

        Integer money= inputService.getInputInteger("1.Pul artir"+ "\n2..Seher sec");
        if (money==1){
            System.out.println(user);
            moneyService.changeBalance(user,userList);
        } else if (money==2) {
            System.out.println("Qeyd Şəhərin adını String olaraq yazın");
            String chooseCity= inputService.getInputString("Which city in the list do you want to choose");
            City city= beanService.optionalList(chooseCity,listCity);
            int money2= moneyService.checkMoney(user,city);
            user.setCity(city.getCityName());
            user.setMoney(money2);
            beanService.ChangeList(userList,user);
        }else {
            System.out.println("The number you selected is not correct!");
        }


    }






}