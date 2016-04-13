package org.globaltester.protocol;

import java.util.List;

import org.globaltester.protocol.parameter.ProtocolParameterDescription;

/**
 * OSGi-Service that describes the protocol (its parameters and configuration)
 * and allows instantiation.
 * <p/>
 * This Service is used to find available protocols, provide the relevant
 * configuration parameter descriptions and allow instantiation w/o problems
 * with OSGi related class loading issues.
 * 
 * @author amay
 *
 */
public interface ProtocolFactory {

	/**
	 * The human readable protocol name
	 * @return the name of the protocol
	 */
	public String getName();

	/**
	 * Provide information about the available parameters that the created
	 * protocol will be able to handle.
	 * <p/>
	 * The order of the returned List will be used to order/group the mentioned
	 * parameters within automatically generated editors. Thus special
	 * {@link ProtocolParameterDescriptors} are allowed that allow formatting.
	 * 
	 * @return
	 */
	public List<ProtocolParameterDescription> getParameterDescriptors();

	/**
	 * List of profiles relevant for this protocol.
	 * <p/>
	 * These profiles will be selectable within the Profiles tab of the
	 * {@link SampleConfig}
	 * 
	 * @return
	 */
	public String[] getProfiles();

	/**
	 * Creates a new {@link Protocol} of type described by this instance that
	 * wraps the given {@link CommunicationObject}.
	 * 
	 * @param comObject
	 * @return
	 */
	public Protocol create(CommunicationObject comObject);

}
