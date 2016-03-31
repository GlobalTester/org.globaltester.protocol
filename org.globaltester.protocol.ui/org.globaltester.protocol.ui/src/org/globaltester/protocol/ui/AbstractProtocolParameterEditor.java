package org.globaltester.protocol.ui;

import org.globaltester.protocol.parameter.ProtocolParameterDescription;

/**
 * Abstract super implementation of a {@link ProtocolParameterEditor} that
 * handles registering and caching a {@link ProtocolParameterDescription}
 * 
 * @author amay
 *
 */
public abstract class AbstractProtocolParameterEditor implements ProtocolParameterEditor {

	ProtocolParameterDescription paramDescr;

	public AbstractProtocolParameterEditor(ProtocolParameterDescription protocolParameterDescription) {
		paramDescr = protocolParameterDescription;
	}

	@Override
	public ProtocolParameterDescription getProtocolParameterDescription() {
		return paramDescr;
	}

}
