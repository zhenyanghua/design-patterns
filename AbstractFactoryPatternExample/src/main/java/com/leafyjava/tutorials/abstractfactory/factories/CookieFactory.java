package com.leafyjava.tutorials.abstractfactory.factories;

import com.leafyjava.tutorials.abstractfactory.domains.AbstractDessert;
import com.leafyjava.tutorials.abstractfactory.domains.ChocolateChipsCookie;
import com.leafyjava.tutorials.abstractfactory.domains.RahRahRaisinCookie;

public class CookieFactory extends AbstractDessertFactory{

    @Override
    public AbstractDessert getDessert(boolean isChocolateLover) {
        return isChocolateLover ? new ChocolateChipsCookie() : new RahRahRaisinCookie();
    }

}
