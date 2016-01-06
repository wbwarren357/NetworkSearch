package org.wbw.networksearch.graphs;

import org.wbw.networksearch.abstractgraphs.AbstractEdge;

public class ListVertexEdge<V> extends AbstractEdge<V> {

	public ListVertexEdge(V vStart, String vStartName, V vEnd, String vEndName, EdgeWay eWay) {
		this.vStart = vStart;
		this.vStartName = vStartName;
		this.vEnd = vEnd;
		this.vEndName = vEndName;
		this.eWay = eWay;
		
		this.eName = vStartName + eWay.getWay() + vEndName;
		this.eTail = eWay.getWay() + vEndName;
	}

//
// 2016-01-05
//  Decided not to implement combing functionality at this time.
//
//	public Edge<V> combineEdges(Edge<V> eCheck) {
//		if (this.hasSameVertices(eCheck)) {
//			if (this.eWay == EdgeWay.BOTH || eCheck.getWay() == EdgeWay.BOTH ) {
//				//return new edge with same vertices and EdgeWay.BOTH
//				return new Edge<V>(
//						this.vStart,
//						this.vStartName,
//						this.vEnd,
//						this.vEndName,
//						EdgeWay.BOTH 
//						);
//			} else {
//				// return new edge same as this
//				return new Edge<V>(
//						this.vStart,
//						this.vStartName,
//						this.vEnd,
//						this.vEndName,
//						this.eWay 
//						);
//			}
//		} else {
//			return null;
//		}
//	}
}
