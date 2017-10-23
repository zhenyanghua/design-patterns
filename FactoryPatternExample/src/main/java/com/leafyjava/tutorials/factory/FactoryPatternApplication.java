package com.leafyjava.tutorials.factory;

import com.leafyjava.tutorials.factory.domains.AbstractCheeseCake;
import com.leafyjava.tutorials.factory.domains.CheeseCakeFactory;
import com.leafyjava.tutorials.factory.utils.enums.CheeseCakeType;

public class FactoryPatternApplication {
    public static void main(String[] args) {
        AbstractCheeseCake cheeseCake = CheeseCakeFactory.getCheeseCake(CheeseCakeType.Original);
        System.out.println(cheeseCake);

        cheeseCake = CheeseCakeFactory.getCheeseCake(CheeseCakeType.Chocolate);
        System.out.println(cheeseCake);


        //
    }
}
