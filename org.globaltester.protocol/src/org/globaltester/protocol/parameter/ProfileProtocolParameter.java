package org.globaltester.protocol.parameter;

/**
 * Profile that defines whether testcases are executable on the given sample.
 * 
 * @author amay
 *
 */
public class ProfileProtocolParameter extends BooleanProtocolParameter {

	public ProfileProtocolParameter(String protocolName, String name, String description) {
		super(protocolName, name, description);
	}
	
}
