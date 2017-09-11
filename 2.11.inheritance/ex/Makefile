#Makefile

SO    = ./src/Kimishima/*java
MAINSO= ./src/
CP    = ./bin/
MAIN  = Kimishima.Main;

.PHONY:comp
all:comp

comp:
	javac $(SO) -d $(CP) -g
cinfo:
	javac $(SO) -d $(CP) 2> ./dbginfo.txt
run:
	javac $(SO) -d $(CP) -g
	java -cp  $(CP) $(MAIN)
clean:
	rm -rf $(CP)*
	rm -rf ./*.txt
rinfo:
	javac $(SO) -d $(CP) -g
	java -cp  $(CP) $(MAIN) > ./rinfo.txt
dbg:
	javac $(SO) -d $(CP) -g
	jdb -classpath $(CP) -sourcepath $(MAINSO) $(MAIN)

