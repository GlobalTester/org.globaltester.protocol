package org.globaltester.protocol.ui;

import org.eclipse.swt.widgets.Composite;
import org.globaltester.protocol.parameter.ProtocolParameterDescription;

public class ProfileProtocolParameterEditor extends BooleanProtocolParameterEditor {

	public ProfileProtocolParameterEditor(Composite tabItemComp, ProtocolParameterDescription curParamDescriptor) {
		super(tabItemComp, curParamDescriptor);

		checkbox.setText(paramDescr.getName());
		checkbox.setToolTipText(paramDescr.getDescription());
		
	}
}
