package org.wbw.networksearch.abstractgraphs;

import java.util.ArrayList;
import java.util.List;

public abstract class AbstractEdge<V> {

	public enum EDGE_TYPE{ ONE_WAY, TWO_WAY}

	protected EDGE_TYPE edgeType;
	protected V start;
	protected V end;
	protected String name;
	
	
	public List<V> getVertices() {
		List<V> list = new ArrayList();
		list.add(start);
		list.add(end);
		return list;
	}
	
	public V getStart() {
		return start;
	}
	
	public V getEnd() {
		return end;
	}
	
	public V getOtherEnd(V vertex) {
		if (vertex.equals(start)) {
			return end;
		} else {
			return start;
		}
	}

	public EDGE_TYPE getEdgeType(){
		return edgeType;
	}
	
}
