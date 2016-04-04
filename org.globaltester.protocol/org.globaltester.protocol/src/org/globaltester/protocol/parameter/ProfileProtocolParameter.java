package org.globaltester.protocol.parameter;

/**
 * Profile that defines whether testcases are executable on the given sample.
 * 
 * @author amay
 *
 */
public class ProfileProtocolParameter extends AbstractProtocolParameterDescription
		implements ProtocolParameterDescription {

	public ProfileProtocolParameter(String protocolName, String name, String description) {
		super(protocolName, name, description);
	}

}
