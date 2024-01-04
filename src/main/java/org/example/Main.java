package org.example;

import org.example.Entity.Admin;
import org.example.Entity.City;
import org.example.Entity.User;
import org.example.Service.*;

import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        List<Admin> adminList = staticAdmin();
        List<User> userList = staticUser();
        List<City> cityList = staticCity();

        InputService inputService = new InputService();
        RegisterAdminService adminService = new RegisterAdminService();
        RegisterUserService userService = new RegisterUserService();
        CityService cityService = new CityService();
        MoneyService moneyService=new MoneyService();



        System.out.println("Welcome to SmartCity");
        while (true) {
        System.out.println("1.Admin Panel" + "\n2.User Panel");
        int getChose = inputService.getInputInteger("Choose one");
        switch (getChose) {
            case 1:
                adminService.register(adminList);
                System.out.println("1.Register City" + "\n2.List All Citys"
                        + "\n3.List User by City"+"\n4.List All User"); // Qeyd 3. Seher adina gore orda olan userleri qaytarir
                int getChoose = inputService.getInputInteger("Choose one");
                if (getChoose == 1) {
                    City city = cityService.register();
                    cityList.add(city);
                } else if (getChoose == 2) {
                    cityList.forEach(System.out::println);
                } else if (getChoose == 3) {
                    cityService.filter(userList,cityList);
                } else if (getChoose==4) {
                    userList.forEach(System.out::println);
                } else {
                    System.out.println("The number you selected is not correct!");
                }
                break;
                case 2:
                    User user1 = userService.register(userList);
                    System.out.println("1.List All Cityes and Choose city" + "\n2..Money Balance");
                    int getChse = inputService.getInputInteger("Choose one");
                    if (getChse == 1) {
                        cityList.forEach(System.out::println);
                        System.out.println("Your Money count="+user1.getMoney());
                        userService.chooseCity(user1,cityList,userList);
                    } else if (getChse == 2) {
                        System.out.println(user1);
                        moneyService.changeBalance(user1,userList);
                    } else {
                        System.out.println("The number you selected is not correct!");
                    }
                    break;
                default:
                    System.out.println("false");
            }
        }
    }





    //Qeyd static DataBasa
    public static List<City> staticCity() {
        H2Database database = new H2Database();
        return database.setCity();
    }

    public static List<User> staticUser() {
        H2Database database = new H2Database();
        return database.setUser();
    }

    public static List<Admin> staticAdmin() {
        H2Database database = new H2Database();
        return database.setAdmin();
    }
    }

