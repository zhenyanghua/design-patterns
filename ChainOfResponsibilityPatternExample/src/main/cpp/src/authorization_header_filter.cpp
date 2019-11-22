#include "authorization_header_filter.h"
#include <iostream>

/* Show that the request is being handled by this filter
 * object by printing to STDOUT. If the request is not
 * able to be handled, pass to successor.
**/
void AuthorizationHeaderFilter::handleRequest(int request){
  switch(request){
    case 3:
      std::cout << "Request being handled by AuthorizationHeaderFilter" << std::endl;
      break;
    default:
      std::cout << "Final object in chain unable to handle request" << std::endl;
  }
}
