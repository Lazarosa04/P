// Generated from /Users/andreoliveira/Library/CloudStorage/OneDrive-UniversidadedeAveiro/LEI - André Oliveira/2º Ano/2º semestre/Compiladores/Aulas Práticas/Exames Práticos/ex1/StrLang.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class StrLangLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		STRING=10, ID=11, WS=12, COMMENT=13;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"STRING", "ID", "WS", "COMMENT"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "':'", "'print'", "'('", "')'", "'input'", "'+'", "'-'", "'trim'", 
			"'/'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, "STRING", 
			"ID", "WS", "COMMENT"
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


	public StrLangLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "StrLang.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\17\\\b\1\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3"+
		"\4\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\t\3\t\3\t"+
		"\3\n\3\n\3\13\3\13\7\13=\n\13\f\13\16\13@\13\13\3\13\3\13\3\f\6\fE\n\f"+
		"\r\f\16\fF\3\r\6\rJ\n\r\r\r\16\rK\3\r\3\r\3\16\3\16\3\16\3\16\7\16T\n"+
		"\16\f\16\16\16W\13\16\3\16\3\16\3\16\3\16\4>U\2\17\3\3\5\4\7\5\t\6\13"+
		"\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\3\2\4\5\2\62;C\\c|\5\2\13"+
		"\f\17\17\"\"\2_\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3"+
		"\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2"+
		"\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\3\35\3\2\2\2\5\37\3\2\2\2\7%\3"+
		"\2\2\2\t\'\3\2\2\2\13)\3\2\2\2\r/\3\2\2\2\17\61\3\2\2\2\21\63\3\2\2\2"+
		"\238\3\2\2\2\25:\3\2\2\2\27D\3\2\2\2\31I\3\2\2\2\33O\3\2\2\2\35\36\7<"+
		"\2\2\36\4\3\2\2\2\37 \7r\2\2 !\7t\2\2!\"\7k\2\2\"#\7p\2\2#$\7v\2\2$\6"+
		"\3\2\2\2%&\7*\2\2&\b\3\2\2\2\'(\7+\2\2(\n\3\2\2\2)*\7k\2\2*+\7p\2\2+,"+
		"\7r\2\2,-\7w\2\2-.\7v\2\2.\f\3\2\2\2/\60\7-\2\2\60\16\3\2\2\2\61\62\7"+
		"/\2\2\62\20\3\2\2\2\63\64\7v\2\2\64\65\7t\2\2\65\66\7k\2\2\66\67\7o\2"+
		"\2\67\22\3\2\2\289\7\61\2\29\24\3\2\2\2:>\7$\2\2;=\13\2\2\2<;\3\2\2\2"+
		"=@\3\2\2\2>?\3\2\2\2><\3\2\2\2?A\3\2\2\2@>\3\2\2\2AB\7$\2\2B\26\3\2\2"+
		"\2CE\t\2\2\2DC\3\2\2\2EF\3\2\2\2FD\3\2\2\2FG\3\2\2\2G\30\3\2\2\2HJ\t\3"+
		"\2\2IH\3\2\2\2JK\3\2\2\2KI\3\2\2\2KL\3\2\2\2LM\3\2\2\2MN\b\r\2\2N\32\3"+
		"\2\2\2OP\7\61\2\2PQ\7\61\2\2QU\3\2\2\2RT\13\2\2\2SR\3\2\2\2TW\3\2\2\2"+
		"UV\3\2\2\2US\3\2\2\2VX\3\2\2\2WU\3\2\2\2XY\7\f\2\2YZ\3\2\2\2Z[\b\16\2"+
		"\2[\34\3\2\2\2\7\2>FKU\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}