package org.jboss.tools.forge.core.runtime;

import java.beans.PropertyChangeListener;

import org.eclipse.core.runtime.IProgressMonitor;
import org.jboss.tools.forge.core.io.ForgeOutputListener;

public interface ForgeRuntime {
	
	String STATE_NOT_RUNNING = "org.jboss.tools.forge.runtime.notRunning";
	String STATE_RUNNING = "org.jboss.tools.forge.runtime.running";
	String STATE_STARTING = "org.jboss.tools.forge.runtime.starting";
	
	String PROPERTY_STATE = "org.jboss.tools.forge.runtime.state";

	String getName();
	String getLocation();
	ForgeRuntimeType getType();
	String getState();
	String getVersion();
	
	void start(IProgressMonitor progressMonitor);
	void stop(IProgressMonitor progressMonitor);
	
	String getErrorMessage();
	
	void sendInput(String str);
	String sendCommand(String str);
	
	void addOutputListener(ForgeOutputListener outputListener);
	void removeOutputListener(ForgeOutputListener outputListener);
	
	void addPropertyChangeListener(PropertyChangeListener propertyChangeListener);
	void removePropertyChangeListener(PropertyChangeListener propertyChangeListener);

}