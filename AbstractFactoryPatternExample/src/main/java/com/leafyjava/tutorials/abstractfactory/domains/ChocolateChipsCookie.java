package com.leafyjava.tutorials.abstractfactory.domains;

public class ChocolateChipsCookie extends AbstractDessert{
    @Override
    protected void makeDessert() {
        ingredients.add("Chocolate Chips");
        ingredients.add("Peanut Button");
        ingredients.add("More Button");
    }
}
