package org.example.Service.Interface;

import org.example.Entity.City;
import org.example.Entity.User;

import java.util.List;

public interface MoneyInterface {


   public void changeBalance(User user, List<User>list);

   public Integer checkMoney(User user, City city);


}
