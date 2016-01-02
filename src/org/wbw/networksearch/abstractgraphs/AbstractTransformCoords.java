package org.wbw.networksearch.abstractgraphs;

public interface AbstractTransformCoords<C> {
	
	C convertString(String s);
	String stringifyCoord(C c);
}
