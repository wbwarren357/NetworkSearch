package org.wbw.networksearch.graphs;

import org.wbw.networksearch.abstractgraphs.AbstractTransformCoords;

public class IntegerCoordinates implements AbstractTransformCoords<Integer> {

	public IntegerCoordinates() {}
	
	public Integer convertString(String s){
		return Integer.decode(s.trim());
	}
	
	public String stringifyCoord(Integer c){
		return c.toString();
	}
}
