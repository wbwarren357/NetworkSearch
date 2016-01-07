package org.wbw.networksearch;

import java.util.List;

import org.wbw.networksearch.abstractgraphs.GraphFactory_Interface;
import org.wbw.networksearch.abstractgraphs.Graph_Interface;
import org.wbw.networksearch.abstractsearcher.Searcher_Interface;
import org.wbw.networksearch.abstractsearcherutils.DataCollector_Interface;
import org.wbw.networksearch.searcherutils.SimpleDataCollector;
import org.wbw.networksearch.searcherutils.SimplePathQueue;
import org.wbw.networksearch.abstractsearcher.SearcherFactory_Interface;

public class NetworkSearchMain {

	public static void main(String[] args) {
		
		// local parameters
		// LIFO or FIFO
		// Dimensions of the graph
		// Start and end points in the graph
		// Collect extended data yes/no
		Searcher_Interface.SearchType searchType = SearchType.BREADTH_FIRST;
		Integer[] graphDimensions = {2,2};
		Integer[] startCoords = {0,0};
		DataCollector_Interface.DataCollectorOnOff collectData = DataCollector_Interface.DataCollectorOnOff.OFF;
		
		// Get instances of the searcher utilities
		Path_Interface path_class = SimplePath.class;
		PathQueue_Interface path_class = SimplePathQueue.class;
		DataCollector_Interface dataCollector_class = SimpleDataCollector.class;
		
		// Create a new graph with the graph factory
		GraphFactory_Interface graphFactory = new xxx;
		Graph_Interface graph = graphFactory.getGraph(graphDimensions);
		
		// Create a new SearchFactory and pass arguments and the Graph object to create a searcher
		SearcherFactory_Interface searcherFactory = new xxx;
		Searcher_Interface searcher = searcherFactory.getSearcher();

		// Run Searcher
		searcher.doSearch();
		
		// Print results
		dataCollector.;
		
	}

}
