package org.example.Service;

import org.example.Entity.Admin;
import org.example.Entity.Enum.Role;
import org.example.Entity.Security;
import org.example.Entity.User;
import org.example.Service.Interface.SecurityInterface;

import java.util.List;
import java.util.Scanner;

public class SecurityService implements SecurityInterface {

    InputService inputService = new InputService(); //Dependency injection


    @Override
    public List<Admin> singUpAdmin(List<Admin> list) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please sing up");
        String name = inputService.getInputString("Name");
        String surname = inputService.getInputString("Surname");
        String username = inputService.getInputString("Username");
        String parol = inputService.getInputString("Parol");
        Security security = new Security(username, parol, Role.ADMIN);
        Admin admin = new Admin(name, surname, security);
        System.out.println("successful");
        list.add(admin);
        return list;
    }

    @Override
    public void loginAdmin(List<Admin> list) {

        String username = "";
        String parol = "";
        Role role = Role.ADMIN;
        boolean found = true;
        while (found) {
            Scanner scan = new Scanner(System.in);
            System.out.println("Please Enter login");
            username = inputService.getInputString("Username");
            parol = inputService.getInputString("Parol");
            for (Admin admin :
                    list) {
                if (username.equals(admin.getSecurity().getUsername())
                        && parol.equals(admin.getSecurity().getParol())
                        && (role == admin.getSecurity().getRole())) {
                    System.out.println("successful");
                    found = false;
                } else {
                    System.out.println("Error-401");
                    System.out.println("Please login again");
                }
            }
        }
    }

    @Override
    public List<User> singUpUser(List<User> list) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please sing up");
        String name = inputService.getInputString("Name");
        String surname = inputService.getInputString("Surname");
        String profession = inputService.getInputString("Profession");
        Integer age = inputService.getInputInteger("Age");
        String username = inputService.getInputString("Username");
        String parol = inputService.getInputString("Parol");
        Security security = new Security(username, parol, Role.USER);
        User user = new User(name, surname, profession, age, security,0);

        System.out.println("successful");
        list.add(user);
        return list;
    }


    @Override
    public User loginUser(List<User> list) {
        User user1=new User();
        String username = "";
        String parol = "";
        Role role = Role.USER;
        boolean found = true;
        while (found) {
            Scanner scan = new Scanner(System.in);
            System.out.println("Please Enter login");
            username = inputService.getInputString("Username");
            parol = inputService.getInputString("Parol");
            for (User user :
                    list) {
                if (username.equals(user.getSecurity().getUsername())
                        && parol.equals(user.getSecurity().getParol())
                        && (role == user.getSecurity().getRole())) {

                    // qeyd hal hazirda sisteme daxil olan userin datasini bilmek ucundur.
                    Security security=new Security();
                    security.setUsername(user.getSecurity().getUsername());
                    security.setParol(user.getSecurity().getParol());
                    security.setRole(role);
                    user1.setName(user.getName());
                    user1.setSurname(user.getSurname());
                    user1.setProfession(user.getProfession());
                    user1.setAge(user.getAge());
                    user1.setSecurity(security);
                    user1.setMoney(user.getMoney());
                    user1.setCity(user.getCity());

                    System.out.println("successful");
                    found = false;
                } else {
                    System.out.println("Error-401");
                    System.out.println("Please login again");
                }
            }
        }
        return user1;
    }





}
