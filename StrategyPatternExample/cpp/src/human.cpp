/* Human implementation of header */

#include "dancebehavior.hpp"
#include "human.hpp"
#include "twostep.hpp"
#include "boxfight.hpp"

// constructor and destructor
Human::Human() {
    this->danceBehavior = new TwoStep();
    this->fightBehavior = new Boxing();
}

Human::~Human() {
    delete this->danceBehavior;
    delete this->fightBehavior;
}

// Make that human dance
void Human::dance() {
   this->danceBehavior->dance();
}

// setter for new dance behavior
void Human::setDanceBehavior(DanceBehavior *d) {
    this->danceBehavior = d;
}

// Make human fight
void Human::fight() {
    this->fightBehavior->fight();
}

// setter for fight behavior
void Human::setFightBehavior(FightBehavior* f) {
    this->fightBehavior = f;
}
