package com.leafyjava.tutorials.abstractfactory.domains;

public class RahRahRaisinCookie extends AbstractDessert{
    @Override
    protected void makeDessert() {
        ingredients.add("Raisin");
        ingredients.add("Oatmeal");
        ingredients.add("Magic");
    }
}
