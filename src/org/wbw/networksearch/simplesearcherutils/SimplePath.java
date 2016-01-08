package org.wbw.networksearch.simplesearcherutils;

import org.wbw.networksearch.abstractsearcherutils.PathQueue_Interface;
import org.wbw.networksearch.abstractsearcherutils.Path_Interface;

public class SimplePath implements Path_Interface {

	private StringBuilder sb = null;
	private String endVname;
	private String lastEname;
	private int plength;
	private Boolean pathFreed;

	private SimplePathQueue pathQueue;
	private SimplePathQueue freedPaths;

	
	// Constructor
	protected SimplePath(SimplePathQueue pathQueue, SimplePathQueue freedPaths) {
		this.pathQueue = pathQueue;
		this.freedPaths = freedPaths;
	}
	
	protected SimplePath initPath() {
		
		// Populate with initial values
		if(this.sb == null) {
			this.sb = new StringBuilder();
		} else {
			this.sb = sb.delete(0,  sb.length());
		}
		this.endVname = ""; 
		this.lastEname = ""; 
		this.plength = 0;
		this.pathFreed = false; 
	
		return this;
	}
	
	@Override
	public Boolean createExtendedAndQueue(String vName, String eName, String eTail) {
		Boolean extendedPathValid = true;
		
		// if NoVertexReuse, test for Vertex
		if(true) {
			
		}
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
