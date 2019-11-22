/* Strategy Pattern
* Show how the strategy pattern can be used to lend different
* behaviors to different objects without relying strictly on
* inheritance. This example is similar to the Java one, but
* slightly more brief.
**/

#include <iostream>
#include "human.hpp"
#include "race.hpp"
#include "taichifight.hpp"
#include "twostep.hpp"

int main(){

    // instantiate objects
    Race* human = new Human();

    // do stuff
    human->dance();
    human->fight();

    // now, change the behavior
    std::cout << "Change human to use Tai Chi fight" << std::endl;

    human->setFightBehavior(new TaiChi());
    human->fight();

    return 0;
}
