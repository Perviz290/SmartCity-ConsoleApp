package org.example.Entity;
import lombok.*;
import java.util.List;

@Getter
@Setter
@ToString
@NoArgsConstructor

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
}
