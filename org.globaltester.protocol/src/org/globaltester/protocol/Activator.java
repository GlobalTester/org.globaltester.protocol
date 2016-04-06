package org.globaltester.protocol;

import java.util.Collection;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.util.tracker.ServiceTracker;

/**
 * Handles the protocol service
 * 
 * @author amay
 *
 */
public class Activator implements BundleActivator {

	private static Activator defaultInstance;
	private static BundleContext context;
	private static ServiceTracker<ProtocolFactory, ProtocolFactory> factoryTracker;

	@Override
	public void start(BundleContext bundleContext) throws Exception {
		context = bundleContext;
		defaultInstance = this;
		factoryTracker = new ServiceTracker<>(context, ProtocolFactory.class, null);
		factoryTracker.open();
	}

	@Override
	public void stop(BundleContext bundleContext) throws Exception {
		if (factoryTracker != null) {
			factoryTracker.close();
			factoryTracker = null;
		}
		defaultInstance = null;
		context = null;
	}

	public static BundleContext getContext() {
		return context;
	}

	/**
	 * Returns a {@link Collection} of available {@link ProtocolFactory}
	 * objects. One for each registered OSGi service.
	 * 
	 * @return
	 */
	public static ProtocolFactory[] getAvailableProtocolFactories() {
		ProtocolFactory[] emptyArray = new ProtocolFactory[0];
		if (factoryTracker == null) {
			return emptyArray;
		}

		return factoryTracker.getServices(emptyArray);
	}

	/**
	 * @return a {@link ProtocolFactory} that produces Protocols with the
	 *         provided protocolName or null if none is available
	 */
	public static ProtocolFactory getProtocolFactoriesForName(String protocolName) {
		if (protocolName == null) return null;
		
		
		ProtocolFactory[] availableFactories = getAvailableProtocolFactories();
		
		for (ProtocolFactory currentFactory : availableFactories) {
			if (protocolName.equals(currentFactory.getName())) {
				return currentFactory;
			}
		}
		
		return null;
	}

	public static Activator getDefault() {
		return defaultInstance;
	}
}
