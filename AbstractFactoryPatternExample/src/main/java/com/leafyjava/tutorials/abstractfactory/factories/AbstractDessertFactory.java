package com.leafyjava.tutorials.abstractfactory.factories;

import com.leafyjava.tutorials.abstractfactory.domains.AbstractDessert;
import com.leafyjava.tutorials.abstractfactory.utils.enums.DessertType;

public abstract class AbstractDessertFactory {

    public static AbstractDessertFactory getDessertFactory(DessertType dessertType) {
        switch (dessertType) {
            case Cookie:
                return new CookieFactory();
            case CheeseCake:
                return new CheeseCakeFactory();
            default:
                    return null;
        }
    }

    public abstract AbstractDessert getDessert(boolean isChocolateLover);

}
