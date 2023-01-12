package com.recipes.recipelist.models;


import jakarta.persistence.Entity;

@Entity
public class RecipeModel extends BaseEntity {

    private String name;
    private String time;
    private String rating;

    public RecipeModel(){

    }


    public RecipeModel(String name, String time, String rating) {
        this.name = name;
        this.time = time;
        this.rating = rating;
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
