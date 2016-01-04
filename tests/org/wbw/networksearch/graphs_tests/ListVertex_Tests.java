package org.wbw.networksearch.graphs_tests;


import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.wbw.networksearch.abstractgraphs.AbstractTransformVcoords;
import org.wbw.networksearch.abstractgraphs.AbstractListVertex.VertexType;
import org.wbw.networksearch.graphs.IntegerVcoordinates;
import org.wbw.networksearch.graphs.ListStringifyVcoords;
import org.wbw.networksearch.graphs.ListVertex;

public class ListVertex_Tests {

	private IntegerVcoordinates integerVcoordinates = new IntegerVcoordinates();
	private ListStringifyVcoords<Integer> listStringifyVcoords = new ListStringifyVcoords<Integer>();

	@Before
	public void setUp() {
		listStringifyVcoords.setVcoordTransformer((AbstractTransformVcoords<Integer>)integerVcoordinates);
		ListVertex<Integer> lv = new ListVertex<Integer>();
		lv.setStringifyVcoords(listStringifyVcoords);
	}
	
	@Test
	public void testListVertex_getVname() {
		ListVertex<Integer> lv = new ListVertex(VertexType.IS_REAL, "1,4");
		assertEquals(lv.getVname(), "1.4");
		
		
	}

//	@Test
//	public void testListVertexVertexTypeString() {
//		fail("Not yet implemented");
//	}
//
//	@Test
//	public void testGetVname() {
//		fail("Not yet implemented");
//	}
//
//	@Test
//	public void testGetVcoordinates() {
//		fail("Not yet implemented");
//	}
//
//	@Test
//	public void testSetVtype() {
//		fail("Not yet implemented");
//	}
//
//	@Test
//	public void testGetVtypel() {
//		fail("Not yet implemented");
//	}

}
