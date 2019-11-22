#ifndef AUTHORIZATION_HEADER_FILTER_H
#define AUTHORIZATION_HEADER_FILTER_H

#include "request_filter.h"

class AuthorizationHeaderFilter : public RequestFilter {
  public:
    void handleRequest(int);
};

#endif // AUTHORIZATION_HEADER_FILTER_H 
