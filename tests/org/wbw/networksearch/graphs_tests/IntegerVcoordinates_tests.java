package org.wbw.networksearch.graphs_tests;

import static org.junit.Assert.*;

import org.junit.Test;
import org.wbw.networksearch.graphs.IntegerVcoordinates;

public class IntegerVcoordinates_tests {

	
	
	@Test
	public void testConvertVcoordString() {
		IntegerVcoordinates integerVcoordinates = new IntegerVcoordinates();
		
		assertEquals(integerVcoordinates.convertVcoordString("1"), new Integer(1));
		assertEquals(integerVcoordinates.convertVcoordString("12345678"), new Integer(12345678));
		assertEquals(integerVcoordinates.convertVcoordString(" 123 "), new Integer(123));
		assertEquals(integerVcoordinates.convertVcoordString("123 "), new Integer(123));
		
	}

	@Test
	public void testStringifyVcoord() {
		IntegerVcoordinates integerVcoordinates = new IntegerVcoordinates();
		
		assertEquals(integerVcoordinates.stringifyVcoord(new Integer(1)), "1");
		assertEquals(integerVcoordinates.stringifyVcoord(new Integer(12345678)), "12345678");
		
	}

}
