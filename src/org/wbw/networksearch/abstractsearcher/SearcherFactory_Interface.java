package org.wbw.networksearch.abstractsearcher;

import org.wbw.networksearch.abstractgraphs.Graph_Interface;
import org.wbw.networksearch.abstractgraphs.PathExtender_Interface;


public interface SearcherFactory_Interface {

	public Searcher_Interface getSearcher( 
			WorkQueue_Interface workQueue,
			StringStorageProvider_Interface stringStorageProvider,
			DataCollector_Interface dataCollector
		);
}
