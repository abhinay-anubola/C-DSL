lexer grammar TLexer;

Int : 'int';

Float: 'float';

Void: 'void';

Identifier: [a-zA-Z][a-zA-Z0-9_]*;

Number: [0-9]+;

Comma: ',';

EqualTo: '=';

Add: '+';

SemiColon: ';';

WS: [ \t\r\n]+ -> skip;