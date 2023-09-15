// Generated from C:/coderepos/compiler/ANTLR-Compiler/compiler/src/parser/Ohpl.g4 by ANTLR 4.13.1
package parser;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link OhplParser}.
 */
public interface OhplListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link OhplParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(OhplParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link OhplParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(OhplParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link OhplParser#declarationBlock}.
	 * @param ctx the parse tree
	 */
	void enterDeclarationBlock(OhplParser.DeclarationBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link OhplParser#declarationBlock}.
	 * @param ctx the parse tree
	 */
	void exitDeclarationBlock(OhplParser.DeclarationBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link OhplParser#constDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterConstDeclaration(OhplParser.ConstDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link OhplParser#constDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitConstDeclaration(OhplParser.ConstDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link OhplParser#varDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterVarDeclaration(OhplParser.VarDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link OhplParser#varDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitVarDeclaration(OhplParser.VarDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link OhplParser#recordDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterRecordDeclaration(OhplParser.RecordDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link OhplParser#recordDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitRecordDeclaration(OhplParser.RecordDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link OhplParser#procedure}.
	 * @param ctx the parse tree
	 */
	void enterProcedure(OhplParser.ProcedureContext ctx);
	/**
	 * Exit a parse tree produced by {@link OhplParser#procedure}.
	 * @param ctx the parse tree
	 */
	void exitProcedure(OhplParser.ProcedureContext ctx);
	/**
	 * Enter a parse tree produced by {@link OhplParser#param}.
	 * @param ctx the parse tree
	 */
	void enterParam(OhplParser.ParamContext ctx);
	/**
	 * Exit a parse tree produced by {@link OhplParser#param}.
	 * @param ctx the parse tree
	 */
	void exitParam(OhplParser.ParamContext ctx);
	/**
	 * Enter a parse tree produced by {@link OhplParser#procedureCall}.
	 * @param ctx the parse tree
	 */
	void enterProcedureCall(OhplParser.ProcedureCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link OhplParser#procedureCall}.
	 * @param ctx the parse tree
	 */
	void exitProcedureCall(OhplParser.ProcedureCallContext ctx);
	/**
	 * Enter a parse tree produced by {@link OhplParser#returnStatement}.
	 * @param ctx the parse tree
	 */
	void enterReturnStatement(OhplParser.ReturnStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link OhplParser#returnStatement}.
	 * @param ctx the parse tree
	 */
	void exitReturnStatement(OhplParser.ReturnStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link OhplParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(OhplParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link OhplParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(OhplParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link OhplParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(OhplParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link OhplParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(OhplParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link OhplParser#statementList}.
	 * @param ctx the parse tree
	 */
	void enterStatementList(OhplParser.StatementListContext ctx);
	/**
	 * Exit a parse tree produced by {@link OhplParser#statementList}.
	 * @param ctx the parse tree
	 */
	void exitStatementList(OhplParser.StatementListContext ctx);
	/**
	 * Enter a parse tree produced by {@link OhplParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(OhplParser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link OhplParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(OhplParser.AssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link OhplParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void enterIfStatement(OhplParser.IfStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link OhplParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void exitIfStatement(OhplParser.IfStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link OhplParser#whileStatement}.
	 * @param ctx the parse tree
	 */
	void enterWhileStatement(OhplParser.WhileStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link OhplParser#whileStatement}.
	 * @param ctx the parse tree
	 */
	void exitWhileStatement(OhplParser.WhileStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link OhplParser#writeStatement}.
	 * @param ctx the parse tree
	 */
	void enterWriteStatement(OhplParser.WriteStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link OhplParser#writeStatement}.
	 * @param ctx the parse tree
	 */
	void exitWriteStatement(OhplParser.WriteStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ArithmeticExpr}
	 * labeled alternative in {@link OhplParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterArithmeticExpr(OhplParser.ArithmeticExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ArithmeticExpr}
	 * labeled alternative in {@link OhplParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitArithmeticExpr(OhplParser.ArithmeticExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Comparison}
	 * labeled alternative in {@link OhplParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterComparison(OhplParser.ComparisonContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Comparison}
	 * labeled alternative in {@link OhplParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitComparison(OhplParser.ComparisonContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CreationExpr}
	 * labeled alternative in {@link OhplParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterCreationExpr(OhplParser.CreationExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CreationExpr}
	 * labeled alternative in {@link OhplParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitCreationExpr(OhplParser.CreationExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code UnaryExpr}
	 * labeled alternative in {@link OhplParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterUnaryExpr(OhplParser.UnaryExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code UnaryExpr}
	 * labeled alternative in {@link OhplParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitUnaryExpr(OhplParser.UnaryExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code EqualityComparison}
	 * labeled alternative in {@link OhplParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterEqualityComparison(OhplParser.EqualityComparisonContext ctx);
	/**
	 * Exit a parse tree produced by the {@code EqualityComparison}
	 * labeled alternative in {@link OhplParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitEqualityComparison(OhplParser.EqualityComparisonContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BooleanExpr}
	 * labeled alternative in {@link OhplParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterBooleanExpr(OhplParser.BooleanExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BooleanExpr}
	 * labeled alternative in {@link OhplParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitBooleanExpr(OhplParser.BooleanExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link OhplParser#primaryExpr}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryExpr(OhplParser.PrimaryExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link OhplParser#primaryExpr}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryExpr(OhplParser.PrimaryExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link OhplParser#arrayLength}.
	 * @param ctx the parse tree
	 */
	void enterArrayLength(OhplParser.ArrayLengthContext ctx);
	/**
	 * Exit a parse tree produced by {@link OhplParser#arrayLength}.
	 * @param ctx the parse tree
	 */
	void exitArrayLength(OhplParser.ArrayLengthContext ctx);
	/**
	 * Enter a parse tree produced by {@link OhplParser#fullIdentifier}.
	 * @param ctx the parse tree
	 */
	void enterFullIdentifier(OhplParser.FullIdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link OhplParser#fullIdentifier}.
	 * @param ctx the parse tree
	 */
	void exitFullIdentifier(OhplParser.FullIdentifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link OhplParser#selector}.
	 * @param ctx the parse tree
	 */
	void enterSelector(OhplParser.SelectorContext ctx);
	/**
	 * Exit a parse tree produced by {@link OhplParser#selector}.
	 * @param ctx the parse tree
	 */
	void exitSelector(OhplParser.SelectorContext ctx);
	/**
	 * Enter a parse tree produced by {@link OhplParser#returnType}.
	 * @param ctx the parse tree
	 */
	void enterReturnType(OhplParser.ReturnTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link OhplParser#returnType}.
	 * @param ctx the parse tree
	 */
	void exitReturnType(OhplParser.ReturnTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link OhplParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(OhplParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link OhplParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(OhplParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link OhplParser#baseType}.
	 * @param ctx the parse tree
	 */
	void enterBaseType(OhplParser.BaseTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link OhplParser#baseType}.
	 * @param ctx the parse tree
	 */
	void exitBaseType(OhplParser.BaseTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link OhplParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteral(OhplParser.LiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link OhplParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteral(OhplParser.LiteralContext ctx);
}