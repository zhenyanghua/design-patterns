/* Human; implementation of Race interface */

#ifndef HUMAN
#define HUMAN

#include "dancebehavior.hpp"
#include "race.hpp"
#include "fightbehavior.hpp"

class Human : public Race {
    public:
        DanceBehavior* danceBehavior; 
        FightBehavior* fightBehavior;

        Human();
        ~Human();

        void dance();
        void setDanceBehavior(DanceBehavior*);
        void fight();
        void setFightBehavior(FightBehavior*);

};

#endif
