// Generated from JSON/json.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class jsonParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, CARACTERE=5, GUILLEMETS=6, NOMBRE=7, CHIFFRE=8, 
		EXPOSANT=9, VIRGULE_TAB=10, CROCHET_OUVR=11, CROCHET_FERM=12, ACCOL_OUVR=13, 
		ACCOL_FERM=14, WS=15;
	public static final int
		RULE_regle_json = 0, RULE_element = 1, RULE_booleen = 2, RULE_type_null = 3, 
		RULE_tableau = 4, RULE_objet = 5, RULE_couple_membre = 6;
	private static String[] makeRuleNames() {
		return new String[] {
			"regle_json", "element", "booleen", "type_null", "tableau", "objet", 
			"couple_membre"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'true'", "'false'", "'null'", "':'", null, "'\"'", null, null, 
			"'E'", "','", "'['", "']'", "'{'", "'}'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, "CARACTERE", "GUILLEMETS", "NOMBRE", "CHIFFRE", 
			"EXPOSANT", "VIRGULE_TAB", "CROCHET_OUVR", "CROCHET_FERM", "ACCOL_OUVR", 
			"ACCOL_FERM", "WS"
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
	public String getGrammarFileName() { return "json.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public jsonParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class Regle_jsonContext extends ParserRuleContext {
		public ElementContext element() {
			return getRuleContext(ElementContext.class,0);
		}
		public Regle_jsonContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_regle_json; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof jsonListener ) ((jsonListener)listener).enterRegle_json(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof jsonListener ) ((jsonListener)listener).exitRegle_json(this);
		}
	}

	public final Regle_jsonContext regle_json() throws RecognitionException {
		Regle_jsonContext _localctx = new Regle_jsonContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_regle_json);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(14);
			element();
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

	public static class ElementContext extends ParserRuleContext {
		public List<TerminalNode> GUILLEMETS() { return getTokens(jsonParser.GUILLEMETS); }
		public TerminalNode GUILLEMETS(int i) {
			return getToken(jsonParser.GUILLEMETS, i);
		}
		public TerminalNode CARACTERE() { return getToken(jsonParser.CARACTERE, 0); }
		public TerminalNode NOMBRE() { return getToken(jsonParser.NOMBRE, 0); }
		public BooleenContext booleen() {
			return getRuleContext(BooleenContext.class,0);
		}
		public Type_nullContext type_null() {
			return getRuleContext(Type_nullContext.class,0);
		}
		public TableauContext tableau() {
			return getRuleContext(TableauContext.class,0);
		}
		public ObjetContext objet() {
			return getRuleContext(ObjetContext.class,0);
		}
		public ElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_element; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof jsonListener ) ((jsonListener)listener).enterElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof jsonListener ) ((jsonListener)listener).exitElement(this);
		}
	}

	public final ElementContext element() throws RecognitionException {
		ElementContext _localctx = new ElementContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_element);
		try {
			setState(24);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case GUILLEMETS:
				enterOuterAlt(_localctx, 1);
				{
				setState(16);
				match(GUILLEMETS);
				setState(17);
				match(CARACTERE);
				setState(18);
				match(GUILLEMETS);
				}
				break;
			case NOMBRE:
				enterOuterAlt(_localctx, 2);
				{
				setState(19);
				match(NOMBRE);
				}
				break;
			case T__0:
			case T__1:
				enterOuterAlt(_localctx, 3);
				{
				setState(20);
				booleen();
				}
				break;
			case T__2:
				enterOuterAlt(_localctx, 4);
				{
				setState(21);
				type_null();
				}
				break;
			case CROCHET_OUVR:
				enterOuterAlt(_localctx, 5);
				{
				setState(22);
				tableau();
				}
				break;
			case ACCOL_OUVR:
				enterOuterAlt(_localctx, 6);
				{
				setState(23);
				objet();
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

	public static class BooleenContext extends ParserRuleContext {
		public BooleenContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_booleen; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof jsonListener ) ((jsonListener)listener).enterBooleen(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof jsonListener ) ((jsonListener)listener).exitBooleen(this);
		}
	}

	public final BooleenContext booleen() throws RecognitionException {
		BooleenContext _localctx = new BooleenContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_booleen);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(26);
			_la = _input.LA(1);
			if ( !(_la==T__0 || _la==T__1) ) {
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

	public static class Type_nullContext extends ParserRuleContext {
		public Type_nullContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type_null; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof jsonListener ) ((jsonListener)listener).enterType_null(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof jsonListener ) ((jsonListener)listener).exitType_null(this);
		}
	}

	public final Type_nullContext type_null() throws RecognitionException {
		Type_nullContext _localctx = new Type_nullContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_type_null);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(28);
			match(T__2);
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

	public static class TableauContext extends ParserRuleContext {
		public TerminalNode CROCHET_OUVR() { return getToken(jsonParser.CROCHET_OUVR, 0); }
		public List<ElementContext> element() {
			return getRuleContexts(ElementContext.class);
		}
		public ElementContext element(int i) {
			return getRuleContext(ElementContext.class,i);
		}
		public TerminalNode CROCHET_FERM() { return getToken(jsonParser.CROCHET_FERM, 0); }
		public List<TerminalNode> VIRGULE_TAB() { return getTokens(jsonParser.VIRGULE_TAB); }
		public TerminalNode VIRGULE_TAB(int i) {
			return getToken(jsonParser.VIRGULE_TAB, i);
		}
		public TableauContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tableau; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof jsonListener ) ((jsonListener)listener).enterTableau(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof jsonListener ) ((jsonListener)listener).exitTableau(this);
		}
	}

	public final TableauContext tableau() throws RecognitionException {
		TableauContext _localctx = new TableauContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_tableau);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(30);
			match(CROCHET_OUVR);
			setState(31);
			element();
			setState(36);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==VIRGULE_TAB) {
				{
				{
				setState(32);
				match(VIRGULE_TAB);
				setState(33);
				element();
				}
				}
				setState(38);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(39);
			match(CROCHET_FERM);
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

	public static class ObjetContext extends ParserRuleContext {
		public TerminalNode ACCOL_OUVR() { return getToken(jsonParser.ACCOL_OUVR, 0); }
		public List<Couple_membreContext> couple_membre() {
			return getRuleContexts(Couple_membreContext.class);
		}
		public Couple_membreContext couple_membre(int i) {
			return getRuleContext(Couple_membreContext.class,i);
		}
		public TerminalNode ACCOL_FERM() { return getToken(jsonParser.ACCOL_FERM, 0); }
		public List<TerminalNode> VIRGULE_TAB() { return getTokens(jsonParser.VIRGULE_TAB); }
		public TerminalNode VIRGULE_TAB(int i) {
			return getToken(jsonParser.VIRGULE_TAB, i);
		}
		public ObjetContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_objet; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof jsonListener ) ((jsonListener)listener).enterObjet(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof jsonListener ) ((jsonListener)listener).exitObjet(this);
		}
	}

	public final ObjetContext objet() throws RecognitionException {
		ObjetContext _localctx = new ObjetContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_objet);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(41);
			match(ACCOL_OUVR);
			setState(42);
			couple_membre();
			setState(47);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==VIRGULE_TAB) {
				{
				{
				setState(43);
				match(VIRGULE_TAB);
				setState(44);
				couple_membre();
				}
				}
				setState(49);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(50);
			match(ACCOL_FERM);
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

	public static class Couple_membreContext extends ParserRuleContext {
		public List<TerminalNode> GUILLEMETS() { return getTokens(jsonParser.GUILLEMETS); }
		public TerminalNode GUILLEMETS(int i) {
			return getToken(jsonParser.GUILLEMETS, i);
		}
		public TerminalNode CARACTERE() { return getToken(jsonParser.CARACTERE, 0); }
		public ElementContext element() {
			return getRuleContext(ElementContext.class,0);
		}
		public Couple_membreContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_couple_membre; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof jsonListener ) ((jsonListener)listener).enterCouple_membre(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof jsonListener ) ((jsonListener)listener).exitCouple_membre(this);
		}
	}

	public final Couple_membreContext couple_membre() throws RecognitionException {
		Couple_membreContext _localctx = new Couple_membreContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_couple_membre);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(52);
			match(GUILLEMETS);
			setState(53);
			match(CARACTERE);
			setState(54);
			match(GUILLEMETS);
			setState(55);
			match(T__3);
			setState(56);
			element();
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\21=\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\3\2\3\2\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\5\3\33\n\3\3\4\3\4\3\5\3\5\3\6\3\6\3\6\3\6\7\6%\n\6\f\6\16"+
		"\6(\13\6\3\6\3\6\3\7\3\7\3\7\3\7\7\7\60\n\7\f\7\16\7\63\13\7\3\7\3\7\3"+
		"\b\3\b\3\b\3\b\3\b\3\b\3\b\2\2\t\2\4\6\b\n\f\16\2\3\3\2\3\4\2<\2\20\3"+
		"\2\2\2\4\32\3\2\2\2\6\34\3\2\2\2\b\36\3\2\2\2\n \3\2\2\2\f+\3\2\2\2\16"+
		"\66\3\2\2\2\20\21\5\4\3\2\21\3\3\2\2\2\22\23\7\b\2\2\23\24\7\7\2\2\24"+
		"\33\7\b\2\2\25\33\7\t\2\2\26\33\5\6\4\2\27\33\5\b\5\2\30\33\5\n\6\2\31"+
		"\33\5\f\7\2\32\22\3\2\2\2\32\25\3\2\2\2\32\26\3\2\2\2\32\27\3\2\2\2\32"+
		"\30\3\2\2\2\32\31\3\2\2\2\33\5\3\2\2\2\34\35\t\2\2\2\35\7\3\2\2\2\36\37"+
		"\7\5\2\2\37\t\3\2\2\2 !\7\r\2\2!&\5\4\3\2\"#\7\f\2\2#%\5\4\3\2$\"\3\2"+
		"\2\2%(\3\2\2\2&$\3\2\2\2&\'\3\2\2\2\')\3\2\2\2(&\3\2\2\2)*\7\16\2\2*\13"+
		"\3\2\2\2+,\7\17\2\2,\61\5\16\b\2-.\7\f\2\2.\60\5\16\b\2/-\3\2\2\2\60\63"+
		"\3\2\2\2\61/\3\2\2\2\61\62\3\2\2\2\62\64\3\2\2\2\63\61\3\2\2\2\64\65\7"+
		"\20\2\2\65\r\3\2\2\2\66\67\7\b\2\2\678\7\7\2\289\7\b\2\29:\7\6\2\2:;\5"+
		"\4\3\2;\17\3\2\2\2\5\32&\61";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}