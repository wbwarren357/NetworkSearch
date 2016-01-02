package org.wbw.networksearch.abstractgraphs;

import java.util.List;

public abstract class AbstractEdge<V> {

	public static final int DIRECTED = 0;
	public static final int BIDIRECTIONAL = 1;
	
	private int direction;
	
	public abstract List<V> getVertices();
	public int getDirection(){
		return direction;
	}
	public abstract V getStart();
	public abstract V getEnd();
	public abstract V getOtherEnd(V vertex);
}
