// Generated from Letters.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link LettersParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface LettersVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link LettersParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(LettersParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link LettersParser#declList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclList(LettersParser.DeclListContext ctx);
	/**
	 * Visit a parse tree produced by {@link LettersParser#decl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecl(LettersParser.DeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link LettersParser#stmtList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmtList(LettersParser.StmtListContext ctx);
	/**
	 * Visit a parse tree produced by {@link LettersParser#stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmt(LettersParser.StmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link LettersParser#ifStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfStmt(LettersParser.IfStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link LettersParser#assignStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignStmt(LettersParser.AssignStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link LettersParser#readStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReadStmt(LettersParser.ReadStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link LettersParser#writeStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWriteStmt(LettersParser.WriteStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link LettersParser#jumpStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJumpStmt(LettersParser.JumpStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link LettersParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr(LettersParser.ExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link LettersParser#addSubExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddSubExpr(LettersParser.AddSubExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link LettersParser#mulDivExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMulDivExpr(LettersParser.MulDivExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link LettersParser#equalsExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEqualsExpr(LettersParser.EqualsExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link LettersParser#compExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompExpr(LettersParser.CompExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link LettersParser#atomExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtomExpr(LettersParser.AtomExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link LettersParser#assignExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignExpr(LettersParser.AssignExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link LettersParser#vecIndexExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVecIndexExpr(LettersParser.VecIndexExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link LettersParser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTerm(LettersParser.TermContext ctx);
	/**
	 * Visit a parse tree produced by {@link LettersParser#local}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLocal(LettersParser.LocalContext ctx);
	/**
	 * Visit a parse tree produced by {@link LettersParser#vecLit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVecLit(LettersParser.VecLitContext ctx);
}