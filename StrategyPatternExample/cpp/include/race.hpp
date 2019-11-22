/* Abstract Race class as an interface */

#ifndef RACE
#define RACE

#include "dancebehavior.hpp"
#include "fightbehavior.hpp"

class Race {
    public:
        // member data
        DanceBehavior* danceBehavior;
        FightBehavior* fightBehavior;

        // member functions
        virtual void dance() = 0;
        virtual void setDanceBehavior(DanceBehavior*) = 0;
        virtual void fight() = 0;
        virtual void setFightBehavior(FightBehavior*) = 0;

};

#endif
