package org.globaltester.protocol.parameter;

/**
 * Not an actual protocol parameter but a means to separate different protocol
 * parameters semantically. This might be mapped to a visual divider within UI
 * usage.
 * 
 * @author amay
 *
 */
public class ProfileProtocolParameter extends AbstractProtocolParameterDescription
		implements ProtocolParameterDescription {

	public ProfileProtocolParameter(String name) {
		super(name);
	}

	public ProfileProtocolParameter(String name, String description) {
		super(name, description);
	}

}
