package org.globaltester.protocol.ui;

import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Composite;
import org.globaltester.protocol.parameter.ProtocolParameterDescription;
import org.globaltester.protocol.parameter.MultilineStringProtocolParameter;

/**
 * Allows use of multiple line strings as parameters.
 * @author mboonk
 *
 */
public class MultilineStringProtocolParameterEditor extends StringProtocolParameterEditor {
	
	ProtocolParameterDescription paramDescriptor;

	public MultilineStringProtocolParameterEditor(Composite tabItemComp, ProtocolParameterDescription curParamDescriptor) {
		super(tabItemComp, curParamDescriptor);
	}
	
	@Override
	public GridData getLayoutData() {
		GridData data = super.getLayoutData();
		if (paramDescriptor instanceof MultilineStringProtocolParameter){
			data.heightHint = ((MultilineStringProtocolParameter)paramDescriptor).getNumberOfLines();
		} else {
			data.heightHint =  3 * valueField.getLineHeight();
		}
		return data;
	}
	
	@Override
	public int getStyle() {
		return super.getStyle() | SWT.MULTI;
	}

}
