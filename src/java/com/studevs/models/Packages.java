/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.studevs.models;

/**
 *
 * @author Sajid
 */
public class Packages {

    private int id;
    private String name;
    private String cost;
    private String duration;
    private String number_of_photographer;
    private String cover_person;
    private String photo_info;
    private String pre_post_shooting;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCost() {
        return cost;
    }

    public void setCost(String cost) {
        this.cost = cost;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public String getNumber_of_photographer() {
        return number_of_photographer;
    }

    public void setNumber_of_photographer(String number_of_photographer) {
        this.number_of_photographer = number_of_photographer;
    }

    public String getCover_person() {
        return cover_person;
    }

    public void setCover_person(String cover_person) {
        this.cover_person = cover_person;
    }

    public String getPhoto_info() {
        return photo_info;
    }

    public void setPhoto_info(String photo_info) {
        this.photo_info = photo_info;
    }

    public String getPre_post_shooting() {
        return pre_post_shooting;
    }

    public void setPre_post_shooting(String pre_post_shooting) {
        this.pre_post_shooting = pre_post_shooting;
    }

}
