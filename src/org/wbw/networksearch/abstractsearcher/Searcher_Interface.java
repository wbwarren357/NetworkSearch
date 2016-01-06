package org.wbw.networksearch.abstractsearcher;


import java.util.List;

import org.wbw.networksearch.abstractgraphs.Graph_Interface;

public interface Searcher_Interface {

	// Configure
	setWorkQueue(WorkQueue_Interface workQueue);
	setStringStorageProvider(StringStorageProvider_Interface stringStorageProvider);
	setDataCollector(DataCollector_Interface dataCollector);
	
	// Do search and get results
	public Boolean doSearch(
			Graph_Interface graph,
			List<Integer> startVcoords,
			List<Integer> endVcoords,
			PathType pathType
			);

}
