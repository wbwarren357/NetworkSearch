package org.wbw.networksearch.listvertexgraphs;

import org.wbw.networksearch.abstractgraphs.AbstractTransformVcoords;

public class IntegerVcoordinates implements AbstractTransformVcoords<Integer> {

	public IntegerVcoordinates() {}
	
	public Integer convertVcoordString(String vCoord){
		return Integer.decode(vCoord.trim());
	}
	
	public String stringifyVcoord(Integer vCoord){
		return vCoord.toString();
	}
}
