package com.example.foodshop;

import com.example.foodshop.Controllers.IndexController;
import com.example.foodshop.Controllers.RecipeController;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

import java.io.IOException;

public class App extends javafx.application.Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader indexLoader = new FXMLLoader(App.class.getResource("index-view.fxml"));
        FXMLLoader recipeLoader = new FXMLLoader(App.class.getResource("recipe-view.fxml"));

        // Load the FXML files and get the corresponding controllers
        Pane indexPane = indexLoader.load();
        Pane recipePane = recipeLoader.load();

        // Get Controllers
        IndexController indexController = indexLoader.getController();
        RecipeController recipeController = recipeLoader.getController();

        // Pass reference to controllers
        indexController.setRecipePane(recipePane);
        indexController.setRecipeController(recipeController);
        recipeController.setIndexPane(indexPane);


        // Set up the main scene with a StackPane as the root container
        StackPane rootPane = new StackPane();
        rootPane.getChildren().addAll(indexPane, recipePane);

        // Initially show the table view and hide the graph view
        indexPane.setVisible(true);
        recipePane.setVisible(false);

        Scene scene = new Scene(rootPane, 750, 750);
        stage.setTitle("Cook Book");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}