package it.cnr.ilc.cophilab.languages.antlr;

// Generated from todo.g4 by ANTLR 4.9.3
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link todoParser}.
 */
public interface todoListener extends ParseTreeListener {
    /**
     * Enter a parse tree produced by {@link todoParser#elements}.
     * @param ctx the parse tree
     */
    void enterElements(todoParser.ElementsContext ctx);
    /**
     * Exit a parse tree produced by {@link todoParser#elements}.
     * @param ctx the parse tree
     */
    void exitElements(todoParser.ElementsContext ctx);
    /**
     * Enter a parse tree produced by {@link todoParser#element}.
     * @param ctx the parse tree
     */
    void enterElement(todoParser.ElementContext ctx);
    /**
     * Exit a parse tree produced by {@link todoParser#element}.
     * @param ctx the parse tree
     */
    void exitElement(todoParser.ElementContext ctx);
    /**
     * Enter a parse tree produced by {@link todoParser#emptyLine}.
     * @param ctx the parse tree
     */
    void enterEmptyLine(todoParser.EmptyLineContext ctx);
    /**
     * Exit a parse tree produced by {@link todoParser#emptyLine}.
     * @param ctx the parse tree
     */
    void exitEmptyLine(todoParser.EmptyLineContext ctx);
}
