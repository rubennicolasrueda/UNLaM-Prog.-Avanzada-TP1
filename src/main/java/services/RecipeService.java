package services;

import domain.Ingredient;
import domain.Recipe;
import messages.ErrorMessage;

import java.util.Scanner;
import java.io.FileNotFoundException;
import java.io.File;
import java.util.ArrayList;

/* todo clase que lee los archivos de texto y los convierte a
//objetos de Java. La clase OrganizadorRecetas debe utilizar esta clase
//para obtener el listado de recetas o de ingredientes, no pueden leerse
//los archivos dentro de la misma clase OrganizadorRecetas.
 */

public class RecipeService {

    public ArrayList<Ingredient> getIngredients() {
        ArrayList<Ingredient> ingredientList = new ArrayList<>();
        // todo remove directory from code
        String IngredientsPath = ".\\src\\main\\resources\\ingredients\\Ingredients.txt";
        File file = new File(IngredientsPath);

        try (Scanner sc = new Scanner(file)) {
            while (sc.hasNextLine()) {
                String line = sc.nextLine();
                Ingredient ingredient = getIngredientFromAString(line);
                ingredientList.add(ingredient);

            }
        } catch (FileNotFoundException exception) {
            System.out.println(ErrorMessage.ARCHIVO_INGREDIENTES_NO_ENCONTRADO.getMessage());
        } finally {
            return ingredientList;
        }
    }

    private Ingredient getIngredientFromAString(String line) {
        String[] splittedLine = line.split(",");
        int id = Integer.parseInt(splittedLine[0]);
        String name = splittedLine[1];
        int amount = Integer.parseInt(splittedLine[2]);
        return new Ingredient(id, name, amount);
    }

    public ArrayList<Recipe> getRecepies() {
        ArrayList<Recipe> result = new ArrayList<>();
        // todo remove directory from code
        String recipesPath = ".\\src\\main\\resources\\recipes\\Recipe5.txt";
        File file = new File(recipesPath);
        try (Scanner sc = new Scanner(file)) {
            while (sc.hasNextLine()) {
                ArrayList<Ingredient> ingredients = new ArrayList<>();
                String line = sc.nextLine();
                String[] splittedLine = line.split(";");
                String name = splittedLine[0];
                // ingredientes
                for(int i = 1; splittedLine.length != i; i++){
                    Ingredient ingredient = getIngredientFromAString(splittedLine[i]);
                    ingredients.add(ingredient);
                }
                Recipe Item = new Recipe(name, ingredients);
                result.add(Item);
            }
        } catch (FileNotFoundException exception) {
            System.out.println(ErrorMessage.ARCHIVO_RECETAS_NO_ENCONTRADO.getMessage());
        } finally {
            return result;
        }
    }
}

