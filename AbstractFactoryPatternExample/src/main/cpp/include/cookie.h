#include "abstract_dessert.h"

#ifndef COOKIE
#define COOKIE

/* The Cookie class inherits everything from the AbstractDessert, and
* by virtue of the virtual functions, is of the type AbstractDessert.
* The implemented functions, however, are not virtual, as these will
* be used in client code. */

class Cookie : public AbstractDessert {
    public:
        void eat();
};

#endif
