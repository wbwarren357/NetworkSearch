package org.wbw.networksearch.abstractgraphs;

public interface GraphFactory_Interface<V,E> {

	public Graph_Interface<V,E> getGraph(List<Integer> graphDimensions));
	
}
