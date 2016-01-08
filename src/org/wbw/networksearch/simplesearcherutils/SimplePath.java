package org.wbw.networksearch.simplesearcherutils;

import org.wbw.networksearch.abstractsearcherutils.PathQueue_Interface;
import org.wbw.networksearch.abstractsearcherutils.Path_Interface;

public class SimplePath implements Path_Interface {

	private StringBuilder sb;
	private String endVname;
	private String lastEname;
	private int plength;
	private Boolean pathFreed;

	private SimplePathQueue pathQueue;
	private SimplePathQueue freedPaths;

	
	// Constructor
	private SimplePath() {}
	
	@Override
	public Path_Interface getNewPath(PathQueue_Interface pathQueue, PathQueue_Interface freedPaths) {
		SimplePath path;
		
		// If there are freed paths, get one
		if (freedPaths.getQueueLength() > 0) {
			// get a freedPath
			path = (SimplePath) freedPaths.getNextPathLIFO();
		} else {
			// Else, create a new one
			path = new SimplePath();
		}
		
		// Populate with initial values
		path.clearSB();
		path.setEndVname("");
		path.setLastEname("");
		path.setPlength(0);
		path.setPathFreed(true);
		path.setPathQueue((SimplePathQueue) pathQueue);
		path.setFreedPaths((SimplePathQueue) freedPaths);

		return path;
	}
	
	private void clearSB() { this.sb = sb.delete(0,  sb.length()); }
	private void setEndVname(String endVname) { this.endVname = endVname; }
	private void setLastEname(String lastEname) { this.lastEname = lastEname; }
	private void setPlength(int pLength) { this.plength = pLength; }
	private void setPathFreed(Boolean pathFrred) { this.pathFreed = pathFreed; }
	private void setPathQueue(SimplePathQueue pathQueue) {this.pathQueue = pathQueue; }
	private void setFreedPaths(SimplePathQueue freedPaths) {this.freedPaths = freedPaths; }
	
	@Override
	public Boolean createExtendedAndQueue(PathType pathType, String vName, String eName, String eTail) {
		return true;
	}

	@Override
	public String getEndEname() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getEndVname() {
		return this.endVname;
	}

	@Override
	public String getPathString() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int getPathLength() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void freePath() {
		// TODO Auto-generated method stub

	}
}
