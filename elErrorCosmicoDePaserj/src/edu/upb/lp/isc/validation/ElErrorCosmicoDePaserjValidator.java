package edu.upb.lp.isc.validation;

import java.util.LinkedList;

import org.eclipse.xtext.validation.Check;

import edu.upb.lp.isc.elErrorCosmicoDePaserj.ArithExpression;
import edu.upb.lp.isc.elErrorCosmicoDePaserj.ElErrorCosmicoDePaserjPackage;
import edu.upb.lp.isc.elErrorCosmicoDePaserj.FunctionCallExpression;
import edu.upb.lp.isc.elErrorCosmicoDePaserj.IfExpression;
import edu.upb.lp.isc.elErrorCosmicoDePaserj.ListOperationExpression;


/**
 * This class contains custom validation rules. 
 *
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#validation
 */
public class ElErrorCosmicoDePaserjValidator extends AbstractElErrorCosmicoDePaserjValidator {
	
//	public static final String INVALID_NAME = "invalidName";
//
//	@Check
//	public void checkGreetingStartsWithCapital(Greeting greeting) {
//		if (!Character.isUpperCase(greeting.getName().charAt(0))) {
//			warning("Name should start with a capital",
//					ElErrorCosmicoDePaserjPackage.Literals.GREETING__NAME,
//					INVALID_NAME);
//		}
//	}
	
	@Check
	public void checkFunctionCallNumberOfArguments(FunctionCallExpression e) {
		if (e.getArgs().size() != e.getFunction().getParams().size()){
			error("El número de parametros no corresponde con el número de argumentos", ElErrorCosmicoDePaserjPackage.Literals.FUNCTION_CALL_EXPRESSION__ARGS);
		}
	}
//	@Check
//	public void checkParamsOfDefine(ParamsCallExpression p, Define d) {
//		if (p.getParams() != d.getParams()) {
//			error("El parametro no es correcto", ElErrorCosmicoDePaserjPackage.Literals.PARAMS_CALL_EXPRESSION__PARAMS);
//		}
//	}
//	@Check
//	public void checkListIsHomogeneous(LinkedList l) {
//		if(!(l.getHead() instanceof IntExpression && l.getTail() instanceof IntExpression) 
//				||!( l.getHead() instanceof BooleanExpression && l.getTail() instanceof BooleanExpression)
//				||!( l.getHead() instanceof StringExpression && l.getTail() instanceof StringExpression)
//				||!( l.getHead() instanceof ListExpression && l.getTail() instanceof ListExpression)) {
//			error("La lista no es homogenea", ElErrorCosmicoDePaserjPackage.Literals.LINKED_LIST__TAIL);
//		} 
//    }
	@Check
	public void checkLegalListTypes(LinkedList l) {
		if(l.getHead() instanceof IfExpression 
		|| l.getHead() instanceof ArithExpression 
		|| l.getHead() instanceof ListOperationExpression) {
			error("Esto no es un tipo de datos aceptado por java", ElErrorCosmicoDePaserjPackage.Literals.LINKED_LIST__HEAD);
		} else if (l.getTail() instanceof IfExpression
				|| l.getTail() instanceof ArithExpression 
				|| l.getTail() instanceof ListOperationExpression) {
			error("Esto no es un tipo de datos aceptado por java", ElErrorCosmicoDePaserjPackage.Literals.LINKED_LIST__TAIL);			
		}
	}
	
	
}

