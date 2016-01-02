package org.wbw.networksearch.abstractgraphs;

public abstract class AbstractEdgeFactory<V,E,S> {

	private S edgeNamingStrategy;
	
	abstract public E newEdge(V v1, V v2, int direction);
}
