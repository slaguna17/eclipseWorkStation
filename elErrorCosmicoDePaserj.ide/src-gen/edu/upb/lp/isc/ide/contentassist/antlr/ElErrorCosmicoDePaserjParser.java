/*
 * generated by Xtext 2.21.0
 */
package edu.upb.lp.isc.ide.contentassist.antlr;

import com.google.common.collect.ImmutableMap;
import com.google.inject.Inject;
import com.google.inject.Singleton;
import edu.upb.lp.isc.ide.contentassist.antlr.internal.InternalElErrorCosmicoDePaserjParser;
import edu.upb.lp.isc.services.ElErrorCosmicoDePaserjGrammarAccess;
import java.util.Map;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.AbstractContentAssistParser;

public class ElErrorCosmicoDePaserjParser extends AbstractContentAssistParser {

	@Singleton
	public static final class NameMappings {
		
		private final Map<AbstractElement, String> mappings;
		
		@Inject
		public NameMappings(ElErrorCosmicoDePaserjGrammarAccess grammarAccess) {
			ImmutableMap.Builder<AbstractElement, String> builder = ImmutableMap.builder();
			init(builder, grammarAccess);
			this.mappings = builder.build();
		}
		
		public String getRuleName(AbstractElement element) {
			return mappings.get(element);
		}
		
