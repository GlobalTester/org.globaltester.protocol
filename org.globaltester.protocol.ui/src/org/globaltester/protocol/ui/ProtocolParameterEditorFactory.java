package org.globaltester.protocol.ui;

import org.eclipse.swt.widgets.Composite;
import org.globaltester.protocol.parameter.ListProtocolParameter;
import org.globaltester.protocol.parameter.ProfileProtocolParameter;
import org.globaltester.protocol.parameter.ProtocolParameterDescription;
import org.globaltester.protocol.parameter.SeparatorProtocolParameter;
import org.globaltester.protocol.parameter.StringProtocolParameter;

public class ProtocolParameterEditorFactory {

	public static ProtocolParameterEditor createEditor(Composite tabItemComp, ProtocolParameterDescription curParamDescriptor) {
		
		if (curParamDescriptor instanceof SeparatorProtocolParameter) return new SeparatorProtocolParameterEditor(tabItemComp, curParamDescriptor);
		if (curParamDescriptor instanceof ProfileProtocolParameter) return new BooleanProtocolParameterEditor(tabItemComp, curParamDescriptor);
		
		if (curParamDescriptor instanceof StringProtocolParameter) return new StringProtocolParameterEditor(tabItemComp, curParamDescriptor);
		
		if (curParamDescriptor instanceof ListProtocolParameter) return new ListProtocolParameterEditor(tabItemComp, curParamDescriptor, ((ListProtocolParameter) curParamDescriptor).getMapping());
		
		return new UnknownProtocolParameterEditor(tabItemComp, curParamDescriptor);
		
	}

}
