package org.wbw.networksearch.abstractgraphs;

import java.util.List;

public abstract class AbstractGraph<V,E> {

	private String graphName;
	// private hashMap of vertices (real & virtual) keyed by vertex name
	// private hasMap of edges keyed by edge name
	// private hashMap of vertex's (real & virutal) list of edges, keyed by vertex name
	// private hashMap of real vertex's neighbor vertices (real and virtual) (real and virtual) (for which there is an edge)
	// virtual vertices are removed from the graph when there are no edges connecting it to a real vertex
	
	public String getGraphName() {
		return graphName;
	}
	
	public abstract String toString();
	
	public abstract Boolean addVertex(V vertex);
	public abstract Boolean removeVertex(V vertex);
	public abstract Boolean addEdge(E edge);
	public abstract Boolean removeEdge(E edge);
	
	public abstract int getNumVertices();
	public abstract int getNumEdges();
	
	public abstract Boolean hasVertex(V vertex);
	public abstract Boolean hasEdge(E edge);
	
	public abstract List<V> getAdjacentVertices(V vertex);
	// get vertex type in graph, real or virtual
	// set vertex type in graph, real or virtual
	// get edge type, oneWay or twoWay
}
