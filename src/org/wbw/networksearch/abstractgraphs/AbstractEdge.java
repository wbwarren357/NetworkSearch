package org.wbw.networksearch.abstractgraphs;

import java.util.ArrayList;
import java.util.List;

public abstract class AbstractEdge<V> {


	public enum EdgeWay { FORWARDS(">"), BACKWARDS("<"), BOTH("|");
		private final String way;
		EdgeWay(String way) {
			this.way = way;
		}
		
		public String getWay() {
			return way;
		}
		
	}

	protected EdgeWay eWay;
	protected V vStart;
	protected String vStartName;
	protected V vEnd;
	protected String vEndName;
	protected String eTail;
	protected String eName;
	
	
	public List<V> getVertices() {
		List<V> vlist = new ArrayList<V>();
		vlist.add(vStart);
		vlist.add(vEnd);
		return vlist;
	}
	
	public V getVstart() {
		return vStart;
	}
	
	public String getVstartName() {
		return vStartName;
	}
	
	public V getVend() {
		return vEnd;
	}
	
	public String getVendName() {
		return vEndName;
	}
	
	public V getOtherVend(V vertex) {
		if (vertex.equals(vStart)) {
			return vEnd;
		} else {
			return vStart;
		}
	}
	
	public EdgeWay getEway() {
		return this.eWay;
	}
	
	public Boolean hasEdge(StringBuilder path) {
		if (path.indexOf(eName) > -1) {
			return true;
		} else {
			return false;
		}
	}
	
	public Boolean hasEndVertex(StringBuilder path) {
		if (path.indexOf(vEndName) > -1) {
			return true;
		} else {
			return false;
		}
	}
	
	public StringBuilder addEdgeToPathEnd(StringBuilder path) {
		return path.append(eTail);
	}
	
}
