package com.leafyjava.tutorials.factory.domains;

import com.leafyjava.tutorials.factory.utils.enums.CheeseCakeType;

public class CheeseCakeFactory {
    private CheeseCakeFactory() {
        throw new AssertionError();
    }

    public static AbstractCheeseCake getCheeseCake(CheeseCakeType cheeseCakeType) {
        switch (cheeseCakeType) {
            case Original:
                return new OriginalCheeseCake();
            case Chocolate:
                return new ChocolateCheeseCake();
            default:
                return null;
        }
    }
}
