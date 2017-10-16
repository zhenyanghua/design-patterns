package com.leafyjava.tutorials.domains;

import com.leafyjava.tutorials.utils.enums.CheeseCakeType;

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
