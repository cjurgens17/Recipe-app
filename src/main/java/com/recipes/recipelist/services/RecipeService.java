package com.recipes.recipelist.services;

import com.recipes.recipelist.models.RecipeModel;
import org.springframework.data.repository.CrudRepository;




public interface RecipeService extends CrudRepository<RecipeModel,Long>{


}
