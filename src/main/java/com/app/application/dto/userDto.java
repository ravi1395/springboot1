package com.app.application.dto;

import com.app.application.model.UserRole;
import com.app.application.model.user;

import java.util.Objects;

public class userDto {

    private String name;
    private Long id;
    private UserRole role;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public UserRole getRole() {
        return role;
    }

    public void setRole(UserRole role) {
        this.role = role;
    }

    @Override
    public String toString() {
        return "userDto{" +
                "name='" + name + '\'' +
                ", password='" + id + '\'' +
                ", role=" + role +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        userDto userDto = (userDto) o;
        return Objects.equals(name, userDto.name) && Objects.equals(id, userDto.id) && role == userDto.role;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, id, role);
    }

    public userDto(user u){
        this.name = u.getName();
        this.id = u.getId();
        this.role = u.getRole();
    }

    public user asUser(){
        user u = new user();
        u.setRole(this.role);
        u.setId(this.id);
        u.setName(this.name);

        return u;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
