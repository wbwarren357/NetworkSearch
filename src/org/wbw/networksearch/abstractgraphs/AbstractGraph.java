package org.wbw.networksearch.abstractgraphs;

import java.util.List;

public abstract class AbstractGraph<V,E> {

	private String graphName = "";
	
	public String getGraphName() {
		return graphName;
	}
	public void setGraphName(String graphName) {
		this.graphName = graphName;
	}
	
	public abstract String toString();
	
	public abstract void addVertex(V vertex);
	public abstract void removeVertex(V vertex);
	public abstract void addEdge(E edge);
	public abstract void removeEdge(E edge);
	
	public abstract int numVertices();
	public abstract int numEdges();
	
	public abstract Boolean hasVertex(V vertex);
	public abstract Boolean hasEdge(E edge);
	
	public abstract List<V> getAdjacentVertices(V vertex);
}
