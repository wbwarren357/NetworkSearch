package org.wbw.networksearch.abstractgraphs;

import java.util.List;

abstract public class AbstractListVertex<C> extends AbstractVertex<C> {
	public enum VERTEX_TYPE {IS_REAL, IS_VIRTUAL}

	protected String vertexName;
	protected VERTEX_TYPE vertexType;
	protected List<C> vertexCoordinates;

	public String getName() {
		return vertexName;
	}
	
	public List<C> getCoordinates() {
		return vertexCoordinates;
	}
	
	public void setType(VERTEX_TYPE type) {
		this.vertexType = type;
	}
	public VERTEX_TYPE getTypel() {
		return vertexType;
	}

}
