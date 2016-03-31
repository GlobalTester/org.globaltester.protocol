package org.globaltester.protocol.ui;

import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.globaltester.protocol.parameter.ProtocolParameterDescription;

public class BooleanProtocolParameterEditor extends AbstractProtocolParameterEditor {
	
	Button checkbox;

	public BooleanProtocolParameterEditor(Composite tabItemComp, ProtocolParameterDescription curParamDescriptor) {
		super(curParamDescriptor);

		checkbox = new Button(tabItemComp, SWT.CHECK);
		checkbox.setText(paramDescr.getName());
	}

	@Override
	public void setValue(String newValue) {
		checkbox.setSelection(Boolean.parseBoolean(newValue));
	}

	@Override
	public String getValue() {
		return Boolean.toString(checkbox.getSelection());
	}

}
