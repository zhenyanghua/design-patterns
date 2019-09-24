#include "cookie_factory.h"
#include "cookie.h"
#include <iostream>

/* Implementation of the CookieFactory subclass. */
Cookie* CookieFactory::getDessert(bool isChocolateLover){
    // TODO implement new type for chocolate cookie?
    switch(isChocolateLover){
        case true:
            std::cout << "*Takes chocolate cookie*" << std::endl;
            break;
        default:
            std::cout << "*Takes sugar cookie*" << std::endl;
            break;
    }
    return new Cookie;
}
