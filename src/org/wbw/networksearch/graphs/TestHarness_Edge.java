package org.wbw.networksearch.graphs;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.wbw.networksearch.abstractgraphs.AbstractTransformVcoords;
import org.wbw.networksearch.abstractgraphs.AbstractEdge.EdgeWay;
import org.wbw.networksearch.abstractgraphs.AbstractListVertex.VertexType;

public class TestHarness_Edge {

	public static void main(String[] args) {

		// Initialize the ListVertex class
		IntegerVcoordinates integerVcoordinates = new IntegerVcoordinates();
		ListStringifyVcoords<Integer> listStringifyVcoords = new ListStringifyVcoords<Integer>();
		listStringifyVcoords.setVcoordTransformer((AbstractTransformVcoords<Integer>)integerVcoordinates);
		ListVertex<Integer> tlv = new ListVertex<Integer>();
		tlv.setStringifyVcoords(listStringifyVcoords);

		// Create lists and vertices to test with
		List<Integer> listOf2 = new ArrayList<Integer>();
		List<Integer> listOf5 = new ArrayList<Integer>();

		ListVertex<Integer> lv1;
		ListVertex<Integer> lv2;

		Edge<ListVertex<Integer>> edge1;
		Edge<ListVertex<Integer>> edge2;
		Edge<ListVertex<Integer>> edge3;
		

		//Populate the testing objects
		listOf2.add(new Integer(-1));
		listOf2.add(new Integer(2));

		listOf5.add(new Integer(1));
		listOf5.add(new Integer(2));
		listOf5.add(new Integer(3));
		listOf5.add(new Integer(4));
		listOf5.add(new Integer(5));
		
		lv1 = new ListVertex<Integer>(VertexType.IS_REAL, listOf2);
		lv2 = new ListVertex<Integer>(VertexType.IS_VIRTUAL, listOf5);

		List<ListVertex<Integer>> edge1ListOfVertices = new ArrayList<ListVertex<Integer>>();
		edge1ListOfVertices.add(lv1);
		edge1ListOfVertices.add(lv2);
		
		edge1 = new Edge<ListVertex<Integer>>(lv1, lv1.getVname(), lv2, lv2.getVname(), EdgeWay.FORWARDS);
		edge2 = new Edge<ListVertex<Integer>>(lv1, lv1.getVname(), lv2, lv2.getVname(), EdgeWay.BOTH);
		edge3 = new Edge<ListVertex<Integer>>(lv2, lv2.getVname(), lv1, lv1.getVname(), EdgeWay.BACKWARDS);

		// Setup done - now test
		System.out.println("Setup done.");
		
		
		// Start testing

		// Test 1:  Edge.getEname & Edge.getEtail
//		System.out.println("Test 1:  Edge.getVertices");
//		System.out.println(edge1.getEname());
//		System.out.println("\"" + lv1.getVname() + EdgeWay.FORWARDS.getWay() + lv2.getVname() + "\"");
//		System.out.println(edge1.getEtail());
//		System.out.println("\"" + EdgeWay.FORWARDS.getWay() + lv2.getVname() + "\"");

		assertEquals(edge1.getEname(), lv1.getVname() + EdgeWay.FORWARDS.getWay() + lv2.getVname());
		assertEquals(edge1.getEtail(), EdgeWay.FORWARDS.getWay() + lv2.getVname());
	
		
		// Test 2:  test Edge.getStart, End, otherEnd
		assertTrue(edge1.getVstart().equals(lv1));
		assertTrue(edge1.getVend().equals(lv2));
		assertTrue(edge1.getOtherVend(lv1).equals(lv2));
		assertTrue(edge1.getOtherVend(lv2).equals(lv1));
		
		// Test get vertices
		assertTrue(edge1.getVertices().equals(edge1ListOfVertices));

		
		// Test edge's path methods
		StringBuilder path = new StringBuilder();
		path.append(lv1.getVname());

		// System.out.println((lv1.getVname() + edge2.getWayString() + lv2.getVname()));
		// System.out.println(path);
		
		assertTrue(edge2.addEdgeToPathEnd(path).toString().equals(lv1.getVname() + edge2.getWayString() + lv2.getVname()));
		assertTrue(edge2.hasEdge(path));
		assertTrue(edge1.hasEndVertex(path));
		
		// All tests done
		System.out.println("all tests done.");
	}

}
