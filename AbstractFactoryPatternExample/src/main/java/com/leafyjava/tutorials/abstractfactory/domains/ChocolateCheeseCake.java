package com.leafyjava.tutorials.abstractfactory.domains;

public class ChocolateCheeseCake extends AbstractDessert {
    @Override
    protected void makeDessert() {
        ingredients.add("Cream Cheese");
        ingredients.add("Cocoa");
        ingredients.add("Sugar");
        ingredients.add("Egg");
    }
}
