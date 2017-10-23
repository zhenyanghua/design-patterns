package com.leafyjava.tutorials.factory.domains;

import com.leafyjava.tutorials.abstractfactory.domains.AbstractDessert;

public class OriginalCheeseCake extends AbstractCheeseCake {
    @Override
    protected void makeCake() {
        ingredients.add("Cream Cheese");
        ingredients.add("Sugar");
        ingredients.add("egg");
        ingredients.add("flower");
    }
}
