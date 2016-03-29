package org.globaltester.protocol;

/**
 * Not an actual protocol parameter but a means to separate different protocol
 * parameters semantically. This might be mapped to a visual divider within UI
 * usage.
 * 
 * @author amay
 *
 */
public class ProtocolParameterSeparator extends AbstractProtocolParameterDescription
		implements ProtocolParameterDescription {

	public ProtocolParameterSeparator(String name) {
		super(name);
	}

	public ProtocolParameterSeparator(String name, String description) {
		super(name, description);
	}

}
