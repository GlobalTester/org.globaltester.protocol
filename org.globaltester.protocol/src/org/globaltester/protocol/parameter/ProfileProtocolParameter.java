package org.globaltester.protocol.parameter;

/**
 * Profile that defines whether testcases are executable on the given sample.
 * 
 * @author amay
 *
 */
public class ProfileProtocolParameter extends AbstractProtocolParameterDescription
		implements ProtocolParameterDescription {
	
	boolean useDescription;

	public ProfileProtocolParameter(String protocolName, String name, String description) {
		super(protocolName, name, description);
		this.useDescription = false;
	}
	
	public ProfileProtocolParameter(String protocolName, String name, String description, boolean useDescription) {
		super(protocolName, name, description);
		this.useDescription = useDescription;
	}

	public boolean getUseDescription(){
		return useDescription;
	}
}
