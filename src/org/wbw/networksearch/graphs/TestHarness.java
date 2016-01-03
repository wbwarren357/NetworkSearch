package org.wbw.networksearch.graphs;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.wbw.networksearch.abstractgraphs.AbstractTransformVcoords;

public class TestHarness {

	public static void main(String[] args) {
		IntegerVcoordinates integerVcoordinates = new IntegerVcoordinates();
		ListStringifyVcoords<Integer> listStringifyVcoords = new ListStringifyVcoords<Integer>();
		listStringifyVcoords.setVcoordTransformer((AbstractTransformVcoords<Integer>)integerVcoordinates);
		
		List<Integer> listOf1 = new ArrayList<Integer>();
		listOf1.add(new Integer(1));
		listOf1.add(new Integer(2));
		
		List<Integer> listOf5 = new ArrayList<Integer>();
		listOf5.add(new Integer(1));
		listOf5.add(new Integer(2));
		listOf5.add(new Integer(3));
		listOf5.add(new Integer(4));
		listOf5.add(new Integer(5));

		System.out.println("1 " + listOf1);;
		System.out.println("2 " + listOf5);;
		
//		assertEquals(listStringifyVcoords.decodeVcoords("1"), listOf1);
		System.out.println("3 " + listStringifyVcoords.decodeVcoords("1,2"));
//		assertEquals(listStringifyVcoords.decodeVcoords("1,2,3,4,5"), listOf5);
		System.out.println("4 " + listStringifyVcoords.decodeVcoords("1,2,3,4,5"));

	}

}
