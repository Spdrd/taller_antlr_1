grammar gramatica;

// TOKENS
IDENTIFICADOR : [a-z] + ([A-Z] | [a-z] | [0-9])*;
VALOR : ([a-z] | [A-Z] | [0-9]) + ([a-z] | [A-Z] | [0-9])*;
ESPACIO_VACIO : [ \t\r\n]+ -> skip;
OPERADOR_ASIGNACION : '=';
OPERADORES_MULT : ('*' | '/');
OPERADORES_SUM : ('+' | '-');
OPERADORES_COMP : ('<' | '>' | '==' | '!=' | '&&' | '||' | '<=' | '>=');


// REGLAS
termino : (VALOR (OPERADORES_MULT VALOR)*);
expresion : (termino (OPERADORES_SUM termino)*);
asignacion : IDENTIFICADOR OPERADOR_ASIGNACION expresion;
