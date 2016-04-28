package org.globaltester.protocol.ui;

import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.FileDialog;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Listener;
import org.eclipse.swt.widgets.Text;
import org.globaltester.protocol.parameter.ProtocolParameterDescription;

public class FileProtocolParameterEditor extends AbstractProtocolParameterEditor{
	
	Label lbl;
	Text valueField;
	Button btnFileDialog;
	Composite certComposite;
	String currentDir;
	
	public FileProtocolParameterEditor(Composite tabItemComp, ProtocolParameterDescription curParamDescriptor) {
		super(curParamDescriptor);
		
		certComposite = new Composite(tabItemComp, SWT.NONE);
		GridData gdCertComp = new GridData(SWT.FILL, SWT.CENTER, true, false, 2, 1);
		GridLayout certLayout = new GridLayout(3, false);
		certComposite.setLayout(certLayout);
		certComposite.setLayoutData(gdCertComp);
		
		lbl = new Label(certComposite, SWT.NONE);
		lbl.setText(curParamDescriptor.getDescription());
		GridData gdLbl = new GridData(SWT.FILL, SWT.CENTER, false, false, 1, 1);
		gdLbl.widthHint = 110;
		lbl.setLayoutData(gdLbl);
		
		valueField = new Text(certComposite, SWT.BORDER);
		GridData gdValueField = new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1);
		valueField.setLayoutData(gdValueField);
		
		btnFileDialog = new Button(certComposite, SWT.PUSH);
		btnFileDialog.setText("Browse...");
		
		btnFileDialog.addListener(SWT.Selection, new Listener() {
			@Override
			public void handleEvent(Event event) {
				FileDialog fileDialog = new FileDialog(certComposite.getShell());
				
				fileDialog.setFilterPath(valueField.getText());
				fileDialog.setText("Please select a certificate and click OK");
				
				String dir = fileDialog.open();
				if (dir != null) {
					valueField.setText(dir);
					currentDir = dir;
				}
			}
		});
	}

	@Override
	public void setValue(String newValue) {
		valueField.setText(newValue);
		currentDir = newValue;
		
	}

	@Override
	public String getValue() {
		return currentDir;
		
	}

	@Override
	public void setEditable(boolean editable) {
		valueField.setEditable(editable);
		btnFileDialog.setEnabled(editable);
	}
}
