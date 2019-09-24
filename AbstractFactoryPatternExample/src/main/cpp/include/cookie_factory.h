#include "abstract_dessert_factory.h"
#include "cookie.h"

#ifndef COOKIE_FACTORY
#define COOKIE_FACTORY

/* Concrete implementation of the Cookie Factory */
class CookieFactory : public AbstractDessertFactory {
    public:

        /* Because Cookie is derived from AbstractDessert, a client
         * calling AbstractFactory.getDessert() should have no problem
         * and will be able to utilize the abstraction of the
         * AbstractDessert. */

        /* Return a cookie pointer */
        Cookie* getDessert(bool isChocolateLover);
};

#endif
