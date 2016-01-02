package org.wbw.networksearch.graphs;

import java.util.List;
import org.wbw.networksearch.abstractgraphs.AbstractListVertex;
import org.wbw.networksearch.abstractgraphs.AbstractStringifyCoords;

public class ListVertex<C> extends AbstractListVertex<C> {

	private AbstractStringifyCoords<C> stringifyCoords;
	
	public void setStringifyCoords(AbstractStringifyCoords<C> stringifyCoords) {
		this.stringifyCoords = stringifyCoords;
	}
	
	public ListVertex(String name, VERTEX_TYPE type, List<C> coordinates) {
		this.vertexName = name;
		this.vertexType = type;
		this.vertexCoordinates = coordinates;
	}

	public ListVertex(VERTEX_TYPE type, List<C> coordinates) {
		this.vertexName = stringifyCoords.encodeCoords(coordinates);
		this.vertexType = type;
		this.vertexCoordinates = coordinates;
	}

	public ListVertex(String name, VERTEX_TYPE type) {
		this.vertexName = name;
		this.vertexType = type;
		this.vertexCoordinates = stringifyCoords.decodeCoords(name);
	}
}
