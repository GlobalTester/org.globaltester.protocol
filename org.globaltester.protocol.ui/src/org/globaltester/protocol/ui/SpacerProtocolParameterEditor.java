package org.globaltester.protocol.ui;

import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.globaltester.protocol.parameter.ProtocolParameterDescription;

public class SpacerProtocolParameterEditor extends AbstractProtocolParameterEditor {

	public SpacerProtocolParameterEditor(Composite tabItemComp, ProtocolParameterDescription curParamDescriptor) {
		super (curParamDescriptor);
		
		new Label(tabItemComp, SWT.NONE);
	}

	@Override
	public void setValue(String newValue) {
		// no value handled for a spacer
	}

	@Override
	public String getValue() {
		return null; // no value handled for a spacer
	}

}
