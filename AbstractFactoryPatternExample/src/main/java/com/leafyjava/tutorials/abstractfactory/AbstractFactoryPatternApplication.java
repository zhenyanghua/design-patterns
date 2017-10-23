package com.leafyjava.tutorials.abstractfactory;

import com.leafyjava.tutorials.abstractfactory.domains.AbstractDessert;
import com.leafyjava.tutorials.abstractfactory.factories.AbstractDessertFactory;
import com.leafyjava.tutorials.abstractfactory.utils.enums.DessertType;

public class AbstractFactoryPatternApplication {
    public static void main(String[] args) {
        AbstractDessertFactory cakeFactory = AbstractDessertFactory.getDessertFactory(DessertType.CheeseCake);

        AbstractDessert chocolateCake = cakeFactory.getDessert(true);
        System.out.println(chocolateCake.getClass().getSimpleName());

        AbstractDessert originalCake = cakeFactory.getDessert(false);
        System.out.println(originalCake.getClass().getSimpleName());

        AbstractDessertFactory cookieFactory = AbstractDessertFactory.getDessertFactory(DessertType.Cookie);

        AbstractDessert chocolateCookie = cookieFactory.getDessert(true);
        System.out.println(chocolateCookie.getClass().getSimpleName());

        AbstractDessert otherCookie = cookieFactory.getDessert(false);
        System.out.println(otherCookie.getClass().getSimpleName());
    }
}
