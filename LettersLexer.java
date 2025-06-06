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
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, PERIOD=20, WS=21, COMMENT=22, IDENT=23, INTLIT=24, 
		ESCAPE=25, CHARLIT=26, STRLIT=27;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"T__9", "T__10", "T__11", "T__12", "T__13", "T__14", "T__15", "T__16", 
			"T__17", "T__18", "PERIOD", "WS", "COMMENT", "IDENT", "INTLIT", "ESCAPE", 
			"CHARLIT", "STRLIT"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'B'", "'N'", "'C'", "'V'", "'P'", "'I'", "'F'", "'R'", "'W'", 
			"'J'", "'A'", "'S'", "'M'", "'D'", "'Q'", "'U'", "'G'", "'L'", "'E'", 
			"'.'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, "PERIOD", "WS", "COMMENT", 
			"IDENT", "INTLIT", "ESCAPE", "CHARLIT", "STRLIT"
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
		"\u0004\u0000\u001b\u0082\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002"+
		"\u0001\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002"+
		"\u0004\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002"+
		"\u0007\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002"+
		"\u000b\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e"+
		"\u0002\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011"+
		"\u0002\u0012\u0007\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014"+
		"\u0002\u0015\u0007\u0015\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017"+
		"\u0002\u0018\u0007\u0018\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a"+
		"\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002"+
		"\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005"+
		"\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001"+
		"\t\u0001\t\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001"+
		"\r\u0001\r\u0001\u000e\u0001\u000e\u0001\u000f\u0001\u000f\u0001\u0010"+
		"\u0001\u0010\u0001\u0011\u0001\u0011\u0001\u0012\u0001\u0012\u0001\u0013"+
		"\u0001\u0013\u0001\u0014\u0004\u0014a\b\u0014\u000b\u0014\f\u0014b\u0001"+
		"\u0014\u0001\u0014\u0001\u0015\u0001\u0015\u0004\u0015i\b\u0015\u000b"+
		"\u0015\f\u0015j\u0001\u0015\u0001\u0015\u0001\u0016\u0001\u0016\u0001"+
		"\u0017\u0001\u0017\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0019\u0001"+
		"\u0019\u0001\u0019\u0001\u0019\u0001\u001a\u0001\u001a\u0005\u001a|\b"+
		"\u001a\n\u001a\f\u001a\u007f\t\u001a\u0001\u001a\u0001\u001a\u0000\u0000"+
		"\u001b\u0001\u0001\u0003\u0002\u0005\u0003\u0007\u0004\t\u0005\u000b\u0006"+
		"\r\u0007\u000f\b\u0011\t\u0013\n\u0015\u000b\u0017\f\u0019\r\u001b\u000e"+
		"\u001d\u000f\u001f\u0010!\u0011#\u0012%\u0013\'\u0014)\u0015+\u0016-\u0017"+
		"/\u00181\u00193\u001a5\u001b\u0001\u0000\u0006\u0003\u0000\t\n\r\r  \u0003"+
		"\u0000\n\n\r\r~~\u0005\u0000\t\n\r\r  09AZ\u0001\u000009\u0002\u0000n"+
		"nst\u0002\u0000\n\n\r\r\u0084\u0000\u0001\u0001\u0000\u0000\u0000\u0000"+
		"\u0003\u0001\u0000\u0000\u0000\u0000\u0005\u0001\u0000\u0000\u0000\u0000"+
		"\u0007\u0001\u0000\u0000\u0000\u0000\t\u0001\u0000\u0000\u0000\u0000\u000b"+
		"\u0001\u0000\u0000\u0000\u0000\r\u0001\u0000\u0000\u0000\u0000\u000f\u0001"+
		"\u0000\u0000\u0000\u0000\u0011\u0001\u0000\u0000\u0000\u0000\u0013\u0001"+
		"\u0000\u0000\u0000\u0000\u0015\u0001\u0000\u0000\u0000\u0000\u0017\u0001"+
		"\u0000\u0000\u0000\u0000\u0019\u0001\u0000\u0000\u0000\u0000\u001b\u0001"+
		"\u0000\u0000\u0000\u0000\u001d\u0001\u0000\u0000\u0000\u0000\u001f\u0001"+
		"\u0000\u0000\u0000\u0000!\u0001\u0000\u0000\u0000\u0000#\u0001\u0000\u0000"+
		"\u0000\u0000%\u0001\u0000\u0000\u0000\u0000\'\u0001\u0000\u0000\u0000"+
		"\u0000)\u0001\u0000\u0000\u0000\u0000+\u0001\u0000\u0000\u0000\u0000-"+
		"\u0001\u0000\u0000\u0000\u0000/\u0001\u0000\u0000\u0000\u00001\u0001\u0000"+
		"\u0000\u0000\u00003\u0001\u0000\u0000\u0000\u00005\u0001\u0000\u0000\u0000"+
		"\u00017\u0001\u0000\u0000\u0000\u00039\u0001\u0000\u0000\u0000\u0005;"+
		"\u0001\u0000\u0000\u0000\u0007=\u0001\u0000\u0000\u0000\t?\u0001\u0000"+
		"\u0000\u0000\u000bA\u0001\u0000\u0000\u0000\rC\u0001\u0000\u0000\u0000"+
		"\u000fE\u0001\u0000\u0000\u0000\u0011G\u0001\u0000\u0000\u0000\u0013I"+
		"\u0001\u0000\u0000\u0000\u0015K\u0001\u0000\u0000\u0000\u0017M\u0001\u0000"+
		"\u0000\u0000\u0019O\u0001\u0000\u0000\u0000\u001bQ\u0001\u0000\u0000\u0000"+
		"\u001dS\u0001\u0000\u0000\u0000\u001fU\u0001\u0000\u0000\u0000!W\u0001"+
		"\u0000\u0000\u0000#Y\u0001\u0000\u0000\u0000%[\u0001\u0000\u0000\u0000"+
		"\']\u0001\u0000\u0000\u0000)`\u0001\u0000\u0000\u0000+f\u0001\u0000\u0000"+
		"\u0000-n\u0001\u0000\u0000\u0000/p\u0001\u0000\u0000\u00001r\u0001\u0000"+
		"\u0000\u00003u\u0001\u0000\u0000\u00005y\u0001\u0000\u0000\u000078\u0005"+
		"B\u0000\u00008\u0002\u0001\u0000\u0000\u00009:\u0005N\u0000\u0000:\u0004"+
		"\u0001\u0000\u0000\u0000;<\u0005C\u0000\u0000<\u0006\u0001\u0000\u0000"+
		"\u0000=>\u0005V\u0000\u0000>\b\u0001\u0000\u0000\u0000?@\u0005P\u0000"+
		"\u0000@\n\u0001\u0000\u0000\u0000AB\u0005I\u0000\u0000B\f\u0001\u0000"+
		"\u0000\u0000CD\u0005F\u0000\u0000D\u000e\u0001\u0000\u0000\u0000EF\u0005"+
		"R\u0000\u0000F\u0010\u0001\u0000\u0000\u0000GH\u0005W\u0000\u0000H\u0012"+
		"\u0001\u0000\u0000\u0000IJ\u0005J\u0000\u0000J\u0014\u0001\u0000\u0000"+
		"\u0000KL\u0005A\u0000\u0000L\u0016\u0001\u0000\u0000\u0000MN\u0005S\u0000"+
		"\u0000N\u0018\u0001\u0000\u0000\u0000OP\u0005M\u0000\u0000P\u001a\u0001"+
		"\u0000\u0000\u0000QR\u0005D\u0000\u0000R\u001c\u0001\u0000\u0000\u0000"+
		"ST\u0005Q\u0000\u0000T\u001e\u0001\u0000\u0000\u0000UV\u0005U\u0000\u0000"+
		"V \u0001\u0000\u0000\u0000WX\u0005G\u0000\u0000X\"\u0001\u0000\u0000\u0000"+
		"YZ\u0005L\u0000\u0000Z$\u0001\u0000\u0000\u0000[\\\u0005E\u0000\u0000"+
		"\\&\u0001\u0000\u0000\u0000]^\u0005.\u0000\u0000^(\u0001\u0000\u0000\u0000"+
		"_a\u0007\u0000\u0000\u0000`_\u0001\u0000\u0000\u0000ab\u0001\u0000\u0000"+
		"\u0000b`\u0001\u0000\u0000\u0000bc\u0001\u0000\u0000\u0000cd\u0001\u0000"+
		"\u0000\u0000de\u0006\u0014\u0000\u0000e*\u0001\u0000\u0000\u0000fh\u0005"+
		"#\u0000\u0000gi\u0007\u0001\u0000\u0000hg\u0001\u0000\u0000\u0000ij\u0001"+
		"\u0000\u0000\u0000jh\u0001\u0000\u0000\u0000jk\u0001\u0000\u0000\u0000"+
		"kl\u0001\u0000\u0000\u0000lm\u0006\u0015\u0000\u0000m,\u0001\u0000\u0000"+
		"\u0000no\b\u0002\u0000\u0000o.\u0001\u0000\u0000\u0000pq\u0007\u0003\u0000"+
		"\u0000q0\u0001\u0000\u0000\u0000rs\u0005X\u0000\u0000st\u0007\u0004\u0000"+
		"\u0000t2\u0001\u0000\u0000\u0000uv\u0005\'\u0000\u0000vw\b\u0000\u0000"+
		"\u0000wx\u0005\'\u0000\u0000x4\u0001\u0000\u0000\u0000y}\u0005\"\u0000"+
		"\u0000z|\b\u0005\u0000\u0000{z\u0001\u0000\u0000\u0000|\u007f\u0001\u0000"+
		"\u0000\u0000}{\u0001\u0000\u0000\u0000}~\u0001\u0000\u0000\u0000~\u0080"+
		"\u0001\u0000\u0000\u0000\u007f}\u0001\u0000\u0000\u0000\u0080\u0081\u0005"+
		"\"\u0000\u0000\u00816\u0001\u0000\u0000\u0000\u0004\u0000bj}\u0001\u0006"+
		"\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}