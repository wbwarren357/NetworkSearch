package org.wbw.networksearch.abstractsearcher;

import org.wbw.networksearch.abstractgraphs.Graph_Interface;
public interface Searcher_Interface {

	public enum WorkQueueType { FIFO, LIFO };
	public enum PathType { NO_VERTEX_REUSE, NO_EDGE_REUSE };
	
	// Configure
	public void setWorkQueueType(WorkQueueType workQueueType);
	public void setPathType(PathType path_type);
	
	// Do search and get results
	public Boolean doSearch(Graph_Interface graph);
	public void reportResults();
}
