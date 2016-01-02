package org.wbw.networksearch.graphs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.wbw.networksearch.abstractgraphs.AbstractTransformCoords;
import org.wbw.networksearch.abstractgraphs.AbstractStringifyCoords;

public class ListStringifyCoords<C> extends AbstractStringifyCoords<C> {

	private static final String VERTEX_LIST_SEPARATOR = ",";
	private AbstractTransformCoords<C> coordTransformer;

	public void setCoordTransformer(AbstractTransformCoords<C> coordTransformer) {
		this.coordTransformer = coordTransformer;
	}
	
	public ListStringifyCoords() {
	}
	
	@Override
	public String encodeCoords(List<C> coords) {
		String vertexName = "";
		String sep = "";
		
		for(C coord : coords) {
			vertexName += sep + coordTransformer.stringifyCoord(coord);
			sep = VERTEX_LIST_SEPARATOR;
		}
		return vertexName;
	}
	
	@Override
	public List<C> decodeCoords(String nameArg) {
		List<C> listCoords = new ArrayList<C>();		
		List<String> listStrings = new ArrayList<String>(Arrays.asList(nameArg.split(VERTEX_LIST_SEPARATOR)));
		for (String s : listStrings) {
			listCoords.add(coordTransformer.convertString(s));
		}
		return listCoords;
	}
}
