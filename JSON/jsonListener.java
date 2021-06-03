// Generated from JSON/json.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link jsonParser}.
 */
public interface jsonListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link jsonParser#regle_json}.
	 * @param ctx the parse tree
	 */
	void enterRegle_json(jsonParser.Regle_jsonContext ctx);
	/**
	 * Exit a parse tree produced by {@link jsonParser#regle_json}.
	 * @param ctx the parse tree
	 */
	void exitRegle_json(jsonParser.Regle_jsonContext ctx);
	/**
	 * Enter a parse tree produced by {@link jsonParser#element}.
	 * @param ctx the parse tree
	 */
	void enterElement(jsonParser.ElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link jsonParser#element}.
	 * @param ctx the parse tree
	 */
	void exitElement(jsonParser.ElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link jsonParser#booleen}.
	 * @param ctx the parse tree
	 */
	void enterBooleen(jsonParser.BooleenContext ctx);
	/**
	 * Exit a parse tree produced by {@link jsonParser#booleen}.
	 * @param ctx the parse tree
	 */
	void exitBooleen(jsonParser.BooleenContext ctx);
	/**
	 * Enter a parse tree produced by {@link jsonParser#type_null}.
	 * @param ctx the parse tree
	 */
	void enterType_null(jsonParser.Type_nullContext ctx);
	/**
	 * Exit a parse tree produced by {@link jsonParser#type_null}.
	 * @param ctx the parse tree
	 */
	void exitType_null(jsonParser.Type_nullContext ctx);
	/**
	 * Enter a parse tree produced by {@link jsonParser#tableau}.
	 * @param ctx the parse tree
	 */
	void enterTableau(jsonParser.TableauContext ctx);
	/**
	 * Exit a parse tree produced by {@link jsonParser#tableau}.
	 * @param ctx the parse tree
	 */
	void exitTableau(jsonParser.TableauContext ctx);
	/**
	 * Enter a parse tree produced by {@link jsonParser#objet}.
	 * @param ctx the parse tree
	 */
	void enterObjet(jsonParser.ObjetContext ctx);
	/**
	 * Exit a parse tree produced by {@link jsonParser#objet}.
	 * @param ctx the parse tree
	 */
	void exitObjet(jsonParser.ObjetContext ctx);
	/**
	 * Enter a parse tree produced by {@link jsonParser#couple_membre}.
	 * @param ctx the parse tree
	 */
	void enterCouple_membre(jsonParser.Couple_membreContext ctx);
	/**
	 * Exit a parse tree produced by {@link jsonParser#couple_membre}.
	 * @param ctx the parse tree
	 */
	void exitCouple_membre(jsonParser.Couple_membreContext ctx);
}