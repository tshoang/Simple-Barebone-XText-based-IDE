/*
 * generated by Xtext 2.22.0
 */
package ac.soton.java.barebones.serializer;

import ac.soton.java.barebones.bareBones.BareBonesPackage;
import ac.soton.java.barebones.bareBones.Clear;
import ac.soton.java.barebones.bareBones.Decrement;
import ac.soton.java.barebones.bareBones.Increment;
import ac.soton.java.barebones.bareBones.Program;
import ac.soton.java.barebones.bareBones.While;
import ac.soton.java.barebones.services.BareBonesGrammarAccess;
import com.google.inject.Inject;
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
public class BareBonesSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private BareBonesGrammarAccess grammarAccess;
	
	@Override
	public void sequence(ISerializationContext context, EObject semanticObject) {
		EPackage epackage = semanticObject.eClass().getEPackage();
		ParserRule rule = context.getParserRule();
		Action action = context.getAssignedAction();
		Set<Parameter> parameters = context.getEnabledBooleanParameters();
		if (epackage == BareBonesPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case BareBonesPackage.CLEAR:
				sequence_Clear(context, (Clear) semanticObject); 
				return; 
			case BareBonesPackage.DECREMENT:
				sequence_Decrement(context, (Decrement) semanticObject); 
				return; 
			case BareBonesPackage.INCREMENT:
				sequence_Increment(context, (Increment) semanticObject); 
				return; 
			case BareBonesPackage.PROGRAM:
				sequence_Program(context, (Program) semanticObject); 
				return; 
			case BareBonesPackage.WHILE:
				sequence_While(context, (While) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Contexts:
	 *     Statement returns Clear
	 *     Clear returns Clear
	 *
	 * Constraint:
	 *     name=ID
	 */
	protected void sequence_Clear(ISerializationContext context, Clear semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, BareBonesPackage.Literals.STATEMENT__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, BareBonesPackage.Literals.STATEMENT__NAME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getClearAccess().getNameIDTerminalRuleCall_2_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Statement returns Decrement
	 *     Decrement returns Decrement
	 *
	 * Constraint:
	 *     name=ID
	 */
	protected void sequence_Decrement(ISerializationContext context, Decrement semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, BareBonesPackage.Literals.STATEMENT__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, BareBonesPackage.Literals.STATEMENT__NAME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getDecrementAccess().getNameIDTerminalRuleCall_2_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Statement returns Increment
	 *     Increment returns Increment
	 *
	 * Constraint:
	 *     name=ID
	 */
	protected void sequence_Increment(ISerializationContext context, Increment semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, BareBonesPackage.Literals.STATEMENT__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, BareBonesPackage.Literals.STATEMENT__NAME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getIncrementAccess().getNameIDTerminalRuleCall_2_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Program returns Program
	 *
	 * Constraint:
	 *     statements+=Statement+
	 */
	protected void sequence_Program(ISerializationContext context, Program semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Statement returns While
	 *     While returns While
	 *
	 * Constraint:
	 *     (name=ID statements+=Statement+)
	 */
	protected void sequence_While(ISerializationContext context, While semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
}
