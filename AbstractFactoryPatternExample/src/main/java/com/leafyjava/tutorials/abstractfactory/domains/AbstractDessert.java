package com.leafyjava.tutorials.abstractfactory.domains;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public abstract class AbstractDessert {
    protected List<String> ingredients = new ArrayList<>();

    public List<String> getIngredients() {
        return ingredients;
    }

    public AbstractDessert() {
        makeDessert();
    }

    protected abstract void makeDessert();

    @Override
    public String toString() {
        return super.toString() + " - " + ingredients.stream().collect(Collectors.joining(", "));
    }
}
