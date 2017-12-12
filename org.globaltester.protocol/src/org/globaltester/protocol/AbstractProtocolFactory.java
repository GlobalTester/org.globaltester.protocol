package org.globaltester.protocol;

import java.util.ArrayList;
import java.util.List;

import org.globaltester.protocol.parameter.ProtocolParameterDescription;

public abstract class AbstractProtocolFactory implements ProtocolFactory {
	
	private String name;
	private List<ProtocolParameterDescription> paramDescriptions = new ArrayList<>();
	
	public AbstractProtocolFactory(String name) {
		this.name = name;
	}
	
	public final void addParameterDescription(ProtocolParameterDescription description){
		if (description == null){
			throw new IllegalArgumentException("The given description can not be null");
		}
		paramDescriptions.add(description);
	}
	
	@Override
	public List<ProtocolParameterDescription> getParameterDescriptors(){
		return new ArrayList<>(paramDescriptions);
	}
	
	@Override
	public String getName() {
		return name;
	}
	
	@Override
	public Protocol create(CommunicationObject comObject) {
		return null;
	}
}
