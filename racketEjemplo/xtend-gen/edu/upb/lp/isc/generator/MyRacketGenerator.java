/**
 * generated by Xtext 2.21.0
 */
package edu.upb.lp.isc.generator;

import edu.upb.lp.isc.myRacket.MyRacketProgram;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.generator.AbstractGenerator;
import org.eclipse.xtext.generator.IFileSystemAccess2;
import org.eclipse.xtext.generator.IGeneratorContext;

/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
@SuppressWarnings("all")
public class MyRacketGenerator extends AbstractGenerator {
  @Override
  public void doGenerate(final Resource resource, final IFileSystemAccess2 fsa, final IGeneratorContext context) {
    EObject _get = resource.getContents().get(0);
    final MyRacketProgram p = ((MyRacketProgram) _get);
    fsa.generateFile("PrimerFile.java", this.generate(p));
  }
  
  public CharSequence generate(final MyRacketProgram p) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method generate(Expression) from the type MyRacketGenerator refers to the missing type Expression");
  }
  
  public CharSequence generate(final /* Expression */Object e) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("tenemos que hacer el codigo de las exprsiones");
    return _builder;
  }
}