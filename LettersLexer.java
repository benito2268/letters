// Generated from Letters.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class LettersLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, PERIOD=16, 
		SPACE=17, WS=18, IDENT=19, INTLIT=20, CHARLIT=21;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"T__9", "T__10", "T__11", "T__12", "T__13", "T__14", "PERIOD", "SPACE", 
			"WS", "IDENT", "INTLIT", "CHARLIT"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'B'", "'N'", "'C'", "'V'", "'L'", "'I'", "'{'", "'F'", "'R'", 
			"'W'", "'J'", "'A'", "'S'", "'M'", "'D'", "'.'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, "PERIOD", "SPACE", "WS", "IDENT", "INTLIT", "CHARLIT"
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


	public LettersLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Letters.g4"; }

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
		"\u0004\u0000\u0015Z\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
		"\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004"+
		"\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007"+
		"\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b"+
		"\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002"+
		"\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002"+
		"\u0012\u0007\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0001"+
		"\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001"+
		"\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001"+
		"\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\t\u0001"+
		"\t\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001\r\u0001"+
		"\r\u0001\u000e\u0001\u000e\u0001\u000f\u0001\u000f\u0001\u0010\u0001\u0010"+
		"\u0001\u0011\u0004\u0011O\b\u0011\u000b\u0011\f\u0011P\u0001\u0011\u0001"+
		"\u0011\u0001\u0012\u0001\u0012\u0001\u0013\u0001\u0013\u0001\u0014\u0001"+
		"\u0014\u0000\u0000\u0015\u0001\u0001\u0003\u0002\u0005\u0003\u0007\u0004"+
		"\t\u0005\u000b\u0006\r\u0007\u000f\b\u0011\t\u0013\n\u0015\u000b\u0017"+
		"\f\u0019\r\u001b\u000e\u001d\u000f\u001f\u0010!\u0011#\u0012%\u0013\'"+
		"\u0014)\u0015\u0001\u0000\u0005\u0001\u0000  \u0002\u0000\t\n\r\r\u0005"+
		"\u0000\t\n\r\r  09AZ\u0001\u000009\u0003\u0000\t\n\r\r  Z\u0000\u0001"+
		"\u0001\u0000\u0000\u0000\u0000\u0003\u0001\u0000\u0000\u0000\u0000\u0005"+
		"\u0001\u0000\u0000\u0000\u0000\u0007\u0001\u0000\u0000\u0000\u0000\t\u0001"+
		"\u0000\u0000\u0000\u0000\u000b\u0001\u0000\u0000\u0000\u0000\r\u0001\u0000"+
		"\u0000\u0000\u0000\u000f\u0001\u0000\u0000\u0000\u0000\u0011\u0001\u0000"+
		"\u0000\u0000\u0000\u0013\u0001\u0000\u0000\u0000\u0000\u0015\u0001\u0000"+
		"\u0000\u0000\u0000\u0017\u0001\u0000\u0000\u0000\u0000\u0019\u0001\u0000"+
		"\u0000\u0000\u0000\u001b\u0001\u0000\u0000\u0000\u0000\u001d\u0001\u0000"+
		"\u0000\u0000\u0000\u001f\u0001\u0000\u0000\u0000\u0000!\u0001\u0000\u0000"+
		"\u0000\u0000#\u0001\u0000\u0000\u0000\u0000%\u0001\u0000\u0000\u0000\u0000"+
		"\'\u0001\u0000\u0000\u0000\u0000)\u0001\u0000\u0000\u0000\u0001+\u0001"+
		"\u0000\u0000\u0000\u0003-\u0001\u0000\u0000\u0000\u0005/\u0001\u0000\u0000"+
		"\u0000\u00071\u0001\u0000\u0000\u0000\t3\u0001\u0000\u0000\u0000\u000b"+
		"5\u0001\u0000\u0000\u0000\r7\u0001\u0000\u0000\u0000\u000f9\u0001\u0000"+
		"\u0000\u0000\u0011;\u0001\u0000\u0000\u0000\u0013=\u0001\u0000\u0000\u0000"+
		"\u0015?\u0001\u0000\u0000\u0000\u0017A\u0001\u0000\u0000\u0000\u0019C"+
		"\u0001\u0000\u0000\u0000\u001bE\u0001\u0000\u0000\u0000\u001dG\u0001\u0000"+
		"\u0000\u0000\u001fI\u0001\u0000\u0000\u0000!K\u0001\u0000\u0000\u0000"+
		"#N\u0001\u0000\u0000\u0000%T\u0001\u0000\u0000\u0000\'V\u0001\u0000\u0000"+
		"\u0000)X\u0001\u0000\u0000\u0000+,\u0005B\u0000\u0000,\u0002\u0001\u0000"+
		"\u0000\u0000-.\u0005N\u0000\u0000.\u0004\u0001\u0000\u0000\u0000/0\u0005"+
		"C\u0000\u00000\u0006\u0001\u0000\u0000\u000012\u0005V\u0000\u00002\b\u0001"+
		"\u0000\u0000\u000034\u0005L\u0000\u00004\n\u0001\u0000\u0000\u000056\u0005"+
		"I\u0000\u00006\f\u0001\u0000\u0000\u000078\u0005{\u0000\u00008\u000e\u0001"+
		"\u0000\u0000\u00009:\u0005F\u0000\u0000:\u0010\u0001\u0000\u0000\u0000"+
		";<\u0005R\u0000\u0000<\u0012\u0001\u0000\u0000\u0000=>\u0005W\u0000\u0000"+
		">\u0014\u0001\u0000\u0000\u0000?@\u0005J\u0000\u0000@\u0016\u0001\u0000"+
		"\u0000\u0000AB\u0005A\u0000\u0000B\u0018\u0001\u0000\u0000\u0000CD\u0005"+
		"S\u0000\u0000D\u001a\u0001\u0000\u0000\u0000EF\u0005M\u0000\u0000F\u001c"+
		"\u0001\u0000\u0000\u0000GH\u0005D\u0000\u0000H\u001e\u0001\u0000\u0000"+
		"\u0000IJ\u0005.\u0000\u0000J \u0001\u0000\u0000\u0000KL\u0007\u0000\u0000"+
		"\u0000L\"\u0001\u0000\u0000\u0000MO\u0007\u0001\u0000\u0000NM\u0001\u0000"+
		"\u0000\u0000OP\u0001\u0000\u0000\u0000PN\u0001\u0000\u0000\u0000PQ\u0001"+
		"\u0000\u0000\u0000QR\u0001\u0000\u0000\u0000RS\u0006\u0011\u0000\u0000"+
		"S$\u0001\u0000\u0000\u0000TU\b\u0002\u0000\u0000U&\u0001\u0000\u0000\u0000"+
		"VW\u0007\u0003\u0000\u0000W(\u0001\u0000\u0000\u0000XY\b\u0004\u0000\u0000"+
		"Y*\u0001\u0000\u0000\u0000\u0002\u0000P\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}