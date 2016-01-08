package org.wbw.networksearch.abstractsearcherutils;

import java.util.HashMap;

public interface DataCollector_Interface {
	
	public enum DataCollectorOnOff {ON, OFF};

	// Turn data collection on/off
	public void turnOnOff(DataCollectorOnOff turnOnOff);
	
	public void recordMeasurement(String dataType, int currentValue);
	public HashMap<String, Measurement_Interface> getMeasurements();
	
	public interface Measurement_Interface {
		public String getName();
		public int getCount();
		public int getTotal();
	}
}
