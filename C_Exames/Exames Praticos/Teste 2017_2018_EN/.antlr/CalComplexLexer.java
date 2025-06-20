// Generated from /Users/andreoliveira/Library/CloudStorage/OneDrive-UniversidadedeAveiro/LEI - André Oliveira/2º Ano/2º semestre/Compiladores/Aulas Práticas/Exames Práticos/Teste 2017_2018_EN/CalComplex.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class CalComplexLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, STRING=11, COMPLEX=12, NUMBER=13, ID=14, WS=15, COMMENT=16, ERROR=17;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"T__9", "STRING", "COMPLEX", "NUMBER", "ID", "WS", "COMMENT", "ERROR"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "';'", "'output'", "'=>'", "'+'", "'-'", "'*'", "':'", "'('", "')'", 
			"'input'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, "STRING", 
			"COMPLEX", "NUMBER", "ID", "WS", "COMMENT", "ERROR"
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


	public CalComplexLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "CalComplex.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\23z\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3"+
		"\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\7\fF"+
		"\n\f\f\f\16\fI\13\f\3\f\3\f\3\r\5\rN\n\r\3\r\5\rQ\n\r\3\r\5\rT\n\r\3\r"+
		"\3\r\3\16\6\16Y\n\16\r\16\16\16Z\3\17\6\17^\n\17\r\17\16\17_\3\17\7\17"+
		"c\n\17\f\17\16\17f\13\17\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\7\21"+
		"p\n\21\f\21\16\21s\13\21\3\21\3\21\3\21\3\21\3\22\3\22\4Gq\2\23\3\3\5"+
		"\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21"+
		"!\22#\23\3\2\6\4\2--//\3\2\62;\4\2C\\c|\5\2\13\f\17\17\"\"\2\u0081\2\3"+
		"\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2"+
		"\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31"+
		"\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2"+
		"\3%\3\2\2\2\5\'\3\2\2\2\7.\3\2\2\2\t\61\3\2\2\2\13\63\3\2\2\2\r\65\3\2"+
		"\2\2\17\67\3\2\2\2\219\3\2\2\2\23;\3\2\2\2\25=\3\2\2\2\27C\3\2\2\2\31"+
		"M\3\2\2\2\33X\3\2\2\2\35]\3\2\2\2\37g\3\2\2\2!k\3\2\2\2#x\3\2\2\2%&\7"+
		"=\2\2&\4\3\2\2\2\'(\7q\2\2()\7w\2\2)*\7v\2\2*+\7r\2\2+,\7w\2\2,-\7v\2"+
		"\2-\6\3\2\2\2./\7?\2\2/\60\7@\2\2\60\b\3\2\2\2\61\62\7-\2\2\62\n\3\2\2"+
		"\2\63\64\7/\2\2\64\f\3\2\2\2\65\66\7,\2\2\66\16\3\2\2\2\678\7<\2\28\20"+
		"\3\2\2\29:\7*\2\2:\22\3\2\2\2;<\7+\2\2<\24\3\2\2\2=>\7k\2\2>?\7p\2\2?"+
		"@\7r\2\2@A\7w\2\2AB\7v\2\2B\26\3\2\2\2CG\7$\2\2DF\13\2\2\2ED\3\2\2\2F"+
		"I\3\2\2\2GH\3\2\2\2GE\3\2\2\2HJ\3\2\2\2IG\3\2\2\2JK\7$\2\2K\30\3\2\2\2"+
		"LN\5\33\16\2ML\3\2\2\2MN\3\2\2\2NP\3\2\2\2OQ\t\2\2\2PO\3\2\2\2PQ\3\2\2"+
		"\2QS\3\2\2\2RT\5\33\16\2SR\3\2\2\2ST\3\2\2\2TU\3\2\2\2UV\7k\2\2V\32\3"+
		"\2\2\2WY\t\3\2\2XW\3\2\2\2YZ\3\2\2\2ZX\3\2\2\2Z[\3\2\2\2[\34\3\2\2\2\\"+
		"^\t\4\2\2]\\\3\2\2\2^_\3\2\2\2_]\3\2\2\2_`\3\2\2\2`d\3\2\2\2ac\t\3\2\2"+
		"ba\3\2\2\2cf\3\2\2\2db\3\2\2\2de\3\2\2\2e\36\3\2\2\2fd\3\2\2\2gh\t\5\2"+
		"\2hi\3\2\2\2ij\b\20\2\2j \3\2\2\2kl\7%\2\2lm\7%\2\2mq\3\2\2\2np\13\2\2"+
		"\2on\3\2\2\2ps\3\2\2\2qr\3\2\2\2qo\3\2\2\2rt\3\2\2\2sq\3\2\2\2tu\7\f\2"+
		"\2uv\3\2\2\2vw\b\21\2\2w\"\3\2\2\2xy\13\2\2\2y$\3\2\2\2\13\2GMPSZ_dq\3"+
		"\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}