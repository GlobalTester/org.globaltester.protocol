package org.globaltester.protocol.ui;

import org.eclipse.swt.widgets.Composite;
import org.globaltester.protocol.parameter.ProfileProtocolParameter;
import org.globaltester.protocol.parameter.ProtocolParameterDescription;
import org.globaltester.protocol.parameter.SeparatorProtocolParameter;
import org.globaltester.protocol.parameter.StringProtocolParameter;

public class ProtocolParameterEditorFactory {

	public static ProtocolParameterEditor createEditor(Composite tabItemComp, ProtocolParameterDescription curParamDescriptor) {
		
		if (curParamDescriptor instanceof SeparatorProtocolParameter) return new SeparatorProtocolParameterEditor(tabItemComp, curParamDescriptor);
		if (curParamDescriptor instanceof ProfileProtocolParameter) return new BooleanProtocolParameterEditor(tabItemComp, curParamDescriptor);
		
		if (curParamDescriptor instanceof StringProtocolParameter) return new StringProtocolParameterEditor(tabItemComp, curParamDescriptor);
		
		return new UnknownProtocolParameterEditor(tabItemComp, curParamDescriptor);
		
	}

}
