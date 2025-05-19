# to install antlr on linux (as 'antlr4'):
# 	1. curl -O https://www.antlr.org/download/antlr-4.13.1-complete.jar
# 	2. sudo mv antlr-4.13.1-complete.jar /usr/local/lib/
# 	3. add these lines to bashrc if you wanna use it without the Makefile
# 		export CLASSPATH=".:/usr/local/lib/antlr-4.13.1-complete.jar:$CLASSPATH"
#		alias antlr4='java -jar /usr/local/lib/antlr-4.13.1-complete.jar'

ANTLRJAR=/usr/local/lib/antlr-4.13.1-complete.jar
ANTLR=java -jar $(ANTLRJAR)

GENFILES= LettersLexer.java 		\
		  LettersParser.java 		\
		  LettersListener.java 		\
		  LettersBaseListener.java 	\
		  LettersVisitor.java		\
		  LettersBaseVisitor.java	\

CLASSPATH=.:$(ANTLRJAR):build

TESTFILE=test.let
MAINFILE=Letters.java
MAINCLASS=build/$(patsubst %.java, %.class, $(MAINFILE))
GRAMMAR=Letters.g4

# --- shouldn't need to edit beyond this point ---

all: $(MAINCLASS)
.PHONY: clean test

gen: $(GRAMMAR)
	$(ANTLR) -visitor $^

$(MAINCLASS): gen
	javac -cp $(CLASSPATH) $(GENFILES) -d build/
	javac -cp $(CLASSPATH) $(MAINFILE) -d build/
	
# need to make Letters.java accept a filename as a command line arg
test:
	java -cp $(CLASSPATH) $(basename $(notdir $(MAINCLASS))) $(TESTFILE)

clean:
	rm -f $(GENFILES) Letters.interp LettersLexer.interp Letters.tokens LettersLexer.tokens
	rm -f build/*.class
