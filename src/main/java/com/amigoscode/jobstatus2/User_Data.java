package com.amigoscode.jobstatus2;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.util.Objects;

@Entity
public class User_Data {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String f_name;
    private String l_name;


    public User_Data() {
    }

    public User_Data(Integer id, String f_name, String l_name) {
        this.id = id;
        this.f_name = f_name;
        this.l_name = l_name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getF_name() {
        return f_name;
    }

    public void setF_name(String f_name) {
        this.f_name = f_name;
    }

    public String getL_name() {
        return l_name;
    }

    public void setL_name(String l_name) {
        this.l_name = l_name;
    }


    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        User_Data userData = (User_Data) o;
        return Objects.equals(id, userData.id) && Objects.equals(f_name, userData.f_name) && Objects.equals(l_name, userData.l_name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, f_name, l_name);
    }
}
