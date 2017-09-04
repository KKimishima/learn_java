#javaのビルド

#変数
SOURECE = ./src/Kimishima/*java
SOURECEPATH = ./src
CLASS = ./bin/
MAINCLASS = Kimishima.Ex0905
subclas =  kimishima.

.PHONY:all
all:comp

comp:
	javac $(SOURECE) -d $(CLASS) -g
clean:
	rm -rf $(CLASS)
run:
	java -cp $(CLASS) $(MAINCLASS)
dbg:
	jdb -classpath $(CLASS) -sourcepath $(SOURECEPATH) $(MAINCLASS)

