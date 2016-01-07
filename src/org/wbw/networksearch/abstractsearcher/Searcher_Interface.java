package org.wbw.networksearch.abstractsearcher;

public interface Searcher_Interface {

	public enum SearchType { BREADTH_FIRST, DEPTH_FIRST};
	
	public Searcher_Interface getSearcher();
	
}
