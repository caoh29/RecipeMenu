package com.example.foodshop.Models;

public class RecipeComplex {
    private boolean vegetarian;
    private boolean vegan;
    private boolean glutenFree;
    private boolean dairyFree;
    private boolean veryHealthy;
    private boolean cheap;
    private boolean veryPopular;
    private boolean sustainable;
    private boolean lowFodmap;
    private float weightWatcherSmartPoints;
    private String gaps;
    private float aggregateLikes;
    private float healthScore;
    private String creditsText;
    private String license;
    private String sourceName;
    private float pricePerServing;
    private Ingredient[] extendedIngredients;
    private float id;
    private String title;
    private float readyInMinutes;
    private float servings;
    private String sourceUrl;
    private String image;
    private String imageType;
    private String summary;
    private String[] cuisines;
    private String[] dishTypes;
    private String[] diets;
    private String[] occasions;
    private String instructions;
    private AnalyzeInstruction[] analyzedInstructions;
    private String originalId = null;
    private float spoonacularScore;
    private String spoonacularSourceUrl;


    // Getter Methods

    public boolean getVegetarian() {
        return vegetarian;
    }

    public boolean getVegan() {
        return vegan;
    }

    public boolean getGlutenFree() {
        return glutenFree;
    }

    public boolean getDairyFree() {
        return dairyFree;
    }

    public boolean getVeryHealthy() {
        return veryHealthy;
    }

    public boolean getCheap() {
        return cheap;
    }

    public boolean getVeryPopular() {
        return veryPopular;
    }

    public boolean getSustainable() {
        return sustainable;
    }

    public boolean getLowFodmap() {
        return lowFodmap;
    }

    public float getWeightWatcherSmartPoints() {
        return weightWatcherSmartPoints;
    }

    public String getGaps() {
        return gaps;
    }

    public float getAggregateLikes() {
        return aggregateLikes;
    }

    public float getHealthScore() {
        return healthScore;
    }

    public String getCreditsText() {
        return creditsText;
    }

    public String getLicense() {
        return license;
    }

    public String getSourceName() {
        return sourceName;
    }

    public float getPricePerServing() {
        return pricePerServing;
    }

    public float getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public float getReadyInMinutes() {
        return readyInMinutes;
    }

    public float getServings() {
        return servings;
    }

    public String getSourceUrl() {
        return sourceUrl;
    }

    public String getImage() {
        return image;
    }

    public String getImageType() {
        return imageType;
    }

    public String getSummary() {
        return summary;
    }

    public String getInstructions() {
        return instructions;
    }

    public String getOriginalId() {
        return originalId;
    }

    public float getSpoonacularScore() {
        return spoonacularScore;
    }

    public String getSpoonacularSourceUrl() {
        return spoonacularSourceUrl;
    }

    public String[] getCuisines() {
        return cuisines;
    }

    public String[] getDishTypes() {
        return dishTypes;
    }

    public String[] getDiets() {
        return diets;
    }

    public String[] getOccasions() {
        return occasions;
    }

    public AnalyzeInstruction[] getAnalyzedInstructions() {
        return analyzedInstructions;
    }

    public Ingredient[] getExtendedIngredients() {
        return extendedIngredients;
    }


    // Setter Methods

    public void setVegetarian( boolean vegetarian ) {
        this.vegetarian = vegetarian;
    }

    public void setVegan( boolean vegan ) {
        this.vegan = vegan;
    }

    public void setGlutenFree( boolean glutenFree ) {
        this.glutenFree = glutenFree;
    }

    public void setDairyFree( boolean dairyFree ) {
        this.dairyFree = dairyFree;
    }

    public void setVeryHealthy( boolean veryHealthy ) {
        this.veryHealthy = veryHealthy;
    }

    public void setCheap( boolean cheap ) {
        this.cheap = cheap;
    }

    public void setVeryPopular( boolean veryPopular ) {
        this.veryPopular = veryPopular;
    }

    public void setSustainable( boolean sustainable ) {
        this.sustainable = sustainable;
    }

    public void setLowFodmap( boolean lowFodmap ) {
        this.lowFodmap = lowFodmap;
    }

    public void setWeightWatcherSmartPoints( float weightWatcherSmartPoints ) {
        this.weightWatcherSmartPoints = weightWatcherSmartPoints;
    }

    public void setGaps( String gaps ) {
        this.gaps = gaps;
    }

    public void setAggregateLikes( float aggregateLikes ) {
        this.aggregateLikes = aggregateLikes;
    }

    public void setHealthScore( float healthScore ) {
        this.healthScore = healthScore;
    }

    public void setCreditsText( String creditsText ) {
        this.creditsText = creditsText;
    }

    public void setLicense( String license ) {
        this.license = license;
    }

    public void setSourceName( String sourceName ) {
        this.sourceName = sourceName;
    }

    public void setPricePerServing( float pricePerServing ) {
        this.pricePerServing = pricePerServing;
    }

    public void setId( float id ) {
        this.id = id;
    }

    public void setTitle( String title ) {
        this.title = title;
    }

    public void setReadyInMinutes( float readyInMinutes ) {
        this.readyInMinutes = readyInMinutes;
    }

    public void setServings( float servings ) {
        this.servings = servings;
    }

    public void setSourceUrl( String sourceUrl ) {
        this.sourceUrl = sourceUrl;
    }

    public void setImage( String image ) {
        this.image = image;
    }

    public void setImageType( String imageType ) {
        this.imageType = imageType;
    }

    public void setSummary( String summary ) {
        this.summary = summary;
    }

    public void setInstructions( String instructions ) {
        this.instructions = instructions;
    }

    public void setOriginalId( String originalId ) {
        this.originalId = originalId;
    }

    public void setSpoonacularScore( float spoonacularScore ) {
        this.spoonacularScore = spoonacularScore;
    }

    public void setSpoonacularSourceUrl( String spoonacularSourceUrl ) {
        this.spoonacularSourceUrl = spoonacularSourceUrl;
    }

    public void setOccasions(String[] occasions) {
        this.occasions = occasions;
    }

    public void setDishTypes(String[] dishTypes) {
        this.dishTypes = dishTypes;
    }

    public void setDiets(String[] diets) {
        this.diets = diets;
    }

    public void setCuisines(String[] cuisines) {
        this.cuisines = cuisines;
    }

    public void setAnalyzedInstructions(AnalyzeInstruction[] analyzedInstructions) {
        this.analyzedInstructions = analyzedInstructions;
    }

    public void setExtendedIngredients(Ingredient[] extendedIngredients) {
        this.extendedIngredients = extendedIngredients;
    }
}
