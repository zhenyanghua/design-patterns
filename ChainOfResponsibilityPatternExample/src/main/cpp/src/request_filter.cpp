#include "request_filter.h"

void RequestFilter::setSuccessor(RequestFilter* successor){
  this->successor = successor;
}

void RequestFilter::handleRequest(int) {};
