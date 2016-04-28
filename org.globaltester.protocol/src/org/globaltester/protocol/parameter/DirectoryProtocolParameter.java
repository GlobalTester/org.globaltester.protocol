package org.globaltester.protocol.parameter;

/**
 * Generic protocol parameter that defines a path.
 * 
 * @author jgoeke
 *
 */
public class DirectoryProtocolParameter extends StringProtocolParameter {

	public DirectoryProtocolParameter(String protocolName, String name, String description) {
		super(protocolName, name, description);
	}

}
