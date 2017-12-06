package com.leafyjava.tutorials.decorator;

public class FirTree implements Tree {
    private int height;
    private String type;

    public FirTree(final int height, final String type) {
        this.height = height;
        this.type = type;
    }

    public int getHeight() {
        return height;
    }

    public String getType() {
        return type;
    }
}
