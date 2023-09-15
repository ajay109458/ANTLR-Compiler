// Generated from C:/coderepos/compiler/ANTLR-Compiler/compiler/src/parser/Ohpl.g4 by ANTLR 4.13.1
package parser;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link OhplParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface OhplVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link OhplParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(OhplParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link OhplParser#declarationBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclarationBlock(OhplParser.DeclarationBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link OhplParser#constDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstDeclaration(OhplParser.ConstDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link OhplParser#varDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarDeclaration(OhplParser.VarDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link OhplParser#recordDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRecordDeclaration(OhplParser.RecordDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link OhplParser#procedure}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProcedure(OhplParser.ProcedureContext ctx);
	/**
	 * Visit a parse tree produced by {@link OhplParser#param}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParam(OhplParser.ParamContext ctx);
	/**
	 * Visit a parse tree produced by {@link OhplParser#procedureCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProcedureCall(OhplParser.ProcedureCallContext ctx);
	/**
	 * Visit a parse tree produced by {@link OhplParser#returnStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnStatement(OhplParser.ReturnStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link OhplParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(OhplParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link OhplParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(OhplParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link OhplParser#statementList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatementList(OhplParser.StatementListContext ctx);
	/**
	 * Visit a parse tree produced by {@link OhplParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment(OhplParser.AssignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link OhplParser#ifStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfStatement(OhplParser.IfStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link OhplParser#whileStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileStatement(OhplParser.WhileStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link OhplParser#writeStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWriteStatement(OhplParser.WriteStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ArithmeticExpr}
	 * labeled alternative in {@link OhplParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArithmeticExpr(OhplParser.ArithmeticExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Comparison}
	 * labeled alternative in {@link OhplParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComparison(OhplParser.ComparisonContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CreationExpr}
	 * labeled alternative in {@link OhplParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreationExpr(OhplParser.CreationExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code UnaryExpr}
	 * labeled alternative in {@link OhplParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnaryExpr(OhplParser.UnaryExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code EqualityComparison}
	 * labeled alternative in {@link OhplParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEqualityComparison(OhplParser.EqualityComparisonContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BooleanExpr}
	 * labeled alternative in {@link OhplParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBooleanExpr(OhplParser.BooleanExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link OhplParser#primaryExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimaryExpr(OhplParser.PrimaryExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link OhplParser#arrayLength}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayLength(OhplParser.ArrayLengthContext ctx);
	/**
	 * Visit a parse tree produced by {@link OhplParser#fullIdentifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFullIdentifier(OhplParser.FullIdentifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link OhplParser#selector}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelector(OhplParser.SelectorContext ctx);
	/**
	 * Visit a parse tree produced by {@link OhplParser#returnType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnType(OhplParser.ReturnTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link OhplParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(OhplParser.TypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link OhplParser#baseType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBaseType(OhplParser.BaseTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link OhplParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteral(OhplParser.LiteralContext ctx);
}