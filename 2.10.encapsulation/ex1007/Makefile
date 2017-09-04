# Makefile

SO = ./src/Kimishima/*.java
MASSO = ./src
CP = ./bin/
MAIN = Kimishima.Main
SUB  = Kimishima.Wizard

.PHONY:all
all:comp

comp:
	javac $(SO) -d $(CP) -g
run:
	java -cp $(CP) $(MAIN)
clean:
	rm rf $(CP)*
dbg:
	jdb -classpath $(CP) -sourcepath $(MASSO) $(MAIN);
