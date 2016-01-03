package org.wbw.networksearch.abstractgraphs;

public interface AbstractTransformVcoords<C> {
	
	C convertVcoordString(String s);
	String stringifyVcoord(C c);
}
