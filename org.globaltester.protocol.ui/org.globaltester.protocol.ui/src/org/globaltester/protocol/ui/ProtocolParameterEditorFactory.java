package org.globaltester.protocol.ui;

import org.eclipse.swt.widgets.Composite;
import org.globaltester.protocol.parameter.ProtocolParameterDescription;
import org.globaltester.protocol.parameter.SeparatorProtocolParameter;

public class ProtocolParameterEditorFactory {

	public static ProtocolParameterEditor createEditor(Composite tabItemComp, ProtocolParameterDescription curParamDescriptor) {
		
		if (curParamDescriptor instanceof SeparatorProtocolParameter) return new SeparatorProtocolParameterEditor(tabItemComp, curParamDescriptor);
		
		return null;
		
	}

}
