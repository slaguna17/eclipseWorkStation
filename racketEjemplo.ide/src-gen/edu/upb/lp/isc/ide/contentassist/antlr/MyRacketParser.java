/*
 * generated by Xtext 2.21.0
 */
package edu.upb.lp.isc.ide.contentassist.antlr;

import com.google.common.collect.ImmutableMap;
import com.google.inject.Inject;
import com.google.inject.Singleton;
import edu.upb.lp.isc.ide.contentassist.antlr.internal.InternalMyRacketParser;
import edu.upb.lp.isc.services.MyRacketGrammarAccess;
import java.util.Map;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.AbstractContentAssistParser;

public class MyRacketParser extends AbstractContentAssistParser {

	@Singleton
	public static final class NameMappings {
		
		private final Map<AbstractElement, String> mappings;
		
		@Inject
		public NameMappings(MyRacketGrammarAccess grammarAccess) {
			ImmutableMap.Builder<AbstractElement, String> builder = ImmutableMap.builder();
			init(builder, grammarAccess);
			this.mappings = builder.build();
		}
		
		public String getRuleName(AbstractElement element) {
			return mappings.get(element);
		}
		
		private static void init(ImmutableMap.Builder<AbstractElement, String> builder, MyRacketGrammarAccess grammarAccess) {
			builder.put(grammarAccess.getMyRacketProgramAccess().getGroup(), "rule__MyRacketProgram__Group__0");
			builder.put(grammarAccess.getMyRacketProgramAccess().getGroup_0(), "rule__MyRacketProgram__Group_0__0");
			builder.put(grammarAccess.getDefineAccess().getGroup(), "rule__Define__Group__0");
			builder.put(grammarAccess.getMyRacketProgramAccess().getDefinesAssignment_0_1(), "rule__MyRacketProgram__DefinesAssignment_0_1");
			builder.put(grammarAccess.getMyRacketProgramAccess().getExecutionsAssignment_2(), "rule__MyRacketProgram__ExecutionsAssignment_2");
			builder.put(grammarAccess.getDefineAccess().getNameAssignment_3(), "rule__Define__NameAssignment_3");
			builder.put(grammarAccess.getDefineAccess().getParamsAssignment_4(), "rule__Define__ParamsAssignment_4");
			builder.put(grammarAccess.getDefineAccess().getBodyAssignment_6(), "rule__Define__BodyAssignment_6");
		}
	}
	
	@Inject
	private NameMappings nameMappings;

	@Inject
	private MyRacketGrammarAccess grammarAccess;

	@Override
	protected InternalMyRacketParser createParser() {
		InternalMyRacketParser result = new InternalMyRacketParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}

	@Override
	protected String getRuleName(AbstractElement element) {
		return nameMappings.getRuleName(element);
	}

	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}

	public MyRacketGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(MyRacketGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
	
	public NameMappings getNameMappings() {
		return nameMappings;
	}
	
	public void setNameMappings(NameMappings nameMappings) {
		this.nameMappings = nameMappings;
	}
}
