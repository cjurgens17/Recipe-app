package com.recipes.recipelist.bootstrap;

import com.recipes.recipelist.models.Chef;
import com.recipes.recipelist.models.RecipeModel;
import com.recipes.recipelist.services.ChefService;
import com.recipes.recipelist.services.RecipeService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataOnLoad implements CommandLineRunner {

    private final RecipeService recipeService;
    private final ChefService chefService;

    public DataOnLoad(RecipeService recipeService,ChefService chefService) {
        this.recipeService = recipeService;
        this.chefService = chefService;
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

        System.out.println("------------Chefs who made the recipes");

        Chef chef1 = new Chef("Bobby", "Flay");
        chef1.getChefRecipes().add(recipe1);
        chefService.save(chef1);

        Chef chef2 = new Chef("Gordon","Ramsay");
        chef2.getChefRecipes().add(recipe2);
        chefService.save(chef2);

        Chef chef3 = new Chef("Jamie","Oliver");
        chef3.getChefRecipes().add(recipe3);
        chefService.save(chef3);

        System.out.print(chef1.getFirstName()+ " " +chef1.getLastName() + " made the famous ");
        chef1.getChefRecipes().forEach(recipeModel -> System.out.print(recipe1.getName()));
        System.out.println();
        System.out.print(chef2.getFirstName()+ " " +chef2.getLastName() + " made the famous ");
        chef2.getChefRecipes().forEach(recipeModel -> System.out.print(recipe2.getName()));
        System.out.println();
        System.out.print(chef3.getFirstName()+ " " +chef3.getLastName() + " made the famous ");
        chef3.getChefRecipes().forEach(recipeModel -> System.out.print(recipe3.getName()));
        System.out.println();


    }
}
