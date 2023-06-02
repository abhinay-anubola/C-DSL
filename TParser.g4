parser grammar TParser;

options {
	tokenVocab = TLexer;
}

main: ( declaration+ ( equation SemiColon )* )+  EOF;

declaration: typeSpecifier ( declaratorList | equation ) SemiColon;

equation: Identifier EqualTo expression;

declaratorList: Identifier ( Comma Identifier)*;

expression: Number| Identifier | expression Add expression;

typeSpecifier: Int | Float | Void;