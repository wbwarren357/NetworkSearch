package org.wbw.networksearch.graphs_tests;

import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.List;
import org.junit.Before;
import org.junit.Test;
import org.wbw.networksearch.abstractgraphs.AbstractTransformVcoords;
import org.wbw.networksearch.graphs.IntegerVcoordinates;
import org.wbw.networksearch.graphs.ListStringifyVcoords;

public class ListStringifyVCoords_tests {
	
	@Test
	public void testEncodeVcoords() {
		IntegerVcoordinates integerVcoordinates = new IntegerVcoordinates();
		ListStringifyVcoords<Integer> listStringifyVcoords = new ListStringifyVcoords<Integer>();
		listStringifyVcoords.setVcoordTransformer((AbstractTransformVcoords<Integer>)integerVcoordinates);
		
		List<Integer> listOf1 = new ArrayList<Integer>();
		listOf1.add(new Integer(1));

		List<Integer> listOf5 = new ArrayList<Integer>();
		listOf5.add(new Integer(1));
		listOf5.add(new Integer(2));
		listOf5.add(new Integer(3));
		listOf5.add(new Integer(4));
		listOf5.add(new Integer(5));
		
		assertEquals(listStringifyVcoords.encodeVcoords(listOf1), "1");
		assertEquals(listStringifyVcoords.encodeVcoords(listOf5), "1,2,3,4,5");
	}

	@Test
	public void testDecodeVcoords() {
		IntegerVcoordinates integerVcoordinates = new IntegerVcoordinates();
		ListStringifyVcoords<Integer> listStringifyVcoords = new ListStringifyVcoords<Integer>();
		listStringifyVcoords.setVcoordTransformer((AbstractTransformVcoords<Integer>)integerVcoordinates);
		
		List<Integer> listOf1 = new ArrayList<Integer>();
		listOf1.add(new Integer(1));
		
		List<Integer> listOf5 = new ArrayList<Integer>();
		listOf5.add(new Integer(1));
		listOf5.add(new Integer(2));
		listOf5.add(new Integer(3));
		listOf5.add(new Integer(4));
		listOf5.add(new Integer(5));

		assertEquals(listStringifyVcoords.decodeVcoords("1"), listOf1);
		System.out.println(listStringifyVcoords.decodeVcoords("1"));
		assertEquals(listStringifyVcoords.decodeVcoords("1,2,3,4,5"), listOf5);
		System.out.println(listStringifyVcoords.decodeVcoords("1,2,3,4,5"));
	}

}
