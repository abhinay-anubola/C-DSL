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
		Int=1, Float=2, Void=3, Identifier=4, Number=5, Comma=6, EqualTo=7, Add=8, 
		SemiColon=9, WS=10;
	public static final int
		RULE_main = 0, RULE_declaration = 1, RULE_equation = 2, RULE_declaratorList = 3, 
		RULE_expression = 4, RULE_typeSpecifier = 5;
	private static String[] makeRuleNames() {
		return new String[] {
			"main", "declaration", "equation", "declaratorList", "expression", "typeSpecifier"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'int'", "'float'", "'void'", null, null, "','", "'='", "'+'", 
			"';'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "Int", "Float", "Void", "Identifier", "Number", "Comma", "EqualTo", 
			"Add", "SemiColon", "WS"
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
		public TerminalNode EOF() { return getToken(TParser.EOF, 0); }
		public List<DeclarationContext> declaration() {
			return getRuleContexts(DeclarationContext.class);
		}
		public DeclarationContext declaration(int i) {
			return getRuleContext(DeclarationContext.class,i);
		}
		public List<EquationContext> equation() {
			return getRuleContexts(EquationContext.class);
		}
		public EquationContext equation(int i) {
			return getRuleContext(EquationContext.class,i);
		}
		public List<TerminalNode> SemiColon() { return getTokens(TParser.SemiColon); }
		public TerminalNode SemiColon(int i) {
			return getToken(TParser.SemiColon, i);
		}
		public MainContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_main; }
	}

	public final MainContext main() throws RecognitionException {
		MainContext _localctx = new MainContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_main);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(25); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(13); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(12);
						declaration();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(15); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(22);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Identifier) {
					{
					{
					setState(17);
					equation();
					setState(18);
					match(SemiColon);
					}
					}
					setState(24);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				setState(27); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Int) | (1L << Float) | (1L << Void))) != 0) );
			setState(29);
			match(EOF);
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

	public static class DeclarationContext extends ParserRuleContext {
		public TypeSpecifierContext typeSpecifier() {
			return getRuleContext(TypeSpecifierContext.class,0);
		}
		public TerminalNode SemiColon() { return getToken(TParser.SemiColon, 0); }
		public DeclaratorListContext declaratorList() {
			return getRuleContext(DeclaratorListContext.class,0);
		}
		public EquationContext equation() {
			return getRuleContext(EquationContext.class,0);
		}
		public DeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaration; }
	}

	public final DeclarationContext declaration() throws RecognitionException {
		DeclarationContext _localctx = new DeclarationContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(31);
			typeSpecifier();
			setState(34);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				{
				setState(32);
				declaratorList();
				}
				break;
			case 2:
				{
				setState(33);
				equation();
				}
				break;
			}
			setState(36);
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

	public static class EquationContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(TParser.Identifier, 0); }
		public TerminalNode EqualTo() { return getToken(TParser.EqualTo, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public EquationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_equation; }
	}

	public final EquationContext equation() throws RecognitionException {
		EquationContext _localctx = new EquationContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_equation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(38);
			match(Identifier);
			setState(39);
			match(EqualTo);
			setState(40);
			expression(0);
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

	public static class DeclaratorListContext extends ParserRuleContext {
		public List<TerminalNode> Identifier() { return getTokens(TParser.Identifier); }
		public TerminalNode Identifier(int i) {
			return getToken(TParser.Identifier, i);
		}
		public List<TerminalNode> Comma() { return getTokens(TParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(TParser.Comma, i);
		}
		public DeclaratorListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaratorList; }
	}

	public final DeclaratorListContext declaratorList() throws RecognitionException {
		DeclaratorListContext _localctx = new DeclaratorListContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_declaratorList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(42);
			match(Identifier);
			setState(47);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(43);
				match(Comma);
				setState(44);
				match(Identifier);
				}
				}
				setState(49);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class ExpressionContext extends ParserRuleContext {
		public TerminalNode Number() { return getToken(TParser.Number, 0); }
		public TerminalNode Identifier() { return getToken(TParser.Identifier, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode Add() { return getToken(TParser.Add, 0); }
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
	}

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 8;
		enterRecursionRule(_localctx, 8, RULE_expression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(53);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Number:
				{
				setState(51);
				match(Number);
				}
				break;
			case Identifier:
				{
				setState(52);
				match(Identifier);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(60);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ExpressionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_expression);
					setState(55);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(56);
					match(Add);
					setState(57);
					expression(2);
					}
					} 
				}
				setState(62);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
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

	public static class TypeSpecifierContext extends ParserRuleContext {
		public TerminalNode Int() { return getToken(TParser.Int, 0); }
		public TerminalNode Float() { return getToken(TParser.Float, 0); }
		public TerminalNode Void() { return getToken(TParser.Void, 0); }
		public TypeSpecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeSpecifier; }
	}

	public final TypeSpecifierContext typeSpecifier() throws RecognitionException {
		TypeSpecifierContext _localctx = new TypeSpecifierContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_typeSpecifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(63);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Int) | (1L << Float) | (1L << Void))) != 0)) ) {
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
		case 4:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\fD\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\3\2\6\2\20\n\2\r\2\16\2\21\3\2\3\2"+
		"\3\2\7\2\27\n\2\f\2\16\2\32\13\2\6\2\34\n\2\r\2\16\2\35\3\2\3\2\3\3\3"+
		"\3\3\3\5\3%\n\3\3\3\3\3\3\4\3\4\3\4\3\4\3\5\3\5\3\5\7\5\60\n\5\f\5\16"+
		"\5\63\13\5\3\6\3\6\3\6\5\68\n\6\3\6\3\6\3\6\7\6=\n\6\f\6\16\6@\13\6\3"+
		"\7\3\7\3\7\2\3\n\b\2\4\6\b\n\f\2\3\3\2\3\5\2D\2\33\3\2\2\2\4!\3\2\2\2"+
		"\6(\3\2\2\2\b,\3\2\2\2\n\67\3\2\2\2\fA\3\2\2\2\16\20\5\4\3\2\17\16\3\2"+
		"\2\2\20\21\3\2\2\2\21\17\3\2\2\2\21\22\3\2\2\2\22\30\3\2\2\2\23\24\5\6"+
		"\4\2\24\25\7\13\2\2\25\27\3\2\2\2\26\23\3\2\2\2\27\32\3\2\2\2\30\26\3"+
		"\2\2\2\30\31\3\2\2\2\31\34\3\2\2\2\32\30\3\2\2\2\33\17\3\2\2\2\34\35\3"+
		"\2\2\2\35\33\3\2\2\2\35\36\3\2\2\2\36\37\3\2\2\2\37 \7\2\2\3 \3\3\2\2"+
		"\2!$\5\f\7\2\"%\5\b\5\2#%\5\6\4\2$\"\3\2\2\2$#\3\2\2\2%&\3\2\2\2&\'\7"+
		"\13\2\2\'\5\3\2\2\2()\7\6\2\2)*\7\t\2\2*+\5\n\6\2+\7\3\2\2\2,\61\7\6\2"+
		"\2-.\7\b\2\2.\60\7\6\2\2/-\3\2\2\2\60\63\3\2\2\2\61/\3\2\2\2\61\62\3\2"+
		"\2\2\62\t\3\2\2\2\63\61\3\2\2\2\64\65\b\6\1\2\658\7\7\2\2\668\7\6\2\2"+
		"\67\64\3\2\2\2\67\66\3\2\2\28>\3\2\2\29:\f\3\2\2:;\7\n\2\2;=\5\n\6\4<"+
		"9\3\2\2\2=@\3\2\2\2><\3\2\2\2>?\3\2\2\2?\13\3\2\2\2@>\3\2\2\2AB\t\2\2"+
		"\2B\r\3\2\2\2\t\21\30\35$\61\67>";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}