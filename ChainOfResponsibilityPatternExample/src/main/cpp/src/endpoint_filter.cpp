#include "endpoint_filter.h"
#include <iostream>

/* Show that the request is being handled by this filter
 * object by printing to STDOUT. If the request is not
 * able to be handled, pass to the successor.
**/
void EndpointFilter::handleRequest(int request){
  switch(request){
    case 1:
      std::cout << "Request being handled by EndpointFilter" << std::endl;
      break;
    default:
      this->successor->handleRequest(request);
  }
}
