package org.wbw.networksearch.abstractsearcherutils;

public interface Path_Interface {
	enum PathType{ NO_VERTEX_REUSE, NO_EDGE_REUSE }
	
	public Boolean createExtendedAndQueue(String vName, String eName, String eTail);
	public String getEndEname();
	public String getEndVname();
	public String getPathString();
	public int getPathLength();
	public void freePath();
}
