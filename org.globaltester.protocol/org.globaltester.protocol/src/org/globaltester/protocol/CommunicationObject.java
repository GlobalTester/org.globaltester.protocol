package org.globaltester.protocol;

/**
 * A {@link CommunicationObject} wraps the test sample in an object that allows
 * simple communication.
 * <p/>
 * Essentialy al it defines is a simple message-response type of communication
 * based on byte[]s. This is the most basic communication that can be defined
 * for every test sample independent of type. This interface does not make any
 * assumptions about content of these messages.
 * 
 * @author amay
 *
 */
public interface CommunicationObject {

	/**
	 * Transmit the given command to the wrapped test sample and return a response.
	 * <p/>
	 * No assumptions about message content are made.
	 * @param command command data
	 * @return response data
	 */
	public byte[] send(byte[] command);
}
