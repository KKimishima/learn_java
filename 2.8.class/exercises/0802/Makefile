#javaのビルド

#変数
SOURECE = ./src/kimishima/*java
SOURECEPATH = ./src
CLASS = ./bin/
MAINCLASS = kimishima.ex0802
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

