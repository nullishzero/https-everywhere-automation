#!/usr/bin/make -f

# Basic wrapper for maven 

pkg: 
	mvn package
clean:
	mvn clean
test:
	mvn test

.PHONY: pkg clean test
