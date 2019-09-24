#ifndef ABSTRACT_DESSERT
#define ABSTRACT_DESSERT

/* Abstract base class for desserts to subclass. Virtual methods
are inherited.*/

class AbstractDessert {
    public:

        /* Virtual public method to inherit. Eat the dessert. */
        virtual void eat() = 0; // what does = 0 do?
};

#endif
