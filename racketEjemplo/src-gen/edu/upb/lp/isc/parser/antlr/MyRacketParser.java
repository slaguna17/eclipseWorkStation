/*
 * generated by Xtext 2.21.0
 */
package edu.upb.lp.isc.parser.antlr;

import com.google.inject.Inject;
import edu.upb.lp.isc.parser.antlr.internal.InternalMyRacketParser;
import edu.upb.lp.isc.services.MyRacketGrammarAccess;
import org.eclipse.xtext.parser.antlr.AbstractAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;

public class MyRacketParser extends AbstractAntlrParser {

	@Inject
	private MyRacketGrammarAccess grammarAccess;

	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
	}
	

	@Override
	protected InternalMyRacketParser createParser(XtextTokenStream stream) {
		return new InternalMyRacketParser(stream, getGrammarAccess());
	}

	@Override 
	protected String getDefaultRuleName() {
		return "MyRacketProgram";
	}

	public MyRacketGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(MyRacketGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}