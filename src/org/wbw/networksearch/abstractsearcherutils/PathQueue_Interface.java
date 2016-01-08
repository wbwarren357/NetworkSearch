package org.wbw.networksearch.abstractsearcherutils;

public interface PathQueue_Interface {

	// queue length
	int getQueueLength();
	
	// LIFO queue
	Path_Interface getNextPathLIFO();
	void putNextPathLIFO(Path_Interface path);
	
	// FIFO queue
	Path_Interface getNextPathFIFO();
	void putNextPathFIFO(Path_Interface path);
}
