#include "abstract_dessert.h"
#include "abstract_dessert_factory.h"
#include "cookie_factory.h"
#include "cheesecake_factory.h"
#include <exception>

/* Implementation of the Abstract Dessert Factory */

/* Return a pointer of type AbstractDessertFctory so each concrete factory
 * can return an appropriate object. Notice that the pointers being returned are
 * declared in their respective header files; they are implementations of the
 * AbstractDessertFactory, but by virtue of inheritance, they are also of type
 * AbstractDessertFactory. */
AbstractDessertFactory* AbstractDessertFactory::getDessertFactory(int type){
    switch(type){
        case 1:
            return new CookieFactory;
        case 2:
            return new CheesecakeFactory;
        default:
            throw "Invalid dessert selection!";
    }
}

/* The virtual function getDessert is implemented in the concrete classes, but
 * must be defined in the abstract implementation or else the compiler will complain
 * about an undefined reference. */
AbstractDessert* AbstractDessertFactory::getDessert(bool) {
    //AbstractDessert a = new AbstractDessert();
    //return &a;
}
