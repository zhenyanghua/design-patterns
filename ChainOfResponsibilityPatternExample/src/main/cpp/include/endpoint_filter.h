#ifndef ENDPOINT_FILTER_H
#define ENDPOINT_FILTER_H

#include "request_filter.h"
#include <iostream>

class EndpointFilter : public RequestFilter {
  public:
    void handleRequest(int);
};

#endif //ENDPOINT_FILTER_H
