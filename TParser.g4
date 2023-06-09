parser grammar TParser;

options {
	tokenVocab = TLexer;
}

main: declList;
declList: declList decl | decl;
decl: varDecl | funDecl;

varDecl: typeSpec varDeclList SemiColon;
scopedVarDecl:
	Static typeSpec varDeclList SemiColon
	| typeSpec varDeclList SemiColon;
varDeclList: varDeclList Comma varDeclInit | varDeclInit;
varDeclInit: varDeclId | varDeclId Equal simpleExp;
varDeclId: ID (OpenSqu NUMCONST CloseSqu)?;
typeSpec: Int | Bool | Char | VInt;

funDecl:
	typeSpec ID OpenPar parms ClosePar stmt
	| ID OpenPar parms ClosePar stmt;
parms: parmList |;
parmList: parmList SemiColon parmTypeList | parmTypeList;
parmTypeList: typeSpec parmIdList;
parmIdList: parmIdList Comma parmId | parmId;
parmId: ID | ID OpenSqu CloseSqu;

stmt:
	expStmt
	| compoundStmt
	| selectStmt
	| iterStmt
	| returnStmt
	| breakStmt;
expStmt: exp SemiColon | SemiColon;
compoundStmt: OpenCurly localDecls stmtList CloseCurly;
localDecls: localDecls scopedVarDecl |;
stmtList: stmtList stmt |;
selectStmt:
	If OpenPar simpleExp ClosePar stmt
	| If OpenPar simpleExp ClosePar stmt Else stmt;
iterStmt:
	While OpenPar simpleExp ClosePar stmt
	| For OpenPar iterRange ClosePar stmt;
iterRange: (typeSpec varDeclList? | exp?) ';' exp? ';' exp?;

returnStmt: Return SemiColon | Return exp SemiColon;
breakStmt: Break SemiColon;

exp:
	mutable Equal exp
	| mutable PlusEqual exp
	| mutable MinusEqual exp
	| mutable StarEqual exp
	| mutable ForEqual exp
	| mutable Increment
	| mutable Decrement
	| simpleExp;
simpleExp: simpleExp Or andExp | andExp;
andExp: andExp And unaryRelExp | unaryRelExp;
unaryRelExp: Not unaryRelExp | relExp;
relExp: sumExp relop sumExp | sumExp;
relop:
	LessorEqual
	| LessThan
	| GreaterThan
	| GreatorEqual
	| DoubleEqual
	| NotEqual;
sumExp: sumExp sumop mulExp | mulExp;
sumop: Plus | Minus;
mulExp: mulExp mulop unaryExp | unaryExp;
mulop: Star | ForSlash | Percent;
unaryExp: unaryop unaryExp | factor;
unaryop: Minus | Star | QuestionMark;
factor: immutable | mutable;
mutable: ID | ID OpenSqu exp CloseSqu;
immutable: OpenPar exp ClosePar | call | constant;
call: ID OpenPar args ClosePar;
args: argList |;
argList: argList Comma exp | exp;
constant: NUMCONST | CHARCONST | STRINGCONST | VECTORCONST | True | False;