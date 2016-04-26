package org.globaltester.protocol.ui;

import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.globaltester.protocol.parameter.ProtocolParameterDescription;

public class BooleanTableProtocolParameterEditor extends AbstractProtocolParameterEditor {
	
	Label lbl;
	Composite valueField;
	boolean[][] table;
	Button[][] buttonTable;

	public BooleanTableProtocolParameterEditor(Composite tabItemComp, ProtocolParameterDescription curParamDescriptor, String[] descrColumns, String[] descrRow, boolean[][] table) {
		super(curParamDescriptor);
		
		lbl = new Label(tabItemComp, SWT.NONE);
		lbl.setText(curParamDescriptor.getDescription());
		
		new Label(tabItemComp, SWT.NONE);
		
		valueField = new Composite(tabItemComp, SWT.READ_ONLY);
		GridLayout gdData = new GridLayout(table.length + 1, false);
		valueField.setLayout(gdData);
		
		new Label(valueField, SWT.NONE);
		for(int i = 0; i<descrColumns.length; i++) {
			new Label(valueField, SWT.NONE).setText(descrColumns[i]);
		}
		
		addRows(valueField, descrRow, table);
		
		valueField.setVisible(true);
		
		new Label(tabItemComp, SWT.NONE);
	}
	
	private void addRows(Composite composite, String[] descrRow, boolean[][] table) {
		buttonTable = new Button[table.length][table[0].length];
		for(int i = 0; i<descrRow.length; i++) {
			new Label(composite, SWT.NONE).setText(descrRow[i]);
			for(int j = 0; j<table[i].length; j++) {
				if(table[i][j]) {
					buttonTable[i][j] = new Button(composite, SWT.CHECK);
				}
				else {
					new Label(composite, SWT.NONE);
				}
			}
		}
	}

	@Override
	public void setValue(String newValue) {
		char[] values = newValue.toCharArray();
		
		int tableSize = buttonTable.length * buttonTable[0].length;
		if(tableSize != newValue.length()) {
			throw new IllegalArgumentException("Length of value is not correct");
		}
		
		for(int i = 0; i<values.length; i++) {
			int row = i / buttonTable.length;
			int column = i % buttonTable.length;
			if(values[i] == '1') {
				if(buttonTable[row][column] != null) {
					buttonTable[row][column].setSelection(true);
				}
			} else {
				if(buttonTable[row][column] != null) {
					buttonTable[row][column].setSelection(false);
				}
			}
		}
	}

	@Override
	public String getValue() {
		String codedSelection = "";
		for(int row = 0; row<buttonTable.length; row++) {
			for (int column = 0; column<buttonTable[row].length; column++) {
				if(buttonTable[row][column] != null && buttonTable[row][column].getSelection()) {
					codedSelection += "1";
				} else {
					codedSelection += "0";
				}
			}
		}
		return codedSelection;
	}

}
