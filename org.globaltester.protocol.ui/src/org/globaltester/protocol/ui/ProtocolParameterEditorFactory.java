package org.globaltester.protocol.ui;

import org.eclipse.jface.resource.JFaceResources;
import org.eclipse.swt.graphics.Font;
import org.eclipse.swt.widgets.Composite;
import org.globaltester.protocol.parameter.BooleanProtocolParameter;
import org.globaltester.protocol.parameter.BooleanTableProtocolParameter;
import org.globaltester.protocol.parameter.DirectoryProtocolParameter;
import org.globaltester.protocol.parameter.FileProtocolParameter;
import org.globaltester.protocol.parameter.ListProtocolParameter;
import org.globaltester.protocol.parameter.MultilineStringProtocolParameter;
import org.globaltester.protocol.parameter.ProfileProtocolParameter;
import org.globaltester.protocol.parameter.ProtocolParameterDescription;
import org.globaltester.protocol.parameter.SeparatorProtocolParameter;
import org.globaltester.protocol.parameter.SpacerProtocolParameter;
import org.globaltester.protocol.parameter.StringProtocolParameter;

public class ProtocolParameterEditorFactory {
	public static final Font FONT_MONOSPACE = JFaceResources.getFont(JFaceResources.TEXT_FONT);
	
	public static ProtocolParameterEditor createEditor(Composite tabItemComp, ProtocolParameterDescription curParamDescriptor) {
		
		if (curParamDescriptor instanceof SeparatorProtocolParameter) return new SeparatorProtocolParameterEditor(tabItemComp, curParamDescriptor);
		if (curParamDescriptor instanceof SpacerProtocolParameter) return new SpacerProtocolParameterEditor(tabItemComp, curParamDescriptor);
		if (curParamDescriptor instanceof ProfileProtocolParameter) return new ProfileProtocolParameterEditor(tabItemComp, curParamDescriptor);
		if (curParamDescriptor instanceof BooleanProtocolParameter) return new BooleanProtocolParameterEditor(tabItemComp, curParamDescriptor);
		if (curParamDescriptor instanceof FileProtocolParameter) return new FileProtocolParameterEditor(tabItemComp, curParamDescriptor);
		if (curParamDescriptor instanceof DirectoryProtocolParameter) return new DirectoryProtocolParameterEditor(tabItemComp, curParamDescriptor);
		if (curParamDescriptor instanceof MultilineStringProtocolParameter) return new MultilineStringProtocolParameterEditor(tabItemComp, curParamDescriptor);
		if (curParamDescriptor instanceof StringProtocolParameter) return new StringProtocolParameterEditor(tabItemComp, curParamDescriptor);
		if (curParamDescriptor instanceof ListProtocolParameter) return new ListProtocolParameterEditor(tabItemComp, curParamDescriptor, ((ListProtocolParameter) curParamDescriptor).getMapping());
		if (curParamDescriptor instanceof BooleanTableProtocolParameter) return new BooleanTableProtocolParameterEditor(tabItemComp, curParamDescriptor, ((BooleanTableProtocolParameter) curParamDescriptor).getColumnDescription(), ((BooleanTableProtocolParameter) curParamDescriptor).getLineDescription(), ((BooleanTableProtocolParameter) curParamDescriptor).getTable());
		
		return new UnknownProtocolParameterEditor(tabItemComp, curParamDescriptor);
		
	}

}
