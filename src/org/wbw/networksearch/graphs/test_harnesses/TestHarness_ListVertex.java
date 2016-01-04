package org.wbw.networksearch.graphs.test_harnesses;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import org.wbw.networksearch.graphs.*;
import org.wbw.networksearch.abstractgraphs.*;
import org.wbw.networksearch.abstractgraphs.AbstractTransformVcoords;
import org.wbw.networksearch.abstractgraphs.AbstractListVertex.VertexType;

public class TestHarness_ListVertex {

	public static void main(String[] args) {
		IntegerVcoordinates integerVcoordinates = new IntegerVcoordinates();
		ListStringifyVcoords<Integer> listStringifyVcoords = new ListStringifyVcoords<Integer>();
		listStringifyVcoords.setVcoordTransformer((AbstractTransformVcoords<Integer>)integerVcoordinates);
		ListVertex<Integer> throwAwaylv = new ListVertex<Integer>();
		throwAwaylv.setStringifyVcoords(listStringifyVcoords);
		
		List<Integer> listOf2 = new ArrayList<Integer>();
		listOf2.add(new Integer(-1));
		listOf2.add(new Integer(2));

		List<Integer> listOf5 = new ArrayList<Integer>();
		listOf5.add(new Integer(1));
		listOf5.add(new Integer(2));
		listOf5.add(new Integer(3));
		listOf5.add(new Integer(4));
		listOf5.add(new Integer(5));

		// Setup done - now test
		System.out.println("Setup done.");
		
		// test simple setup
		System.out.println("Test 1");
		ListVertex<Integer> lv = new ListVertex<Integer>(VertexType.IS_REAL, listOf2);
		assertEquals(lv.getVname(), "-1,2");
		assertEquals(lv.getVcoordinates(), listOf2);
		assertEquals(lv.getVtypel(), VertexType.IS_REAL);

		System.out.println("Test 2");
		lv = new ListVertex<Integer>(VertexType.IS_VIRTUAL, listOf5);
		assertEquals(lv.getVname(), "1,2,3,4,5");
		assertEquals(lv.getVcoordinates(), listOf5);
		assertEquals(lv.getVtypel(), VertexType.IS_VIRTUAL);
		
		System.out.println("Test 3");
		lv = new ListVertex<Integer>(VertexType.IS_REAL, "-1,2");
		assertEquals(lv.getVname(), "-1,2");
		assertEquals(lv.getVcoordinates(), listOf2);
		assertEquals(lv.getVtypel(), VertexType.IS_REAL);

		System.out.println("Test 4");
		lv = new ListVertex<Integer>(VertexType.IS_VIRTUAL, "1,2,3,4,5");
		assertEquals(lv.getVname(), "1,2,3,4,5");
		assertEquals(lv.getVcoordinates(), listOf5);
		assertEquals(lv.getVtypel(), VertexType.IS_VIRTUAL);

		System.out.println("all tests done.");
	}

}
