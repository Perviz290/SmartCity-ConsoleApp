package org.example.Entity.Enum;

public enum Role {

    ADMIN("admin"),
    USER("user");


    private final String role;

    private Role(String role) {
        this.role = role;
    }

    public String getValue() {
        return role;
    }



}
