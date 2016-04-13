package org.globaltester.protocol;

import org.globaltester.sampleconfiguration.SampleConfig;

/**
 * A {@link Protocol} encapsulates a process defined by several steps together
 * with its relevant used configuration data and state information.
 * <p/>
 * They are intended to be wrapped around a {@link CommunicationObject} such
 * that every protocol step is performed on that object.
 * <p/>
 * The processing state is handled completely within the protocol
 * implementation. It may be accessible through implementation specific methods
 * in order to retrieve or modify data as needed.
 * <p/>
 * A {@link Protocol} can extract all relevant parameters from a given
 * {@link SampleConfig} use them internaly and update the SampleConfiguration at any
 * time with modified values.
 * 
 * @author amay
 *
 */
public interface Protocol {

	public String[] getStepNames();
	public boolean hasNextStep();
	public boolean executeNextStep();
	public boolean skipNextStep();
	public boolean execute();
	
	/**
	 * Extract all relevant protocol parameters from the given
	 * {@link SampleConfig}
	 */
	public void initFromSampleConfig(SampleConfig sampleConfig);

	/**
	 * Update the given {@link SampleConfig} object with the modified
	 * configuration data. <p\> This is intended for protocols known to change
	 * the internal state of the test sample and want this change to be
	 * reflected in the SampleConfiguration.
	 */
	public void updateSampleConfig(SampleConfig sampleConfig);
}
