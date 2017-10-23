package com.leafyjava.tutorials.abstractfactory.domains;

import com.leafyjava.tutorials.abstractfactory.utils.enums.Doneness;

public class Burger extends AbstractMenuItem {
    private Doneness doneness;

    public Doneness getDoneness() {
        return doneness;
    }

    public void setDoneness(final Doneness doneness) {
        this.doneness = doneness;
    }
}
