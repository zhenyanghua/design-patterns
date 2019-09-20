#include "cheesecake_factory.h"
#include "cheesecake.h"
#include <iostream>

/* Implementation of Cheesecake Factory */
Cheesecake* CheesecakeFactory::getDessert(bool isChocolateLover){
    // TODO implement new type for chocolate cake?
    switch(isChocolateLover){
        case true:
            std::cout << "*Takes chocolate cheesecake*" << std::endl;
            break;
        default:
            std::cout << "*Takes vanilla and praline cheesecake*" << std::endl;
            break;
    }
    return new Cheesecake;
}
