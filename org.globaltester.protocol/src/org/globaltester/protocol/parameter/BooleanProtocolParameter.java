package org.globaltester.protocol.parameter;

/**
 * Protocol parameter that defines a boolean parameter.
 * 
 * @author cstroh
 *
 */
public class BooleanProtocolParameter extends AbstractProtocolParameterDescription
		implements ProtocolParameterDescription {
	
	public BooleanProtocolParameter(String protocolName, String name, String description) {
		super(protocolName, name, description);
	}

}
