package com.example.foodshop.Controllers;

import com.example.foodshop.Models.RecipeComplex;
import com.google.gson.Gson;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import org.jsoup.Jsoup;

public class RecipeController {
    @FXML
    private VBox recipeViewContent;
    private Pane indexPane;


    @FXML
    private Label recipeTitle;
    @FXML
    private TextArea recipeSummary;
    @FXML
    private TextArea recipeInstructions;
    @FXML
    private ImageView recipeImage;
    @FXML
    private Label vegetarian;
    @FXML
    private Label vegan;
    @FXML
    private Label glutenFree;
    @FXML
    private Label dairyFree;
    @FXML
    private Label veryHealthy;
    @FXML
    private Label cheap;
    @FXML
    private Label veryPopular;
    @FXML
    private Label sustainable;
    @FXML
    private Label lowFodmap;
    @FXML
    private Label weightWatcherPoints;
    @FXML
    private Label aggregateLikes;
    @FXML
    private Label healthScore;
    @FXML
    private Label creditsText;
    @FXML
    private Label sourceName;
    @FXML
    private Label pricePerServing;


    private Gson gson;

    public void initialize() {
        this.gson = new Gson();
    }

    public void setRecipeData(RecipeComplex recipe) {
        recipeTitle.setText(recipe.getTitle());
        recipeSummary.setText(stripHtmlTags(recipe.getSummary()));
        recipeInstructions.setText(formatInstructions(recipe.getInstructions()));

        Image image = new Image(recipe.getImage());
        recipeImage.setImage(image);

        vegetarian.setText(recipe.getVegetarian() ? "Yes" : "No");
        vegan.setText(recipe.getVegan() ? "Yes" : "No");
        glutenFree.setText(recipe.getGlutenFree() ? "Yes" : "No");
        dairyFree.setText(recipe.getDairyFree() ? "Yes" : "No");
        veryHealthy.setText(recipe.getVeryHealthy() ? "Yes" : "No");
        cheap.setText(recipe.getCheap() ? "Yes" : "No");
        veryPopular.setText(recipe.getVeryPopular() ? "Yes" : "No");
        sustainable.setText(recipe.getSustainable() ? "Yes" : "No");
        lowFodmap.setText(recipe.getLowFodmap() ? "Yes" : "No");

        weightWatcherPoints.setText(String.valueOf(recipe.getWeightWatcherSmartPoints()));
        aggregateLikes.setText(String.valueOf(recipe.getAggregateLikes()));
        healthScore.setText(String.valueOf(recipe.getHealthScore()));
        creditsText.setText(recipe.getCreditsText());
        sourceName.setText(recipe.getSourceName());
        pricePerServing.setText(String.format("$%.2f", recipe.getPricePerServing()));
    }

    private String stripHtmlTags(String html) {
        return Jsoup.parse(html).text();
    }

    private String formatInstructions(String html) {
        // Parse the HTML to plain text
        String plainText = Jsoup.parse(html).text();
        // Split by period followed by space (this can be adjusted to match the instruction format)
        String[] steps = plainText.split("\\. ");
        // Add bullet points to each step
        StringBuilder formattedInstructions = new StringBuilder();
        for (String step : steps) {
            formattedInstructions.append("• ").append(step.trim()).append(".\n");
        }
        return formattedInstructions.toString();
    }

    @FXML
    public void changeViewToIndex(ActionEvent event) {
        recipeViewContent.setVisible(false);
        indexPane.setVisible(true);
    }


    public void setIndexPane(Pane indexPane) {
        this.indexPane = indexPane;
    }
}