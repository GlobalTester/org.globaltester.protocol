package org.globaltester.protocol.ui;

import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.globaltester.protocol.ProtocolParameterDescription;
import org.globaltester.protocol.ProtocolParameterSeparator;

public class ProtocolParameterEditorFactory {

	public static Object createEditor(Composite tabItemComp, ProtocolParameterDescription curParamDescriptor) {
		
		if (curParamDescriptor instanceof ProtocolParameterSeparator) return createSeparator(tabItemComp, curParamDescriptor);
		
		return null;
		
	}

	private static Object createSeparator(Composite tabItemComp, ProtocolParameterDescription curParamDescriptor) {
		Label separator = new Label(tabItemComp, SWT.SEPARATOR | SWT.HORIZONTAL);
		GridData gdSep = new GridData(GridData.FILL_HORIZONTAL);
		gdSep.grabExcessHorizontalSpace = true;
		gdSep.horizontalSpan = 2;
		separator.setLayoutData(gdSep);
		
		if (curParamDescriptor.getDescription() != null) {
			Label description = new Label(tabItemComp, SWT.NONE);
			description.setText(curParamDescriptor.getDescription());
			GridData gdDescr = new GridData(GridData.FILL_HORIZONTAL);
			gdDescr.grabExcessHorizontalSpace = true;
			gdDescr.horizontalSpan = 2;
			description.setLayoutData(gdDescr);
			return description;
		} else {
			return separator;
		}
		
	}

}
