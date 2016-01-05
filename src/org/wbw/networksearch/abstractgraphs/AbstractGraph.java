package org.wbw.networksearch.abstractgraphs;

import java.util.List;

public abstract class AbstractGraph<V,E> {

	// NOTE:  for now, if a vertex is deleted, all edges that connect
	// to that vertex are deleted.  There are no virtual vertices.
	//
	// NOTE:  You can't add an edge unless both vertices already exist in the graph

	// No edge combining.  If an edge already exists in the graph
	// of any directionality and it is tried to add another edge, the add will fail.

	
	protected String gName;
	
	private String getGname() {
		return this.gName;
	}
	// private hashMap of vertices keyed by vertex name
	// private hasMap of edges keyed by edge name
	// private hashMap of real vertex's list of edges, keyed by vertex name
	// private hashMap of real vertex's neighbor  vertices (for which there is a forward, backward, or both edge)
	

	public String getGraphName() {
		return gName;
	}
	
	//public abstract String toString();
	
	public Boolean addVertex(V vertex) {
		// returns true only if no equivalent vertex exists in the graph already
		return null;
	}
	
	public Boolean removeVertex(V vertex) {
		// returns true only if an equivalent vertex exists in the graph and is removed
		// NOTE:  when a vertex is removed, all edges in the graph connecting it to
		// other vertices are also removed.
		return null;
	}
	
	public Boolean addEdge(E edge) {
		// returns true only if:
		// a.  equivalents of the two end point vertices exist in the graph
		// b.  there is no node of any directionality that connects the two vertices
		//     already in the graph
		return null;
	}
	
	public Boolean removeEdge(E edge) {
		// returns true only if an equivalent edge of the same directionality 
		//   already exists in the graph
		// NOTE:  a vertex can exist in the graph with no
		//   edges connected to it.
		return null; 
	}
	
	public int getNumVertices() {
		return 0;
	}
	
	public int getNumEdges() {
		return 0;
	}
	
	public Boolean hasVertex(V vertex) {
		// returns true only if the graph has an equivalent vertex of the same
		//   directionality
		return null;
	}
	public Boolean hasEdge(E edge) {
		// returns true only if the graph has an equivalent edge existing in it
		// and the edge is removed.
		return null;
	}
	
	public List<V> getAdjacentVertices(V vertex) {
		// returns a list of the vertices for which there exists
		//   an edge from / to the given vertex
		return null;
	}
	
	public List<E> getVertexEdges(V vertex) {
		// return a list of edges that connect to this vertex
		return null;
	}

}
