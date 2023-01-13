package com.recipes.recipelist.services;

import com.recipes.recipelist.models.Chef;
import org.springframework.data.repository.CrudRepository;

public interface ChefService extends CrudRepository<Chef,Long> {
}
