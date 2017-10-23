package com.leafyjava.tutorials.abstractfactory.domains;

public class OriginalCheeseCake extends AbstractDessert {
    @Override
    protected void makeDessert() {
        ingredients.add("Cream Cheese");
        ingredients.add("Sugar");
        ingredients.add("egg");
        ingredients.add("flower");
    }
}
