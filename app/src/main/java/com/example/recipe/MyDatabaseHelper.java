package com.example.recipe;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class MyDatabaseHelper extends SQLiteOpenHelper {

    private static final String DATABASE_NAME = "RecipeDatabase.db";
    private static final int DATABASE_VERSION = 1;
    static final String TABLE_NAME = "my_recipe";
    private static final String COLUMN_ID = "_id";
    static final String COLUMN_DISH = "dish_name";
    static final String COLUMN_RECIPE = "store_recipe";
    static final String COLUMN_IMG = "recipe_img";

    public MyDatabaseHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String createTable = "CREATE TABLE " + TABLE_NAME + " (" +
                COLUMN_ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " +
                COLUMN_DISH + " TEXT, " +
                COLUMN_RECIPE + " TEXT," +
                COLUMN_IMG + " TEXT )";
        db.execSQL(createTable);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_NAME);
        onCreate(db);
    }

    /*//PARA SA ADD NG DETAILS SA DATABASE TABLE
    public void addRecipe(String dish, String recipe, String img) {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put(COLUMN_DISH, dish);
        contentValues.put(COLUMN_RECIPE, recipe);
        contentValues.put(COLUMN_IMG, img);

        long result = db.insert(TABLE_NAME, null, contentValues);
        if (result == -1) {
        } else {
        }
    }

    public void deleteTable() {
        SQLiteDatabase db = this.getWritableDatabase();
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_NAME);
        onCreate(db);
    }*/
}
