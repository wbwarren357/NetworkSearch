package org.wbw.networksearch.graphs;

import org.wbw.networksearch.abstractgraphs.AbstractCoordTransformer;

public class IntegerCoordinates implements AbstractCoordTransformer<Integer> {

	public IntegerCoordinates() {}
	
	public Integer convertString(String s){
		return Integer.decode(s.trim());
	}
	
	public String stringifyElement(Integer e){
		return e.toString();
	}
}
