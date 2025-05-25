grammar Letters;

//parser rules

//accepts decls with or without an initial assignment
program : (stmtList | declList)* EOF ;

declList : decl+ ;
decl : ('B' | 'N') IDENT (SPACE INTLIT)? PERIOD		// bool or int
	 | 'C' IDENT (SPACE CHARLIT)? PERIOD			// char
	 | 'V' IDENT (SPACE vecLit)? PERIOD				// vector
	 | 'L' IDENT PERIOD								// label
	 ;

stmtList : stmt+ ;
stmt : ifStmt PERIOD
	 | assignStmt PERIOD
	 | readStmt PERIOD
	 | writeStmt PERIOD
	 | jumpStmt PERIOD
	 ;

ifStmt		: 'I' expr '{' stmtList+ 'F' ;
assignStmt	: assignExpr;
readStmt	: 'R' local ;
writeStmt	: 'W' (INTLIT | CHARLIT | vecLit | local) ;
jumpStmt	: 'J' IDENT ;

expr : assignExpr				// chaining (i.e. a=b=c) is not allowed
	 | expr 'A' expr
	 | expr 'S' expr
	 | expr 'M' expr
	 | expr 'D' expr
	 | vecIndexExpr
	 | term
	 ;

assignExpr   : expr SPACE (INTLIT | CHARLIT | vecLit | local) ;
vecIndexExpr : local (INTLIT | local) ;

term : local
	 | INTLIT
	 | CHARLIT
	 | vecLit
	 ;

local : IDENT ;

vecLit : (INTLIT | CHARLIT | local)+ ;

//lexer rules
PERIOD  : '.' ; 
SPACE   : [ ] ;					//used for assignments
WS	    : [\t\r\n]+ -> skip ;	//skip other whitespace for now
IDENT   : ~[A-Z0-9 \t\r\n] ;		//accepts ONE of any unicode char that is not a cap. letter, whitespace, or digit
INTLIT  : [0-9] ;				//matches a single char integer
CHARLIT : ~[ \t\r\n] ;
