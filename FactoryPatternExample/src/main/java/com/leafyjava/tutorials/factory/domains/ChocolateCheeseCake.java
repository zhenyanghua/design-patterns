package com.leafyjava.tutorials.factory.domains;

public class ChocolateCheeseCake extends AbstractCheeseCake {
    @Override
    protected void makeCake() {
        ingredients.add("Cream Cheese");
        ingredients.add("Cocoa");
        ingredients.add("Sugar");
        ingredients.add("Egg");
        ingredients.add("Flower");
    }
}
