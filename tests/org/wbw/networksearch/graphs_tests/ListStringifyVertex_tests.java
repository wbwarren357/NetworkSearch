package org.wbw.networksearch.graphs_tests;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.wbw.networksearch.abstractgraphs.AbstractCoordTransformer;
import org.wbw.networksearch.graphs.IntegerCoordinates;
import org.wbw.networksearch.graphs.ListStringifyVertex;

public class ListStringifyVertex_tests {
	
	@Test
	public void testEncodeCoords() {
		IntegerCoordinates integerCoordinates = new IntegerCoordinates();
		ListStringifyVertex<Integer> listStringifyVertex = new ListStringifyVertex<Integer>();
		listStringifyVertex.setElemTransformer((AbstractCoordTransformer<Integer>)integerCoordinates);
		
		List<Integer> listOf1 = new ArrayList<Integer>();
		listOf1.add(new Integer(1));

		List<Integer> listOf5 = new ArrayList<Integer>();
		listOf5.add(new Integer(1));
		listOf5.add(new Integer(2));
		listOf5.add(new Integer(3));
		listOf5.add(new Integer(4));
		listOf5.add(new Integer(5));
		
		assertEquals(listStringifyVertex.encodeCoords(listOf1), "1");
		assertEquals(listStringifyVertex.encodeCoords(listOf5), "1,2,3,4,5");
	}

	@Test
	public void testDecodeCoords() {
		IntegerCoordinates integerCoordinates = new IntegerCoordinates();
		ListStringifyVertex<Integer> listStringifyVertex = new ListStringifyVertex<Integer>();
		listStringifyVertex.setElemTransformer((AbstractCoordTransformer<Integer>)integerCoordinates);
		
		List<Integer> listOf1 = new ArrayList<Integer>();
		listOf1.add(new Integer(1));
		
		List<Integer> listOf5 = new ArrayList<Integer>();
		listOf5.add(new Integer(1));
		listOf5.add(new Integer(2));
		listOf5.add(new Integer(3));
		listOf5.add(new Integer(4));
		listOf5.add(new Integer(5));

		assertEquals(listStringifyVertex.decodeCoords("1"), listOf1);
		assertEquals(listStringifyVertex.decodeCoords("1,2,3,4,5"), listOf5);
	}

}
