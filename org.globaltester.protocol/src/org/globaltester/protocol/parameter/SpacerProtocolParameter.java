package org.globaltester.protocol.parameter;

/**
 * Not an actual protocol parameter but a means add a spacer. This might be
 * mapped to an empty label within UI usage.
 * 
 * @author cstroh
 *
 */
public class SpacerProtocolParameter extends AbstractProtocolParameterDescription
		implements ProtocolParameterDescription {

	public SpacerProtocolParameter(String protocolName,  String name, String description) {
		super(protocolName, name, description);
	}

}
