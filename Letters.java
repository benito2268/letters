import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.charset.StandardCharsets;

public class Letters {
	public static void main(String[] args) throws Exception {
		//read input into a string as utf-8
		String inputStr = Files.readString(Paths.get(args[0]), StandardCharsets.UTF_8);

		//do scanning
		CharStream cs = CharStreams.fromString(inputStr);
		LettersLexer lex = new LettersLexer(cs);
		CommonTokenStream ts = new CommonTokenStream(lex);

		//do parsing
		LettersParser parser = new LettersParser(ts);
		
		//FIXME the function you call here is the name of the
		//grammar rule in Letters.g4 that you want to begin parsing at
		ParseTree ast = parser.decl();
		
		//make antlr unparse the ast and print for debugging
		System.out.println(ast.toStringTree(parser));
	}
}
