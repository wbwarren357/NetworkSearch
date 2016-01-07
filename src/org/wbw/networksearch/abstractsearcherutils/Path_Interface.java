package org.wbw.networksearch.abstractsearcherutils;

public interface Path_Interface {


//	StringBuilder sb;
//	String endVname;
//	String lastEname;
//	int plength;
	// Booean pathFreed;



	public Path_Interface addToNew(String vName, String eName);
	public String getLastEndEname();
	public String getLastVertexVname();
	public String getPathString();
	public int getPathLength();
	public void freePath();
	
}
