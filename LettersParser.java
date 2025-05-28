// Generated from Letters.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class LettersParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, PERIOD=20, WS=21, COMMENT=22, IDENT=23, INTLIT=24, 
		ESCAPE=25, CHARLIT=26;
	public static final int
		RULE_program = 0, RULE_declList = 1, RULE_decl = 2, RULE_stmtList = 3, 
		RULE_stmt = 4, RULE_ifStmt = 5, RULE_assignStmt = 6, RULE_readStmt = 7, 
		RULE_writeStmt = 8, RULE_jumpStmt = 9, RULE_expr = 10, RULE_addSubExpr = 11, 
		RULE_mulDivExpr = 12, RULE_equalsExpr = 13, RULE_compExpr = 14, RULE_atomExpr = 15, 
		RULE_assignExpr = 16, RULE_vecIndexExpr = 17, RULE_term = 18, RULE_local = 19, 
		RULE_vecLit = 20;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "declList", "decl", "stmtList", "stmt", "ifStmt", "assignStmt", 
			"readStmt", "writeStmt", "jumpStmt", "expr", "addSubExpr", "mulDivExpr", 
			"equalsExpr", "compExpr", "atomExpr", "assignExpr", "vecIndexExpr", "term", 
			"local", "vecLit"
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
			"IDENT", "INTLIT", "ESCAPE", "CHARLIT"
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
	public String getGrammarFileName() { return "Letters.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public LettersParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(LettersParser.EOF, 0); }
		public List<StmtListContext> stmtList() {
			return getRuleContexts(StmtListContext.class);
		}
		public StmtListContext stmtList(int i) {
			return getRuleContext(StmtListContext.class,i);
		}
		public List<DeclListContext> declList() {
			return getRuleContexts(DeclListContext.class);
		}
		public DeclListContext declList(int i) {
			return getRuleContext(DeclListContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LettersListener ) ((LettersListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LettersListener ) ((LettersListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LettersVisitor ) return ((LettersVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(46);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 125831038L) != 0)) {
				{
				setState(44);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__5:
				case T__7:
				case T__8:
				case T__9:
				case IDENT:
				case INTLIT:
				case ESCAPE:
				case CHARLIT:
					{
					setState(42);
					stmtList();
					}
					break;
				case T__0:
				case T__1:
				case T__2:
				case T__3:
				case T__4:
					{
					setState(43);
					declList();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(48);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(49);
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

	@SuppressWarnings("CheckReturnValue")
	public static class DeclListContext extends ParserRuleContext {
		public List<DeclContext> decl() {
			return getRuleContexts(DeclContext.class);
		}
		public DeclContext decl(int i) {
			return getRuleContext(DeclContext.class,i);
		}
		public DeclListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LettersListener ) ((LettersListener)listener).enterDeclList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LettersListener ) ((LettersListener)listener).exitDeclList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LettersVisitor ) return ((LettersVisitor<? extends T>)visitor).visitDeclList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclListContext declList() throws RecognitionException {
		DeclListContext _localctx = new DeclListContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_declList);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(52); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(51);
					decl();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(54); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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
	public static class DeclContext extends ParserRuleContext {
		public TerminalNode PERIOD() { return getToken(LettersParser.PERIOD, 0); }
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public AssignExprContext assignExpr() {
			return getRuleContext(AssignExprContext.class,0);
		}
		public DeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LettersListener ) ((LettersListener)listener).enterDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LettersListener ) ((LettersListener)listener).exitDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LettersVisitor ) return ((LettersVisitor<? extends T>)visitor).visitDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclContext decl() throws RecognitionException {
		DeclContext _localctx = new DeclContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_decl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(56);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 62L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(59);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				{
				setState(57);
				term();
				}
				break;
			case 2:
				{
				setState(58);
				assignExpr();
				}
				break;
			}
			setState(61);
			match(PERIOD);
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
	public static class StmtListContext extends ParserRuleContext {
		public List<StmtContext> stmt() {
			return getRuleContexts(StmtContext.class);
		}
		public StmtContext stmt(int i) {
			return getRuleContext(StmtContext.class,i);
		}
		public StmtListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stmtList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LettersListener ) ((LettersListener)listener).enterStmtList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LettersListener ) ((LettersListener)listener).exitStmtList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LettersVisitor ) return ((LettersVisitor<? extends T>)visitor).visitStmtList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StmtListContext stmtList() throws RecognitionException {
		StmtListContext _localctx = new StmtListContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_stmtList);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(64); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(63);
					stmt();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(66); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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
	public static class StmtContext extends ParserRuleContext {
		public IfStmtContext ifStmt() {
			return getRuleContext(IfStmtContext.class,0);
		}
		public AssignStmtContext assignStmt() {
			return getRuleContext(AssignStmtContext.class,0);
		}
		public ReadStmtContext readStmt() {
			return getRuleContext(ReadStmtContext.class,0);
		}
		public WriteStmtContext writeStmt() {
			return getRuleContext(WriteStmtContext.class,0);
		}
		public JumpStmtContext jumpStmt() {
			return getRuleContext(JumpStmtContext.class,0);
		}
		public StmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LettersListener ) ((LettersListener)listener).enterStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LettersListener ) ((LettersListener)listener).exitStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LettersVisitor ) return ((LettersVisitor<? extends T>)visitor).visitStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StmtContext stmt() throws RecognitionException {
		StmtContext _localctx = new StmtContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_stmt);
		try {
			setState(73);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__5:
				enterOuterAlt(_localctx, 1);
				{
				setState(68);
				ifStmt();
				}
				break;
			case IDENT:
			case INTLIT:
			case ESCAPE:
			case CHARLIT:
				enterOuterAlt(_localctx, 2);
				{
				setState(69);
				assignStmt();
				}
				break;
			case T__7:
				enterOuterAlt(_localctx, 3);
				{
				setState(70);
				readStmt();
				}
				break;
			case T__8:
				enterOuterAlt(_localctx, 4);
				{
				setState(71);
				writeStmt();
				}
				break;
			case T__9:
				enterOuterAlt(_localctx, 5);
				{
				setState(72);
				jumpStmt();
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

	@SuppressWarnings("CheckReturnValue")
	public static class IfStmtContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public List<StmtListContext> stmtList() {
			return getRuleContexts(StmtListContext.class);
		}
		public StmtListContext stmtList(int i) {
			return getRuleContext(StmtListContext.class,i);
		}
		public IfStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LettersListener ) ((LettersListener)listener).enterIfStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LettersListener ) ((LettersListener)listener).exitIfStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LettersVisitor ) return ((LettersVisitor<? extends T>)visitor).visitIfStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfStmtContext ifStmt() throws RecognitionException {
		IfStmtContext _localctx = new IfStmtContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_ifStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(75);
			match(T__5);
			setState(76);
			expr();
			setState(77);
			match(T__6);
			setState(79); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(78);
				stmtList();
				}
				}
				setState(81); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 125830976L) != 0) );
			setState(83);
			match(T__6);
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
	public static class AssignStmtContext extends ParserRuleContext {
		public AssignExprContext assignExpr() {
			return getRuleContext(AssignExprContext.class,0);
		}
		public TerminalNode PERIOD() { return getToken(LettersParser.PERIOD, 0); }
		public AssignStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LettersListener ) ((LettersListener)listener).enterAssignStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LettersListener ) ((LettersListener)listener).exitAssignStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LettersVisitor ) return ((LettersVisitor<? extends T>)visitor).visitAssignStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignStmtContext assignStmt() throws RecognitionException {
		AssignStmtContext _localctx = new AssignStmtContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_assignStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(85);
			assignExpr();
			setState(86);
			match(PERIOD);
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
	public static class ReadStmtContext extends ParserRuleContext {
		public LocalContext local() {
			return getRuleContext(LocalContext.class,0);
		}
		public TerminalNode PERIOD() { return getToken(LettersParser.PERIOD, 0); }
		public ReadStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_readStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LettersListener ) ((LettersListener)listener).enterReadStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LettersListener ) ((LettersListener)listener).exitReadStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LettersVisitor ) return ((LettersVisitor<? extends T>)visitor).visitReadStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReadStmtContext readStmt() throws RecognitionException {
		ReadStmtContext _localctx = new ReadStmtContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_readStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(88);
			match(T__7);
			setState(89);
			local();
			setState(90);
			match(PERIOD);
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
	public static class WriteStmtContext extends ParserRuleContext {
		public TerminalNode PERIOD() { return getToken(LettersParser.PERIOD, 0); }
		public TerminalNode INTLIT() { return getToken(LettersParser.INTLIT, 0); }
		public TerminalNode CHARLIT() { return getToken(LettersParser.CHARLIT, 0); }
		public TerminalNode ESCAPE() { return getToken(LettersParser.ESCAPE, 0); }
		public VecLitContext vecLit() {
			return getRuleContext(VecLitContext.class,0);
		}
		public LocalContext local() {
			return getRuleContext(LocalContext.class,0);
		}
		public WriteStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_writeStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LettersListener ) ((LettersListener)listener).enterWriteStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LettersListener ) ((LettersListener)listener).exitWriteStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LettersVisitor ) return ((LettersVisitor<? extends T>)visitor).visitWriteStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WriteStmtContext writeStmt() throws RecognitionException {
		WriteStmtContext _localctx = new WriteStmtContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_writeStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(92);
			match(T__8);
			setState(98);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				{
				setState(93);
				match(INTLIT);
				}
				break;
			case 2:
				{
				setState(94);
				match(CHARLIT);
				}
				break;
			case 3:
				{
				setState(95);
				match(ESCAPE);
				}
				break;
			case 4:
				{
				setState(96);
				vecLit();
				}
				break;
			case 5:
				{
				setState(97);
				local();
				}
				break;
			}
			setState(100);
			match(PERIOD);
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
	public static class JumpStmtContext extends ParserRuleContext {
		public TerminalNode IDENT() { return getToken(LettersParser.IDENT, 0); }
		public TerminalNode PERIOD() { return getToken(LettersParser.PERIOD, 0); }
		public JumpStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jumpStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LettersListener ) ((LettersListener)listener).enterJumpStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LettersListener ) ((LettersListener)listener).exitJumpStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LettersVisitor ) return ((LettersVisitor<? extends T>)visitor).visitJumpStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JumpStmtContext jumpStmt() throws RecognitionException {
		JumpStmtContext _localctx = new JumpStmtContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_jumpStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(102);
			match(T__9);
			setState(103);
			match(IDENT);
			setState(104);
			match(PERIOD);
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
	public static class ExprContext extends ParserRuleContext {
		public AddSubExprContext addSubExpr() {
			return getRuleContext(AddSubExprContext.class,0);
		}
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LettersListener ) ((LettersListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LettersListener ) ((LettersListener)listener).exitExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LettersVisitor ) return ((LettersVisitor<? extends T>)visitor).visitExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_expr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(106);
			addSubExpr();
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
	public static class AddSubExprContext extends ParserRuleContext {
		public List<MulDivExprContext> mulDivExpr() {
			return getRuleContexts(MulDivExprContext.class);
		}
		public MulDivExprContext mulDivExpr(int i) {
			return getRuleContext(MulDivExprContext.class,i);
		}
		public AddSubExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_addSubExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LettersListener ) ((LettersListener)listener).enterAddSubExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LettersListener ) ((LettersListener)listener).exitAddSubExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LettersVisitor ) return ((LettersVisitor<? extends T>)visitor).visitAddSubExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AddSubExprContext addSubExpr() throws RecognitionException {
		AddSubExprContext _localctx = new AddSubExprContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_addSubExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(108);
			mulDivExpr();
			setState(113);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__10 || _la==T__11) {
				{
				{
				setState(109);
				_la = _input.LA(1);
				if ( !(_la==T__10 || _la==T__11) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(110);
				mulDivExpr();
				}
				}
				setState(115);
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

	@SuppressWarnings("CheckReturnValue")
	public static class MulDivExprContext extends ParserRuleContext {
		public List<EqualsExprContext> equalsExpr() {
			return getRuleContexts(EqualsExprContext.class);
		}
		public EqualsExprContext equalsExpr(int i) {
			return getRuleContext(EqualsExprContext.class,i);
		}
		public MulDivExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mulDivExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LettersListener ) ((LettersListener)listener).enterMulDivExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LettersListener ) ((LettersListener)listener).exitMulDivExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LettersVisitor ) return ((LettersVisitor<? extends T>)visitor).visitMulDivExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MulDivExprContext mulDivExpr() throws RecognitionException {
		MulDivExprContext _localctx = new MulDivExprContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_mulDivExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(116);
			equalsExpr();
			setState(121);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__12 || _la==T__13) {
				{
				{
				setState(117);
				_la = _input.LA(1);
				if ( !(_la==T__12 || _la==T__13) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(118);
				equalsExpr();
				}
				}
				setState(123);
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

	@SuppressWarnings("CheckReturnValue")
	public static class EqualsExprContext extends ParserRuleContext {
		public List<CompExprContext> compExpr() {
			return getRuleContexts(CompExprContext.class);
		}
		public CompExprContext compExpr(int i) {
			return getRuleContext(CompExprContext.class,i);
		}
		public EqualsExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_equalsExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LettersListener ) ((LettersListener)listener).enterEqualsExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LettersListener ) ((LettersListener)listener).exitEqualsExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LettersVisitor ) return ((LettersVisitor<? extends T>)visitor).visitEqualsExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EqualsExprContext equalsExpr() throws RecognitionException {
		EqualsExprContext _localctx = new EqualsExprContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_equalsExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(124);
			compExpr();
			setState(129);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__14 || _la==T__15) {
				{
				{
				setState(125);
				_la = _input.LA(1);
				if ( !(_la==T__14 || _la==T__15) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(126);
				compExpr();
				}
				}
				setState(131);
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

	@SuppressWarnings("CheckReturnValue")
	public static class CompExprContext extends ParserRuleContext {
		public List<AtomExprContext> atomExpr() {
			return getRuleContexts(AtomExprContext.class);
		}
		public AtomExprContext atomExpr(int i) {
			return getRuleContext(AtomExprContext.class,i);
		}
		public CompExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LettersListener ) ((LettersListener)listener).enterCompExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LettersListener ) ((LettersListener)listener).exitCompExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LettersVisitor ) return ((LettersVisitor<? extends T>)visitor).visitCompExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CompExprContext compExpr() throws RecognitionException {
		CompExprContext _localctx = new CompExprContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_compExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(132);
			atomExpr();
			setState(137);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__16 || _la==T__17) {
				{
				{
				setState(133);
				_la = _input.LA(1);
				if ( !(_la==T__16 || _la==T__17) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(134);
				atomExpr();
				}
				}
				setState(139);
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

	@SuppressWarnings("CheckReturnValue")
	public static class AtomExprContext extends ParserRuleContext {
		public AssignExprContext assignExpr() {
			return getRuleContext(AssignExprContext.class,0);
		}
		public VecIndexExprContext vecIndexExpr() {
			return getRuleContext(VecIndexExprContext.class,0);
		}
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public AtomExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atomExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LettersListener ) ((LettersListener)listener).enterAtomExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LettersListener ) ((LettersListener)listener).exitAtomExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LettersVisitor ) return ((LettersVisitor<? extends T>)visitor).visitAtomExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AtomExprContext atomExpr() throws RecognitionException {
		AtomExprContext _localctx = new AtomExprContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_atomExpr);
		try {
			setState(143);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(140);
				assignExpr();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(141);
				vecIndexExpr();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(142);
				term();
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

	@SuppressWarnings("CheckReturnValue")
	public static class AssignExprContext extends ParserRuleContext {
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public TerminalNode INTLIT() { return getToken(LettersParser.INTLIT, 0); }
		public TerminalNode CHARLIT() { return getToken(LettersParser.CHARLIT, 0); }
		public TerminalNode ESCAPE() { return getToken(LettersParser.ESCAPE, 0); }
		public VecLitContext vecLit() {
			return getRuleContext(VecLitContext.class,0);
		}
		public LocalContext local() {
			return getRuleContext(LocalContext.class,0);
		}
		public AssignExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LettersListener ) ((LettersListener)listener).enterAssignExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LettersListener ) ((LettersListener)listener).exitAssignExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LettersVisitor ) return ((LettersVisitor<? extends T>)visitor).visitAssignExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignExprContext assignExpr() throws RecognitionException {
		AssignExprContext _localctx = new AssignExprContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_assignExpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(145);
			term();
			setState(146);
			match(T__18);
			setState(152);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				{
				setState(147);
				match(INTLIT);
				}
				break;
			case 2:
				{
				setState(148);
				match(CHARLIT);
				}
				break;
			case 3:
				{
				setState(149);
				match(ESCAPE);
				}
				break;
			case 4:
				{
				setState(150);
				vecLit();
				}
				break;
			case 5:
				{
				setState(151);
				local();
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

	@SuppressWarnings("CheckReturnValue")
	public static class VecIndexExprContext extends ParserRuleContext {
		public List<LocalContext> local() {
			return getRuleContexts(LocalContext.class);
		}
		public LocalContext local(int i) {
			return getRuleContext(LocalContext.class,i);
		}
		public TerminalNode INTLIT() { return getToken(LettersParser.INTLIT, 0); }
		public VecIndexExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_vecIndexExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LettersListener ) ((LettersListener)listener).enterVecIndexExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LettersListener ) ((LettersListener)listener).exitVecIndexExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LettersVisitor ) return ((LettersVisitor<? extends T>)visitor).visitVecIndexExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VecIndexExprContext vecIndexExpr() throws RecognitionException {
		VecIndexExprContext _localctx = new VecIndexExprContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_vecIndexExpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(154);
			local();
			setState(157);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INTLIT:
				{
				setState(155);
				match(INTLIT);
				}
				break;
			case IDENT:
				{
				setState(156);
				local();
				}
				break;
			default:
				throw new NoViableAltException(this);
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
	public static class TermContext extends ParserRuleContext {
		public LocalContext local() {
			return getRuleContext(LocalContext.class,0);
		}
		public TerminalNode INTLIT() { return getToken(LettersParser.INTLIT, 0); }
		public TerminalNode CHARLIT() { return getToken(LettersParser.CHARLIT, 0); }
		public VecLitContext vecLit() {
			return getRuleContext(VecLitContext.class,0);
		}
		public TermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_term; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LettersListener ) ((LettersListener)listener).enterTerm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LettersListener ) ((LettersListener)listener).exitTerm(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LettersVisitor ) return ((LettersVisitor<? extends T>)visitor).visitTerm(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TermContext term() throws RecognitionException {
		TermContext _localctx = new TermContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_term);
		try {
			setState(163);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(159);
				local();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(160);
				match(INTLIT);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(161);
				match(CHARLIT);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(162);
				vecLit();
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

	@SuppressWarnings("CheckReturnValue")
	public static class LocalContext extends ParserRuleContext {
		public TerminalNode IDENT() { return getToken(LettersParser.IDENT, 0); }
		public LocalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_local; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LettersListener ) ((LettersListener)listener).enterLocal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LettersListener ) ((LettersListener)listener).exitLocal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LettersVisitor ) return ((LettersVisitor<? extends T>)visitor).visitLocal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LocalContext local() throws RecognitionException {
		LocalContext _localctx = new LocalContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_local);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(165);
			match(IDENT);
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
	public static class VecLitContext extends ParserRuleContext {
		public List<TerminalNode> INTLIT() { return getTokens(LettersParser.INTLIT); }
		public TerminalNode INTLIT(int i) {
			return getToken(LettersParser.INTLIT, i);
		}
		public List<TerminalNode> CHARLIT() { return getTokens(LettersParser.CHARLIT); }
		public TerminalNode CHARLIT(int i) {
			return getToken(LettersParser.CHARLIT, i);
		}
		public List<TerminalNode> ESCAPE() { return getTokens(LettersParser.ESCAPE); }
		public TerminalNode ESCAPE(int i) {
			return getToken(LettersParser.ESCAPE, i);
		}
		public List<LocalContext> local() {
			return getRuleContexts(LocalContext.class);
		}
		public LocalContext local(int i) {
			return getRuleContext(LocalContext.class,i);
		}
		public VecLitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_vecLit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LettersListener ) ((LettersListener)listener).enterVecLit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LettersListener ) ((LettersListener)listener).exitVecLit(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LettersVisitor ) return ((LettersVisitor<? extends T>)visitor).visitVecLit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VecLitContext vecLit() throws RecognitionException {
		VecLitContext _localctx = new VecLitContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_vecLit);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(171); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(171);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case INTLIT:
					{
					setState(167);
					match(INTLIT);
					}
					break;
				case CHARLIT:
					{
					setState(168);
					match(CHARLIT);
					}
					break;
				case ESCAPE:
					{
					setState(169);
					match(ESCAPE);
					}
					break;
				case IDENT:
					{
					setState(170);
					local();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(173); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 125829120L) != 0) );
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
		"\u0004\u0001\u001a\u00b0\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001"+
		"\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004"+
		"\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007"+
		"\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b"+
		"\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007"+
		"\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007"+
		"\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0001\u0000\u0001"+
		"\u0000\u0005\u0000-\b\u0000\n\u0000\f\u00000\t\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0001\u0004\u00015\b\u0001\u000b\u0001\f\u00016\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0003\u0002<\b\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0003\u0004\u0003A\b\u0003\u000b\u0003\f\u0003B\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0003\u0004J\b\u0004\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0004\u0005P\b\u0005\u000b"+
		"\u0005\f\u0005Q\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001\b"+
		"\u0001\b\u0001\b\u0001\b\u0001\b\u0003\bc\b\b\u0001\b\u0001\b\u0001\t"+
		"\u0001\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0005\u000bp\b\u000b\n\u000b\f\u000bs\t\u000b\u0001\f\u0001\f\u0001"+
		"\f\u0005\fx\b\f\n\f\f\f{\t\f\u0001\r\u0001\r\u0001\r\u0005\r\u0080\b\r"+
		"\n\r\f\r\u0083\t\r\u0001\u000e\u0001\u000e\u0001\u000e\u0005\u000e\u0088"+
		"\b\u000e\n\u000e\f\u000e\u008b\t\u000e\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0003\u000f\u0090\b\u000f\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0003\u0010\u0099\b\u0010\u0001\u0011"+
		"\u0001\u0011\u0001\u0011\u0003\u0011\u009e\b\u0011\u0001\u0012\u0001\u0012"+
		"\u0001\u0012\u0001\u0012\u0003\u0012\u00a4\b\u0012\u0001\u0013\u0001\u0013"+
		"\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0004\u0014\u00ac\b\u0014"+
		"\u000b\u0014\f\u0014\u00ad\u0001\u0014\u0000\u0000\u0015\u0000\u0002\u0004"+
		"\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e \""+
		"$&(\u0000\u0005\u0001\u0000\u0001\u0005\u0001\u0000\u000b\f\u0001\u0000"+
		"\r\u000e\u0001\u0000\u000f\u0010\u0001\u0000\u0011\u0012\u00ba\u0000."+
		"\u0001\u0000\u0000\u0000\u00024\u0001\u0000\u0000\u0000\u00048\u0001\u0000"+
		"\u0000\u0000\u0006@\u0001\u0000\u0000\u0000\bI\u0001\u0000\u0000\u0000"+
		"\nK\u0001\u0000\u0000\u0000\fU\u0001\u0000\u0000\u0000\u000eX\u0001\u0000"+
		"\u0000\u0000\u0010\\\u0001\u0000\u0000\u0000\u0012f\u0001\u0000\u0000"+
		"\u0000\u0014j\u0001\u0000\u0000\u0000\u0016l\u0001\u0000\u0000\u0000\u0018"+
		"t\u0001\u0000\u0000\u0000\u001a|\u0001\u0000\u0000\u0000\u001c\u0084\u0001"+
		"\u0000\u0000\u0000\u001e\u008f\u0001\u0000\u0000\u0000 \u0091\u0001\u0000"+
		"\u0000\u0000\"\u009a\u0001\u0000\u0000\u0000$\u00a3\u0001\u0000\u0000"+
		"\u0000&\u00a5\u0001\u0000\u0000\u0000(\u00ab\u0001\u0000\u0000\u0000*"+
		"-\u0003\u0006\u0003\u0000+-\u0003\u0002\u0001\u0000,*\u0001\u0000\u0000"+
		"\u0000,+\u0001\u0000\u0000\u0000-0\u0001\u0000\u0000\u0000.,\u0001\u0000"+
		"\u0000\u0000./\u0001\u0000\u0000\u0000/1\u0001\u0000\u0000\u00000.\u0001"+
		"\u0000\u0000\u000012\u0005\u0000\u0000\u00012\u0001\u0001\u0000\u0000"+
		"\u000035\u0003\u0004\u0002\u000043\u0001\u0000\u0000\u000056\u0001\u0000"+
		"\u0000\u000064\u0001\u0000\u0000\u000067\u0001\u0000\u0000\u00007\u0003"+
		"\u0001\u0000\u0000\u00008;\u0007\u0000\u0000\u00009<\u0003$\u0012\u0000"+
		":<\u0003 \u0010\u0000;9\u0001\u0000\u0000\u0000;:\u0001\u0000\u0000\u0000"+
		"<=\u0001\u0000\u0000\u0000=>\u0005\u0014\u0000\u0000>\u0005\u0001\u0000"+
		"\u0000\u0000?A\u0003\b\u0004\u0000@?\u0001\u0000\u0000\u0000AB\u0001\u0000"+
		"\u0000\u0000B@\u0001\u0000\u0000\u0000BC\u0001\u0000\u0000\u0000C\u0007"+
		"\u0001\u0000\u0000\u0000DJ\u0003\n\u0005\u0000EJ\u0003\f\u0006\u0000F"+
		"J\u0003\u000e\u0007\u0000GJ\u0003\u0010\b\u0000HJ\u0003\u0012\t\u0000"+
		"ID\u0001\u0000\u0000\u0000IE\u0001\u0000\u0000\u0000IF\u0001\u0000\u0000"+
		"\u0000IG\u0001\u0000\u0000\u0000IH\u0001\u0000\u0000\u0000J\t\u0001\u0000"+
		"\u0000\u0000KL\u0005\u0006\u0000\u0000LM\u0003\u0014\n\u0000MO\u0005\u0007"+
		"\u0000\u0000NP\u0003\u0006\u0003\u0000ON\u0001\u0000\u0000\u0000PQ\u0001"+
		"\u0000\u0000\u0000QO\u0001\u0000\u0000\u0000QR\u0001\u0000\u0000\u0000"+
		"RS\u0001\u0000\u0000\u0000ST\u0005\u0007\u0000\u0000T\u000b\u0001\u0000"+
		"\u0000\u0000UV\u0003 \u0010\u0000VW\u0005\u0014\u0000\u0000W\r\u0001\u0000"+
		"\u0000\u0000XY\u0005\b\u0000\u0000YZ\u0003&\u0013\u0000Z[\u0005\u0014"+
		"\u0000\u0000[\u000f\u0001\u0000\u0000\u0000\\b\u0005\t\u0000\u0000]c\u0005"+
		"\u0018\u0000\u0000^c\u0005\u001a\u0000\u0000_c\u0005\u0019\u0000\u0000"+
		"`c\u0003(\u0014\u0000ac\u0003&\u0013\u0000b]\u0001\u0000\u0000\u0000b"+
		"^\u0001\u0000\u0000\u0000b_\u0001\u0000\u0000\u0000b`\u0001\u0000\u0000"+
		"\u0000ba\u0001\u0000\u0000\u0000cd\u0001\u0000\u0000\u0000de\u0005\u0014"+
		"\u0000\u0000e\u0011\u0001\u0000\u0000\u0000fg\u0005\n\u0000\u0000gh\u0005"+
		"\u0017\u0000\u0000hi\u0005\u0014\u0000\u0000i\u0013\u0001\u0000\u0000"+
		"\u0000jk\u0003\u0016\u000b\u0000k\u0015\u0001\u0000\u0000\u0000lq\u0003"+
		"\u0018\f\u0000mn\u0007\u0001\u0000\u0000np\u0003\u0018\f\u0000om\u0001"+
		"\u0000\u0000\u0000ps\u0001\u0000\u0000\u0000qo\u0001\u0000\u0000\u0000"+
		"qr\u0001\u0000\u0000\u0000r\u0017\u0001\u0000\u0000\u0000sq\u0001\u0000"+
		"\u0000\u0000ty\u0003\u001a\r\u0000uv\u0007\u0002\u0000\u0000vx\u0003\u001a"+
		"\r\u0000wu\u0001\u0000\u0000\u0000x{\u0001\u0000\u0000\u0000yw\u0001\u0000"+
		"\u0000\u0000yz\u0001\u0000\u0000\u0000z\u0019\u0001\u0000\u0000\u0000"+
		"{y\u0001\u0000\u0000\u0000|\u0081\u0003\u001c\u000e\u0000}~\u0007\u0003"+
		"\u0000\u0000~\u0080\u0003\u001c\u000e\u0000\u007f}\u0001\u0000\u0000\u0000"+
		"\u0080\u0083\u0001\u0000\u0000\u0000\u0081\u007f\u0001\u0000\u0000\u0000"+
		"\u0081\u0082\u0001\u0000\u0000\u0000\u0082\u001b\u0001\u0000\u0000\u0000"+
		"\u0083\u0081\u0001\u0000\u0000\u0000\u0084\u0089\u0003\u001e\u000f\u0000"+
		"\u0085\u0086\u0007\u0004\u0000\u0000\u0086\u0088\u0003\u001e\u000f\u0000"+
		"\u0087\u0085\u0001\u0000\u0000\u0000\u0088\u008b\u0001\u0000\u0000\u0000"+
		"\u0089\u0087\u0001\u0000\u0000\u0000\u0089\u008a\u0001\u0000\u0000\u0000"+
		"\u008a\u001d\u0001\u0000\u0000\u0000\u008b\u0089\u0001\u0000\u0000\u0000"+
		"\u008c\u0090\u0003 \u0010\u0000\u008d\u0090\u0003\"\u0011\u0000\u008e"+
		"\u0090\u0003$\u0012\u0000\u008f\u008c\u0001\u0000\u0000\u0000\u008f\u008d"+
		"\u0001\u0000\u0000\u0000\u008f\u008e\u0001\u0000\u0000\u0000\u0090\u001f"+
		"\u0001\u0000\u0000\u0000\u0091\u0092\u0003$\u0012\u0000\u0092\u0098\u0005"+
		"\u0013\u0000\u0000\u0093\u0099\u0005\u0018\u0000\u0000\u0094\u0099\u0005"+
		"\u001a\u0000\u0000\u0095\u0099\u0005\u0019\u0000\u0000\u0096\u0099\u0003"+
		"(\u0014\u0000\u0097\u0099\u0003&\u0013\u0000\u0098\u0093\u0001\u0000\u0000"+
		"\u0000\u0098\u0094\u0001\u0000\u0000\u0000\u0098\u0095\u0001\u0000\u0000"+
		"\u0000\u0098\u0096\u0001\u0000\u0000\u0000\u0098\u0097\u0001\u0000\u0000"+
		"\u0000\u0099!\u0001\u0000\u0000\u0000\u009a\u009d\u0003&\u0013\u0000\u009b"+
		"\u009e\u0005\u0018\u0000\u0000\u009c\u009e\u0003&\u0013\u0000\u009d\u009b"+
		"\u0001\u0000\u0000\u0000\u009d\u009c\u0001\u0000\u0000\u0000\u009e#\u0001"+
		"\u0000\u0000\u0000\u009f\u00a4\u0003&\u0013\u0000\u00a0\u00a4\u0005\u0018"+
		"\u0000\u0000\u00a1\u00a4\u0005\u001a\u0000\u0000\u00a2\u00a4\u0003(\u0014"+
		"\u0000\u00a3\u009f\u0001\u0000\u0000\u0000\u00a3\u00a0\u0001\u0000\u0000"+
		"\u0000\u00a3\u00a1\u0001\u0000\u0000\u0000\u00a3\u00a2\u0001\u0000\u0000"+
		"\u0000\u00a4%\u0001\u0000\u0000\u0000\u00a5\u00a6\u0005\u0017\u0000\u0000"+
		"\u00a6\'\u0001\u0000\u0000\u0000\u00a7\u00ac\u0005\u0018\u0000\u0000\u00a8"+
		"\u00ac\u0005\u001a\u0000\u0000\u00a9\u00ac\u0005\u0019\u0000\u0000\u00aa"+
		"\u00ac\u0003&\u0013\u0000\u00ab\u00a7\u0001\u0000\u0000\u0000\u00ab\u00a8"+
		"\u0001\u0000\u0000\u0000\u00ab\u00a9\u0001\u0000\u0000\u0000\u00ab\u00aa"+
		"\u0001\u0000\u0000\u0000\u00ac\u00ad\u0001\u0000\u0000\u0000\u00ad\u00ab"+
		"\u0001\u0000\u0000\u0000\u00ad\u00ae\u0001\u0000\u0000\u0000\u00ae)\u0001"+
		"\u0000\u0000\u0000\u0012,.6;BIQbqy\u0081\u0089\u008f\u0098\u009d\u00a3"+
		"\u00ab\u00ad";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}