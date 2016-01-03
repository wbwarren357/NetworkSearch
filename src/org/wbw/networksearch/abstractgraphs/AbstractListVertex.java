package org.wbw.networksearch.abstractgraphs;

import java.util.List;

abstract public class AbstractListVertex<C> extends AbstractVertex<C> {
	public enum VertexType {IS_REAL, IS_VIRTUAL}

	protected String vName;
	protected VertexType vType;
	protected List<C> vCoordinates;

	public String getVname() {
		return vName;
	}
	
	public List<C> getVcoordinates() {
		return vCoordinates;
	}
	
	public void setVtype(VertexType vtype) {
		this.vType = vType;
	}
	public VertexType getVtypel() {
		return vType;
	}

}
