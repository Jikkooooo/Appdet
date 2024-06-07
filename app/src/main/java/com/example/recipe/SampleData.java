package com.example.recipe;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SampleData {
    public static List<String> getAllIngredients() {
        List<String> ingredients = new ArrayList<>();
        ingredients.add("Chicken");
        ingredients.add("Pork");
        ingredients.add("Oxtail");
        ingredients.add("Beef ");
        ingredients.add("Squash");
        ingredients.add("Eggplant");
        ingredients.add("Milkfish");
        ingredients.add("Taro leaves");
        ingredients.add("Coconut milk");
        ingredients.add("Rice flour");
        ingredients.add("Ube");
        ingredients.add("Coconut meat");
        ingredients.add("All-purpose flour");
        ingredients.add("Ampalaya");
        ingredients.add("Shrimp");
        ingredients.add("Fish");
        ingredients.add("Garlic");
        ingredients.add("String beans");
        ingredients.add("Tomatoes");
        ingredients.add("Carrots");
        ingredients.add("Evaporated milk");
        ingredients.add("Pork blood");
        ingredients.add("Onion");
        ingredients.add("Jackfruit");
        ingredients.add("Lumpia wrappers");
        ingredients.add("Potatoes");
        return ingredients;
    }

    public static List<Dish> getAllDishes() {
        List<Dish> dishes = new ArrayList<>();


                dishes.add(new Dish("Adobo", Arrays.asList("Chicken ", "Pork", "Soy sauce", "Vinegar", "Garlic","Bay leaves", "Peppercorns")));
        dishes.add(new Dish("Sinigang", Arrays.asList("Shrimp", "Fish", "Tamarind" ,"Vegetables")));
        dishes.add(new Dish("Lechon", Arrays.asList("Pork", "Salt", "Garlic", "Lemongrass")));
        dishes.add(new Dish("Kare-Kare", Arrays.asList("Oxtail", "Peanut butter", "Annatto seeds", "Eggplant", "String bean")));

        dishes.add(new Dish("Pancit", Arrays.asList("Oxtail", "Peanut butter", "Annatto seeds", "Eggplant", "String bean")));
        dishes.add(new Dish("Sinigang na Baboy", Arrays.asList("Oxtail", "Peanut butter", "Annatto seeds", "Eggplant", "String bean")));
        dishes.add(new Dish("Adobong Manok", Arrays.asList("Oxtail", "Peanut butter", "Annatto seeds", "Eggplant", "String bean")));

        dishes.add(new Dish("Tinola", Arrays.asList("Chicken", "Ginger", "Garlic", "Chili leaves", "Green papaya")));

        dishes.add(new Dish("Bistek Tagalog", Arrays.asList("Oxtail", "Peanut butter", "Annatto seeds", "Eggplant", "String bean")));

        dishes.add(new Dish("Sisig", Arrays.asList("Pig's head", "Chili peppers", "Onions")));
        dishes.add(new Dish("Ginataang Kalabasa at Sitaw", Arrays.asList("Squash", "String bean", "Coconut milk", "Shrimp or pork")));
        dishes.add(new Dish("Pinakbet", Arrays.asList("Ampalaya", "Squash", "String bean", "Okra", "Tomato")));

        dishes.add(new Dish("Paksiw na Lechon", Arrays.asList("Ampalaya", "Squash", "String bean", "Okra", "Tomato")));

        dishes.add(new Dish("Lumpiang Shanghai", Arrays.asList("Pork", "Carrots", "Onions", "Garlic", "Lumpia wrappers")));
        dishes.add(new Dish("Bicol Express", Arrays.asList("Pork ", "Coconut milk", "Garlic", "Onions", "Shrimp paste", "Chili peppers")));
        dishes.add(new Dish("Laing", Arrays.asList("Taro leaves", "Coconut milk", "Shrimp paste", "Garlic", "Chili peppers", "Onions")));

        dishes.add(new Dish("Escabeche", Arrays.asList("Ampalaya", "Squash", "String bean", "Okra", "Tomato")));

        dishes.add(new Dish("Ginataang Langka", Arrays.asList("Jackfruit", "Coconut milk", "Shrimp or smoked fish", "Garlic", "Onions")));
        dishes.add(new Dish("Dinuguan", Arrays.asList("Pork", "Pork blood", "Vinegar", "Garlic", "Chili peppers", "Onions")));
        dishes.add(new Dish("Turon", Arrays.asList("Banana", "Brown sugar", "Lumpia wrappers", "Cooking oil")));
        dishes.add(new Dish("Bibingka", Arrays.asList("Rice flour", "Coconut milk", "Sugar", "Salted eggs", "Cheese")));
        dishes.add(new Dish("Sapin-Sapin", Arrays.asList("Glutinous rice flour", "Coconut milk", "Sugar", "Ube", "Jackfruit")));

        dishes.add(new Dish("Puto Bumbong", Arrays.asList("Ampalaya", "Squash", "String bean", "Okra", "Tomato")));

        dishes.add(new Dish("Ube Halaya", Arrays.asList("Ube ", "Coconut milk", "Condensed mil", "Butter", "Sugar")));
        dishes.add(new Dish("Espasol", Arrays.asList("Glutinous rice flour", "Coconut milk", "Sugar", "Toasted rice flour")));

        dishes.add(new Dish("Palitaw", Arrays.asList("Ampalaya", "Squash", "String bean", "Okra", "Tomato")));

        dishes.add(new Dish("Goto", Arrays.asList("Beef ", "Rice", "Beef shank", "Garlic", "Ginger")));

        dishes.add(new Dish("Tapsilog", Arrays.asList("Ampalaya", "Beef ", "Garlic", "Onions", "Tomatoes")));


        return dishes;
    }
}
