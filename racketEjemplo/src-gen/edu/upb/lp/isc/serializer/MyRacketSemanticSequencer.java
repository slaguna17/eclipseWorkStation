/*
 * generated by Xtext 2.21.0
 */
package edu.upb.lp.isc.serializer;

import com.google.inject.Inject;
import edu.upb.lp.isc.myRacket.Define;
import edu.upb.lp.isc.myRacket.MyRacketPackage;
import edu.upb.lp.isc.myRacket.MyRacketProgram;
import edu.upb.lp.isc.services.MyRacketGrammarAccess;
import java.util.Set;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Parameter;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.serializer.ISerializationContext;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;

@SuppressWarnings("all")
public class MyRacketSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private MyRacketGrammarAccess grammarAccess;
	
	@Override
	public void sequence(ISerializationContext context, EObject semanticObject) {
		EPackage epackage = semanticObject.eClass().getEPackage();
		ParserRule rule = context.getParserRule();
		Action action = context.getAssignedAction();
		Set<Parameter> parameters = context.getEnabledBooleanParameters();
		if (epackage == MyRacketPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case MyRacketPackage.DEFINE:
				sequence_Define(context, (Define) semanticObject); 
				return; 
			case MyRacketPackage.MY_RACKET_PROGRAM:
				sequence_MyRacketProgram(context, (MyRacketProgram) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Contexts:
	 *     Define returns Define
	 *
	 * Constraint:
	 *     (name=ID params+=ID* body=Expression)
	 */
	protected void sequence_Define(ISerializationContext context, Define semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
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
	
	
}