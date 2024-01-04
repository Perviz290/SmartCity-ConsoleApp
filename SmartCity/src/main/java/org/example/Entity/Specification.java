package org.example.Entity;

import lombok.*;

@Getter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Specification {

    //Qeyd her bir specification 10 bal sistemi uzerinden deyerlendirilir;

    private Integer safety;
    private Integer technology;
    private Integer cleanliness;
    private Integer naturalResource;
    private Integer economy;



    public void setSafety(Integer safety) {
        if(safety<=10 && safety>=1){
            this.safety = safety;
        }else {
            throw new IllegalArgumentException("Qeyd safety,technology,cleanliness,naturalResource " +
                    "ve economy 1 ve 10 bal uzerinde deyerlendirin");
        }
    }

    public void setTechnology(Integer technology) {
        if(technology<=10&&technology>=1){
            this.technology = technology;
        }else {
            throw new IllegalArgumentException("Qeyd safety,technology,cleanliness,naturalResource " +
                    "ve economy 1 ve 10 bal uzerinde deyerlendirin");
        }
    }

    public void setCleanliness(Integer cleanliness) {
        if(cleanliness<=10&&cleanliness>=1){
            this.cleanliness = cleanliness;
        }else {
            throw new IllegalArgumentException("Qeyd safety,technology,cleanliness,naturalResource " +
                    "ve economy 1 ve 10 bal uzerinde deyerlendirin");
        }
    }

    public void setNaturalResource(Integer naturalResource) {
        if(naturalResource<=10&&naturalResource>=1){
            this.naturalResource = naturalResource;
        }else {
            throw new IllegalArgumentException("Qeyd safety,technology,cleanliness,naturalResource " +
                    "ve economy 1 ve 10 bal uzerinde deyerlendirin");
        }
    }

    public void setEconomy(Integer economy) {
        if(economy<=10&&economy>=1){
            this.economy = economy;
        }else {
            throw new IllegalArgumentException("Qeyd safety,technology,cleanliness,naturalResource " +
                    "ve economy 1 ve 10 bal uzerinde deyerlendirin");
        }
    }




}