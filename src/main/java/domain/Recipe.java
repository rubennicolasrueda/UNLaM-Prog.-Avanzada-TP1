package domain;
// todo nombre de la receta y una lista de ingredientes

import java.util.ArrayList;

public class Recipe {
    private String name; //Nombre de la receta
    private ArrayList<Ingredient> ingredients; //Array que contiene los ingredientes necesarios para hacer la receta

    public Recipe(String name, ArrayList<Ingredient> ingredients) {
        this.name = name;
        this.ingredients = ingredients;
    }

    public String getName() {
        return name;
    }

    public ArrayList<Ingredient> getIngredients() {
        return ingredients;
    }

    @Override
    public String toString() {
        return "Recipe{" +
                "name='" + name + '\'' +
                ", ingredients=" + ingredients +
                '}';
    }
}
