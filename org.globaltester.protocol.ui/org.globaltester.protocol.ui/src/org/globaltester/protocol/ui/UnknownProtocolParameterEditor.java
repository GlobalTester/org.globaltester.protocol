package org.globaltester.protocol.ui;

import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.globaltester.protocol.parameter.ProtocolParameterDescription;

/**
 * Default Editor for ProtocolParameter that no known Editor is associated.
 * <p/>
 * This is essentially a {@link StringProtocolParameterEditor} with an
 * obviously wrong background.
 * 
 * @author amay
 *
 */
public class UnknownProtocolParameterEditor extends StringProtocolParameterEditor {

	public UnknownProtocolParameterEditor(Composite tabItemComp, ProtocolParameterDescription curParamDescriptor) {
		super(tabItemComp, curParamDescriptor);

		Display display = Display.getCurrent();
		Color bgColor = display.getSystemColor(SWT.COLOR_YELLOW);

		lbl.setBackground(bgColor);
	}

}
