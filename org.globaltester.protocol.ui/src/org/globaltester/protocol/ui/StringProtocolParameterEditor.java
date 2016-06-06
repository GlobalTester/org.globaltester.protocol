package org.globaltester.protocol.ui;

import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Listener;
import org.eclipse.swt.widgets.Text;
import org.globaltester.protocol.parameter.ProtocolParameterDescription;

public class StringProtocolParameterEditor extends AbstractProtocolParameterEditor {
	
	ProtocolParameterDescription paramDescriptor;
	
	Label lbl;
	Text valueField;

	public StringProtocolParameterEditor(Composite tabItemComp, ProtocolParameterDescription curParamDescriptor) {
		super(curParamDescriptor);

		lbl = new Label(tabItemComp, SWT.NONE);
		lbl.setText(curParamDescriptor.getDescription());

		valueField = new Text(tabItemComp, getStyle());
		valueField.setFont(ProtocolParameterEditorFactory.FONT_MONOSPACE);
		valueField.setLayoutData(getLayoutData());
	}

	public GridData getLayoutData() {
		return new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1);
	}

	public int getStyle() {
		return SWT.BORDER;
	}

	@Override
	public void setValue(String newValue) {
		valueField.setText(newValue);
	}

	@Override
	public String getValue() {
		return valueField.getText();
	}

	@Override
	public void setEditable(boolean editable) {
		valueField.setEditable(editable);
	}
	
	@Override
	public void addListener(int eventType, Listener listener) {
		valueField.addListener(eventType, listener);
	}

}
