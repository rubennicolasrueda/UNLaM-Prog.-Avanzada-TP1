import domain.Ingredient;
import domain.Recipe;
import services.RecipeService;

import java.util.ArrayList;

public class App {

    // todo clase principal del programa, desde aquí debe llamarse a las funcionalidades de las otras clases
    public static void main(String[] args) {
        RecipeService recipeService = new RecipeService();
        RecipeOrganizer recipeOrganizer = new RecipeOrganizer();
        ArrayList<Ingredient> ingredients = recipeService.getIngredients();
        ArrayList<Recipe> recipes = recipeService.getRecepies();

        // test
        System.out.println(ingredients);
        System.out.println(recipes);

        recipeOrganizer.organice(recipes, ingredients);
    }
}

