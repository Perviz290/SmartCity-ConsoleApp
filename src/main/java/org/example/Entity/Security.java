package org.example.Entity;

import lombok.*;
import org.example.Entity.Enum.Role;




public class Security {

    private String username;
    private String parol;
    private Role role;


    public Security(){

    }

    public Security(String username, String parol, Role role) {
        this.username = username;
        this.parol = parol;
        this.role = role;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getParol() {
        return parol;
    }

    public void setParol(String parol) {
        this.parol = parol;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    @Override
    public String toString() {
        return "Security{" +
                "username='" + username + '\'' +
                ", parol='" + parol + '\'' +
                ", role=" + role +
                '}';
    }
}
