package com.recipes.recipelist.controllers;

import com.recipes.recipelist.models.Chef;
import com.recipes.recipelist.models.RecipeModel;
import com.recipes.recipelist.services.ChefService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ChefController {

    private final ChefService chefService;

    public ChefController(ChefService chefService) {
        this.chefService = chefService;
    }

    @RequestMapping({"/chefs", "chefs/list","/list"})
    public String getChefRecipes(Model model, Model model2){

        model.addAttribute("chefs", chefService.findAll());


        return "chefs/list";
    }
}
