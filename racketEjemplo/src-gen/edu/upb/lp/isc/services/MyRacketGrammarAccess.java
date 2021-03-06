/*
 * generated by Xtext 2.21.0
 */
package edu.upb.lp.isc.services;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.List;
import org.eclipse.xtext.Assignment;
import org.eclipse.xtext.Grammar;
import org.eclipse.xtext.GrammarUtil;
import org.eclipse.xtext.Group;
import org.eclipse.xtext.Keyword;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.TerminalRule;
import org.eclipse.xtext.common.services.TerminalsGrammarAccess;
import org.eclipse.xtext.service.AbstractElementFinder.AbstractGrammarElementFinder;
import org.eclipse.xtext.service.GrammarProvider;

@Singleton
public class MyRacketGrammarAccess extends AbstractGrammarElementFinder {
	
	public class MyRacketProgramElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "edu.upb.lp.isc.MyRacket.MyRacketProgram");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Group cGroup_0 = (Group)cGroup.eContents().get(0);
		private final Keyword cDefinitionsKeyword_0_0 = (Keyword)cGroup_0.eContents().get(0);
		private final Assignment cDefinesAssignment_0_1 = (Assignment)cGroup_0.eContents().get(1);
		private final RuleCall cDefinesDefineParserRuleCall_0_1_0 = (RuleCall)cDefinesAssignment_0_1.eContents().get(0);
		private final Keyword cExecutionsKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cExecutionsAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cExecutionsExpressionParserRuleCall_2_0 = (RuleCall)cExecutionsAssignment_2.eContents().get(0);
		
		//MyRacketProgram:
		//	("Definitions"
		//	defines+=Define+)?
		//	"Executions"
		//	executions+=Expression+;
		@Override public ParserRule getRule() { return rule; }
		
		//("Definitions" defines+=Define+)? "Executions" executions+=Expression+
		public Group getGroup() { return cGroup; }
		
		//("Definitions" defines+=Define+)?
		public Group getGroup_0() { return cGroup_0; }
		
		//"Definitions"
		public Keyword getDefinitionsKeyword_0_0() { return cDefinitionsKeyword_0_0; }
		
		//defines+=Define+
		public Assignment getDefinesAssignment_0_1() { return cDefinesAssignment_0_1; }
		
		//Define
		public RuleCall getDefinesDefineParserRuleCall_0_1_0() { return cDefinesDefineParserRuleCall_0_1_0; }
		
		//"Executions"
		public Keyword getExecutionsKeyword_1() { return cExecutionsKeyword_1; }
		
		//executions+=Expression+
		public Assignment getExecutionsAssignment_2() { return cExecutionsAssignment_2; }
		
		//Expression
		public RuleCall getExecutionsExpressionParserRuleCall_2_0() { return cExecutionsExpressionParserRuleCall_2_0; }
	}
	public class DefineElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "edu.upb.lp.isc.MyRacket.Define");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cLeftParenthesisKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cDefineKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Keyword cLeftParenthesisKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cNameAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cNameIDTerminalRuleCall_3_0 = (RuleCall)cNameAssignment_3.eContents().get(0);
		private final Assignment cParamsAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cParamsIDTerminalRuleCall_4_0 = (RuleCall)cParamsAssignment_4.eContents().get(0);
		private final Keyword cRightParenthesisKeyword_5 = (Keyword)cGroup.eContents().get(5);
		private final Assignment cBodyAssignment_6 = (Assignment)cGroup.eContents().get(6);
		private final RuleCall cBodyExpressionParserRuleCall_6_0 = (RuleCall)cBodyAssignment_6.eContents().get(0);
		private final Keyword cRightParenthesisKeyword_7 = (Keyword)cGroup.eContents().get(7);
		
		//Define:
		//	"(" "define" "(" name=ID params+=ID* ")" body=Expression ")";
		@Override public ParserRule getRule() { return rule; }
		
		//"(" "define" "(" name=ID params+=ID* ")" body=Expression ")"
		public Group getGroup() { return cGroup; }
		
		//"("
		public Keyword getLeftParenthesisKeyword_0() { return cLeftParenthesisKeyword_0; }
		
		//"define"
		public Keyword getDefineKeyword_1() { return cDefineKeyword_1; }
		
		//"("
		public Keyword getLeftParenthesisKeyword_2() { return cLeftParenthesisKeyword_2; }
		
		//name=ID
		public Assignment getNameAssignment_3() { return cNameAssignment_3; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_3_0() { return cNameIDTerminalRuleCall_3_0; }
		
		//params+=ID*
		public Assignment getParamsAssignment_4() { return cParamsAssignment_4; }
		
		//ID
		public RuleCall getParamsIDTerminalRuleCall_4_0() { return cParamsIDTerminalRuleCall_4_0; }
		
		//")"
		public Keyword getRightParenthesisKeyword_5() { return cRightParenthesisKeyword_5; }
		
		//body=Expression
		public Assignment getBodyAssignment_6() { return cBodyAssignment_6; }
		
		//Expression
		public RuleCall getBodyExpressionParserRuleCall_6_0() { return cBodyExpressionParserRuleCall_6_0; }
		
		//")"
		public Keyword getRightParenthesisKeyword_7() { return cRightParenthesisKeyword_7; }
	}
	public class ExpressionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "edu.upb.lp.isc.MyRacket.Expression");
		private final Keyword cTODOKeyword = (Keyword)rule.eContents().get(1);
		
		//Expression:
		//	"TODO";
		@Override public ParserRule getRule() { return rule; }
		
		//"TODO"
		public Keyword getTODOKeyword() { return cTODOKeyword; }
	}
	
	
	private final MyRacketProgramElements pMyRacketProgram;
	private final DefineElements pDefine;
	private final ExpressionElements pExpression;
	
	private final Grammar grammar;
	
	private final TerminalsGrammarAccess gaTerminals;

	@Inject
	public MyRacketGrammarAccess(GrammarProvider grammarProvider,
			TerminalsGrammarAccess gaTerminals) {
		this.grammar = internalFindGrammar(grammarProvider);
		this.gaTerminals = gaTerminals;
		this.pMyRacketProgram = new MyRacketProgramElements();
		this.pDefine = new DefineElements();
		this.pExpression = new ExpressionElements();
	}
	
	protected Grammar internalFindGrammar(GrammarProvider grammarProvider) {
		Grammar grammar = grammarProvider.getGrammar(this);
		while (grammar != null) {
			if ("edu.upb.lp.isc.MyRacket".equals(grammar.getName())) {
				return grammar;
			}
			List<Grammar> grammars = grammar.getUsedGrammars();
			if (!grammars.isEmpty()) {
				grammar = grammars.iterator().next();
			} else {
				return null;
			}
		}
		return grammar;
	}
	
	@Override
	public Grammar getGrammar() {
		return grammar;
	}
	
	
	public TerminalsGrammarAccess getTerminalsGrammarAccess() {
		return gaTerminals;
	}

	
	//MyRacketProgram:
	//	("Definitions"
	//	defines+=Define+)?
	//	"Executions"
	//	executions+=Expression+;
	public MyRacketProgramElements getMyRacketProgramAccess() {
		return pMyRacketProgram;
	}
	
	public ParserRule getMyRacketProgramRule() {
		return getMyRacketProgramAccess().getRule();
	}
	
	//Define:
	//	"(" "define" "(" name=ID params+=ID* ")" body=Expression ")";
	public DefineElements getDefineAccess() {
		return pDefine;
	}
	
	public ParserRule getDefineRule() {
		return getDefineAccess().getRule();
	}
	
	//Expression:
	//	"TODO";
	public ExpressionElements getExpressionAccess() {
		return pExpression;
	}
	
	public ParserRule getExpressionRule() {
		return getExpressionAccess().getRule();
	}
	
	//terminal ID:
	//	'^'? ('a'..'z' | 'A'..'Z' | '_') ('a'..'z' | 'A'..'Z' | '_' | '0'..'9')*;
	public TerminalRule getIDRule() {
		return gaTerminals.getIDRule();
	}
	
	//terminal INT returns ecore::EInt:
	//	'0'..'9'+;
	public TerminalRule getINTRule() {
		return gaTerminals.getINTRule();
	}
	
	//terminal STRING:
	//	'"' ('\\' . | !('\\' | '"'))* '"' | "'" ('\\' . | !('\\' | "'"))* "'";
	public TerminalRule getSTRINGRule() {
		return gaTerminals.getSTRINGRule();
	}
	
	//terminal ML_COMMENT:
	//	'/*'->'*/';
	public TerminalRule getML_COMMENTRule() {
		return gaTerminals.getML_COMMENTRule();
	}
	
	//terminal SL_COMMENT:
	//	'//' !('\n' | '\r')* ('\r'? '\n')?;
	public TerminalRule getSL_COMMENTRule() {
		return gaTerminals.getSL_COMMENTRule();
	}
	
	//terminal WS:
	//	' ' | '\t' | '\r' | '\n'+;
	public TerminalRule getWSRule() {
		return gaTerminals.getWSRule();
	}
	
	//terminal ANY_OTHER:
	//	.;
	public TerminalRule getANY_OTHERRule() {
		return gaTerminals.getANY_OTHERRule();
	}
}
