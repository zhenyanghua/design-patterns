package com.leafyjava.tutorials.decorator;

public abstract class TreeDecorator implements Tree {
    private Tree tree;

    public TreeDecorator(Tree tree) {
        this.tree = tree;
    }

    public int getHeight() {
        return tree.getHeight();
    }

    public String getType() {
        return tree.getType();
    }
}
