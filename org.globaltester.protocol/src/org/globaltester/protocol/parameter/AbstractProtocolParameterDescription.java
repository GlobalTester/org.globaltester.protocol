package org.globaltester.protocol.parameter;

/**
 * Abstract super implementation for {@link ProtocolParameterDescription}
 * <p/>
 * This class handles the basic requirements of a ProtocolParameterDescription
 * to remove that burden from implementations. It is not meant to be
 * instantiated directly.
 * 
 * @author amay
 *
 */
public abstract class AbstractProtocolParameterDescription implements ProtocolParameterDescription {

	protected String protocolName = "";
	protected String name = "";
	protected String description = "";

	public AbstractProtocolParameterDescription(String protocolName, String name) {
		this.protocolName = protocolName;
		this.name = name;
	}

	public AbstractProtocolParameterDescription(String protocolName, String name, String description) {
		this(protocolName, name);
		this.description = description;
	}

	@Override
	public String getProtocolName() {
		return protocolName;
	}

	@Override
	public String getName() {
		return name;
	}

	@Override
	public String getDescription() {
		return description;
	}

}