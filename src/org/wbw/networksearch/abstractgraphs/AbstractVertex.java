package org.wbw.networksearch.abstractgraphs;

import java.util.List;

abstract public class AbstractVertex<C,V> {
	public static final Boolean ISREAL = true;
	public static final Boolean ISVIRTUAL = false;
	
	private String vertexName;
	private Boolean isVirtual;
	private List<C> coordinates;
	
	public String getName() {
		return vertexName;
	}
	
	public List<C> getCoords(V vertex) {
		return coordinates;
	}
	
	public void setIsVirtual(Boolean isVirtual) {
		this.isVirtual = isVirtual;
	}
	public Boolean getIsVirtual() {
		return isVirtual;
	}
	public void setReal() {
		isVirtual = false;
	}
	
	public Boolean isVirtual() {
		return isVirtual;
	}
	public Boolean isReal() {
		return !isVirtual;
	}
}
