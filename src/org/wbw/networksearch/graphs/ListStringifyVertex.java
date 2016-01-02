package org.wbw.networksearch.graphs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.wbw.networksearch.abstractgraphs.AbstractCoordTransformer;
import org.wbw.networksearch.abstractgraphs.AbstractStringifyVertex;

public class ListStringifyVertex<E> extends AbstractStringifyVertex<E> {

	private static final String VERTEX_LIST_SEPARATOR = ",";

	private AbstractCoordTransformer<E> elemTransformer;

	public void setElemTransformer(AbstractCoordTransformer<E> elemTransformer) {
		this.elemTransformer = elemTransformer;
	}
	
	public ListStringifyVertex() {
	}
	
	@Override
	public String encodeCoords(List<E> elements) {
		String vertexName = "";
		String sep = "";
		
		for(E element : elements) {
			vertexName += sep + elemTransformer.stringifyElement(element);
			sep = VERTEX_LIST_SEPARATOR;
		}
		return vertexName;
	}
	
	@Override
	public List<E> decodeCoords(String nameArg) {
		List<E> listCoords = new ArrayList<E>();		List<String> listStrings = new ArrayList<String>(Arrays.asList(nameArg.split(VERTEX_LIST_SEPARATOR)));
		for (String s : listStrings) {
			listCoords.add(elemTransformer.convertString(s));
		}
		return listCoords;
	}
}
