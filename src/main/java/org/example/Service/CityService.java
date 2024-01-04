package org.example.Service;

import org.example.Entity.City;
import org.example.Entity.Specification;
import org.example.Entity.User;
import org.example.Service.Interface.CityServiceInterface;

import java.util.List;
import java.util.stream.Collectors;

public class CityService implements CityServiceInterface {

    InputService inputService = new InputService(); //Dependency injection

    @Override
    public City register() {

            String country = inputService.getInputString("Country");
            String cityName = inputService.getInputString("City Name");
        System.out.println("Qeyd safety,technology,cleanliness,naturalResource " +
                "ve economy 1 ve 10 bal uzerinde deyerlendirin");
            Integer safety = inputService.getInputInteger("Safety");
            Integer technology = inputService.getInputInteger("Technology");
            Integer cleanliness = inputService.getInputInteger("Cleanliness");
            Integer naturalResource = inputService.getInputInteger("Natural Resource");
            Integer economy = inputService.getInputInteger("Economy");
        System.out.println("Qeyd Price hissesine Seherin qiymeti yazilir");
            Integer price = inputService.getInputInteger("Price");
            Integer capacity = inputService.getInputInteger("Capacity");
            Specification specification = new Specification();
            specification.setSafety(safety);
            specification.setTechnology(technology);
            specification.setCleanliness(cleanliness);
            specification.setNaturalResource(naturalResource);
            specification.setEconomy(economy);
            City city = new City(country, cityName, price, capacity, specification);
            return city;
    }


    public void filter(List<User> list, List<City> listCity) {
        for (City city : listCity) {
            System.out.println(city.getCityName());
        }
        String chooseCity = inputService.getInputString("Write the name of the country");
        List<User> filterUser = list.stream().filter(l -> l.getCity().equalsIgnoreCase(chooseCity))
                .collect(Collectors.toList());
        System.out.println(filterUser);
    }
}






