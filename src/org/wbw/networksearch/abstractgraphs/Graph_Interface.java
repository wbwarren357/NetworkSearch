package org.wbw.networksearch.abstractgraphs;

public interface Graph_Interface {

	// Name
	public String getGname();
	
	// Get and remove
	public Boolean addVname(String vName);
	public Boolean removeVname(String vName);
	public Boolean addEname(String eName);
	public Boolean removeEname(String eName);

	// Statistics
	public int getNumVertices();
	public int getNumEdges();
	
	// Membership
	public Boolean hasVertex(String vName);
	public Boolean hasEdge(String eName);
	
	// Neighbors
	public String[] getAdjacentVnames(String vName);
	public String[] getVnameEnames(String vName);
	public NextStep_Interface[] getVertexNextSteps(String vName);
	

}
