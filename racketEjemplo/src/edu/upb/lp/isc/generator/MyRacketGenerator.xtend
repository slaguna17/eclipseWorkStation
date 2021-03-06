/*
 * generated by Xtext 2.21.0
 */
package edu.upb.lp.isc.generator

import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.AbstractGenerator
import org.eclipse.xtext.generator.IFileSystemAccess2
import org.eclipse.xtext.generator.IGeneratorContext
import edu.upb.lp.isc.myRacket.MyRacketProgram

/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
class MyRacketGenerator extends AbstractGenerator {

	override void doGenerate(Resource resource, IFileSystemAccess2 fsa, IGeneratorContext context) {
//		fsa.generateFile('greetings.txt', 'People to greet: ' + 
//			resource.allContents
//				.filter(Greeting)
//				.map[name]
//				.join(', '))
		val MyRacketProgram p = resource.contents.get(0) as MyRacketProgram
		fsa.generateFile('PrimerFile.java', generate(p))
	}
	
	//def generate(MyRacketProgram p) '''Esto es un string y si con las 3 comillas ?p.defines.size?'''
	def generate(MyRacketProgram p) '''public class PrimerFile.java{
		public static void main(String[] args) {
			?FOR e: p.executions?
				?generate(e)?
			?ENDFOR?
		}
	}'''
	
	def generate (Expression e) '''tenemos que hacer el codigo de las exprsiones'''
}
