#Makefile

SO    = ./src/Kimishima/*java
MAINSO= ./src/
CP    = ./bin/
MAIN  = Kimsihima.Main;

.PHONY:comp
all:comp

comp:
	javac $(SO) -d $(CP) -g
cinfo:
	javac $(SO) -d $(CP) 2> ./dbginfo.txt
clean:
	rm -rf $(CP)*
	rm -rf ./*.txt
dbg:
	jdb -classpath $(CP) -sourcepath $(MAINSO) $(MAIN)

