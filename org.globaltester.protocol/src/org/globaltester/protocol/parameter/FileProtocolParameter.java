package org.globaltester.protocol.parameter;

/**
 * Generic protocol parameter that defines a path.
 * 
 * @author jgoeke
 *
 */
public class FileProtocolParameter extends StringProtocolParameter {

	public FileProtocolParameter(String protocolName, String name, String description) {
		super(protocolName, name, description);
	}

}
