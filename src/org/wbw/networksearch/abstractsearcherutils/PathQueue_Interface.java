package org.wbw.networksearch.abstractsearcherutils;

public interface PathQueue_Interface {


	int getQueueLength();
	
	// LIFO queue
	Path_Interface getNextPathLIFO();
	void putNextPathLIFO(Path_Interface path);
	
	// FIFO queue
	Path_Interface getNextFIFO();
	void putNextFIFO(Path_Interface path);
}
