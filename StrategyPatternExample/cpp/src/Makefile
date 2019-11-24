CPP = /usr/bin/g++
CPPFLAGS = $(INCLUDE_DIRS)
INCLUDE_DIRS = -I/home/dalton/design-patterns/StrategyPatternExample/cpp/include
OBJECTS = main.o boxfight.o human.o taichifight.o twostep.o

# target executable -- link the compiled object files
prog: $(OBJECTS)
	$(CPP) -o prog $(OBJECTS)

# make the object files. Implicitly, make is invoking $(CPP) -c $(CXXFLAGS) for
# each recipe, as these are all defined implicitly. E.g. g++ -c -I... boxfight.cpp
main.o:
boxfight.o:
human.o:
twostep.o:
taichifight.o:

# fake target -- simply an action
.PHONY: clean
clean:
	rm prog *.o
