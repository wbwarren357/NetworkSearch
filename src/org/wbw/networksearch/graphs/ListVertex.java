package org.wbw.networksearch.graphs;

import java.util.List;
import org.wbw.networksearch.abstractgraphs.AbstractListVertex;
import org.wbw.networksearch.abstractgraphs.AbstractStringifyVcoords;

public class ListVertex<C> extends AbstractListVertex<C> {

	//private static AbstractStringifyVcoords<C> stringifyVcoords;
	private static Object stringifyVcoords;
	
	public void setStringifyVcoords(AbstractStringifyVcoords<C> stringifyVcoords) {
		this.stringifyVcoords = stringifyVcoords;
	}
	
	public ListVertex() {}
	
	public ListVertex(VertexType vType, List<C> vCoordinates) {
		if (stringifyVcoords == null) {
			System.out.println("2 is null.");
		}
		this.vType = vType;
		this.vCoordinates = vCoordinates;
		this.vName = ((AbstractStringifyVcoords<C>)stringifyVcoords).encodeVcoords(vCoordinates);
	}

	public ListVertex(VertexType vType, String vName) {
		this.vName = vName;
		this.vType = vType;
		this.vCoordinates = ((AbstractStringifyVcoords<C>)stringifyVcoords).decodeVcoords(vName);
	}
}
