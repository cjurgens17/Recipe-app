package com.recipes.recipelist.models;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;

import java.util.HashSet;
import java.util.Set;

@Entity
public class Chef extends BaseEntity{

    private String firstName;
    private String lastName;

    @OneToMany(mappedBy = "chef")
    private Set<RecipeModel> chefRecipes = new HashSet<>();

    public Chef(){
    }

    public Chef(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Set<RecipeModel> getChefRecipes() {
        return chefRecipes;
    }

    public void setChefRecipes(Set<RecipeModel> chefRecipes) {
        this.chefRecipes = chefRecipes;
    }
}
