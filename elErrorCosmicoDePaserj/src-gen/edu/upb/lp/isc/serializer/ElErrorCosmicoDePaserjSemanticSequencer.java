/*
 * generated by Xtext 2.21.0
 */
package edu.upb.lp.isc.serializer;

import com.google.inject.Inject;
import edu.upb.lp.isc.elErrorCosmicoDePaserj.ArithExpression;
import edu.upb.lp.isc.elErrorCosmicoDePaserj.BooleanConstant;
import edu.upb.lp.isc.elErrorCosmicoDePaserj.BooleanOpExpression;
import edu.upb.lp.isc.elErrorCosmicoDePaserj.ComparisonExpression;
import edu.upb.lp.isc.elErrorCosmicoDePaserj.Define;
import edu.upb.lp.isc.elErrorCosmicoDePaserj.ElErrorCosmicoDePaserjPackage;
import edu.upb.lp.isc.elErrorCosmicoDePaserj.FunctionCallExpression;
import edu.upb.lp.isc.elErrorCosmicoDePaserj.IfExpression;
import edu.upb.lp.isc.elErrorCosmicoDePaserj.IntExpression;
import edu.upb.lp.isc.elErrorCosmicoDePaserj.LinkedList;
import edu.upb.lp.isc.elErrorCosmicoDePaserj.ListConsOp;
import edu.upb.lp.isc.elErrorCosmicoDePaserj.ListExpression;
import edu.upb.lp.isc.elErrorCosmicoDePaserj.ListHeadOp;
import edu.upb.lp.isc.elErrorCosmicoDePaserj.ListIsEmptyExpression;
import edu.upb.lp.isc.elErrorCosmicoDePaserj.ListLengthOp;
import edu.upb.lp.isc.elErrorCosmicoDePaserj.ListTailOp;
import edu.upb.lp.isc.elErrorCosmicoDePaserj.MyRacketProgram;
import edu.upb.lp.isc.elErrorCosmicoDePaserj.ParamsCallExpression;
import edu.upb.lp.isc.elErrorCosmicoDePaserj.ParamsExpression;
import edu.upb.lp.isc.elErrorCosmicoDePaserj.SimpleList;
import edu.upb.lp.isc.elErrorCosmicoDePaserj.StringEqualsExpression;
import edu.upb.lp.isc.elErrorCosmicoDePaserj.StringExpression;
import edu.upb.lp.isc.services.ElErrorCosmicoDePaserjGrammarAccess;
import java.util.Set;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Parameter;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.serializer.ISerializationContext;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;

