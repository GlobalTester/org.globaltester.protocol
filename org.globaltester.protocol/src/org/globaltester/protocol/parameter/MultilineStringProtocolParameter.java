package org.globaltester.protocol.parameter;

/**
 * Generic protocol parameter that defines a String value.
 * 
 * @author amay
 *
 */
public class MultilineStringProtocolParameter extends AbstractProtocolParameterDescription
		implements ProtocolParameterDescription {

	private int numberOfLines;

	public MultilineStringProtocolParameter(String protocolName, String name, String description, int numberOfLines) {
		super(protocolName, name, description);
		this.numberOfLines = numberOfLines;
	}

	public int getNumberOfLines(){
		return numberOfLines;
	}
	
}
