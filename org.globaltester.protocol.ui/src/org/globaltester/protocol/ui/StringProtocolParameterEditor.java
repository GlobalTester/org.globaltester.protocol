package org.globaltester.protocol.ui;

import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Listener;
import org.eclipse.swt.widgets.Text;
import org.globaltester.protocol.parameter.ProtocolParameterDescription;
import org.globaltester.sampleconfiguration.SampleConfig;

/**
 * Allows setting {@link String} values for {@link SampleConfig} parameters.
 * @author amay
 *
 */
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

	/**
	 * @return the {@link GridData} to be used for laouting the the value field of this editor
	 */
	protected GridData getLayoutData() {
		return new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1);
	}

	/**
	 * @see Text
	 * @return the style value to be used for the value field
	 */
	protected int getStyle() {
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
		valueField.setEnabled(editable);
	}
	
	@Override
	public void addListener(int eventType, Listener listener) {
		valueField.addListener(eventType, listener);
	}

}
