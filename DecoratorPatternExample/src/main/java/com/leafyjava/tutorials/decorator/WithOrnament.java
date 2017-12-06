package com.leafyjava.tutorials.decorator;

public class WithOrnament extends TreeDecorator {

    public WithOrnament(final Tree tree) {
        super(tree);
    }

    @Override
    public String getType() {
        return super.getType() + addOrnaments();
    }

    private String addOrnaments() {
        return " with ornaments";
    }
}
