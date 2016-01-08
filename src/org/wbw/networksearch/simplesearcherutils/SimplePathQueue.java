package org.wbw.networksearch.simplesearcherutils;

import java.util.HashMap;
import java.util.LinkedList;

import org.wbw.networksearch.abstractsearcherutils.PathQueue_Interface;
import org.wbw.networksearch.abstractsearcherutils.Path_Interface;
import org.wbw.networksearch.abstractsearcherutils.DataCollector_Interface;


public class SimplePathQueue implements PathQueue_Interface {

	// queue - one per instance
	LinkedList<Path_Interface> queue = new LinkedList<>();
	
	// queue strategy for this instance
	QueueStrategy queueStrategy;
	DataCollector_Interface dataCollector;
	
	
	//Constructor
	protected SimplePathQueue(QueueStrategy queueStrategy, DataCollector_Interface dataCollector) {
		this.queueStrategy = queueStrategy;
		this.dataCollector = dataCollector;
	}
	
	@Override
	public int getLength() {
		return queue.size();
	}

	@Override
	public Path_Interface getPath() {
		if(queueStrategy == QueueStrategy.FIFO) {
			// FIFO - take from the front (removeFirst) and add to end (addLast)
			return queue.removeFirst();
		} else {
			// LIFO - take last (removeLast) and add to end (addLast)
			return queue.removeLast();
		}
	}

	@Override
	public void putPath(Path_Interface path) {
		if(queueStrategy == QueueStrategy.FIFO) {
			// FIFO - take from the front (removeFirst) and add to end (addLast)
			queue.addLast(path);
		} else {
			// LIFO - take last (removeLast) and add to end (addLast)
			queue.addLast(path);
		}
	}
}