		private static void init(ImmutableMap.Builder<AbstractElement, String> builder, ElErrorCosmicoDePaserjGrammarAccess grammarAccess) {
			builder.put(grammarAccess.getExpressionAccess().getAlternatives(), "rule__Expression__Alternatives");
			builder.put(grammarAccess.getArithExpressionAccess().getOpAlternatives_1_0(), "rule__ArithExpression__OpAlternatives_1_0");
			builder.put(grammarAccess.getBooleanExpressionAccess().getAlternatives(), "rule__BooleanExpression__Alternatives");
			builder.put(grammarAccess.getBooleanConstantAccess().getAlternatives(), "rule__BooleanConstant__Alternatives");
			builder.put(grammarAccess.getBooleanOpExpressionAccess().getOpAlternatives_1_0(), "rule__BooleanOpExpression__OpAlternatives_1_0");
			builder.put(grammarAccess.getComparisonExpressionAccess().getEvaluatorAlternatives_1_0(), "rule__ComparisonExpression__EvaluatorAlternatives_1_0");
			builder.put(grammarAccess.getListOperationExpressionAccess().getAlternatives(), "rule__ListOperationExpression__Alternatives");
			builder.put(grammarAccess.getMyRacketProgramAccess().getGroup(), "rule__MyRacketProgram__Group__0");
			builder.put(grammarAccess.getMyRacketProgramAccess().getGroup_0(), "rule__MyRacketProgram__Group_0__0");
			builder.put(grammarAccess.getDefineAccess().getGroup(), "rule__Define__Group__0");
			builder.put(grammarAccess.getArithExpressionAccess().getGroup(), "rule__ArithExpression__Group__0");
			builder.put(grammarAccess.getIfExpressionAccess().getGroup(), "rule__IfExpression__Group__0");
			builder.put(grammarAccess.getFunctionCallExpressionAccess().getGroup(), "rule__FunctionCallExpression__Group__0");
			builder.put(grammarAccess.getBooleanConstantAccess().getGroup_1(), "rule__BooleanConstant__Group_1__0");
			builder.put(grammarAccess.getBooleanOpExpressionAccess().getGroup(), "rule__BooleanOpExpression__Group__0");
			builder.put(grammarAccess.getComparisonExpressionAccess().getGroup(), "rule__ComparisonExpression__Group__0");
			builder.put(grammarAccess.getStringEqualsExpressionAccess().getGroup(), "rule__StringEqualsExpression__Group__0");
			builder.put(grammarAccess.getListIsEmptyExpressionAccess().getGroup(), "rule__ListIsEmptyExpression__Group__0");
			builder.put(grammarAccess.getSimpleListAccess().getGroup(), "rule__SimpleList__Group__0");
			builder.put(grammarAccess.getLinkedListAccess().getGroup(), "rule__LinkedList__Group__0");
			builder.put(grammarAccess.getListHeadOpAccess().getGroup(), "rule__ListHeadOp__Group__0");
			builder.put(grammarAccess.getListTailOpAccess().getGroup(), "rule__ListTailOp__Group__0");
			builder.put(grammarAccess.getListConsOpAccess().getGroup(), "rule__ListConsOp__Group__0");
			builder.put(grammarAccess.getListLengthOpAccess().getGroup(), "rule__ListLengthOp__Group__0");
			builder.put(grammarAccess.getMyRacketProgramAccess().getDefinesAssignment_0_1(), "rule__MyRacketProgram__DefinesAssignment_0_1");
			builder.put(grammarAccess.getMyRacketProgramAccess().getExecutionsAssignment_2(), "rule__MyRacketProgram__ExecutionsAssignment_2");
			builder.put(grammarAccess.getDefineAccess().getNameAssignment_3(), "rule__Define__NameAssignment_3");
			builder.put(grammarAccess.getDefineAccess().getParamsAssignment_4(), "rule__Define__ParamsAssignment_4");
			builder.put(grammarAccess.getDefineAccess().getBodyAssignment_6(), "rule__Define__BodyAssignment_6");
			builder.put(grammarAccess.getIntExpressionAccess().getValueAssignment(), "rule__IntExpression__ValueAssignment");
			builder.put(grammarAccess.getArithExpressionAccess().getOpAssignment_1(), "rule__ArithExpression__OpAssignment_1");
			builder.put(grammarAccess.getArithExpressionAccess().getArgsAssignment_2(), "rule__ArithExpression__ArgsAssignment_2");
			builder.put(grammarAccess.getArithExpressionAccess().getArgsAssignment_3(), "rule__ArithExpression__ArgsAssignment_3");
			builder.put(grammarAccess.getIfExpressionAccess().getCondAssignment_2(), "rule__IfExpression__CondAssignment_2");
			builder.put(grammarAccess.getIfExpressionAccess().getThenAssignment_3(), "rule__IfExpression__ThenAssignment_3");
			builder.put(grammarAccess.getIfExpressionAccess().getSinoAssignment_4(), "rule__IfExpression__SinoAssignment_4");
			builder.put(grammarAccess.getFunctionCallExpressionAccess().getFunctionAssignment_1(), "rule__FunctionCallExpression__FunctionAssignment_1");
			builder.put(grammarAccess.getFunctionCallExpressionAccess().getArgsAssignment_2(), "rule__FunctionCallExpression__ArgsAssignment_2");
			builder.put(grammarAccess.getStringExpressionAccess().getStAssignment(), "rule__StringExpression__StAssignment");
			builder.put(grammarAccess.getParamsExpressionAccess().getNameAssignment(), "rule__ParamsExpression__NameAssignment");
			builder.put(grammarAccess.getParamsCallExpressionAccess().getFunctionAssignment(), "rule__ParamsCallExpression__FunctionAssignment");
			builder.put(grammarAccess.getBooleanConstantAccess().getBoolAssignment_0(), "rule__BooleanConstant__BoolAssignment_0");
			builder.put(grammarAccess.getBooleanOpExpressionAccess().getOpAssignment_1(), "rule__BooleanOpExpression__OpAssignment_1");
			builder.put(grammarAccess.getBooleanOpExpressionAccess().getArgsAssignment_2(), "rule__BooleanOpExpression__ArgsAssignment_2");
			builder.put(grammarAccess.getBooleanOpExpressionAccess().getArgsAssignment_3(), "rule__BooleanOpExpression__ArgsAssignment_3");
			builder.put(grammarAccess.getComparisonExpressionAccess().getEvaluatorAssignment_1(), "rule__ComparisonExpression__EvaluatorAssignment_1");
			builder.put(grammarAccess.getComparisonExpressionAccess().getArgsAssignment_2(), "rule__ComparisonExpression__ArgsAssignment_2");
			builder.put(grammarAccess.getComparisonExpressionAccess().getArgsAssignment_3(), "rule__ComparisonExpression__ArgsAssignment_3");
			builder.put(grammarAccess.getStringEqualsExpressionAccess().getOpAssignment_1(), "rule__StringEqualsExpression__OpAssignment_1");
			builder.put(grammarAccess.getStringEqualsExpressionAccess().getArgsAssignment_2(), "rule__StringEqualsExpression__ArgsAssignment_2");
			builder.put(grammarAccess.getStringEqualsExpressionAccess().getArgsAssignment_3(), "rule__StringEqualsExpression__ArgsAssignment_3");
			builder.put(grammarAccess.getListIsEmptyExpressionAccess().getListAssignment_2(), "rule__ListIsEmptyExpression__ListAssignment_2");
			builder.put(grammarAccess.getListExpressionAccess().getSimpleAssignment(), "rule__ListExpression__SimpleAssignment");
			builder.put(grammarAccess.getSimpleListAccess().getLinkedAssignment_2(), "rule__SimpleList__LinkedAssignment_2");
			builder.put(grammarAccess.getLinkedListAccess().getHeadAssignment_0(), "rule__LinkedList__HeadAssignment_0");
			builder.put(grammarAccess.getLinkedListAccess().getTailAssignment_1(), "rule__LinkedList__TailAssignment_1");
			builder.put(grammarAccess.getListHeadOpAccess().getListAssignment_2(), "rule__ListHeadOp__ListAssignment_2");
			builder.put(grammarAccess.getListTailOpAccess().getListAssignment_2(), "rule__ListTailOp__ListAssignment_2");
			builder.put(grammarAccess.getListConsOpAccess().getElemAssignment_2(), "rule__ListConsOp__ElemAssignment_2");
			builder.put(grammarAccess.getListConsOpAccess().getListAssignment_3(), "rule__ListConsOp__ListAssignment_3");
			builder.put(grammarAccess.getListLengthOpAccess().getListAssignment_2(), "rule__ListLengthOp__ListAssignment_2");
		}
	}
	
	@Inject
	private NameMappings nameMappings;

	@Inject
	private ElErrorCosmicoDePaserjGrammarAccess grammarAccess;

	@Override
	protected InternalElErrorCosmicoDePaserjParser createParser() {
		InternalElErrorCosmicoDePaserjParser result = new InternalElErrorCosmicoDePaserjParser(null);
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

	public ElErrorCosmicoDePaserjGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(ElErrorCosmicoDePaserjGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
	
	public NameMappings getNameMappings() {
		return nameMappings;
	}
	
	public void setNameMappings(NameMappings nameMappings) {
		this.nameMappings = nameMappings;
	}
}
