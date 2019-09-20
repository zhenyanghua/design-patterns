#include "abstract_dessert_factory.h"
#include "abstract_dessert.h"
#include <iostream>

int main(){

    AbstractDessertFactory factory = AbstractDessertFactory();
    AbstractDessertFactory* cookieFactory = factory.getDessertFactory(1);
    AbstractDessertFactory* cakeFactory = factory.getDessertFactory(2);

    AbstractDessert* cookie = cookieFactory->getDessert(true);
    AbstractDessert* cheesecake = cakeFactory->getDessert(false);

    cookie->eat();
    cheesecake->eat();

    // free memory
    delete cookieFactory;
    delete cakeFactory;
    delete cookie;
    delete cheesecake;

    return 1;
}
