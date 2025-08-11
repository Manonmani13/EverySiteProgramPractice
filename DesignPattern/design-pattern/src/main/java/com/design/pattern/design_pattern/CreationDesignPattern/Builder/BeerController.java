package com.design.pattern.design_pattern.Builder;

public class BeerController {
    public String createStandardBeer() {
        Beer beer = Beer.builder()
                .name("Standard Beer")
                .drinkSize(500)
                .alcoholPercentage(5.0)
                .price(5.99)
                .build();

        return "Created beer: " + beer.getName() + 
                ", Drink Size: " + beer.getDrinkSize() +
                ", Alcohol Percentage: " + beer.getAlcoholPercentage() +
                ", Price: " + beer.getPrice();
    }

    public String createPremiumBeer(){
        Beer beer = Beer.builder()
                .name("Sample Beer")
                .drinkSize(330)
                .alcoholPercentage(5.0)
                .price(10.99)
                .brewery("Crafty Brews")
                .countryOfOrigin("United States")
                .description("A refreshing lager with a smooth taste.")
                .packaging("Bottle")
                .servingTemperature("4-6°C")
                .foodPairing("Pairs well with grilled chicken and salads.")
                .build();

        return "Created beer: " + beer.getName() + 
                ", Drink Size: " + beer.getDrinkSize() +
                ", Alcohol Percentage: " + beer.getAlcoholPercentage() +
                ", Price: " + beer.getPrice() +
                ", Brewery: " + beer.getBrewery() +
                ", Country of Origin: " + beer.getCountryOfOrigin() +
                ", Description: " + beer.getDescription() +
                ", Packaging: " + beer.getPackaging() +
                ", Serving Temperature: " + beer.getServingTemperature() +
                ", Food Pairing: " + beer.getFoodPairing();
    }
}
