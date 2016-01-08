package org.wbw.networksearch.simplesearcherutils;

import java.util.HashMap;

import org.wbw.networksearch.abstractsearcherutils.DataCollector_Interface;
import org.wbw.networksearch.abstractsearcherutils.DataCollector_Interface.Measurement_Interface;

public class SimpleDataCollector implements DataCollector_Interface {

	private Boolean dataCollectorOn = false;
	private HashMap<String, Measurement_Interface> measurements = new HashMap<>();
	
	
	@Override
	public void turnOnOff(DataCollectorOnOff turnOnfOff) {
		if (turnOnfOff == DataCollectorOnOff.ON) {
			dataCollectorOn = true;
		} else {
			dataCollectorOn = false;
		}
	}

	@Override
	public void recordMeasurement(String dataType, int measurement) {
		// check if a measurement of this name exists
		
		// if not, create one and initialize
		
		// if yes, add new measurement values

	}

	@Override
	public HashMap<String, Measurement_Interface> getMeasurements() {
		return measurements;
	}

	private class Measurement implements Measurement_Interface {
		
		private String name;
		private int currentValue = 0;
		private int count = 0;
		private int total = 0;
		
		private Measurement(String name, int currentValue) {
			this.name = name;
			this.count = this.count++;
			this.count = total + currentValue;
		}
		
		@Override
		public String getName() {
			return name;
		}
		
		@Override
		public int getCount() {
			return count;
		}
		
		@Override
		public int getTotal() {
			return total;
		}
	}
}
