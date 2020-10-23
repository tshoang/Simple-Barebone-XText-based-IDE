/*
 * generated by Xtext 2.22.0
 */
package ac.soton.java.barebones.parser.antlr;

import ac.soton.java.barebones.parser.antlr.internal.InternalBareBonesParser;
import ac.soton.java.barebones.services.BareBonesGrammarAccess;
import com.google.inject.Inject;
import org.eclipse.xtext.parser.antlr.AbstractAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;

public class BareBonesParser extends AbstractAntlrParser {

	@Inject
	private BareBonesGrammarAccess grammarAccess;

	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
	}
	

	@Override
	protected InternalBareBonesParser createParser(XtextTokenStream stream) {
		return new InternalBareBonesParser(stream, getGrammarAccess());
	}

	@Override 
	protected String getDefaultRuleName() {
		return "Program";
	}

	public BareBonesGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(BareBonesGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
