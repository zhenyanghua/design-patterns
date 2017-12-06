package com.leafyjava.tutorials.decorator;

public class WithLight extends TreeDecorator {

    public WithLight(final Tree tree) {
        super(tree);
    }

    @Override
    public String getType() {
        return super.getType() + light();
    }

    private String light() {
        return " with " + (super.getHeight() < 3 ? "mini-light" : "big-light") + " on";
    }


}
