#include "abstract_dessert.h"

#ifndef ABSTRACT_DESSERT_FACTORY
#define ABSTRACT_DESSERT_FACTORY

/* Abstract factory class to instantiate a concrete factory for a dessert.
 * This class is comprised of totally virtual methods, meant to be inherited
 * by subclasses. By being an abstract base class, subclasses can be typed
 * accordingly, thereby allowing the client to be completely unaware of the
 * actual class being used and focus purely on the abstract interface. */

class AbstractDessertFactory {
    public:

        /* Return a pointer to AbstractDessertFactory */
        virtual AbstractDessertFactory* getDessertFactory(int type);

        /* Abstract method to return a pointer to a AbstractDessert type */
        virtual AbstractDessert* getDessert(bool isChocolocateLover);
};

#endif
