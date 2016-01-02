package org.wbw.networksearch.graphs_tests;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.wbw.networksearch.graphs.IntegerCoordinates;

public class IntegerCoordinates_tests {

	
	
	@Test
	public void testConvertString() {
		IntegerCoordinates integerCoordinates = new IntegerCoordinates();
		
		assertEquals(integerCoordinates.convertString("1"), new Integer(1));
		assertEquals(integerCoordinates.convertString("12345678"), new Integer(12345678));
		assertEquals(integerCoordinates.convertString(" 123 "), new Integer(123));
		assertEquals(integerCoordinates.convertString("123 "), new Integer(123));
		
	}

	@Test
	public void testStringifyCoord() {
		IntegerCoordinates integerCoordinates = new IntegerCoordinates();
		
		assertEquals(integerCoordinates.stringifyCoord(new Integer(1)), "1");
		assertEquals(integerCoordinates.stringifyCoord(new Integer(12345678)), "12345678");
		
	}

}