@SuppressWarnings("all")
public class ElErrorCosmicoDePaserjSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private ElErrorCosmicoDePaserjGrammarAccess grammarAccess;
	
	@Override
	public void sequence(ISerializationContext context, EObject semanticObject) {
		EPackage epackage = semanticObject.eClass().getEPackage();
		ParserRule rule = context.getParserRule();
		Action action = context.getAssignedAction();
		Set<Parameter> parameters = context.getEnabledBooleanParameters();
		if (epackage == ElErrorCosmicoDePaserjPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case ElErrorCosmicoDePaserjPackage.ARITH_EXPRESSION:
				sequence_ArithExpression(context, (ArithExpression) semanticObject); 
				return; 
			case ElErrorCosmicoDePaserjPackage.BOOLEAN_CONSTANT:
				sequence_BooleanConstant(context, (BooleanConstant) semanticObject); 
				return; 
			case ElErrorCosmicoDePaserjPackage.BOOLEAN_OP_EXPRESSION:
				sequence_BooleanOpExpression(context, (BooleanOpExpression) semanticObject); 
				return; 
			case ElErrorCosmicoDePaserjPackage.COMPARISON_EXPRESSION:
				sequence_ComparisonExpression(context, (ComparisonExpression) semanticObject); 
				return; 
			case ElErrorCosmicoDePaserjPackage.DEFINE:
				sequence_Define(context, (Define) semanticObject); 
				return; 
			case ElErrorCosmicoDePaserjPackage.FUNCTION_CALL_EXPRESSION:
				sequence_FunctionCallExpression(context, (FunctionCallExpression) semanticObject); 
				return; 
			case ElErrorCosmicoDePaserjPackage.IF_EXPRESSION:
				sequence_IfExpression(context, (IfExpression) semanticObject); 
				return; 
			case ElErrorCosmicoDePaserjPackage.INT_EXPRESSION:
				sequence_IntExpression(context, (IntExpression) semanticObject); 
				return; 
			case ElErrorCosmicoDePaserjPackage.LINKED_LIST:
				sequence_LinkedList(context, (LinkedList) semanticObject); 
				return; 
			case ElErrorCosmicoDePaserjPackage.LIST_CONS_OP:
				sequence_ListConsOp(context, (ListConsOp) semanticObject); 
				return; 
			case ElErrorCosmicoDePaserjPackage.LIST_EXPRESSION:
				sequence_ListExpression(context, (ListExpression) semanticObject); 
				return; 
			case ElErrorCosmicoDePaserjPackage.LIST_HEAD_OP:
				sequence_ListHeadOp(context, (ListHeadOp) semanticObject); 
				return; 
			case ElErrorCosmicoDePaserjPackage.LIST_IS_EMPTY_EXPRESSION:
				sequence_ListIsEmptyExpression(context, (ListIsEmptyExpression) semanticObject); 
				return; 
			case ElErrorCosmicoDePaserjPackage.LIST_LENGTH_OP:
				sequence_ListLengthOp(context, (ListLengthOp) semanticObject); 
				return; 
			case ElErrorCosmicoDePaserjPackage.LIST_TAIL_OP:
				sequence_ListTailOp(context, (ListTailOp) semanticObject); 
				return; 
			case ElErrorCosmicoDePaserjPackage.MY_RACKET_PROGRAM:
				sequence_MyRacketProgram(context, (MyRacketProgram) semanticObject); 
				return; 
			case ElErrorCosmicoDePaserjPackage.PARAMS_CALL_EXPRESSION:
				sequence_ParamsCallExpression(context, (ParamsCallExpression) semanticObject); 
				return; 
			case ElErrorCosmicoDePaserjPackage.PARAMS_EXPRESSION:
				sequence_ParamsExpression(context, (ParamsExpression) semanticObject); 
				return; 
			case ElErrorCosmicoDePaserjPackage.SIMPLE_LIST:
				sequence_SimpleList(context, (SimpleList) semanticObject); 
				return; 
			case ElErrorCosmicoDePaserjPackage.STRING_EQUALS_EXPRESSION:
				sequence_StringEqualsExpression(context, (StringEqualsExpression) semanticObject); 
				return; 
			case ElErrorCosmicoDePaserjPackage.STRING_EXPRESSION:
				sequence_StringExpression(context, (StringExpression) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Contexts:
	 *     Expression returns ArithExpression
	 *     ArithExpression returns ArithExpression
	 *
	 * Constraint:
	 *     ((op='+' | op='-' | op='*' | op='/') args+=Expression args+=Expression+)
	 */
	protected void sequence_ArithExpression(ISerializationContext context, ArithExpression semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Expression returns BooleanConstant
	 *     BooleanExpression returns BooleanConstant
	 *     BooleanConstant returns BooleanConstant
	 *
	 * Constraint:
	 *     bool?='true'?
	 */
	protected void sequence_BooleanConstant(ISerializationContext context, BooleanConstant semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Expression returns BooleanOpExpression
	 *     BooleanExpression returns BooleanOpExpression
	 *     BooleanOpExpression returns BooleanOpExpression
	 *
	 * Constraint:
	 *     ((op='AND' | op='OR') args+=BooleanExpression args+=BooleanExpression+)
	 */
	protected void sequence_BooleanOpExpression(ISerializationContext context, BooleanOpExpression semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Expression returns ComparisonExpression
	 *     BooleanExpression returns ComparisonExpression
	 *     ComparisonExpression returns ComparisonExpression
	 *
	 * Constraint:
	 *     ((evaluator='>' | evaluator='<' | evaluator='equal' | evaluator='>=' | evaluator='<=') args+=IntExpression args+=IntExpression+)
	 */
	protected void sequence_ComparisonExpression(ISerializationContext context, ComparisonExpression semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Define returns Define
	 *
	 * Constraint:
	 *     (name=ID params+=ParamsExpression* body=Expression)
	 */
	protected void sequence_Define(ISerializationContext context, Define semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Expression returns FunctionCallExpression
	 *     FunctionCallExpression returns FunctionCallExpression
	 *
	 * Constraint:
	 *     (function=[Define|ID] args+=Expression*)
	 */
	protected void sequence_FunctionCallExpression(ISerializationContext context, FunctionCallExpression semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Expression returns IfExpression
	 *     IfExpression returns IfExpression
	 *
	 * Constraint:
	 *     (cond=BooleanExpression then=Expression sino=Expression)
	 */
	protected void sequence_IfExpression(ISerializationContext context, IfExpression semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, ElErrorCosmicoDePaserjPackage.Literals.IF_EXPRESSION__COND) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ElErrorCosmicoDePaserjPackage.Literals.IF_EXPRESSION__COND));
			if (transientValues.isValueTransient(semanticObject, ElErrorCosmicoDePaserjPackage.Literals.IF_EXPRESSION__THEN) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ElErrorCosmicoDePaserjPackage.Literals.IF_EXPRESSION__THEN));
			if (transientValues.isValueTransient(semanticObject, ElErrorCosmicoDePaserjPackage.Literals.IF_EXPRESSION__SINO) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ElErrorCosmicoDePaserjPackage.Literals.IF_EXPRESSION__SINO));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getIfExpressionAccess().getCondBooleanExpressionParserRuleCall_2_0(), semanticObject.getCond());
		feeder.accept(grammarAccess.getIfExpressionAccess().getThenExpressionParserRuleCall_3_0(), semanticObject.getThen());
		feeder.accept(grammarAccess.getIfExpressionAccess().getSinoExpressionParserRuleCall_4_0(), semanticObject.getSino());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Expression returns IntExpression
	 *     SimpleExpression returns IntExpression
	 *     IntExpression returns IntExpression
	 *
	 * Constraint:
	 *     value=INT
	 */
	protected void sequence_IntExpression(ISerializationContext context, IntExpression semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, ElErrorCosmicoDePaserjPackage.Literals.INT_EXPRESSION__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ElErrorCosmicoDePaserjPackage.Literals.INT_EXPRESSION__VALUE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getIntExpressionAccess().getValueINTTerminalRuleCall_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     LinkedList returns LinkedList
	 *
	 * Constraint:
	 *     (head=Expression tail+=Expression*)
	 */
	protected void sequence_LinkedList(ISerializationContext context, LinkedList semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Expression returns ListConsOp
	 *     ListOperationExpression returns ListConsOp
	 *     ListConsOp returns ListConsOp
	 *
	 * Constraint:
	 *     (elem=Expression list=LinkedList)
	 */
	protected void sequence_ListConsOp(ISerializationContext context, ListConsOp semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, ElErrorCosmicoDePaserjPackage.Literals.LIST_CONS_OP__ELEM) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ElErrorCosmicoDePaserjPackage.Literals.LIST_CONS_OP__ELEM));
			if (transientValues.isValueTransient(semanticObject, ElErrorCosmicoDePaserjPackage.Literals.LIST_OPERATION_EXPRESSION__LIST) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ElErrorCosmicoDePaserjPackage.Literals.LIST_OPERATION_EXPRESSION__LIST));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getListConsOpAccess().getElemExpressionParserRuleCall_2_0(), semanticObject.getElem());
		feeder.accept(grammarAccess.getListConsOpAccess().getListLinkedListParserRuleCall_3_0(), semanticObject.getList());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Expression returns ListExpression
	 *     ListExpression returns ListExpression
	 *
	 * Constraint:
	 *     simple=SimpleList
	 */
	protected void sequence_ListExpression(ISerializationContext context, ListExpression semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, ElErrorCosmicoDePaserjPackage.Literals.LIST_EXPRESSION__SIMPLE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ElErrorCosmicoDePaserjPackage.Literals.LIST_EXPRESSION__SIMPLE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getListExpressionAccess().getSimpleSimpleListParserRuleCall_0(), semanticObject.getSimple());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Expression returns ListHeadOp
	 *     ListOperationExpression returns ListHeadOp
	 *     ListHeadOp returns ListHeadOp
	 *
	 * Constraint:
	 *     list=LinkedList
	 */
	protected void sequence_ListHeadOp(ISerializationContext context, ListHeadOp semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, ElErrorCosmicoDePaserjPackage.Literals.LIST_OPERATION_EXPRESSION__LIST) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ElErrorCosmicoDePaserjPackage.Literals.LIST_OPERATION_EXPRESSION__LIST));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getListHeadOpAccess().getListLinkedListParserRuleCall_2_0(), semanticObject.getList());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Expression returns ListIsEmptyExpression
	 *     BooleanExpression returns ListIsEmptyExpression
	 *     ListIsEmptyExpression returns ListIsEmptyExpression
	 *
	 * Constraint:
	 *     list=LinkedList
	 */
	protected void sequence_ListIsEmptyExpression(ISerializationContext context, ListIsEmptyExpression semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, ElErrorCosmicoDePaserjPackage.Literals.LIST_IS_EMPTY_EXPRESSION__LIST) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ElErrorCosmicoDePaserjPackage.Literals.LIST_IS_EMPTY_EXPRESSION__LIST));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getListIsEmptyExpressionAccess().getListLinkedListParserRuleCall_2_0(), semanticObject.getList());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Expression returns ListLengthOp
	 *     ListOperationExpression returns ListLengthOp
	 *     ListLengthOp returns ListLengthOp
	 *
	 * Constraint:
	 *     list=LinkedList
	 */
	protected void sequence_ListLengthOp(ISerializationContext context, ListLengthOp semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, ElErrorCosmicoDePaserjPackage.Literals.LIST_OPERATION_EXPRESSION__LIST) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ElErrorCosmicoDePaserjPackage.Literals.LIST_OPERATION_EXPRESSION__LIST));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getListLengthOpAccess().getListLinkedListParserRuleCall_2_0(), semanticObject.getList());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Expression returns ListTailOp
	 *     ListOperationExpression returns ListTailOp
	 *     ListTailOp returns ListTailOp
	 *
	 * Constraint:
	 *     list=LinkedList
	 */
	protected void sequence_ListTailOp(ISerializationContext context, ListTailOp semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, ElErrorCosmicoDePaserjPackage.Literals.LIST_OPERATION_EXPRESSION__LIST) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ElErrorCosmicoDePaserjPackage.Literals.LIST_OPERATION_EXPRESSION__LIST));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getListTailOpAccess().getListLinkedListParserRuleCall_2_0(), semanticObject.getList());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     MyRacketProgram returns MyRacketProgram
	 *
	 * Constraint:
	 *     (defines+=Define* executions+=Expression+)
	 */
	protected void sequence_MyRacketProgram(ISerializationContext context, MyRacketProgram semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Expression returns ParamsCallExpression
	 *     ParamsCallExpression returns ParamsCallExpression
	 *
	 * Constraint:
	 *     function=[ParamsExpression|ID]
	 */
	protected void sequence_ParamsCallExpression(ISerializationContext context, ParamsCallExpression semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, ElErrorCosmicoDePaserjPackage.Literals.PARAMS_CALL_EXPRESSION__FUNCTION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ElErrorCosmicoDePaserjPackage.Literals.PARAMS_CALL_EXPRESSION__FUNCTION));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getParamsCallExpressionAccess().getFunctionParamsExpressionIDTerminalRuleCall_0_1(), semanticObject.eGet(ElErrorCosmicoDePaserjPackage.Literals.PARAMS_CALL_EXPRESSION__FUNCTION, false));
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     ParamsExpression returns ParamsExpression
	 *
	 * Constraint:
	 *     name=ID
	 */
	protected void sequence_ParamsExpression(ISerializationContext context, ParamsExpression semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, ElErrorCosmicoDePaserjPackage.Literals.PARAMS_EXPRESSION__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ElErrorCosmicoDePaserjPackage.Literals.PARAMS_EXPRESSION__NAME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getParamsExpressionAccess().getNameIDTerminalRuleCall_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     SimpleList returns SimpleList
	 *
	 * Constraint:
	 *     linked=LinkedList?
	 */
	protected void sequence_SimpleList(ISerializationContext context, SimpleList semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Expression returns StringEqualsExpression
	 *     BooleanExpression returns StringEqualsExpression
	 *     StringEqualsExpression returns StringEqualsExpression
	 *
	 * Constraint:
	 *     (op='equal?' args+=StringExpression args+=StringExpression)
	 */
	protected void sequence_StringEqualsExpression(ISerializationContext context, StringEqualsExpression semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Expression returns StringExpression
	 *     StringExpression returns StringExpression
	 *
	 * Constraint:
	 *     st=STRING
	 */
	protected void sequence_StringExpression(ISerializationContext context, StringExpression semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, ElErrorCosmicoDePaserjPackage.Literals.STRING_EXPRESSION__ST) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ElErrorCosmicoDePaserjPackage.Literals.STRING_EXPRESSION__ST));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getStringExpressionAccess().getStSTRINGTerminalRuleCall_0(), semanticObject.getSt());
		feeder.finish();
	}
	
	
}
