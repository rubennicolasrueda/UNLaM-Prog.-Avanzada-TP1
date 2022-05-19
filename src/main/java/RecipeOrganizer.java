import domain.Ingredient;
import domain.Recipe;

import java.util.ArrayList;
import java.util.function.Predicate;

public class RecipeOrganizer {
    
    // todo ??? clase que se encarga de determinar si una receta puede hacerse en base a los ingredientes disponibles. Esta se comunica con la clase main.
    public ArrayList<Recipe> organice(ArrayList<Recipe> recipes, ArrayList<Ingredient> ingredients)  {
        ArrayList<Recipe> possibleRecipes = new ArrayList<>();

        recipes.stream().filter( recipe -> checkPossibleReciple(recipe, ingredients) ).findAny();

        recipes.forEach(
                recipe ->
                {
                    recipe.getIngredients().forEach(
                            ingredientNeeded ->
                                ingredients.stream().filter(
                                        ingredient ->
                                                ingredientNeeded.getId() == ingredient.getId()
                                ).findAny()

                    );
                    possibleRecipes.add(recipe);
                }
        );
        return recipes;
    }

    private boolean checkPossibleReciple(Recipe recipe, ArrayList<Ingredient> ingredientsAvailable) {
        boolean isInvalid = true;
        boolean isRecipeComplete = false;
        for (Ingredient ingredientExpected: recipe.getIngredients()) {
            ingredientsAvailable.stream().filter(
                    ingredient -> ingredient.getId() == ingredientExpected.getId()
            ).findAny();
        }
        return isInvalid;
    }
}
