package org.wbw.networksearch.simplesearcherutils;

import org.wbw.networksearch.abstractsearcherutils.PathFactory_Interface;
import org.wbw.networksearch.abstractsearcherutils.Path_Interface;
import org.wbw.networksearch.abstractsearcherutils.Path_Interface.*;

public class SimplePathFactory implements PathFactory_Interface {

	private static SearchType searchType = SearchType.BREADTH_FIRST;
	private static QueueStrategy queueStrategy = QueueStrategy.LIFO;
	private static PathType pathType = PathType.NO_EDGE_REUSE;
	
	private static SimplePathQueue pathQueue = null;
	private static SimplePathQueue freedPaths = null;
	
	public SimplePathFactory(
			SearchType searchType,
			QueueStrategy queueStrategy,
			PathType pathType
			) {
		if(pathQueue == null) {
			pathQueue = new SimplePathQueue();
		}
		if(freedPaths == null) {
			freedPaths = new SimplePathQueue();
		}
		
		this.searchType = searchType;
		this.queueStrategy = queueStrategy;
		this.pathType = pathType;
	}
	
	public SimplePath getNewPath() {
		SimplePath path;
		
		// If there are freed paths, get one
		if (freedPaths.getQueueLength() > 0) {
			// get a freedPath
			path = (SimplePath) freedPaths.getNextPathLIFO();
		} else {
			// Else, create a new one
			path = new SimplePath(pathQueue, freedQueue);
		}
		return path.initPath();
	}
}
