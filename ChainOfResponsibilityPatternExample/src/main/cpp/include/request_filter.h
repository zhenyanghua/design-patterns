#ifndef REQUEST_FILTER_H
#define REQUEST_FILTER_H

#include "filter.h"

/* Parent class for Filter objects. */

class RequestFilter : public Filter {
  public:

    /* Not a virtual method, as this will be implemented in request_filter.cpp
     * and inherited directly by subclasses.
     *
     * Note that, unlike the Java implementation, this method uses a pointer
     * to the type of the successor. This is because it uses a forward declaration
     * to RequestFilter.
    **/
    void setSuccessor(RequestFilter* successor);

    /* Virtual method which will be implemented in respective
     * implementations.
    **/
    virtual void handleRequest(int);

  protected:
    RequestFilter* successor;

};

#endif // REQUEST_FILTER_H
