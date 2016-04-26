package org.globaltester.protocol.parameter;

/**
 * Generic protocol parameter that defines a ICS.
 * 
 * @author amay
 *
 */
public class BooleanTableProtocolParameter extends AbstractProtocolParameterDescription
		implements ProtocolParameterDescription {
	
	private boolean[][] table;
	private String[] descrColumns;
	private String[] descrLines;

	public BooleanTableProtocolParameter(String protocolName, String name, String description, String[] descrColumns, String[] descrLines, boolean[][] table) {
		super(protocolName, name, description);
		this.table = table;
		this.descrColumns = descrColumns;
		this.descrLines = descrLines;
	}
	
	public boolean[][] getTable(){
		return table;
	}
	
	public String[] getColumnDescription(){
		return descrColumns;
	}
	
	public String[] getLineDescription(){
		return descrLines;
	}

}
