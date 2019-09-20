#include "abstract_dessert_factory.h"
#include "cheesecake.h"

#ifndef CHEESECAKE_FACTORY
#define CHEESECAKE_FACTORY

/* Concrete implementation of the Cheesecake Factory */
class CheesecakeFactory : public AbstractDessertFactory {
    public:

        /* Return a cheesecake pointer */
        Cheesecake* getDessert(bool isChocolateCover);
};

#endif
