package org.wbw.networksearch.abstractgraphs;

import java.util.List;

public abstract class AbstractStringifyVertex<E> {
	
	protected AbstractCoordTransformer<E> elemTransformer;

	public void setElemTransformer(AbstractCoordTransformer<E> elemTransformer) {
		this.elemTransformer = elemTransformer;
	}
	
	abstract public String encodeCoords(List<E> e);
	abstract public List<E> decodeCoords(String s);

}
