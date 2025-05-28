// Generated from Letters.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link LettersParser}.
 */
public interface LettersListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link LettersParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(LettersParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link LettersParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(LettersParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link LettersParser#declList}.
	 * @param ctx the parse tree
	 */
	void enterDeclList(LettersParser.DeclListContext ctx);
	/**
	 * Exit a parse tree produced by {@link LettersParser#declList}.
	 * @param ctx the parse tree
	 */
	void exitDeclList(LettersParser.DeclListContext ctx);
	/**
	 * Enter a parse tree produced by {@link LettersParser#decl}.
	 * @param ctx the parse tree
	 */
	void enterDecl(LettersParser.DeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link LettersParser#decl}.
	 * @param ctx the parse tree
	 */
	void exitDecl(LettersParser.DeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link LettersParser#stmtList}.
	 * @param ctx the parse tree
	 */
	void enterStmtList(LettersParser.StmtListContext ctx);
	/**
	 * Exit a parse tree produced by {@link LettersParser#stmtList}.
	 * @param ctx the parse tree
	 */
	void exitStmtList(LettersParser.StmtListContext ctx);
	/**
	 * Enter a parse tree produced by {@link LettersParser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterStmt(LettersParser.StmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link LettersParser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitStmt(LettersParser.StmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link LettersParser#ifStmt}.
	 * @param ctx the parse tree
	 */
	void enterIfStmt(LettersParser.IfStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link LettersParser#ifStmt}.
	 * @param ctx the parse tree
	 */
	void exitIfStmt(LettersParser.IfStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link LettersParser#assignStmt}.
	 * @param ctx the parse tree
	 */
	void enterAssignStmt(LettersParser.AssignStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link LettersParser#assignStmt}.
	 * @param ctx the parse tree
	 */
	void exitAssignStmt(LettersParser.AssignStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link LettersParser#readStmt}.
	 * @param ctx the parse tree
	 */
	void enterReadStmt(LettersParser.ReadStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link LettersParser#readStmt}.
	 * @param ctx the parse tree
	 */
	void exitReadStmt(LettersParser.ReadStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link LettersParser#writeStmt}.
	 * @param ctx the parse tree
	 */
	void enterWriteStmt(LettersParser.WriteStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link LettersParser#writeStmt}.
	 * @param ctx the parse tree
	 */
	void exitWriteStmt(LettersParser.WriteStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link LettersParser#jumpStmt}.
	 * @param ctx the parse tree
	 */
	void enterJumpStmt(LettersParser.JumpStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link LettersParser#jumpStmt}.
	 * @param ctx the parse tree
	 */
	void exitJumpStmt(LettersParser.JumpStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link LettersParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(LettersParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link LettersParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(LettersParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link LettersParser#addSubExpr}.
	 * @param ctx the parse tree
	 */
	void enterAddSubExpr(LettersParser.AddSubExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link LettersParser#addSubExpr}.
	 * @param ctx the parse tree
	 */
	void exitAddSubExpr(LettersParser.AddSubExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link LettersParser#mulDivExpr}.
	 * @param ctx the parse tree
	 */
	void enterMulDivExpr(LettersParser.MulDivExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link LettersParser#mulDivExpr}.
	 * @param ctx the parse tree
	 */
	void exitMulDivExpr(LettersParser.MulDivExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link LettersParser#equalsExpr}.
	 * @param ctx the parse tree
	 */
	void enterEqualsExpr(LettersParser.EqualsExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link LettersParser#equalsExpr}.
	 * @param ctx the parse tree
	 */
	void exitEqualsExpr(LettersParser.EqualsExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link LettersParser#compExpr}.
	 * @param ctx the parse tree
	 */
	void enterCompExpr(LettersParser.CompExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link LettersParser#compExpr}.
	 * @param ctx the parse tree
	 */
	void exitCompExpr(LettersParser.CompExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link LettersParser#atomExpr}.
	 * @param ctx the parse tree
	 */
	void enterAtomExpr(LettersParser.AtomExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link LettersParser#atomExpr}.
	 * @param ctx the parse tree
	 */
	void exitAtomExpr(LettersParser.AtomExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link LettersParser#assignExpr}.
	 * @param ctx the parse tree
	 */
	void enterAssignExpr(LettersParser.AssignExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link LettersParser#assignExpr}.
	 * @param ctx the parse tree
	 */
	void exitAssignExpr(LettersParser.AssignExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link LettersParser#vecIndexExpr}.
	 * @param ctx the parse tree
	 */
	void enterVecIndexExpr(LettersParser.VecIndexExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link LettersParser#vecIndexExpr}.
	 * @param ctx the parse tree
	 */
	void exitVecIndexExpr(LettersParser.VecIndexExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link LettersParser#term}.
	 * @param ctx the parse tree
	 */
	void enterTerm(LettersParser.TermContext ctx);
	/**
	 * Exit a parse tree produced by {@link LettersParser#term}.
	 * @param ctx the parse tree
	 */
	void exitTerm(LettersParser.TermContext ctx);
	/**
	 * Enter a parse tree produced by {@link LettersParser#local}.
	 * @param ctx the parse tree
	 */
	void enterLocal(LettersParser.LocalContext ctx);
	/**
	 * Exit a parse tree produced by {@link LettersParser#local}.
	 * @param ctx the parse tree
	 */
	void exitLocal(LettersParser.LocalContext ctx);
	/**
	 * Enter a parse tree produced by {@link LettersParser#vecLit}.
	 * @param ctx the parse tree
	 */
	void enterVecLit(LettersParser.VecLitContext ctx);
	/**
	 * Exit a parse tree produced by {@link LettersParser#vecLit}.
	 * @param ctx the parse tree
	 */
	void exitVecLit(LettersParser.VecLitContext ctx);
}