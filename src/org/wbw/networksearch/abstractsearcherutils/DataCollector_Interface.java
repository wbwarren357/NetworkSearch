package org.wbw.networksearch.abstractsearcherutils;

public interface DataCollector_Interface {
	
	public enum DataCollectorOnOff {ON, OFF};

	// Turn data collection on/off
	public void disableDataCollection();
	public void enableDataCollection();
	
	public void recordData(String dataType, int measurement);
	
	public void outputResults();
}
