package com.example.recipe;

import android.annotation.SuppressLint;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.WindowDecorActionBar;

import java.util.List;

public class RecipeDetailActivity extends AppCompatActivity {
    MyDatabaseHelper dbHelper = new MyDatabaseHelper(this);
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recipe_detail);

        TextView recipeNameTextView = findViewById(R.id.recipeNameTextView);
        TextView tvRecipe = findViewById(R.id.tvRecipe);
        ImageView imageView = findViewById(R.id.imageView);
        /*List<String> ingredients = getIntent().getStringArrayListExtra("ingredients");
        TextView  tvIngredients = findViewById(R.id. tvIngredients);*/

        /*if (ingredients != null) {
            StringBuilder ingredientsText = new StringBuilder();
            for (String ingredient : ingredients) {
                ingredientsText.append("- ").append(ingredient).append("\n");
            }

            tvIngredients.setText(ingredientsText.toString());
        }*/

        String recipeName = getIntent().getStringExtra("recipeName");
        SQLiteDatabase db = dbHelper.getReadableDatabase();


        String[] columns = {MyDatabaseHelper.COLUMN_DISH, MyDatabaseHelper.COLUMN_RECIPE, MyDatabaseHelper.COLUMN_IMG};


        String selection = MyDatabaseHelper.COLUMN_DISH + "=?";
        String[] selectionArgs = {recipeName};

        Cursor cursor = db.query(
                MyDatabaseHelper.TABLE_NAME, columns, selection, selectionArgs, null, null, null
        );
        if (cursor.moveToFirst()) {
            // If there is a match
            @SuppressLint("Range") String dish_name = cursor.getString(cursor.getColumnIndex(MyDatabaseHelper.COLUMN_DISH));
            @SuppressLint("Range") String store_recipe = cursor.getString(cursor.getColumnIndex(MyDatabaseHelper.COLUMN_RECIPE));
            @SuppressLint("Range") String recipe_img = cursor.getString(cursor.getColumnIndex(MyDatabaseHelper.COLUMN_IMG));

            int imageResId = getResources().getIdentifier(recipe_img, "drawable", getPackageName());
            if (imageResId != 0) { // Check if the resource exists
                imageView.setImageResource(imageResId);
            } else {

                imageView.setContentDescription("Image not found");
            }
            recipeNameTextView.setText(dish_name);
            //tvIngredients.setText(ingredients.toString());
            tvRecipe.setText(store_recipe);

        } else {
            Log.d("MainActivity", "No record found in database for: ");
        }
        cursor.close();
        db.close();
    }


}
