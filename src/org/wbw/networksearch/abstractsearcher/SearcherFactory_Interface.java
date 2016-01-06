package org.wbw.networksearch.abstractsearcher;

import org.wbw.networksearch.abstractgraphs.Graph_Interface;
import org.wbw.networksearch.abstractsearcher.Searcher_Interface.PathType;
import org.wbw.networksearch.abstractsearcher.Searcher_Interface.WorkQueueType;


public interface SearcherFactory_Interface {

	public InterfaceSearcher getSearcher( 
			Graph_Interface graph,
			PathType pathType,
			WorkQueueType workQueueType);
}
