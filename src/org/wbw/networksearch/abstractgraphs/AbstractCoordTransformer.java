package org.wbw.networksearch.abstractgraphs;

public interface AbstractCoordTransformer<E> {
	
	E convertString(String s);
	String stringifyElement(E e);
}
