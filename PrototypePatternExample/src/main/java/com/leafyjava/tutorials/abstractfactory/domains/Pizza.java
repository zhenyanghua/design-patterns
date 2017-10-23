package com.leafyjava.tutorials.abstractfactory.domains;

public class Pizza extends AbstractMenuItem {
    private boolean isThinCrust;

    public boolean isThinCrust() {
        return isThinCrust;
    }

    public void setThinCrust(final boolean thinCrust) {
        isThinCrust = thinCrust;
    }
}
