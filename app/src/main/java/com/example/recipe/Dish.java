package com.example.recipe;

import java.util.List;
public class Dish {
    private String name;
    private List<String> ingredients;

    public Dish(String name, List<String> ingredients) {
        this.name = name;
        this.ingredients = ingredients;
    }
    public String getName() {
        return name;
    }
    public List<String> getIngredients() {
        return ingredients;
    }
}
