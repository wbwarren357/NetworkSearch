package org.wbw.networksearch.abstractgraphs;

import org.wbw.networksearch.abstractgraphs.AbstractEdge.EDGE_TYPE;

public abstract class AbstractPath {

	// a path is a list of vertex names separated by
	//    a pipe or a ">" character.
	
	protected String pathString;
	protected String start;
	protected String end;
	protected int length;
	
	public abstract String getPathString();
	public abstract String getStartName();
	public abstract String getEnd();
	public abstract Boolean hasVertex(String vName);
	public abstract Boolean hasEdge(String eName);
	public abstract void addVertex(String vName, EDGE_TYPE edgeType);
	public abstract int getLength();
	
	
}
