package org.example.Service;

import org.example.Entity.City;
import org.example.Entity.User;
import org.example.Service.Interface.MoneyInterface;

import java.util.List;

public class MoneyService implements MoneyInterface {


    InputService inputService = new InputService();
    BeanService beanService = new BeanService();

    @Override
    public void changeBalance(User user, List<User> list) {
        System.out.println("You money=" + user.getMoney());
        Integer price = inputService.getInputInteger("How much money do you want to add to the balance");
        user.setMoney(user.getMoney() + price);
        System.out.println(user.getMoney());
        beanService.ChangeList(list, user);
    }

    @Override
    public Integer checkMoney(User user, City city) {
        int money = user.getMoney() - city.getPrice();
        if (money >= 0) {
            return money;
        } else {
            throw new RuntimeException("There is not enough money");
        }
    }




}

