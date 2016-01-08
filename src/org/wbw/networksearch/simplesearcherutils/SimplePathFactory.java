package org.wbw.networksearch.simplesearcherutils;

import org.wbw.networksearch.abstractsearcherutils.PathFactory_Interface;
import org.wbw.networksearch.abstractsearcherutils.PathQueue_Interface.*;
import org.wbw.networksearch.abstractsearcherutils.Path_Interface.*;

public class SimplePathFactory implements PathFactory_Interface {

	private QueueStrategy queueStrategy = QueueStrategy.LIFO;
	private PathType pathType = PathType.NO_EDGE_REUSE;
	
	private SimplePathQueue pathQueue = null;
	private SimplePathQueue freedPaths = null;
	
	public SimplePathFactory(
			QueueStrategy queueStrategy,
			PathType pathType
			) {
		
		pathQueue = new SimplePathQueue(queueStrategy);
		freedPaths = new SimplePathQueue(queueStrategy);
		this.queueStrategy = queueStrategy;
		this.pathType = pathType;
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
		return path.initPath(pathType);
	}
}
