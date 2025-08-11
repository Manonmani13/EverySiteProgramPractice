package com.design.pattern.design_pattern.Builder;
public class Beer {
    private String name;
    private int drinkSize;
    private double alcoholPercentage;
    private double price;


     private String brewery;            // The brewery that produces the beer.
    private String countryOfOrigin;    // The country where the beer is originally from.
    private String description;        // A brief description of the beer's characteristics.
    private String packaging;          // The packaging type (bottle, can, draft, etc.).
    private String servingTemperature; // The recommended serving temperature.
    private String foodPairing;  
    private Beer(Builder builder) {
        this.name = builder.name;
        this.drinkSize = builder.drinkSize;
        this.alcoholPercentage = builder.alcoholPercentage;
        this.price = builder.price;
        this.brewery = builder.brewery;
        this.countryOfOrigin = builder.countryOfOrigin;
        this.description = builder.description;
        this.packaging = builder.packaging;
        this.servingTemperature = builder.servingTemperature;
        this.foodPairing = builder.foodPairing;     
    }

    public static Builder builder() {
        return new Builder();
    }

    public String getName() { return name; }
    public int getDrinkSize() { return drinkSize; }
    public double getAlcoholPercentage() { return alcoholPercentage; }
    public double getPrice() { return price; }

    public String getBrewery() { return brewery; }
    public String getCountryOfOrigin() { return countryOfOrigin; }
    public String getDescription() { return description; }          
    public String getPackaging() { return packaging; }
    public String getServingTemperature() { return servingTemperature; }    
    public String getFoodPairing() { return foodPairing; }  
 
    public static class Builder {
        private String name;
        private int drinkSize;
        private double alcoholPercentage;
        private double price;
        private String brewery;            // The brewery that produces the beer.   
        private String countryOfOrigin;    // The country where the beer is originally from.
        private String description;        // A brief description of the beer's characteristics.
        private String packaging;          // The packaging type (bottle, can, draft, etc   
        private String servingTemperature; // The recommended serving temperature.
        private String foodPairing;        // Suggested food pairing for the beer.
        public Builder brewery(String brewery) {
            this.brewery = brewery;
            return this;
        }
        public Builder countryOfOrigin(String countryOfOrigin) {
            this.countryOfOrigin = countryOfOrigin;
            return this;
        }
        public Builder description(String description) {
            this.description = description;
            return this;
        }

        public Builder packaging(String packaging) {
            this.packaging = packaging;
            return this;
        }



        public Builder servingTemperature(String servingTemperature) {
            this.servingTemperature = servingTemperature;
            return this;
        }
        public Builder foodPairing(String foodPairing) {
            this.foodPairing = foodPairing;
            return this;
        }


        

        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public Builder drinkSize(int drinkSize) {
            this.drinkSize = drinkSize;
            return this;
        }

        public Builder alcoholPercentage(double alcoholPercentage) {
            this.alcoholPercentage = alcoholPercentage;
            return this;
        }

        public Builder price(double price) {
            this.price = price;
            return this;
        }

        public Beer build() {
            return new Beer(this);
        }
    }
}
