#include "authorization_header_filter.h"
#include "endpoint_filter.h"
#include "secured_filter.h"
#include <iostream>

/* Main function to illustrate the Chain of Responsibility pattern.
 * Instantiate a receiver object and set its successors and use console
 * printing to show which objects are handling which requests.

 * This C++ implementation is designed to mimic the Java implementation
 * found in `../java/`, but for brevity will only implement three objects
 * in the chain as opposed to five. Additionally, the `requests` used are
 * integers and not objects.
*/

int main(){

    // instantiate the main receiver, an EndpointFilter
    EndpointFilter epFilter = EndpointFilter();

    // now instantiate its successors (and their successors)
    SecuredFilter secFilter = SecuredFilter();
    AuthorizationHeaderFilter authFilter = AuthorizationHeaderFilter();

    // set successors
    epFilter.setSuccessor(&secFilter);
    secFilter.setSuccessor(&authFilter);

    // start handling requests
    std::cout << "The following request should be handled by the "
              << "EndpointFilter" << std::endl;
    int r1 = 1;
    epFilter.handleRequest(r1);

    std::cout << "The following request should be handled by the "
              << "SecuredFilter" << std::endl;
    int r2 = 2;
    epFilter.handleRequest(r2);

    std::cout << "The following request should be handled by the "
              << "AuthorizationHeaderFilter" << std::endl;
    int r3 = 3;
    epFilter.handleRequest(r3);

    /* Request that should not be handled by any objects */
    int r4 = 4;
    epFilter.handleRequest(r4);

    // return successful stop code
    return 0;
}
