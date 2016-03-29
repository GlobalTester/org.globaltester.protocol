package org.globaltester.protocol;

/**
 * Describes a parameter that may be used by a protocol.
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
	 * Return the user description of this parameter.
	 * <p/>
	 * This will be used within the UI for example to label input elements.
	 * 
	 * @return
	 */
	public String getDescription();

}
