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
	
	public String getEname() {
		return eName;
	}
	
	public String getEtail() {
		return eTail;
	}
	
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
	
	public EdgeWay getWay() {
		return this.eWay;
	}
	
	public String getWayString() {
		return this.eWay.getWay();
	}
	
	public Boolean isInPath(StringBuilder path) {
		if (path.indexOf(eName) > -1) {
			return true;
		} else {
			return false;
		}
	}
	
	public Boolean hasEndVertexInPath(StringBuilder path) {
		if (path.indexOf(vEndName) > -1) {
			return true;
		} else {
			return false;
		}
	}
	
	
	public StringBuilder addEdgeToPathEnd(StringBuilder path) {
		return path.append(eTail);
	}
	
	public Boolean isEquivalent(AbstractEdge<V> eCheck) {
		if (this.vStart.equals(eCheck.getVstart()) 
				&& this.vEnd.equals(eCheck.getVend())
				&& this.eWay == eCheck.getWay()) {
			return true;
		} else {
			return false;
		}
	}
	
	public Boolean hasSameVertices(AbstractEdge<V> eCheck) {
		if (this.vStart.equals(eCheck.getVstart()) && this.vEnd.equals(eCheck.getVend())) {
			return true;
		} else if (this.vStart.equals(eCheck.getVend()) && this.vEnd.equals(eCheck.getVstart())) {
			return true;
		} else {
			return false;
		}
	}

}
