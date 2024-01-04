package org.example.Entity;
import lombok.*;
import java.util.List;



public class City {

    private String country;
    private String cityName;
    private Integer price;
    private  Integer capacity;
    Specification specification;

    public City(String country, String cityName, Integer price, Integer capacity, Specification specification) {
        this.country = country;
        this.cityName = cityName;
        this.price = price;
        this.capacity = capacity;
        this.specification = specification;
    }

    public City() {

    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public Integer getCapacity() {
        return capacity;
    }

    public void setCapacity(Integer capacity) {
        this.capacity = capacity;
    }

    public Specification getSpecification() {
        return specification;
    }

    public void setSpecification(Specification specification) {
        this.specification = specification;
    }

    @Override
    public String toString() {
        return "City{" +
                "country='" + country + '\'' +
                ", cityName='" + cityName + '\'' +
                ", price=" + price +
                ", capacity=" + capacity +
                ", specification=" + specification +
                '}';
    }
}
