package org.globaltester.protocol.parameter;

/**
 * Generic protocol parameter that defines a String value.
 * 
 * @author amay
 *
 */
public class StringProtocolParameter extends AbstractProtocolParameterDescription
		implements ProtocolParameterDescription {

	public StringProtocolParameter(String protocolName, String name, String description) {
		super(protocolName, name, description);
	}

}
