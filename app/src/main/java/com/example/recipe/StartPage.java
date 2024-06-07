package com.example.recipe;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class StartPage extends AppCompatActivity {
    EditText dish_input, recipe_input, img_input;
    Button add_button, delete_button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.intro);

        /*// Input Database
        dish_input = findViewById(R.id.editTextText);
        recipe_input = findViewById(R.id.editTextText2);
        img_input = findViewById(R.id.editTextText3);
        add_button = findViewById(R.id.button);
        delete_button = findViewById(R.id.delete_button);

        add_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MyDatabaseHelper myDB = new MyDatabaseHelper(StartPage.this);
                myDB.addRecipe(dish_input.getText().toString().trim(), recipe_input.getText().toString().trim(), img_input.getText().toString().trim());
                Toast.makeText(StartPage.this, "Recipe Added", Toast.LENGTH_SHORT).show();
            }
        });

        delete_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MyDatabaseHelper myDB = new MyDatabaseHelper(StartPage.this);
                myDB.deleteTable();
                Toast.makeText(StartPage.this, "Table Deleted", Toast.LENGTH_SHORT).show();
            }
        });*/

        Button buttonNext = findViewById(R.id.button_next);
        buttonNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(StartPage.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
}
