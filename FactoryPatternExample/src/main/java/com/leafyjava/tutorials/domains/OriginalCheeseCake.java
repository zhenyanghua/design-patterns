package com.leafyjava.tutorials.domains;

public class OriginalCheeseCake extends AbstractCheeseCake {
    @Override
    protected void makeCake() {
        ingredients.add("Cream Cheese");
        ingredients.add("Sugar");
        ingredients.add("egg");
        ingredients.add("flower");
    }
}
