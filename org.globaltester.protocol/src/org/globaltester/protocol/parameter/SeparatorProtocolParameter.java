package org.globaltester.protocol.parameter;

/**
 * Not an actual protocol parameter but a means to separate different protocol
 * parameters semantically. This might be mapped to a visual divider within UI
 * usage.
 * 
 * @author amay
 *
 */
public class SeparatorProtocolParameter extends AbstractProtocolParameterDescription
		implements ProtocolParameterDescription {

	public SeparatorProtocolParameter(String protocolName,  String name, String description) {
		super(protocolName, name, description);
	}

}
