package com.example.foodshop.Controllers;

import com.example.foodshop.Lib.ApiAdapter;
import com.example.foodshop.Models.RecipeComplex;
import com.example.foodshop.Models.RecipeSearch;
import com.example.foodshop.Models.RecipeSimple;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;

public class IndexController {
    @FXML
    private VBox indexViewContent;
    @FXML
    private Pane recipePane;


    @FXML
    private TextField queryField;
    @FXML
    public TextField cuisineField;
    @FXML
    public TextField dietField;
    @FXML
    public TextField ingredientsField;
    @FXML
    public TextField excludeIngredientsField;
    @FXML
    public TextField maxCaloriesField;
    @FXML
    public TextField maxFatField;
    @FXML
    public TextField maxProteinField;
    @FXML
    public TextField maxCarbsField;
    @FXML
    public TextField maxSugarField;


    @FXML
    private TableView<RecipeSimple> recipesTable;
    @FXML
    private TableColumn<RecipeSimple, String> idColumn;
    @FXML
    private TableColumn<RecipeSimple, String> titleColumn;


    private Gson gson;
    private ApiAdapter api;
    private RecipeController recipeController;

    public void initialize() {
        this.gson = new Gson();
        this.api = new ApiAdapter();

        // Initialize values in the table
        idColumn.setCellValueFactory(new PropertyValueFactory<>("id"));
        titleColumn.setCellValueFactory(new PropertyValueFactory<>("title"));
    }

    public void setRecipePane(Pane recipePane) {
        this.recipePane = recipePane;
    }

    public void setRecipeController(RecipeController recipeController) {
        this.recipeController = recipeController;
    }

    @FXML
    protected void onSearchButtonClick() {
        // Get data from textfields and parse it
        String query = replaceWhiteSpace(queryField.getText());
        String cuisine = replaceWhiteSpace(cuisineField.getText());
        String diet = replaceWhiteSpace(dietField.getText());
        String ingredients = replaceWhiteSpace(ingredientsField.getText());
        String excludeIngredients = replaceWhiteSpace(excludeIngredientsField.getText());

        Integer maxCalories = parseInteger(maxCaloriesField.getText());
        Integer maxFat = parseInteger(maxFatField.getText());
        Integer maxProtein = parseInteger(maxProteinField.getText());
        Integer maxCarbs = parseInteger(maxCarbsField.getText());
        Integer maxSugar = parseInteger(maxSugarField.getText());

        // fetch the api
        String response = api.fetchRecipe(query, cuisine, diet, ingredients, excludeIngredients, maxCalories, maxFat, maxProtein, maxCarbs, maxSugar);

        // parse to object type
        RecipeSearch data = gson.fromJson(response, new
                TypeToken<RecipeSearch>(){}.getType());

        // display data into table view
        recipesTable.setItems(FXCollections.observableArrayList(data.results));
    }

    public String replaceWhiteSpace (String str) {
        if (str == null || str.isEmpty()) {
            return str;
        }

        // Split by comma and trim spaces around elements
        String[] parts = str.split(",");
        StringBuilder result = new StringBuilder();

        for (String part : parts) {
            if (result.length() > 0) {
                result.append(",");
            }
            result.append(part.trim().replace(" ", "%20"));
        }

        return result.toString();
        //return str.replace(" ", "%20");
    }

    // Helper methods for input validation
    private Integer parseInteger(String input) {
        try {
            return Integer.parseInt(input);
        } catch (NumberFormatException e) {
            return null;
        }
    }


    @FXML
    public void onRecipeDetailsButtonClick(ActionEvent event) {
        try {
            // Get item from table
            RecipeSimple selectedItem = recipesTable.getSelectionModel().getSelectedItem();
            // Fetch data based on id
            String response = api.fetchRecipeById(selectedItem.getId());
            // Parse from Json to Object Type
            RecipeComplex data = gson.fromJson(response, new TypeToken<RecipeComplex>(){}.getType());

            // Switch to the recipe view and pass data
            recipeController.setRecipeData(data);
            changeViewToRecipe();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void changeViewToRecipe() {
        indexViewContent.setVisible(false);
        recipePane.setVisible(true);
    }
}