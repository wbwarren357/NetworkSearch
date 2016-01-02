package org.wbw.networksearch.abstractgraphs;

import java.util.List;

public abstract class AbstractVertexFactory<E,V> {
	private AbstractStringifyVertex<E> stringifyVertex;
	
	public abstract V newVertex(List<E> coords);
}

