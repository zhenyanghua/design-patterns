package com.leafyjava.tutorials.abstractfactory.factories;

import com.leafyjava.tutorials.abstractfactory.domains.AbstractDessert;
import com.leafyjava.tutorials.abstractfactory.domains.ChocolateCheeseCake;
import com.leafyjava.tutorials.abstractfactory.domains.OriginalCheeseCake;

public class CheeseCakeFactory extends AbstractDessertFactory{

    @Override
    public AbstractDessert getDessert(boolean isChocolateLover) {
        return isChocolateLover ? new ChocolateCheeseCake() : new OriginalCheeseCake();
    }
}
