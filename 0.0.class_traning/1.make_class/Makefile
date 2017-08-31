# Makefile
SOURECE = ./src/*.java
CLASSPASS= ./bin

.PHONY:all
all:comp
comp:
	javac ${SOURECE}  -d ./bin/
clean:
	rm -rf bin/*
run:
	java -cp ${CLASSPASS} Kimishima.MakeClass

#Hero.class:Hero.java
#	java ./src/Hero.java -d bin/Kimishima/Hero.class

#./bin/hello:./src/hello.c
#	gcc -o ./bin/hello ./src/hello.c
#clean:
#	rm -rf /bin/hello
