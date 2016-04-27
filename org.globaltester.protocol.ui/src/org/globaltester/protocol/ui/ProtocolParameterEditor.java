package org.globaltester.protocol.ui;

import org.globaltester.protocol.parameter.ProtocolParameterDescription;

/**
 * Defines SWT widgets that allow editing of a specific ProtocolParameter.
 * <p/>
 * Implementing classes define the actual widgets and their behavior (e.g.
 * condition checking).
 * <p/>
 * {@link ProtocolParameterEditor}s are created for every available
 * ProtocolParamter once the {@link SampleConfigEditorWidget} is created. They can
 * be initialized with given values from an existing {@link SampleConfig}
 * and allow retrieving all relevant informations to store their value.
 * 
 * @author amay
 *
 */
public interface ProtocolParameterEditor {
	
	/**
	 * @return the {@link ProtocolParameterDescription} this editor is associated with
	 */
	public ProtocolParameterDescription getProtocolParameterDescription();

	/**
	 * Set the value this editor displays based on the given parameter
	 */
	public void setValue(String newValue);

	/**
	 * Retrieve the currently displayed value from this editor.
	 */
	public String getValue();
	
	/**
	 * Sets the editable state.
	 * @param editable the new editable state
	 */
	public void setEditable(boolean editable);

}
