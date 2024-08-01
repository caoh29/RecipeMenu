package com.example.foodshop.Lib;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;



public class ApiAdapter {
    private static final String API_BASE_URL = "https://api.apilayer.com/spoonacular";
    private static final String API_KEY = "Y9tDaJwWiHJEDuIWpWlbBGlGZneygjcH";

    private final HttpClient client;

    public ApiAdapter() {
        this.client = HttpClient.newHttpClient();
    }

    private String fetch(String API_URL) {
        try {
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create(API_URL))
                    .setHeader("apikey", API_KEY)
                    .build();
            HttpResponse<String> response = this.client.send(request,
                    HttpResponse.BodyHandlers.ofString());
            if (response.statusCode() == 200) {
                return response.body();
            } else {
                System.out.println("Error:" + response.statusCode());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "There was an Error with the request";
    }

    public String fetchRecipe(String query, String cuisine, String diet, String ingredients, String excludeIngredients, Integer maxCalories, Integer maxFat, Integer maxProtein, Integer maxCarbs, Integer maxSugar) {
        StringBuilder urlBuilder = new StringBuilder(API_BASE_URL + "/recipes/complexSearch");

        if (query != null && !query.isEmpty()) urlBuilder.append("?query=").append(query);
        if (cuisine != null && !cuisine.isEmpty()) urlBuilder.append("&cuisine=").append(cuisine);
        if (diet != null && !diet.isEmpty()) urlBuilder.append("&diet=").append(diet);
        if (ingredients != null && !ingredients.isEmpty()) urlBuilder.append("&includeIngredients=").append(ingredients);
        if (excludeIngredients != null && !excludeIngredients.isEmpty()) urlBuilder.append("&excludeIngredients=").append(excludeIngredients);
        if (maxCalories != null) urlBuilder.append("&maxCalories=").append(maxCalories);
        if (maxFat != null) urlBuilder.append("&maxFat=").append(maxFat);
        if (maxProtein != null) urlBuilder.append("&maxProtein=").append(maxProtein);
        if (maxCarbs != null) urlBuilder.append("&maxCarbs=").append(maxCarbs);
        if (maxSugar != null) urlBuilder.append("&maxSugar=").append(maxSugar);

        String API_URL = urlBuilder.toString();
        return fetch(API_URL);
    }

    public String fetchRecipeById(int id) {
        String API_URL = API_BASE_URL + "/recipes/" + id + "/information";
        return fetch(API_URL);
    }

}