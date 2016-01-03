package org.wbw.networksearch.graphs;

import org.wbw.networksearch.abstractgraphs.AbstractEdge;

public class Edge<V> extends AbstractEdge<V> {

//	protected EdgeWay eWay;
//	protected V vStart;
//	protected String vStartName;
//	protected V vEnd;
//	protected String vEndName;
//	protected String eTail;
//	protected String eName;	

	public Edge(V vStart, String vStartName, V vEnd, String vEndName, EdgeWay eWay) {
		this.vStart = vStart;
		this.vStartName = vStartName;
		this.vEnd = vEnd;
		this.vEndName = vEndName;
		this.eWay = eWay;
		
		this.eTail = vStartName + eWay.getWay() + vEndName;
	}
}
