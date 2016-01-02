package org.wbw.networksearch.abstractgraphs;

import java.util.List;

public abstract class AbstractStringifyCoords<E> {
	
	abstract public String encodeCoords(List<E> e);
	abstract public List<E> decodeCoords(String s);

}
