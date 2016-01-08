package org.wbw.networksearch.abstractsearcherutils;

public interface PathQueue_Interface {

	// Queue strategy
	enum QueueStrategy{ FIFO, LIFO }

	// queue length
	int getLength();
	
	// the queue will know its strategy
	Path_Interface getPath();
	void putPath(Path_Interface path);
}
