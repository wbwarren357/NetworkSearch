package org.wbw.networksearch.simplesearcherutils;

import org.wbw.networksearch.abstractsearcherutils.DataCollector_Interface;
import org.wbw.networksearch.abstractsearcherutils.PathFactory_Interface;
import org.wbw.networksearch.abstractsearcherutils.PathQueue_Interface.*;
import org.wbw.networksearch.abstractsearcherutils.Path_Interface.*;

public class SimplePathFactory implements PathFactory_Interface {

	// Need to use the DataCollector_Interface argument
	
	private QueueStrategy queueStrategy = QueueStrategy.LIFO;
	private PathType pathType = PathType.NO_EDGE_REUSE;
	
	private SimplePathQueue pathQueue = null;
	private SimplePathQueue freedPaths = null;
	
	private DataCollector_Interface dataCollector;
	

	public SimplePathFactory(
			QueueStrategy queueStrategy,
			PathType pathType,
			DataCollector_Interface dataCollector
			) {
		
		pathQueue = new SimplePathQueue(queueStrategy, dataCollector);
		freedPaths = new SimplePathQueue(queueStrategy, dataCollector);
		this.queueStrategy = queueStrategy;
		this.pathType = pathType;
		this.dataCollector = dataCollector;
	}
	
	public SimplePath getNewPath() {
		SimplePath path;
		
		// If there are freed paths, get one
		if (freedPaths.getLength() > 0) {
			// get a freedPath
			path = (SimplePath) freedPaths.getPath();
		} else {
			// Else, create a new one
			path = new SimplePath(pathQueue, freedPaths);
		}
		return path.initPath(pathType, dataCollector);
	}
}
