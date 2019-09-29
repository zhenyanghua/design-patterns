#ifndef FILTER_H
#define FILTER_H

/* Interface for all Filter objects */

class Filter {
  public:
    void handleRequest(int);
};

#endif // FILTER_H
