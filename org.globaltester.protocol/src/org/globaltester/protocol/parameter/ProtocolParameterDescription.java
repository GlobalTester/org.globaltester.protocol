package org.globaltester.protocol.parameter;

/**
 * Describes a parameter that may be used by a protocol.
 * <p/>
 * A protocol parameter itself is essentially a String variable which may be
 * evaluated by the protocol to whatever is needed in the protocol context.
 * <p/>
 * This interface is intentionally small so that implementing classes can handle
 * their specific type of data matching their needs. E.g. restricting values or
 * providing default values it completely out of scope as not all protocol
 * parameters do need this.
 * 
 * @author amay
 *
 */
public interface ProtocolParameterDescription {

	/**
	 * Return the name of this parameter.
	 * <p/>
	 * This is used together with the name of the defining protocol to
	 * explicitly reference this parameter.
	 * 
	 * @return
	 */
	public String getName();

	/**
	 * Return the name of the protocol this parameter is associated with.
	 * <p/>
	 * This is used together with the name of the parameter to
	 * explicitly reference this parameter.
	 * 
	 * @return
	 */
	public String getProtocolName();

	/**
	 * Return the user description of this parameter.
	 * <p/>
	 * This will be used within the UI for example to label input elements.
	 * 
	 * @return
	 */
	public String getDescription();

}
