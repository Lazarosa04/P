// Generated from c:/Users/lazar/OneDrive/Ambiente de Trabalho/Work/Ano 3/Semestre 2/C/P/P2/bloco2/b2_01/Hello.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class HelloParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, ID=3, WS=4;
	public static final int
		RULE_greetings = 0;
	private static String[] makeRuleNames() {
		return new String[] {
			"greetings"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'hello'", "'bye'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, "ID", "WS"
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
	public String getGrammarFileName() { return "Hello.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public HelloParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class GreetingsContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(HelloParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(HelloParser.ID, i);
		}
		public GreetingsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_greetings; }
	}

	public final GreetingsContext greetings() throws RecognitionException {
		GreetingsContext _localctx = new GreetingsContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_greetings);
		int _la;
		try {
			setState(14);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
				enterOuterAlt(_localctx, 1);
				{
				setState(2);
				match(T__0);
				setState(4); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(3);
					match(ID);
					}
					}
					setState(6); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==ID );
				}
				break;
			case T__1:
				enterOuterAlt(_localctx, 2);
				{
				setState(8);
				match(T__1);
				setState(10); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(9);
					match(ID);
					}
					}
					setState(12); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==ID );
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

	public static final String _serializedATN =
		"\u0004\u0001\u0004\u0011\u0002\u0000\u0007\u0000\u0001\u0000\u0001\u0000"+
		"\u0004\u0000\u0005\b\u0000\u000b\u0000\f\u0000\u0006\u0001\u0000\u0001"+
		"\u0000\u0004\u0000\u000b\b\u0000\u000b\u0000\f\u0000\f\u0003\u0000\u000f"+
		"\b\u0000\u0001\u0000\u0000\u0000\u0001\u0000\u0000\u0000\u0012\u0000\u000e"+
		"\u0001\u0000\u0000\u0000\u0002\u0004\u0005\u0001\u0000\u0000\u0003\u0005"+
		"\u0005\u0003\u0000\u0000\u0004\u0003\u0001\u0000\u0000\u0000\u0005\u0006"+
		"\u0001\u0000\u0000\u0000\u0006\u0004\u0001\u0000\u0000\u0000\u0006\u0007"+
		"\u0001\u0000\u0000\u0000\u0007\u000f\u0001\u0000\u0000\u0000\b\n\u0005"+
		"\u0002\u0000\u0000\t\u000b\u0005\u0003\u0000\u0000\n\t\u0001\u0000\u0000"+
		"\u0000\u000b\f\u0001\u0000\u0000\u0000\f\n\u0001\u0000\u0000\u0000\f\r"+
		"\u0001\u0000\u0000\u0000\r\u000f\u0001\u0000\u0000\u0000\u000e\u0002\u0001"+
		"\u0000\u0000\u0000\u000e\b\u0001\u0000\u0000\u0000\u000f\u0001\u0001\u0000"+
		"\u0000\u0000\u0003\u0006\f\u000e";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}