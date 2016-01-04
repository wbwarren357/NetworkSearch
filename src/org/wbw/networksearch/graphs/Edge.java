package org.wbw.networksearch.graphs;

import org.wbw.networksearch.abstractgraphs.AbstractEdge;

public class Edge<V> extends AbstractEdge<V> {

	public Edge(V vStart, String vStartName, V vEnd, String vEndName, EdgeWay eWay) {
		this.vStart = vStart;
		this.vStartName = vStartName;
		this.vEnd = vEnd;
		this.vEndName = vEndName;
		this.eWay = eWay;
		
		this.eName = vStartName + eWay.getWay() + vEndName;
		this.eTail = eWay.getWay() + vEndName;
	}
}
