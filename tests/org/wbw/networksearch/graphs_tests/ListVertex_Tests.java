package org.wbw.networksearch.graphs_tests;


import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

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
	private List<Integer> listOf2 = new ArrayList<Integer>();
	private List<Integer> listOf5 = new ArrayList<Integer>();
	
	@Before
	public void setUp() {
		listStringifyVcoords.setVcoordTransformer((AbstractTransformVcoords<Integer>)integerVcoordinates);
		ListVertex<Integer> lv = new ListVertex<Integer>();
		lv.setStringifyVcoords(listStringifyVcoords);

		listOf2.add(new Integer(-1));
		listOf2.add(new Integer(2));

		listOf5.add(new Integer(1));
		listOf5.add(new Integer(2));
		listOf5.add(new Integer(3));
		listOf5.add(new Integer(4));
		listOf5.add(new Integer(5));

	}
	
	@Test
	public void testVcoordsConstructor() {
		ListVertex<Integer> lv = new ListVertex<Integer>(VertexType.IS_REAL, listOf2);
		assertEquals(lv.getVname(), "-1,2");
		assertEquals(lv.getVcoordinates(), listOf2);
		assertEquals(lv.getVtypel(), VertexType.IS_REAL);

		lv = new ListVertex<Integer>(VertexType.IS_VIRTUAL, listOf5);
		assertEquals(lv.getVname(), "1,2,3,4,5");
		assertEquals(lv.getVcoordinates(), listOf5);
		assertEquals(lv.getVtypel(), VertexType.IS_VIRTUAL);
	}

	@Test
	public void testVnameConstructor() {
		ListVertex<Integer> lv = new ListVertex<Integer>(VertexType.IS_REAL, "-1,2");
		assertEquals(lv.getVname(), "-1,2");
		assertEquals(lv.getVcoordinates(), listOf2);
		assertEquals(lv.getVtypel(), VertexType.IS_REAL);

		lv = new ListVertex<Integer>(VertexType.IS_VIRTUAL, "1,2,3,4,5");
		assertEquals(lv.getVname(), "1,2,3,4,5");
		assertEquals(lv.getVcoordinates(), listOf5);
		assertEquals(lv.getVtypel(), VertexType.IS_VIRTUAL);
	}
}
