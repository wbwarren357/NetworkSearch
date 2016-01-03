package org.wbw.networksearch.graphs;

import org.wbw.networksearch.abstractgraphs.AbstractEdge;

public class Edge<V> extends AbstractEdge<V> {

	public Edge(V startV, V endV, EDGE_TYPE edgeType) {
		this.start = startV;
		this.end = endV;
		this.edgeType = edgeType;
		this.name = "";
	}
}
