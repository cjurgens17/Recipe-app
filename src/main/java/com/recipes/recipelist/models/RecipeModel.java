package com.recipes.recipelist.models;


import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class RecipeModel extends BaseEntity {

    private String name;
    private String time;
    private String rating;

    @ManyToOne
    @JoinColumn(name = "chef_id")
    private Chef chef;

    public RecipeModel(){

    }


    public RecipeModel(String name, String time, String rating) {
        this.name = name;
        this.time = time;
        this.rating = rating;
    }

    public Chef getChef() {
        return chef;
    }

    public void setChef(Chef chef) {
        this.chef = chef;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }
}
