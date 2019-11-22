#include "secured_filter.h"
#include <iostream>

void SecuredFilter::handleRequest(int request){
  switch(request){
    case 2:
      std::cout << "Request being handled by SecuredFilter" << std::endl;
      break;
    default:
      this->successor->handleRequest(request);
  }
}
