grammar gramatica;

prog:   stmt+ ;

stmt:   assignStmt
    |   writeStmt
    |   ifStmt
    |   whileStmt
    ;

assignStmt: ID '=' expr ';' ;

writeStmt: 'escribe' expr ';' ;

ifStmt: 'si' '(' expr ')' '{' stmt+ '}' ('sino' '{' stmt+ '}')? ;

whileStmt: 'mientras' expr '{' stmt+ '}' ;

expr:   expr ('+' | '-') expr
    |   expr ('*' | '/' | '%') expr
    |   expr '^' expr
    |   '(' expr ')'
    |   '-' expr
    |   expr ('>' | '<' | '>=' | '<=' | '==' | '!=') expr
    |   expr '&&' expr
    |   expr '||' expr
    |   ID
    |   NUMBER
    |   STRING
    |   BOOLEAN
    ;

ID:     [a-zA-Z][a-zA-Z0-9]* ;
NUMBER: [0-9]+('.'[0-9]+)? ;
STRING: '"' .*? '"' ;
BOOLEAN: 'true' | 'false' ;

WS: [ \t\r\n]+ -> skip ;
