package com.example.recipe;

import android.graphics.Color;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager.widget.ViewPager;

import com.google.android.material.tabs.TabLayout;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private List<String> selectedIngredients = new ArrayList<>();
    private List<String> allIngredients;
    private List<Dish> allDishes;
    private RecipeFragment recipeFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        allIngredients = SampleData.getAllIngredients();
        allDishes = SampleData.getAllDishes();

        ViewPager viewPager = findViewById(R.id.viewPager);
        TabLayout tabLayout = findViewById(R.id.tabLayout);

        recipeFragment = new RecipeFragment(new ArrayList<>(), allDishes);

        ViewPagerAdapter adapter = new ViewPagerAdapter(getSupportFragmentManager());
        adapter.addFragment(new IngredientFragment(allIngredients, this), "Ingredients");
        adapter.addFragment(recipeFragment, "Recipes");

        viewPager.setAdapter(adapter);
        tabLayout.setupWithViewPager(viewPager);

    }
    public void toggleIngredient(String ingredient, Button button) {
        if (selectedIngredients.contains(ingredient)) {
            selectedIngredients.remove(ingredient);
            button.setBackgroundColor(Color.TRANSPARENT);
        } else {
            selectedIngredients.add(ingredient);
            button.setBackgroundColor(Color.LTGRAY);
        }

        updateRecipesList();
    }

    private void updateRecipesList() {
        List<String> matchedRecipes = new ArrayList<>();

        for (Dish dish : allDishes) {
            boolean containsAnySelected = false;
            for (String selectedIngredient : selectedIngredients) {
                if (dish.getIngredients().contains(selectedIngredient)) {
                    containsAnySelected = true;
                    break;
                }
            }

            if (containsAnySelected) {
                matchedRecipes.add(dish.getName());
            }
        }

        recipeFragment.updateRecipesList(matchedRecipes);
    }

    private static class ViewPagerAdapter extends FragmentPagerAdapter {

        private final List<Fragment> fragmentList = new ArrayList<>();
        private final List<String> fragmentTitleList = new ArrayList<>();

        public ViewPagerAdapter(FragmentManager manager) {
            super(manager);
        }

        @Override
        public Fragment getItem(int position) {
            return fragmentList.get(position);
        }

        @Override
        public int getCount() {
            return fragmentList.size();
        }

        public void addFragment(Fragment fragment, String title) {
            fragmentList.add(fragment);
            fragmentTitleList.add(title);
        }

        @Override
        public CharSequence getPageTitle(int position) {
            return fragmentTitleList.get(position);
        }
    }
}
