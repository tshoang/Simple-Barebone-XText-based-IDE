/*
 * generated by Xtext 2.22.0
 */
package ac.soton.java.barebones.ui.tests;

import ac.soton.java.barebones.ui.internal.BarebonesActivator;
import com.google.inject.Injector;
import org.eclipse.xtext.testing.IInjectorProvider;

public class BareBonesUiInjectorProvider implements IInjectorProvider {

	@Override
	public Injector getInjector() {
		return BarebonesActivator.getInstance().getInjector("ac.soton.java.barebones.BareBones");
	}

}
