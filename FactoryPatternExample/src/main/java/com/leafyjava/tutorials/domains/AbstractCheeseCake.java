package com.leafyjava.tutorials.domains;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public abstract class AbstractCheeseCake {
    protected List<String> ingredients = new ArrayList<>();

    public List<String> getIngredients() {
        return ingredients;
    }

    public AbstractCheeseCake() {
        makeCake();
    }

    protected abstract void makeCake();

    @Override
    public String toString() {
        return super.toString() + " - " + ingredients.stream().collect(Collectors.joining(", "));
    }
}
