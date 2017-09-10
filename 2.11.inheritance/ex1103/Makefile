# makefile
#
SO = ./src/Kimishima/*.java
CP = ./bin/
MAIN = Kimishima.Main

.PHONY:all
all:comp
comp:
	javac $(SO) -d $(CP)
	ctags -R
run:
	javac $(SO) -d $(CP)
	ctags -R
	java -cp $(CP) $(MAIN)
clean:
	rm -rf ./bin/*
	rm -rf ctags
