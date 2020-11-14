package com.indeeded.jobsearcher.model;

import javax.persistence.*;

@Entity
//@Table
public class User {
    @Id
    //@GeneratedValue
    //@Column
    private String id;
    //@Column
    private String name;
    //@Column
    private long phoneNum;
    //@Column
    private String email;
    //@Column
    private String organization;
    //@Column
    private String role;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(long phoneNum) {
        this.phoneNum = phoneNum;
    }

    public String getOrganization() {
        return organization;
    }

    public void setOrganization(String organization) {
        this.organization = organization;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "User{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", phoneNum=" + phoneNum +
                ", email='" + email + '\'' +
                ", organization='" + organization + '\'' +
                ", role='" + role + '\'' +
                '}';
    }
}
