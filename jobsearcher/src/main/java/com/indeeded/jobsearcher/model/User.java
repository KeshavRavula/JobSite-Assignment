package com.indeeded.jobsearcher.model;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;

public class User {

    @Id
    @GeneratedValue
    private String id;
    private String name;
    private long phoneNum;
    private String organization;
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

    @Override
    public String toString() {
        return "User{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", phoneNum=" + phoneNum +
                ", organization='" + organization + '\'' +
                ", role='" + role + '\'' +
                '}';
    }
}
