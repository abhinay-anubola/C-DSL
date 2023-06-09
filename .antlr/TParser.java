// Generated from /home/abhi/test_antlr/TParser.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class TParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		COMMENT=1, And=2, Not=3, Or=4, To=5, By=6, Int=7, Bool=8, Char=9, Return=10, 
		Break=11, If=12, Else=13, For=14, While=15, True=16, False=17, Static=18, 
		ID=19, NUMCONST=20, CHARCONST=21, STRINGCONST=22, VECTORCONST=23, LetDig=24, 
		Letter=25, Digit=26, Comma=27, SemiColon=28, LessorEqual=29, GreatorEqual=30, 
		LessThan=31, GreaterThan=32, DoubleEqual=33, NotEqual=34, Increment=35, 
		Decrement=36, PlusEqual=37, MinusEqual=38, StarEqual=39, ForEqual=40, 
		Equal=41, Colon=42, Plus=43, Minus=44, Star=45, ForSlash=46, Percent=47, 
		OpenPar=48, ClosePar=49, OpenCurly=50, CloseCurly=51, OpenSqu=52, CloseSqu=53, 
		QuestionMark=54, WhiteSpace=55, VInt=56;
	public static final int
		RULE_main = 0, RULE_declList = 1, RULE_decl = 2, RULE_varDecl = 3, RULE_scopedVarDecl = 4, 
		RULE_varDeclList = 5, RULE_varDeclInit = 6, RULE_varDeclId = 7, RULE_typeSpec = 8, 
		RULE_funDecl = 9, RULE_parms = 10, RULE_parmList = 11, RULE_parmTypeList = 12, 
		RULE_parmIdList = 13, RULE_parmId = 14, RULE_stmt = 15, RULE_expStmt = 16, 
		RULE_compoundStmt = 17, RULE_localDecls = 18, RULE_stmtList = 19, RULE_selectStmt = 20, 
		RULE_iterStmt = 21, RULE_iterRange = 22, RULE_returnStmt = 23, RULE_breakStmt = 24, 
		RULE_exp = 25, RULE_simpleExp = 26, RULE_andExp = 27, RULE_unaryRelExp = 28, 
		RULE_relExp = 29, RULE_relop = 30, RULE_sumExp = 31, RULE_sumop = 32, 
		RULE_mulExp = 33, RULE_mulop = 34, RULE_unaryExp = 35, RULE_unaryop = 36, 
		RULE_factor = 37, RULE_mutable = 38, RULE_immutable = 39, RULE_call = 40, 
		RULE_args = 41, RULE_argList = 42, RULE_constant = 43;
	private static String[] makeRuleNames() {
		return new String[] {
			"main", "declList", "decl", "varDecl", "scopedVarDecl", "varDeclList", 
			"varDeclInit", "varDeclId", "typeSpec", "funDecl", "parms", "parmList", 
			"parmTypeList", "parmIdList", "parmId", "stmt", "expStmt", "compoundStmt", 
			"localDecls", "stmtList", "selectStmt", "iterStmt", "iterRange", "returnStmt", 
			"breakStmt", "exp", "simpleExp", "andExp", "unaryRelExp", "relExp", "relop", 
			"sumExp", "sumop", "mulExp", "mulop", "unaryExp", "unaryop", "factor", 
			"mutable", "immutable", "call", "args", "argList", "constant"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, "'&&'", "'!'", "'||'", "'to'", "'by'", "'int'", "'bool'", 
			"'char'", "'return'", "'break'", "'if'", "'else'", "'for'", "'while'", 
			"'true'", "'false'", "'static'", null, null, null, null, null, null, 
			null, null, "','", "';'", "'<='", "'>='", "'<'", "'>'", "'=='", "'!='", 
			"'++'", "'--'", "'+='", "'-='", "'*='", "'/='", "'='", "':'", "'+'", 
			"'-'", "'*'", "'/'", "'%'", "'('", "')'", "'{'", "'}'", "'['", "']'", 
			"'?'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "COMMENT", "And", "Not", "Or", "To", "By", "Int", "Bool", "Char", 
			"Return", "Break", "If", "Else", "For", "While", "True", "False", "Static", 
			"ID", "NUMCONST", "CHARCONST", "STRINGCONST", "VECTORCONST", "LetDig", 
			"Letter", "Digit", "Comma", "SemiColon", "LessorEqual", "GreatorEqual", 
			"LessThan", "GreaterThan", "DoubleEqual", "NotEqual", "Increment", "Decrement", 
			"PlusEqual", "MinusEqual", "StarEqual", "ForEqual", "Equal", "Colon", 
			"Plus", "Minus", "Star", "ForSlash", "Percent", "OpenPar", "ClosePar", 
			"OpenCurly", "CloseCurly", "OpenSqu", "CloseSqu", "QuestionMark", "WhiteSpace", 
			"VInt"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "TParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public TParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class MainContext extends ParserRuleContext {
		public DeclListContext declList() {
			return getRuleContext(DeclListContext.class,0);
		}
		public MainContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_main; }
	}

	public final MainContext main() throws RecognitionException {
		MainContext _localctx = new MainContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_main);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(88);
			declList(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DeclListContext extends ParserRuleContext {
		public DeclContext decl() {
			return getRuleContext(DeclContext.class,0);
		}
		public DeclListContext declList() {
			return getRuleContext(DeclListContext.class,0);
		}
		public DeclListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declList; }
	}

	public final DeclListContext declList() throws RecognitionException {
		return declList(0);
	}

	private DeclListContext declList(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		DeclListContext _localctx = new DeclListContext(_ctx, _parentState);
		DeclListContext _prevctx = _localctx;
		int _startState = 2;
		enterRecursionRule(_localctx, 2, RULE_declList, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(91);
			decl();
			}
			_ctx.stop = _input.LT(-1);
			setState(97);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new DeclListContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_declList);
					setState(93);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(94);
					decl();
					}
					} 
				}
				setState(99);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class DeclContext extends ParserRuleContext {
		public VarDeclContext varDecl() {
			return getRuleContext(VarDeclContext.class,0);
		}
		public FunDeclContext funDecl() {
			return getRuleContext(FunDeclContext.class,0);
		}
		public DeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decl; }
	}

	public final DeclContext decl() throws RecognitionException {
		DeclContext _localctx = new DeclContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_decl);
		try {
			setState(102);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(100);
				varDecl();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(101);
				funDecl();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VarDeclContext extends ParserRuleContext {
		public TypeSpecContext typeSpec() {
			return getRuleContext(TypeSpecContext.class,0);
		}
		public VarDeclListContext varDeclList() {
			return getRuleContext(VarDeclListContext.class,0);
		}
		public TerminalNode SemiColon() { return getToken(TParser.SemiColon, 0); }
		public VarDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varDecl; }
	}

	public final VarDeclContext varDecl() throws RecognitionException {
		VarDeclContext _localctx = new VarDeclContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_varDecl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(104);
			typeSpec();
			setState(105);
			varDeclList(0);
			setState(106);
			match(SemiColon);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ScopedVarDeclContext extends ParserRuleContext {
		public TerminalNode Static() { return getToken(TParser.Static, 0); }
		public TypeSpecContext typeSpec() {
			return getRuleContext(TypeSpecContext.class,0);
		}
		public VarDeclListContext varDeclList() {
			return getRuleContext(VarDeclListContext.class,0);
		}
		public TerminalNode SemiColon() { return getToken(TParser.SemiColon, 0); }
		public ScopedVarDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_scopedVarDecl; }
	}

	public final ScopedVarDeclContext scopedVarDecl() throws RecognitionException {
		ScopedVarDeclContext _localctx = new ScopedVarDeclContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_scopedVarDecl);
		try {
			setState(117);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Static:
				enterOuterAlt(_localctx, 1);
				{
				setState(108);
				match(Static);
				setState(109);
				typeSpec();
				setState(110);
				varDeclList(0);
				setState(111);
				match(SemiColon);
				}
				break;
			case Int:
			case Bool:
			case Char:
			case VInt:
				enterOuterAlt(_localctx, 2);
				{
				setState(113);
				typeSpec();
				setState(114);
				varDeclList(0);
				setState(115);
				match(SemiColon);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VarDeclListContext extends ParserRuleContext {
		public VarDeclInitContext varDeclInit() {
			return getRuleContext(VarDeclInitContext.class,0);
		}
		public VarDeclListContext varDeclList() {
			return getRuleContext(VarDeclListContext.class,0);
		}
		public TerminalNode Comma() { return getToken(TParser.Comma, 0); }
		public VarDeclListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varDeclList; }
	}

	public final VarDeclListContext varDeclList() throws RecognitionException {
		return varDeclList(0);
	}

	private VarDeclListContext varDeclList(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		VarDeclListContext _localctx = new VarDeclListContext(_ctx, _parentState);
		VarDeclListContext _prevctx = _localctx;
		int _startState = 10;
		enterRecursionRule(_localctx, 10, RULE_varDeclList, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(120);
			varDeclInit();
			}
			_ctx.stop = _input.LT(-1);
			setState(127);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new VarDeclListContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_varDeclList);
					setState(122);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(123);
					match(Comma);
					setState(124);
					varDeclInit();
					}
					} 
				}
				setState(129);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class VarDeclInitContext extends ParserRuleContext {
		public VarDeclIdContext varDeclId() {
			return getRuleContext(VarDeclIdContext.class,0);
		}
		public TerminalNode Equal() { return getToken(TParser.Equal, 0); }
		public SimpleExpContext simpleExp() {
			return getRuleContext(SimpleExpContext.class,0);
		}
		public VarDeclInitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varDeclInit; }
	}

	public final VarDeclInitContext varDeclInit() throws RecognitionException {
		VarDeclInitContext _localctx = new VarDeclInitContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_varDeclInit);
		try {
			setState(135);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(130);
				varDeclId();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(131);
				varDeclId();
				setState(132);
				match(Equal);
				setState(133);
				simpleExp(0);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VarDeclIdContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(TParser.ID, 0); }
		public TerminalNode OpenSqu() { return getToken(TParser.OpenSqu, 0); }
		public TerminalNode NUMCONST() { return getToken(TParser.NUMCONST, 0); }
		public TerminalNode CloseSqu() { return getToken(TParser.CloseSqu, 0); }
		public VarDeclIdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varDeclId; }
	}

	public final VarDeclIdContext varDeclId() throws RecognitionException {
		VarDeclIdContext _localctx = new VarDeclIdContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_varDeclId);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(137);
			match(ID);
			setState(141);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				{
				setState(138);
				match(OpenSqu);
				setState(139);
				match(NUMCONST);
				setState(140);
				match(CloseSqu);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeSpecContext extends ParserRuleContext {
		public TerminalNode Int() { return getToken(TParser.Int, 0); }
		public TerminalNode Bool() { return getToken(TParser.Bool, 0); }
		public TerminalNode Char() { return getToken(TParser.Char, 0); }
		public TerminalNode VInt() { return getToken(TParser.VInt, 0); }
		public TypeSpecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeSpec; }
	}

	public final TypeSpecContext typeSpec() throws RecognitionException {
		TypeSpecContext _localctx = new TypeSpecContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_typeSpec);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(143);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Int) | (1L << Bool) | (1L << Char) | (1L << VInt))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunDeclContext extends ParserRuleContext {
		public TypeSpecContext typeSpec() {
			return getRuleContext(TypeSpecContext.class,0);
		}
		public TerminalNode ID() { return getToken(TParser.ID, 0); }
		public TerminalNode OpenPar() { return getToken(TParser.OpenPar, 0); }
		public ParmsContext parms() {
			return getRuleContext(ParmsContext.class,0);
		}
		public TerminalNode ClosePar() { return getToken(TParser.ClosePar, 0); }
		public StmtContext stmt() {
			return getRuleContext(StmtContext.class,0);
		}
		public FunDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funDecl; }
	}

	public final FunDeclContext funDecl() throws RecognitionException {
		FunDeclContext _localctx = new FunDeclContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_funDecl);
		try {
			setState(158);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Int:
			case Bool:
			case Char:
			case VInt:
				enterOuterAlt(_localctx, 1);
				{
				setState(145);
				typeSpec();
				setState(146);
				match(ID);
				setState(147);
				match(OpenPar);
				setState(148);
				parms();
				setState(149);
				match(ClosePar);
				setState(150);
				stmt();
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(152);
				match(ID);
				setState(153);
				match(OpenPar);
				setState(154);
				parms();
				setState(155);
				match(ClosePar);
				setState(156);
				stmt();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParmsContext extends ParserRuleContext {
		public ParmListContext parmList() {
			return getRuleContext(ParmListContext.class,0);
		}
		public ParmsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parms; }
	}

	public final ParmsContext parms() throws RecognitionException {
		ParmsContext _localctx = new ParmsContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_parms);
		try {
			setState(162);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Int:
			case Bool:
			case Char:
			case VInt:
				enterOuterAlt(_localctx, 1);
				{
				setState(160);
				parmList(0);
				}
				break;
			case ClosePar:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParmListContext extends ParserRuleContext {
		public ParmTypeListContext parmTypeList() {
			return getRuleContext(ParmTypeListContext.class,0);
		}
		public ParmListContext parmList() {
			return getRuleContext(ParmListContext.class,0);
		}
		public TerminalNode SemiColon() { return getToken(TParser.SemiColon, 0); }
		public ParmListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parmList; }
	}

	public final ParmListContext parmList() throws RecognitionException {
		return parmList(0);
	}

	private ParmListContext parmList(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ParmListContext _localctx = new ParmListContext(_ctx, _parentState);
		ParmListContext _prevctx = _localctx;
		int _startState = 22;
		enterRecursionRule(_localctx, 22, RULE_parmList, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(165);
			parmTypeList();
			}
			_ctx.stop = _input.LT(-1);
			setState(172);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ParmListContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_parmList);
					setState(167);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(168);
					match(SemiColon);
					setState(169);
					parmTypeList();
					}
					} 
				}
				setState(174);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class ParmTypeListContext extends ParserRuleContext {
		public TypeSpecContext typeSpec() {
			return getRuleContext(TypeSpecContext.class,0);
		}
		public ParmIdListContext parmIdList() {
			return getRuleContext(ParmIdListContext.class,0);
		}
		public ParmTypeListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parmTypeList; }
	}

	public final ParmTypeListContext parmTypeList() throws RecognitionException {
		ParmTypeListContext _localctx = new ParmTypeListContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_parmTypeList);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(175);
			typeSpec();
			setState(176);
			parmIdList(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParmIdListContext extends ParserRuleContext {
		public ParmIdContext parmId() {
			return getRuleContext(ParmIdContext.class,0);
		}
		public ParmIdListContext parmIdList() {
			return getRuleContext(ParmIdListContext.class,0);
		}
		public TerminalNode Comma() { return getToken(TParser.Comma, 0); }
		public ParmIdListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parmIdList; }
	}

	public final ParmIdListContext parmIdList() throws RecognitionException {
		return parmIdList(0);
	}

	private ParmIdListContext parmIdList(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ParmIdListContext _localctx = new ParmIdListContext(_ctx, _parentState);
		ParmIdListContext _prevctx = _localctx;
		int _startState = 26;
		enterRecursionRule(_localctx, 26, RULE_parmIdList, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(179);
			parmId();
			}
			_ctx.stop = _input.LT(-1);
			setState(186);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ParmIdListContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_parmIdList);
					setState(181);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(182);
					match(Comma);
					setState(183);
					parmId();
					}
					} 
				}
				setState(188);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class ParmIdContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(TParser.ID, 0); }
		public TerminalNode OpenSqu() { return getToken(TParser.OpenSqu, 0); }
		public TerminalNode CloseSqu() { return getToken(TParser.CloseSqu, 0); }
		public ParmIdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parmId; }
	}

	public final ParmIdContext parmId() throws RecognitionException {
		ParmIdContext _localctx = new ParmIdContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_parmId);
		try {
			setState(193);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(189);
				match(ID);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(190);
				match(ID);
				setState(191);
				match(OpenSqu);
				setState(192);
				match(CloseSqu);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StmtContext extends ParserRuleContext {
		public ExpStmtContext expStmt() {
			return getRuleContext(ExpStmtContext.class,0);
		}
		public CompoundStmtContext compoundStmt() {
			return getRuleContext(CompoundStmtContext.class,0);
		}
		public SelectStmtContext selectStmt() {
			return getRuleContext(SelectStmtContext.class,0);
		}
		public IterStmtContext iterStmt() {
			return getRuleContext(IterStmtContext.class,0);
		}
		public ReturnStmtContext returnStmt() {
			return getRuleContext(ReturnStmtContext.class,0);
		}
		public BreakStmtContext breakStmt() {
			return getRuleContext(BreakStmtContext.class,0);
		}
		public StmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stmt; }
	}

	public final StmtContext stmt() throws RecognitionException {
		StmtContext _localctx = new StmtContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_stmt);
		try {
			setState(201);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Not:
			case True:
			case False:
			case ID:
			case NUMCONST:
			case CHARCONST:
			case STRINGCONST:
			case VECTORCONST:
			case SemiColon:
			case Minus:
			case Star:
			case OpenPar:
			case QuestionMark:
				enterOuterAlt(_localctx, 1);
				{
				setState(195);
				expStmt();
				}
				break;
			case OpenCurly:
				enterOuterAlt(_localctx, 2);
				{
				setState(196);
				compoundStmt();
				}
				break;
			case If:
				enterOuterAlt(_localctx, 3);
				{
				setState(197);
				selectStmt();
				}
				break;
			case For:
			case While:
				enterOuterAlt(_localctx, 4);
				{
				setState(198);
				iterStmt();
				}
				break;
			case Return:
				enterOuterAlt(_localctx, 5);
				{
				setState(199);
				returnStmt();
				}
				break;
			case Break:
				enterOuterAlt(_localctx, 6);
				{
				setState(200);
				breakStmt();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpStmtContext extends ParserRuleContext {
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public TerminalNode SemiColon() { return getToken(TParser.SemiColon, 0); }
		public ExpStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expStmt; }
	}

	public final ExpStmtContext expStmt() throws RecognitionException {
		ExpStmtContext _localctx = new ExpStmtContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_expStmt);
		try {
			setState(207);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Not:
			case True:
			case False:
			case ID:
			case NUMCONST:
			case CHARCONST:
			case STRINGCONST:
			case VECTORCONST:
			case Minus:
			case Star:
			case OpenPar:
			case QuestionMark:
				enterOuterAlt(_localctx, 1);
				{
				setState(203);
				exp();
				setState(204);
				match(SemiColon);
				}
				break;
			case SemiColon:
				enterOuterAlt(_localctx, 2);
				{
				setState(206);
				match(SemiColon);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CompoundStmtContext extends ParserRuleContext {
		public TerminalNode OpenCurly() { return getToken(TParser.OpenCurly, 0); }
		public LocalDeclsContext localDecls() {
			return getRuleContext(LocalDeclsContext.class,0);
		}
		public StmtListContext stmtList() {
			return getRuleContext(StmtListContext.class,0);
		}
		public TerminalNode CloseCurly() { return getToken(TParser.CloseCurly, 0); }
		public CompoundStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compoundStmt; }
	}

	public final CompoundStmtContext compoundStmt() throws RecognitionException {
		CompoundStmtContext _localctx = new CompoundStmtContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_compoundStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(209);
			match(OpenCurly);
			setState(210);
			localDecls(0);
			setState(211);
			stmtList(0);
			setState(212);
			match(CloseCurly);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LocalDeclsContext extends ParserRuleContext {
		public LocalDeclsContext localDecls() {
			return getRuleContext(LocalDeclsContext.class,0);
		}
		public ScopedVarDeclContext scopedVarDecl() {
			return getRuleContext(ScopedVarDeclContext.class,0);
		}
		public LocalDeclsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_localDecls; }
	}

	public final LocalDeclsContext localDecls() throws RecognitionException {
		return localDecls(0);
	}

	private LocalDeclsContext localDecls(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		LocalDeclsContext _localctx = new LocalDeclsContext(_ctx, _parentState);
		LocalDeclsContext _prevctx = _localctx;
		int _startState = 36;
		enterRecursionRule(_localctx, 36, RULE_localDecls, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			}
			_ctx.stop = _input.LT(-1);
			setState(219);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new LocalDeclsContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_localDecls);
					setState(215);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(216);
					scopedVarDecl();
					}
					} 
				}
				setState(221);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class StmtListContext extends ParserRuleContext {
		public StmtListContext stmtList() {
			return getRuleContext(StmtListContext.class,0);
		}
		public StmtContext stmt() {
			return getRuleContext(StmtContext.class,0);
		}
		public StmtListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stmtList; }
	}

	public final StmtListContext stmtList() throws RecognitionException {
		return stmtList(0);
	}

	private StmtListContext stmtList(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		StmtListContext _localctx = new StmtListContext(_ctx, _parentState);
		StmtListContext _prevctx = _localctx;
		int _startState = 38;
		enterRecursionRule(_localctx, 38, RULE_stmtList, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			}
			_ctx.stop = _input.LT(-1);
			setState(227);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new StmtListContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_stmtList);
					setState(223);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(224);
					stmt();
					}
					} 
				}
				setState(229);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class SelectStmtContext extends ParserRuleContext {
		public TerminalNode If() { return getToken(TParser.If, 0); }
		public TerminalNode OpenPar() { return getToken(TParser.OpenPar, 0); }
		public SimpleExpContext simpleExp() {
			return getRuleContext(SimpleExpContext.class,0);
		}
		public TerminalNode ClosePar() { return getToken(TParser.ClosePar, 0); }
		public List<StmtContext> stmt() {
			return getRuleContexts(StmtContext.class);
		}
		public StmtContext stmt(int i) {
			return getRuleContext(StmtContext.class,i);
		}
		public TerminalNode Else() { return getToken(TParser.Else, 0); }
		public SelectStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selectStmt; }
	}

	public final SelectStmtContext selectStmt() throws RecognitionException {
		SelectStmtContext _localctx = new SelectStmtContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_selectStmt);
		try {
			setState(244);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(230);
				match(If);
				setState(231);
				match(OpenPar);
				setState(232);
				simpleExp(0);
				setState(233);
				match(ClosePar);
				setState(234);
				stmt();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(236);
				match(If);
				setState(237);
				match(OpenPar);
				setState(238);
				simpleExp(0);
				setState(239);
				match(ClosePar);
				setState(240);
				stmt();
				setState(241);
				match(Else);
				setState(242);
				stmt();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IterStmtContext extends ParserRuleContext {
		public TerminalNode While() { return getToken(TParser.While, 0); }
		public TerminalNode OpenPar() { return getToken(TParser.OpenPar, 0); }
		public SimpleExpContext simpleExp() {
			return getRuleContext(SimpleExpContext.class,0);
		}
		public TerminalNode ClosePar() { return getToken(TParser.ClosePar, 0); }
		public StmtContext stmt() {
			return getRuleContext(StmtContext.class,0);
		}
		public TerminalNode For() { return getToken(TParser.For, 0); }
		public IterRangeContext iterRange() {
			return getRuleContext(IterRangeContext.class,0);
		}
		public IterStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_iterStmt; }
	}

	public final IterStmtContext iterStmt() throws RecognitionException {
		IterStmtContext _localctx = new IterStmtContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_iterStmt);
		try {
			setState(258);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case While:
				enterOuterAlt(_localctx, 1);
				{
				setState(246);
				match(While);
				setState(247);
				match(OpenPar);
				setState(248);
				simpleExp(0);
				setState(249);
				match(ClosePar);
				setState(250);
				stmt();
				}
				break;
			case For:
				enterOuterAlt(_localctx, 2);
				{
				setState(252);
				match(For);
				setState(253);
				match(OpenPar);
				setState(254);
				iterRange();
				setState(255);
				match(ClosePar);
				setState(256);
				stmt();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IterRangeContext extends ParserRuleContext {
		public List<TerminalNode> SemiColon() { return getTokens(TParser.SemiColon); }
		public TerminalNode SemiColon(int i) {
			return getToken(TParser.SemiColon, i);
		}
		public TypeSpecContext typeSpec() {
			return getRuleContext(TypeSpecContext.class,0);
		}
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public VarDeclListContext varDeclList() {
			return getRuleContext(VarDeclListContext.class,0);
		}
		public IterRangeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_iterRange; }
	}

	public final IterRangeContext iterRange() throws RecognitionException {
		IterRangeContext _localctx = new IterRangeContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_iterRange);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(267);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Int:
			case Bool:
			case Char:
			case VInt:
				{
				setState(260);
				typeSpec();
				setState(262);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ID) {
					{
					setState(261);
					varDeclList(0);
					}
				}

				}
				break;
			case Not:
			case True:
			case False:
			case ID:
			case NUMCONST:
			case CHARCONST:
			case STRINGCONST:
			case VECTORCONST:
			case SemiColon:
			case Minus:
			case Star:
			case OpenPar:
			case QuestionMark:
				{
				setState(265);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Not) | (1L << True) | (1L << False) | (1L << ID) | (1L << NUMCONST) | (1L << CHARCONST) | (1L << STRINGCONST) | (1L << VECTORCONST) | (1L << Minus) | (1L << Star) | (1L << OpenPar) | (1L << QuestionMark))) != 0)) {
					{
					setState(264);
					exp();
					}
				}

				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(269);
			match(SemiColon);
			setState(271);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Not) | (1L << True) | (1L << False) | (1L << ID) | (1L << NUMCONST) | (1L << CHARCONST) | (1L << STRINGCONST) | (1L << VECTORCONST) | (1L << Minus) | (1L << Star) | (1L << OpenPar) | (1L << QuestionMark))) != 0)) {
				{
				setState(270);
				exp();
				}
			}

			setState(273);
			match(SemiColon);
			setState(275);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Not) | (1L << True) | (1L << False) | (1L << ID) | (1L << NUMCONST) | (1L << CHARCONST) | (1L << STRINGCONST) | (1L << VECTORCONST) | (1L << Minus) | (1L << Star) | (1L << OpenPar) | (1L << QuestionMark))) != 0)) {
				{
				setState(274);
				exp();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ReturnStmtContext extends ParserRuleContext {
		public TerminalNode Return() { return getToken(TParser.Return, 0); }
		public TerminalNode SemiColon() { return getToken(TParser.SemiColon, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public ReturnStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnStmt; }
	}

	public final ReturnStmtContext returnStmt() throws RecognitionException {
		ReturnStmtContext _localctx = new ReturnStmtContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_returnStmt);
		try {
			setState(283);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(277);
				match(Return);
				setState(278);
				match(SemiColon);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(279);
				match(Return);
				setState(280);
				exp();
				setState(281);
				match(SemiColon);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BreakStmtContext extends ParserRuleContext {
		public TerminalNode Break() { return getToken(TParser.Break, 0); }
		public TerminalNode SemiColon() { return getToken(TParser.SemiColon, 0); }
		public BreakStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_breakStmt; }
	}

	public final BreakStmtContext breakStmt() throws RecognitionException {
		BreakStmtContext _localctx = new BreakStmtContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_breakStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(285);
			match(Break);
			setState(286);
			match(SemiColon);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpContext extends ParserRuleContext {
		public MutableContext mutable() {
			return getRuleContext(MutableContext.class,0);
		}
		public TerminalNode Equal() { return getToken(TParser.Equal, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public TerminalNode PlusEqual() { return getToken(TParser.PlusEqual, 0); }
		public TerminalNode MinusEqual() { return getToken(TParser.MinusEqual, 0); }
		public TerminalNode StarEqual() { return getToken(TParser.StarEqual, 0); }
		public TerminalNode ForEqual() { return getToken(TParser.ForEqual, 0); }
		public TerminalNode Increment() { return getToken(TParser.Increment, 0); }
		public TerminalNode Decrement() { return getToken(TParser.Decrement, 0); }
		public SimpleExpContext simpleExp() {
			return getRuleContext(SimpleExpContext.class,0);
		}
		public ExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exp; }
	}

	public final ExpContext exp() throws RecognitionException {
		ExpContext _localctx = new ExpContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_exp);
		try {
			setState(315);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(288);
				mutable();
				setState(289);
				match(Equal);
				setState(290);
				exp();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(292);
				mutable();
				setState(293);
				match(PlusEqual);
				setState(294);
				exp();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(296);
				mutable();
				setState(297);
				match(MinusEqual);
				setState(298);
				exp();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(300);
				mutable();
				setState(301);
				match(StarEqual);
				setState(302);
				exp();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(304);
				mutable();
				setState(305);
				match(ForEqual);
				setState(306);
				exp();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(308);
				mutable();
				setState(309);
				match(Increment);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(311);
				mutable();
				setState(312);
				match(Decrement);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(314);
				simpleExp(0);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SimpleExpContext extends ParserRuleContext {
		public AndExpContext andExp() {
			return getRuleContext(AndExpContext.class,0);
		}
		public SimpleExpContext simpleExp() {
			return getRuleContext(SimpleExpContext.class,0);
		}
		public TerminalNode Or() { return getToken(TParser.Or, 0); }
		public SimpleExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simpleExp; }
	}

	public final SimpleExpContext simpleExp() throws RecognitionException {
		return simpleExp(0);
	}

	private SimpleExpContext simpleExp(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		SimpleExpContext _localctx = new SimpleExpContext(_ctx, _parentState);
		SimpleExpContext _prevctx = _localctx;
		int _startState = 52;
		enterRecursionRule(_localctx, 52, RULE_simpleExp, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(318);
			andExp(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(325);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new SimpleExpContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_simpleExp);
					setState(320);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(321);
					match(Or);
					setState(322);
					andExp(0);
					}
					} 
				}
				setState(327);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class AndExpContext extends ParserRuleContext {
		public UnaryRelExpContext unaryRelExp() {
			return getRuleContext(UnaryRelExpContext.class,0);
		}
		public AndExpContext andExp() {
			return getRuleContext(AndExpContext.class,0);
		}
		public TerminalNode And() { return getToken(TParser.And, 0); }
		public AndExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_andExp; }
	}

	public final AndExpContext andExp() throws RecognitionException {
		return andExp(0);
	}

	private AndExpContext andExp(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		AndExpContext _localctx = new AndExpContext(_ctx, _parentState);
		AndExpContext _prevctx = _localctx;
		int _startState = 54;
		enterRecursionRule(_localctx, 54, RULE_andExp, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(329);
			unaryRelExp();
			}
			_ctx.stop = _input.LT(-1);
			setState(336);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new AndExpContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_andExp);
					setState(331);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(332);
					match(And);
					setState(333);
					unaryRelExp();
					}
					} 
				}
				setState(338);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class UnaryRelExpContext extends ParserRuleContext {
		public TerminalNode Not() { return getToken(TParser.Not, 0); }
		public UnaryRelExpContext unaryRelExp() {
			return getRuleContext(UnaryRelExpContext.class,0);
		}
		public RelExpContext relExp() {
			return getRuleContext(RelExpContext.class,0);
		}
		public UnaryRelExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unaryRelExp; }
	}

	public final UnaryRelExpContext unaryRelExp() throws RecognitionException {
		UnaryRelExpContext _localctx = new UnaryRelExpContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_unaryRelExp);
		try {
			setState(342);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Not:
				enterOuterAlt(_localctx, 1);
				{
				setState(339);
				match(Not);
				setState(340);
				unaryRelExp();
				}
				break;
			case True:
			case False:
			case ID:
			case NUMCONST:
			case CHARCONST:
			case STRINGCONST:
			case VECTORCONST:
			case Minus:
			case Star:
			case OpenPar:
			case QuestionMark:
				enterOuterAlt(_localctx, 2);
				{
				setState(341);
				relExp();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RelExpContext extends ParserRuleContext {
		public List<SumExpContext> sumExp() {
			return getRuleContexts(SumExpContext.class);
		}
		public SumExpContext sumExp(int i) {
			return getRuleContext(SumExpContext.class,i);
		}
		public RelopContext relop() {
			return getRuleContext(RelopContext.class,0);
		}
		public RelExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relExp; }
	}

	public final RelExpContext relExp() throws RecognitionException {
		RelExpContext _localctx = new RelExpContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_relExp);
		try {
			setState(349);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(344);
				sumExp(0);
				setState(345);
				relop();
				setState(346);
				sumExp(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(348);
				sumExp(0);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RelopContext extends ParserRuleContext {
		public TerminalNode LessorEqual() { return getToken(TParser.LessorEqual, 0); }
		public TerminalNode LessThan() { return getToken(TParser.LessThan, 0); }
		public TerminalNode GreaterThan() { return getToken(TParser.GreaterThan, 0); }
		public TerminalNode GreatorEqual() { return getToken(TParser.GreatorEqual, 0); }
		public TerminalNode DoubleEqual() { return getToken(TParser.DoubleEqual, 0); }
		public TerminalNode NotEqual() { return getToken(TParser.NotEqual, 0); }
		public RelopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relop; }
	}

	public final RelopContext relop() throws RecognitionException {
		RelopContext _localctx = new RelopContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_relop);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(351);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LessorEqual) | (1L << GreatorEqual) | (1L << LessThan) | (1L << GreaterThan) | (1L << DoubleEqual) | (1L << NotEqual))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SumExpContext extends ParserRuleContext {
		public MulExpContext mulExp() {
			return getRuleContext(MulExpContext.class,0);
		}
		public SumExpContext sumExp() {
			return getRuleContext(SumExpContext.class,0);
		}
		public SumopContext sumop() {
			return getRuleContext(SumopContext.class,0);
		}
		public SumExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sumExp; }
	}

	public final SumExpContext sumExp() throws RecognitionException {
		return sumExp(0);
	}

	private SumExpContext sumExp(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		SumExpContext _localctx = new SumExpContext(_ctx, _parentState);
		SumExpContext _prevctx = _localctx;
		int _startState = 62;
		enterRecursionRule(_localctx, 62, RULE_sumExp, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(354);
			mulExp(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(362);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new SumExpContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_sumExp);
					setState(356);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(357);
					sumop();
					setState(358);
					mulExp(0);
					}
					} 
				}
				setState(364);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class SumopContext extends ParserRuleContext {
		public TerminalNode Plus() { return getToken(TParser.Plus, 0); }
		public TerminalNode Minus() { return getToken(TParser.Minus, 0); }
		public SumopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sumop; }
	}

	public final SumopContext sumop() throws RecognitionException {
		SumopContext _localctx = new SumopContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_sumop);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(365);
			_la = _input.LA(1);
			if ( !(_la==Plus || _la==Minus) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MulExpContext extends ParserRuleContext {
		public UnaryExpContext unaryExp() {
			return getRuleContext(UnaryExpContext.class,0);
		}
		public MulExpContext mulExp() {
			return getRuleContext(MulExpContext.class,0);
		}
		public MulopContext mulop() {
			return getRuleContext(MulopContext.class,0);
		}
		public MulExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mulExp; }
	}

	public final MulExpContext mulExp() throws RecognitionException {
		return mulExp(0);
	}

	private MulExpContext mulExp(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		MulExpContext _localctx = new MulExpContext(_ctx, _parentState);
		MulExpContext _prevctx = _localctx;
		int _startState = 66;
		enterRecursionRule(_localctx, 66, RULE_mulExp, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(368);
			unaryExp();
			}
			_ctx.stop = _input.LT(-1);
			setState(376);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new MulExpContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_mulExp);
					setState(370);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(371);
					mulop();
					setState(372);
					unaryExp();
					}
					} 
				}
				setState(378);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class MulopContext extends ParserRuleContext {
		public TerminalNode Star() { return getToken(TParser.Star, 0); }
		public TerminalNode ForSlash() { return getToken(TParser.ForSlash, 0); }
		public TerminalNode Percent() { return getToken(TParser.Percent, 0); }
		public MulopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mulop; }
	}

	public final MulopContext mulop() throws RecognitionException {
		MulopContext _localctx = new MulopContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_mulop);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(379);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Star) | (1L << ForSlash) | (1L << Percent))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UnaryExpContext extends ParserRuleContext {
		public UnaryopContext unaryop() {
			return getRuleContext(UnaryopContext.class,0);
		}
		public UnaryExpContext unaryExp() {
			return getRuleContext(UnaryExpContext.class,0);
		}
		public FactorContext factor() {
			return getRuleContext(FactorContext.class,0);
		}
		public UnaryExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unaryExp; }
	}

	public final UnaryExpContext unaryExp() throws RecognitionException {
		UnaryExpContext _localctx = new UnaryExpContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_unaryExp);
		try {
			setState(385);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Minus:
			case Star:
			case QuestionMark:
				enterOuterAlt(_localctx, 1);
				{
				setState(381);
				unaryop();
				setState(382);
				unaryExp();
				}
				break;
			case True:
			case False:
			case ID:
			case NUMCONST:
			case CHARCONST:
			case STRINGCONST:
			case VECTORCONST:
			case OpenPar:
				enterOuterAlt(_localctx, 2);
				{
				setState(384);
				factor();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UnaryopContext extends ParserRuleContext {
		public TerminalNode Minus() { return getToken(TParser.Minus, 0); }
		public TerminalNode Star() { return getToken(TParser.Star, 0); }
		public TerminalNode QuestionMark() { return getToken(TParser.QuestionMark, 0); }
		public UnaryopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unaryop; }
	}

	public final UnaryopContext unaryop() throws RecognitionException {
		UnaryopContext _localctx = new UnaryopContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_unaryop);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(387);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Minus) | (1L << Star) | (1L << QuestionMark))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FactorContext extends ParserRuleContext {
		public ImmutableContext immutable() {
			return getRuleContext(ImmutableContext.class,0);
		}
		public MutableContext mutable() {
			return getRuleContext(MutableContext.class,0);
		}
		public FactorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_factor; }
	}

	public final FactorContext factor() throws RecognitionException {
		FactorContext _localctx = new FactorContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_factor);
		try {
			setState(391);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(389);
				immutable();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(390);
				mutable();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MutableContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(TParser.ID, 0); }
		public TerminalNode OpenSqu() { return getToken(TParser.OpenSqu, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public TerminalNode CloseSqu() { return getToken(TParser.CloseSqu, 0); }
		public MutableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mutable; }
	}

	public final MutableContext mutable() throws RecognitionException {
		MutableContext _localctx = new MutableContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_mutable);
		try {
			setState(399);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(393);
				match(ID);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(394);
				match(ID);
				setState(395);
				match(OpenSqu);
				setState(396);
				exp();
				setState(397);
				match(CloseSqu);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ImmutableContext extends ParserRuleContext {
		public TerminalNode OpenPar() { return getToken(TParser.OpenPar, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public TerminalNode ClosePar() { return getToken(TParser.ClosePar, 0); }
		public CallContext call() {
			return getRuleContext(CallContext.class,0);
		}
		public ConstantContext constant() {
			return getRuleContext(ConstantContext.class,0);
		}
		public ImmutableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_immutable; }
	}

	public final ImmutableContext immutable() throws RecognitionException {
		ImmutableContext _localctx = new ImmutableContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_immutable);
		try {
			setState(407);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OpenPar:
				enterOuterAlt(_localctx, 1);
				{
				setState(401);
				match(OpenPar);
				setState(402);
				exp();
				setState(403);
				match(ClosePar);
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(405);
				call();
				}
				break;
			case True:
			case False:
			case NUMCONST:
			case CHARCONST:
			case STRINGCONST:
			case VECTORCONST:
				enterOuterAlt(_localctx, 3);
				{
				setState(406);
				constant();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CallContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(TParser.ID, 0); }
		public TerminalNode OpenPar() { return getToken(TParser.OpenPar, 0); }
		public ArgsContext args() {
			return getRuleContext(ArgsContext.class,0);
		}
		public TerminalNode ClosePar() { return getToken(TParser.ClosePar, 0); }
		public CallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_call; }
	}

	public final CallContext call() throws RecognitionException {
		CallContext _localctx = new CallContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_call);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(409);
			match(ID);
			setState(410);
			match(OpenPar);
			setState(411);
			args();
			setState(412);
			match(ClosePar);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArgsContext extends ParserRuleContext {
		public ArgListContext argList() {
			return getRuleContext(ArgListContext.class,0);
		}
		public ArgsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_args; }
	}

	public final ArgsContext args() throws RecognitionException {
		ArgsContext _localctx = new ArgsContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_args);
		try {
			setState(416);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Not:
			case True:
			case False:
			case ID:
			case NUMCONST:
			case CHARCONST:
			case STRINGCONST:
			case VECTORCONST:
			case Minus:
			case Star:
			case OpenPar:
			case QuestionMark:
				enterOuterAlt(_localctx, 1);
				{
				setState(414);
				argList(0);
				}
				break;
			case ClosePar:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArgListContext extends ParserRuleContext {
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public ArgListContext argList() {
			return getRuleContext(ArgListContext.class,0);
		}
		public TerminalNode Comma() { return getToken(TParser.Comma, 0); }
		public ArgListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argList; }
	}

	public final ArgListContext argList() throws RecognitionException {
		return argList(0);
	}

	private ArgListContext argList(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ArgListContext _localctx = new ArgListContext(_ctx, _parentState);
		ArgListContext _prevctx = _localctx;
		int _startState = 84;
		enterRecursionRule(_localctx, 84, RULE_argList, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(419);
			exp();
			}
			_ctx.stop = _input.LT(-1);
			setState(426);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,35,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ArgListContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_argList);
					setState(421);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(422);
					match(Comma);
					setState(423);
					exp();
					}
					} 
				}
				setState(428);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,35,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class ConstantContext extends ParserRuleContext {
		public TerminalNode NUMCONST() { return getToken(TParser.NUMCONST, 0); }
		public TerminalNode CHARCONST() { return getToken(TParser.CHARCONST, 0); }
		public TerminalNode STRINGCONST() { return getToken(TParser.STRINGCONST, 0); }
		public TerminalNode VECTORCONST() { return getToken(TParser.VECTORCONST, 0); }
		public TerminalNode True() { return getToken(TParser.True, 0); }
		public TerminalNode False() { return getToken(TParser.False, 0); }
		public ConstantContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constant; }
	}

	public final ConstantContext constant() throws RecognitionException {
		ConstantContext _localctx = new ConstantContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_constant);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(429);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << True) | (1L << False) | (1L << NUMCONST) | (1L << CHARCONST) | (1L << STRINGCONST) | (1L << VECTORCONST))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 1:
			return declList_sempred((DeclListContext)_localctx, predIndex);
		case 5:
			return varDeclList_sempred((VarDeclListContext)_localctx, predIndex);
		case 11:
			return parmList_sempred((ParmListContext)_localctx, predIndex);
		case 13:
			return parmIdList_sempred((ParmIdListContext)_localctx, predIndex);
		case 18:
			return localDecls_sempred((LocalDeclsContext)_localctx, predIndex);
		case 19:
			return stmtList_sempred((StmtListContext)_localctx, predIndex);
		case 26:
			return simpleExp_sempred((SimpleExpContext)_localctx, predIndex);
		case 27:
			return andExp_sempred((AndExpContext)_localctx, predIndex);
		case 31:
			return sumExp_sempred((SumExpContext)_localctx, predIndex);
		case 33:
			return mulExp_sempred((MulExpContext)_localctx, predIndex);
		case 42:
			return argList_sempred((ArgListContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean declList_sempred(DeclListContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean varDeclList_sempred(VarDeclListContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean parmList_sempred(ParmListContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean parmIdList_sempred(ParmIdListContext _localctx, int predIndex) {
		switch (predIndex) {
		case 3:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean localDecls_sempred(LocalDeclsContext _localctx, int predIndex) {
		switch (predIndex) {
		case 4:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean stmtList_sempred(StmtListContext _localctx, int predIndex) {
		switch (predIndex) {
		case 5:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean simpleExp_sempred(SimpleExpContext _localctx, int predIndex) {
		switch (predIndex) {
		case 6:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean andExp_sempred(AndExpContext _localctx, int predIndex) {
		switch (predIndex) {
		case 7:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean sumExp_sempred(SumExpContext _localctx, int predIndex) {
		switch (predIndex) {
		case 8:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean mulExp_sempred(MulExpContext _localctx, int predIndex) {
		switch (predIndex) {
		case 9:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean argList_sempred(ArgListContext _localctx, int predIndex) {
		switch (predIndex) {
		case 10:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3:\u01b2\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\3\2\3\2\3\3\3\3\3\3\3\3\3\3\7\3b\n\3\f\3\16\3e\13\3\3\4\3\4"+
		"\5\4i\n\4\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6x\n\6"+
		"\3\7\3\7\3\7\3\7\3\7\3\7\7\7\u0080\n\7\f\7\16\7\u0083\13\7\3\b\3\b\3\b"+
		"\3\b\3\b\5\b\u008a\n\b\3\t\3\t\3\t\3\t\5\t\u0090\n\t\3\n\3\n\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\5\13\u00a1\n\13"+
		"\3\f\3\f\5\f\u00a5\n\f\3\r\3\r\3\r\3\r\3\r\3\r\7\r\u00ad\n\r\f\r\16\r"+
		"\u00b0\13\r\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\7\17\u00bb\n"+
		"\17\f\17\16\17\u00be\13\17\3\20\3\20\3\20\3\20\5\20\u00c4\n\20\3\21\3"+
		"\21\3\21\3\21\3\21\3\21\5\21\u00cc\n\21\3\22\3\22\3\22\3\22\5\22\u00d2"+
		"\n\22\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\7\24\u00dc\n\24\f\24\16"+
		"\24\u00df\13\24\3\25\3\25\3\25\7\25\u00e4\n\25\f\25\16\25\u00e7\13\25"+
		"\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26"+
		"\5\26\u00f7\n\26\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27"+
		"\3\27\5\27\u0105\n\27\3\30\3\30\5\30\u0109\n\30\3\30\5\30\u010c\n\30\5"+
		"\30\u010e\n\30\3\30\3\30\5\30\u0112\n\30\3\30\3\30\5\30\u0116\n\30\3\31"+
		"\3\31\3\31\3\31\3\31\3\31\5\31\u011e\n\31\3\32\3\32\3\32\3\33\3\33\3\33"+
		"\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33"+
		"\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\5\33\u013e\n\33\3\34"+
		"\3\34\3\34\3\34\3\34\3\34\7\34\u0146\n\34\f\34\16\34\u0149\13\34\3\35"+
		"\3\35\3\35\3\35\3\35\3\35\7\35\u0151\n\35\f\35\16\35\u0154\13\35\3\36"+
		"\3\36\3\36\5\36\u0159\n\36\3\37\3\37\3\37\3\37\3\37\5\37\u0160\n\37\3"+
		" \3 \3!\3!\3!\3!\3!\3!\3!\7!\u016b\n!\f!\16!\u016e\13!\3\"\3\"\3#\3#\3"+
		"#\3#\3#\3#\3#\7#\u0179\n#\f#\16#\u017c\13#\3$\3$\3%\3%\3%\3%\5%\u0184"+
		"\n%\3&\3&\3\'\3\'\5\'\u018a\n\'\3(\3(\3(\3(\3(\3(\5(\u0192\n(\3)\3)\3"+
		")\3)\3)\3)\5)\u019a\n)\3*\3*\3*\3*\3*\3+\3+\5+\u01a3\n+\3,\3,\3,\3,\3"+
		",\3,\7,\u01ab\n,\f,\16,\u01ae\13,\3-\3-\3-\2\r\4\f\30\34&(\668@DV.\2\4"+
		"\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNP"+
		"RTVX\2\b\4\2\t\13::\3\2\37$\3\2-.\3\2/\61\4\2./88\4\2\22\23\26\31\2\u01b4"+
		"\2Z\3\2\2\2\4\\\3\2\2\2\6h\3\2\2\2\bj\3\2\2\2\nw\3\2\2\2\fy\3\2\2\2\16"+
		"\u0089\3\2\2\2\20\u008b\3\2\2\2\22\u0091\3\2\2\2\24\u00a0\3\2\2\2\26\u00a4"+
		"\3\2\2\2\30\u00a6\3\2\2\2\32\u00b1\3\2\2\2\34\u00b4\3\2\2\2\36\u00c3\3"+
		"\2\2\2 \u00cb\3\2\2\2\"\u00d1\3\2\2\2$\u00d3\3\2\2\2&\u00d8\3\2\2\2(\u00e0"+
		"\3\2\2\2*\u00f6\3\2\2\2,\u0104\3\2\2\2.\u010d\3\2\2\2\60\u011d\3\2\2\2"+
		"\62\u011f\3\2\2\2\64\u013d\3\2\2\2\66\u013f\3\2\2\28\u014a\3\2\2\2:\u0158"+
		"\3\2\2\2<\u015f\3\2\2\2>\u0161\3\2\2\2@\u0163\3\2\2\2B\u016f\3\2\2\2D"+
		"\u0171\3\2\2\2F\u017d\3\2\2\2H\u0183\3\2\2\2J\u0185\3\2\2\2L\u0189\3\2"+
		"\2\2N\u0191\3\2\2\2P\u0199\3\2\2\2R\u019b\3\2\2\2T\u01a2\3\2\2\2V\u01a4"+
		"\3\2\2\2X\u01af\3\2\2\2Z[\5\4\3\2[\3\3\2\2\2\\]\b\3\1\2]^\5\6\4\2^c\3"+
		"\2\2\2_`\f\4\2\2`b\5\6\4\2a_\3\2\2\2be\3\2\2\2ca\3\2\2\2cd\3\2\2\2d\5"+
		"\3\2\2\2ec\3\2\2\2fi\5\b\5\2gi\5\24\13\2hf\3\2\2\2hg\3\2\2\2i\7\3\2\2"+
		"\2jk\5\22\n\2kl\5\f\7\2lm\7\36\2\2m\t\3\2\2\2no\7\24\2\2op\5\22\n\2pq"+
		"\5\f\7\2qr\7\36\2\2rx\3\2\2\2st\5\22\n\2tu\5\f\7\2uv\7\36\2\2vx\3\2\2"+
		"\2wn\3\2\2\2ws\3\2\2\2x\13\3\2\2\2yz\b\7\1\2z{\5\16\b\2{\u0081\3\2\2\2"+
		"|}\f\4\2\2}~\7\35\2\2~\u0080\5\16\b\2\177|\3\2\2\2\u0080\u0083\3\2\2\2"+
		"\u0081\177\3\2\2\2\u0081\u0082\3\2\2\2\u0082\r\3\2\2\2\u0083\u0081\3\2"+
		"\2\2\u0084\u008a\5\20\t\2\u0085\u0086\5\20\t\2\u0086\u0087\7+\2\2\u0087"+
		"\u0088\5\66\34\2\u0088\u008a\3\2\2\2\u0089\u0084\3\2\2\2\u0089\u0085\3"+
		"\2\2\2\u008a\17\3\2\2\2\u008b\u008f\7\25\2\2\u008c\u008d\7\66\2\2\u008d"+
		"\u008e\7\26\2\2\u008e\u0090\7\67\2\2\u008f\u008c\3\2\2\2\u008f\u0090\3"+
		"\2\2\2\u0090\21\3\2\2\2\u0091\u0092\t\2\2\2\u0092\23\3\2\2\2\u0093\u0094"+
		"\5\22\n\2\u0094\u0095\7\25\2\2\u0095\u0096\7\62\2\2\u0096\u0097\5\26\f"+
		"\2\u0097\u0098\7\63\2\2\u0098\u0099\5 \21\2\u0099\u00a1\3\2\2\2\u009a"+
		"\u009b\7\25\2\2\u009b\u009c\7\62\2\2\u009c\u009d\5\26\f\2\u009d\u009e"+
		"\7\63\2\2\u009e\u009f\5 \21\2\u009f\u00a1\3\2\2\2\u00a0\u0093\3\2\2\2"+
		"\u00a0\u009a\3\2\2\2\u00a1\25\3\2\2\2\u00a2\u00a5\5\30\r\2\u00a3\u00a5"+
		"\3\2\2\2\u00a4\u00a2\3\2\2\2\u00a4\u00a3\3\2\2\2\u00a5\27\3\2\2\2\u00a6"+
		"\u00a7\b\r\1\2\u00a7\u00a8\5\32\16\2\u00a8\u00ae\3\2\2\2\u00a9\u00aa\f"+
		"\4\2\2\u00aa\u00ab\7\36\2\2\u00ab\u00ad\5\32\16\2\u00ac\u00a9\3\2\2\2"+
		"\u00ad\u00b0\3\2\2\2\u00ae\u00ac\3\2\2\2\u00ae\u00af\3\2\2\2\u00af\31"+
		"\3\2\2\2\u00b0\u00ae\3\2\2\2\u00b1\u00b2\5\22\n\2\u00b2\u00b3\5\34\17"+
		"\2\u00b3\33\3\2\2\2\u00b4\u00b5\b\17\1\2\u00b5\u00b6\5\36\20\2\u00b6\u00bc"+
		"\3\2\2\2\u00b7\u00b8\f\4\2\2\u00b8\u00b9\7\35\2\2\u00b9\u00bb\5\36\20"+
		"\2\u00ba\u00b7\3\2\2\2\u00bb\u00be\3\2\2\2\u00bc\u00ba\3\2\2\2\u00bc\u00bd"+
		"\3\2\2\2\u00bd\35\3\2\2\2\u00be\u00bc\3\2\2\2\u00bf\u00c4\7\25\2\2\u00c0"+
		"\u00c1\7\25\2\2\u00c1\u00c2\7\66\2\2\u00c2\u00c4\7\67\2\2\u00c3\u00bf"+
		"\3\2\2\2\u00c3\u00c0\3\2\2\2\u00c4\37\3\2\2\2\u00c5\u00cc\5\"\22\2\u00c6"+
		"\u00cc\5$\23\2\u00c7\u00cc\5*\26\2\u00c8\u00cc\5,\27\2\u00c9\u00cc\5\60"+
		"\31\2\u00ca\u00cc\5\62\32\2\u00cb\u00c5\3\2\2\2\u00cb\u00c6\3\2\2\2\u00cb"+
		"\u00c7\3\2\2\2\u00cb\u00c8\3\2\2\2\u00cb\u00c9\3\2\2\2\u00cb\u00ca\3\2"+
		"\2\2\u00cc!\3\2\2\2\u00cd\u00ce\5\64\33\2\u00ce\u00cf\7\36\2\2\u00cf\u00d2"+
		"\3\2\2\2\u00d0\u00d2\7\36\2\2\u00d1\u00cd\3\2\2\2\u00d1\u00d0\3\2\2\2"+
		"\u00d2#\3\2\2\2\u00d3\u00d4\7\64\2\2\u00d4\u00d5\5&\24\2\u00d5\u00d6\5"+
		"(\25\2\u00d6\u00d7\7\65\2\2\u00d7%\3\2\2\2\u00d8\u00dd\b\24\1\2\u00d9"+
		"\u00da\f\4\2\2\u00da\u00dc\5\n\6\2\u00db\u00d9\3\2\2\2\u00dc\u00df\3\2"+
		"\2\2\u00dd\u00db\3\2\2\2\u00dd\u00de\3\2\2\2\u00de\'\3\2\2\2\u00df\u00dd"+
		"\3\2\2\2\u00e0\u00e5\b\25\1\2\u00e1\u00e2\f\4\2\2\u00e2\u00e4\5 \21\2"+
		"\u00e3\u00e1\3\2\2\2\u00e4\u00e7\3\2\2\2\u00e5\u00e3\3\2\2\2\u00e5\u00e6"+
		"\3\2\2\2\u00e6)\3\2\2\2\u00e7\u00e5\3\2\2\2\u00e8\u00e9\7\16\2\2\u00e9"+
		"\u00ea\7\62\2\2\u00ea\u00eb\5\66\34\2\u00eb\u00ec\7\63\2\2\u00ec\u00ed"+
		"\5 \21\2\u00ed\u00f7\3\2\2\2\u00ee\u00ef\7\16\2\2\u00ef\u00f0\7\62\2\2"+
		"\u00f0\u00f1\5\66\34\2\u00f1\u00f2\7\63\2\2\u00f2\u00f3\5 \21\2\u00f3"+
		"\u00f4\7\17\2\2\u00f4\u00f5\5 \21\2\u00f5\u00f7\3\2\2\2\u00f6\u00e8\3"+
		"\2\2\2\u00f6\u00ee\3\2\2\2\u00f7+\3\2\2\2\u00f8\u00f9\7\21\2\2\u00f9\u00fa"+
		"\7\62\2\2\u00fa\u00fb\5\66\34\2\u00fb\u00fc\7\63\2\2\u00fc\u00fd\5 \21"+
		"\2\u00fd\u0105\3\2\2\2\u00fe\u00ff\7\20\2\2\u00ff\u0100\7\62\2\2\u0100"+
		"\u0101\5.\30\2\u0101\u0102\7\63\2\2\u0102\u0103\5 \21\2\u0103\u0105\3"+
		"\2\2\2\u0104\u00f8\3\2\2\2\u0104\u00fe\3\2\2\2\u0105-\3\2\2\2\u0106\u0108"+
		"\5\22\n\2\u0107\u0109\5\f\7\2\u0108\u0107\3\2\2\2\u0108\u0109\3\2\2\2"+
		"\u0109\u010e\3\2\2\2\u010a\u010c\5\64\33\2\u010b\u010a\3\2\2\2\u010b\u010c"+
		"\3\2\2\2\u010c\u010e\3\2\2\2\u010d\u0106\3\2\2\2\u010d\u010b\3\2\2\2\u010e"+
		"\u010f\3\2\2\2\u010f\u0111\7\36\2\2\u0110\u0112\5\64\33\2\u0111\u0110"+
		"\3\2\2\2\u0111\u0112\3\2\2\2\u0112\u0113\3\2\2\2\u0113\u0115\7\36\2\2"+
		"\u0114\u0116\5\64\33\2\u0115\u0114\3\2\2\2\u0115\u0116\3\2\2\2\u0116/"+
		"\3\2\2\2\u0117\u0118\7\f\2\2\u0118\u011e\7\36\2\2\u0119\u011a\7\f\2\2"+
		"\u011a\u011b\5\64\33\2\u011b\u011c\7\36\2\2\u011c\u011e\3\2\2\2\u011d"+
		"\u0117\3\2\2\2\u011d\u0119\3\2\2\2\u011e\61\3\2\2\2\u011f\u0120\7\r\2"+
		"\2\u0120\u0121\7\36\2\2\u0121\63\3\2\2\2\u0122\u0123\5N(\2\u0123\u0124"+
		"\7+\2\2\u0124\u0125\5\64\33\2\u0125\u013e\3\2\2\2\u0126\u0127\5N(\2\u0127"+
		"\u0128\7\'\2\2\u0128\u0129\5\64\33\2\u0129\u013e\3\2\2\2\u012a\u012b\5"+
		"N(\2\u012b\u012c\7(\2\2\u012c\u012d\5\64\33\2\u012d\u013e\3\2\2\2\u012e"+
		"\u012f\5N(\2\u012f\u0130\7)\2\2\u0130\u0131\5\64\33\2\u0131\u013e\3\2"+
		"\2\2\u0132\u0133\5N(\2\u0133\u0134\7*\2\2\u0134\u0135\5\64\33\2\u0135"+
		"\u013e\3\2\2\2\u0136\u0137\5N(\2\u0137\u0138\7%\2\2\u0138\u013e\3\2\2"+
		"\2\u0139\u013a\5N(\2\u013a\u013b\7&\2\2\u013b\u013e\3\2\2\2\u013c\u013e"+
		"\5\66\34\2\u013d\u0122\3\2\2\2\u013d\u0126\3\2\2\2\u013d\u012a\3\2\2\2"+
		"\u013d\u012e\3\2\2\2\u013d\u0132\3\2\2\2\u013d\u0136\3\2\2\2\u013d\u0139"+
		"\3\2\2\2\u013d\u013c\3\2\2\2\u013e\65\3\2\2\2\u013f\u0140\b\34\1\2\u0140"+
		"\u0141\58\35\2\u0141\u0147\3\2\2\2\u0142\u0143\f\4\2\2\u0143\u0144\7\6"+
		"\2\2\u0144\u0146\58\35\2\u0145\u0142\3\2\2\2\u0146\u0149\3\2\2\2\u0147"+
		"\u0145\3\2\2\2\u0147\u0148\3\2\2\2\u0148\67\3\2\2\2\u0149\u0147\3\2\2"+
		"\2\u014a\u014b\b\35\1\2\u014b\u014c\5:\36\2\u014c\u0152\3\2\2\2\u014d"+
		"\u014e\f\4\2\2\u014e\u014f\7\4\2\2\u014f\u0151\5:\36\2\u0150\u014d\3\2"+
		"\2\2\u0151\u0154\3\2\2\2\u0152\u0150\3\2\2\2\u0152\u0153\3\2\2\2\u0153"+
		"9\3\2\2\2\u0154\u0152\3\2\2\2\u0155\u0156\7\5\2\2\u0156\u0159\5:\36\2"+
		"\u0157\u0159\5<\37\2\u0158\u0155\3\2\2\2\u0158\u0157\3\2\2\2\u0159;\3"+
		"\2\2\2\u015a\u015b\5@!\2\u015b\u015c\5> \2\u015c\u015d\5@!\2\u015d\u0160"+
		"\3\2\2\2\u015e\u0160\5@!\2\u015f\u015a\3\2\2\2\u015f\u015e\3\2\2\2\u0160"+
		"=\3\2\2\2\u0161\u0162\t\3\2\2\u0162?\3\2\2\2\u0163\u0164\b!\1\2\u0164"+
		"\u0165\5D#\2\u0165\u016c\3\2\2\2\u0166\u0167\f\4\2\2\u0167\u0168\5B\""+
		"\2\u0168\u0169\5D#\2\u0169\u016b\3\2\2\2\u016a\u0166\3\2\2\2\u016b\u016e"+
		"\3\2\2\2\u016c\u016a\3\2\2\2\u016c\u016d\3\2\2\2\u016dA\3\2\2\2\u016e"+
		"\u016c\3\2\2\2\u016f\u0170\t\4\2\2\u0170C\3\2\2\2\u0171\u0172\b#\1\2\u0172"+
		"\u0173\5H%\2\u0173\u017a\3\2\2\2\u0174\u0175\f\4\2\2\u0175\u0176\5F$\2"+
		"\u0176\u0177\5H%\2\u0177\u0179\3\2\2\2\u0178\u0174\3\2\2\2\u0179\u017c"+
		"\3\2\2\2\u017a\u0178\3\2\2\2\u017a\u017b\3\2\2\2\u017bE\3\2\2\2\u017c"+
		"\u017a\3\2\2\2\u017d\u017e\t\5\2\2\u017eG\3\2\2\2\u017f\u0180\5J&\2\u0180"+
		"\u0181\5H%\2\u0181\u0184\3\2\2\2\u0182\u0184\5L\'\2\u0183\u017f\3\2\2"+
		"\2\u0183\u0182\3\2\2\2\u0184I\3\2\2\2\u0185\u0186\t\6\2\2\u0186K\3\2\2"+
		"\2\u0187\u018a\5P)\2\u0188\u018a\5N(\2\u0189\u0187\3\2\2\2\u0189\u0188"+
		"\3\2\2\2\u018aM\3\2\2\2\u018b\u0192\7\25\2\2\u018c\u018d\7\25\2\2\u018d"+
		"\u018e\7\66\2\2\u018e\u018f\5\64\33\2\u018f\u0190\7\67\2\2\u0190\u0192"+
		"\3\2\2\2\u0191\u018b\3\2\2\2\u0191\u018c\3\2\2\2\u0192O\3\2\2\2\u0193"+
		"\u0194\7\62\2\2\u0194\u0195\5\64\33\2\u0195\u0196\7\63\2\2\u0196\u019a"+
		"\3\2\2\2\u0197\u019a\5R*\2\u0198\u019a\5X-\2\u0199\u0193\3\2\2\2\u0199"+
		"\u0197\3\2\2\2\u0199\u0198\3\2\2\2\u019aQ\3\2\2\2\u019b\u019c\7\25\2\2"+
		"\u019c\u019d\7\62\2\2\u019d\u019e\5T+\2\u019e\u019f\7\63\2\2\u019fS\3"+
		"\2\2\2\u01a0\u01a3\5V,\2\u01a1\u01a3\3\2\2\2\u01a2\u01a0\3\2\2\2\u01a2"+
		"\u01a1\3\2\2\2\u01a3U\3\2\2\2\u01a4\u01a5\b,\1\2\u01a5\u01a6\5\64\33\2"+
		"\u01a6\u01ac\3\2\2\2\u01a7\u01a8\f\4\2\2\u01a8\u01a9\7\35\2\2\u01a9\u01ab"+
		"\5\64\33\2\u01aa\u01a7\3\2\2\2\u01ab\u01ae\3\2\2\2\u01ac\u01aa\3\2\2\2"+
		"\u01ac\u01ad\3\2\2\2\u01adW\3\2\2\2\u01ae\u01ac\3\2\2\2\u01af\u01b0\t"+
		"\7\2\2\u01b0Y\3\2\2\2&chw\u0081\u0089\u008f\u00a0\u00a4\u00ae\u00bc\u00c3"+
		"\u00cb\u00d1\u00dd\u00e5\u00f6\u0104\u0108\u010b\u010d\u0111\u0115\u011d"+
		"\u013d\u0147\u0152\u0158\u015f\u016c\u017a\u0183\u0189\u0191\u0199\u01a2"+
		"\u01ac";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}