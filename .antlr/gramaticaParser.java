// Generated from c:/Users/aulasingenieria/Downloads/taller_antlr_1/gramatica.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class gramaticaParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		IDENTIFICADOR=1, VALOR=2, ESPACIO_VACIO=3, OPERADOR_ASIGNACION=4, OPERADORES_MULT=5, 
		OPERADORES_SUM=6, OPERADORES_COMP=7;
	public static final int
		RULE_termino = 0, RULE_expresion = 1, RULE_asignacion = 2;
	private static String[] makeRuleNames() {
		return new String[] {
			"termino", "expresion", "asignacion"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, "'='"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "IDENTIFICADOR", "VALOR", "ESPACIO_VACIO", "OPERADOR_ASIGNACION", 
			"OPERADORES_MULT", "OPERADORES_SUM", "OPERADORES_COMP"
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
	public String getGrammarFileName() { return "gramatica.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public gramaticaParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TerminoContext extends ParserRuleContext {
		public List<TerminalNode> VALOR() { return getTokens(gramaticaParser.VALOR); }
		public TerminalNode VALOR(int i) {
			return getToken(gramaticaParser.VALOR, i);
		}
		public List<TerminalNode> OPERADORES_MULT() { return getTokens(gramaticaParser.OPERADORES_MULT); }
		public TerminalNode OPERADORES_MULT(int i) {
			return getToken(gramaticaParser.OPERADORES_MULT, i);
		}
		public TerminoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_termino; }
	}

	public final TerminoContext termino() throws RecognitionException {
		TerminoContext _localctx = new TerminoContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_termino);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(6);
			match(VALOR);
			setState(11);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OPERADORES_MULT) {
				{
				{
				setState(7);
				match(OPERADORES_MULT);
				setState(8);
				match(VALOR);
				}
				}
				setState(13);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ExpresionContext extends ParserRuleContext {
		public List<TerminoContext> termino() {
			return getRuleContexts(TerminoContext.class);
		}
		public TerminoContext termino(int i) {
			return getRuleContext(TerminoContext.class,i);
		}
		public List<TerminalNode> OPERADORES_SUM() { return getTokens(gramaticaParser.OPERADORES_SUM); }
		public TerminalNode OPERADORES_SUM(int i) {
			return getToken(gramaticaParser.OPERADORES_SUM, i);
		}
		public ExpresionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expresion; }
	}

	public final ExpresionContext expresion() throws RecognitionException {
		ExpresionContext _localctx = new ExpresionContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_expresion);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(14);
			termino();
			setState(19);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OPERADORES_SUM) {
				{
				{
				setState(15);
				match(OPERADORES_SUM);
				setState(16);
				termino();
				}
				}
				setState(21);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	@SuppressWarnings("CheckReturnValue")
	public static class AsignacionContext extends ParserRuleContext {
		public TerminalNode IDENTIFICADOR() { return getToken(gramaticaParser.IDENTIFICADOR, 0); }
		public TerminalNode OPERADOR_ASIGNACION() { return getToken(gramaticaParser.OPERADOR_ASIGNACION, 0); }
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public AsignacionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_asignacion; }
	}

	public final AsignacionContext asignacion() throws RecognitionException {
		AsignacionContext _localctx = new AsignacionContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_asignacion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(22);
			match(IDENTIFICADOR);
			setState(23);
			match(OPERADOR_ASIGNACION);
			setState(24);
			expresion();
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

	public static final String _serializedATN =
		"\u0004\u0001\u0007\u001b\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001"+
		"\u0002\u0002\u0007\u0002\u0001\u0000\u0001\u0000\u0001\u0000\u0005\u0000"+
		"\n\b\u0000\n\u0000\f\u0000\r\t\u0000\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0005\u0001\u0012\b\u0001\n\u0001\f\u0001\u0015\t\u0001\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0000\u0000\u0003\u0000\u0002"+
		"\u0004\u0000\u0000\u0019\u0000\u0006\u0001\u0000\u0000\u0000\u0002\u000e"+
		"\u0001\u0000\u0000\u0000\u0004\u0016\u0001\u0000\u0000\u0000\u0006\u000b"+
		"\u0005\u0002\u0000\u0000\u0007\b\u0005\u0005\u0000\u0000\b\n\u0005\u0002"+
		"\u0000\u0000\t\u0007\u0001\u0000\u0000\u0000\n\r\u0001\u0000\u0000\u0000"+
		"\u000b\t\u0001\u0000\u0000\u0000\u000b\f\u0001\u0000\u0000\u0000\f\u0001"+
		"\u0001\u0000\u0000\u0000\r\u000b\u0001\u0000\u0000\u0000\u000e\u0013\u0003"+
		"\u0000\u0000\u0000\u000f\u0010\u0005\u0006\u0000\u0000\u0010\u0012\u0003"+
		"\u0000\u0000\u0000\u0011\u000f\u0001\u0000\u0000\u0000\u0012\u0015\u0001"+
		"\u0000\u0000\u0000\u0013\u0011\u0001\u0000\u0000\u0000\u0013\u0014\u0001"+
		"\u0000\u0000\u0000\u0014\u0003\u0001\u0000\u0000\u0000\u0015\u0013\u0001"+
		"\u0000\u0000\u0000\u0016\u0017\u0005\u0001\u0000\u0000\u0017\u0018\u0005"+
		"\u0004\u0000\u0000\u0018\u0019\u0003\u0002\u0001\u0000\u0019\u0005\u0001"+
		"\u0000\u0000\u0000\u0002\u000b\u0013";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}