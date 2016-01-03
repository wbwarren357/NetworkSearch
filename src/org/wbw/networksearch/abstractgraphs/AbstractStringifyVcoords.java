package org.wbw.networksearch.abstractgraphs;

import java.util.List;

public abstract class AbstractStringifyVcoords<C> {
	
	abstract public String encodeVcoords(List<C> c);
	abstract public List<C> decodeVcoords(String s);

}
