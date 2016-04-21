package org.globaltester.protocol.parameter;

import java.util.AbstractMap;

/**
 * Generic protocol parameter that defines a list of values.
 * 
 * @author cstroh
 *
 */
public class ListProtocolParameter extends AbstractProtocolParameterDescription
		implements ProtocolParameterDescription {
	
	private AbstractMap<String, String> mapping;

	public ListProtocolParameter(String protocolName, String name, String description, AbstractMap<String, String> mapping) {
		super(protocolName, name, description);
		this.mapping = mapping;
	}

	public AbstractMap<String, String> getMapping() {
		return mapping;
	}

}
