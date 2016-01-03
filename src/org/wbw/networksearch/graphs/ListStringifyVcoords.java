package org.wbw.networksearch.graphs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.wbw.networksearch.abstractgraphs.AbstractTransformVcoords;
import org.wbw.networksearch.abstractgraphs.AbstractStringifyVcoords;

public class ListStringifyVcoords<C> extends AbstractStringifyVcoords<C> {

	private static final String VERTEX_LIST_SEPARATOR = ",";
	private AbstractTransformVcoords<C> vCoordTransformer;

	public void setVcoordTransformer(AbstractTransformVcoords<C> vCordTransformer) {
		this.vCoordTransformer = vCoordTransformer;
	}
	
	public ListStringifyVcoords() {
	}
	
	@Override
	public String encodeVcoords(List<C> vCoords) {
		String vName = "";
		String sep = "";
		
		for(C vCoord : vCoords) {
			vName += sep + vCoordTransformer.stringifyVcoord(vCoord);
			sep = VERTEX_LIST_SEPARATOR;
		}
		return vName;
	}
	
	@Override
	public List<C> decodeVcoords(String vNameArg) {
		List<C> listVcoords = new ArrayList<C>();		
		List<String> listVcoordStrings = new ArrayList<String>(Arrays.asList(vNameArg.split(VERTEX_LIST_SEPARATOR)));
		for (String vCoordString : listVcoordStrings) {
			listVcoords.add(vCoordTransformer.convertVcoordString(vCoordString));
		}
		return listVcoords;
	}
}
