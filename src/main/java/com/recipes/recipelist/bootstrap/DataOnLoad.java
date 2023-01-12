package com.recipes.recipelist.bootstrap;

import com.recipes.recipelist.models.RecipeModel;
import com.recipes.recipelist.services.RecipeService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataOnLoad implements CommandLineRunner {

    private final RecipeService recipeService;

    public DataOnLoad(RecipeService recipeService) {
        this.recipeService = recipeService;
    }

    @Override
    public void run(String... args) throws Exception {
        RecipeModel recipe1 = new RecipeModel("Buck Choy Soup", "40 minutes", "8.5");
        RecipeModel recipe2 = new RecipeModel("Buffalo Chicken Pie","35 minutes", "7.4");
        RecipeModel recipe3 = new RecipeModel("vegan Mac N Cheese","45 minutes", "10");

        recipeService.save(recipe1);
        recipeService.save(recipe2);
        recipeService.save(recipe3);

        System.out.println("-----------Recipes Names");

        System.out.println(recipe1.getName());
        System.out.println(recipe2.getName());
        System.out.println(recipe3.getName());


    }
}
