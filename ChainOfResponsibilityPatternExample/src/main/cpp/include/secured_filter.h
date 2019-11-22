#ifndef SECURED_FILTER_H
#define SECURED_FILTER_H

#include "request_filter.h"

class SecuredFilter : public RequestFilter {
  public:
    void handleRequest(int);
};

#endif // SECURED_FILTER_H
