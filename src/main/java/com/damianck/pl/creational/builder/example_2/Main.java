package com.damianck.pl.creational.builder.example_2;

public class Main {
    public static void main(String[] args) {

        NutritionIngredients nutritionIngredients = new NutritionIngredients.Builder(240, 8)
                .calories(100)
                .sodium(35)
                .carbohydrate(27)
                .build();

        System.out.println(nutritionIngredients);

    }
}
