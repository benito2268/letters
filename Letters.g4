grammar Letters;

//parser rules

//accepts decls with or without an initial assignment
decl : 'I' IDENT (SPACE INTLIT)? PERIOD ;

//lexer rules
PERIOD : '.' ; 
SPACE  : [ ] ;					//used for assignments
WS	   : [\t\r\n]+ -> skip ;	//skip other whitespace for now
IDENT : ~[A-Z0-9 \t\r\n] ;		//accepts ONE of any unicode char that is not a cap. letter, whitespace, or digit
INTLIT : [0-9] ;				//matches a single char integer
