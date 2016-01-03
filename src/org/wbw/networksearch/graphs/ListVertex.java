package org.wbw.networksearch.graphs;

import java.util.List;
import org.wbw.networksearch.abstractgraphs.AbstractListVertex;
import org.wbw.networksearch.abstractgraphs.AbstractStringifyVcoords;

public class ListVertex<C> extends AbstractListVertex<C> {

	private AbstractStringifyVcoords<C> stringifyVcoords;
	
	public void setStringifyVcoords(AbstractStringifyVcoords<C> stringifyVcoords) {
		this.stringifyVcoords = stringifyVcoords;
	}
	
	public ListVertex(VertexType vType, List<C> vCoordinates) {
		this.vType = vType;
		this.vCoordinates = vCoordinates;
		this.vName = stringifyVcoords.encodeVcoords(vCoordinates);
	}

	public ListVertex(VertexType vType, String vName) {
		this.vName = vName;
		this.vType = vType;
		this.vCoordinates = stringifyVcoords.decodeVcoords(vName);
	}
}
