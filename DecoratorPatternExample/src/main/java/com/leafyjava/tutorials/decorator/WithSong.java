package com.leafyjava.tutorials.decorator;

public class WithSong extends TreeDecorator {

    public WithSong(final Tree tree) {
        super(tree);
    }

    @Override
    public String getType() {
        return super.getType() + sing();
    }

    private String sing() {
        return " sings a song";
    }
}
