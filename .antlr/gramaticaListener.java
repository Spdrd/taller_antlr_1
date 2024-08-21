// Generated from c:/Users/Sonyvideo1/Programas Personales/javaCosas/taller_antlr_1/gramatica.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link gramaticaParser}.
 */
public interface gramaticaListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#termino}.
	 * @param ctx the parse tree
	 */
	void enterTermino(gramaticaParser.TerminoContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#termino}.
	 * @param ctx the parse tree
	 */
	void exitTermino(gramaticaParser.TerminoContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#expresion}.
	 * @param ctx the parse tree
	 */
	void enterExpresion(gramaticaParser.ExpresionContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#expresion}.
	 * @param ctx the parse tree
	 */
	void exitExpresion(gramaticaParser.ExpresionContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#asignacion}.
	 * @param ctx the parse tree
	 */
	void enterAsignacion(gramaticaParser.AsignacionContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#asignacion}.
	 * @param ctx the parse tree
	 */
	void exitAsignacion(gramaticaParser.AsignacionContext ctx);
}