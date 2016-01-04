//package org.wbw.networksearch.graphs_tests;
//
//import static org.junit.Assert.*;
//
//import java.util.ArrayList;
//import java.util.List;
//
//import org.junit.Test;
//import org.wbw.networksearch.abstractgraphs.AbstractEdge.EdgeWay;
//import org.wbw.networksearch.abstractgraphs.AbstractListVertex.VertexType;
//import org.wbw.networksearch.abstractgraphs.AbstractTransformVcoords;
//import org.wbw.networksearch.graphs.Edge;
//import org.wbw.networksearch.graphs.IntegerVcoordinates;
//import org.wbw.networksearch.graphs.ListStringifyVcoords;
//import org.wbw.networksearch.graphs.ListVertex;
//import org.junit.Before;
//
//public class Edge_Tests {
//
//	private IntegerVcoordinates integerVcoordinates = new IntegerVcoordinates();
//	private ListStringifyVcoords<Integer> listStringifyVcoords = new ListStringifyVcoords<Integer>();
//	private List<Integer> listOf2 = new ArrayList<Integer>();
//	private List<Integer> listOf5 = new ArrayList<Integer>();
//	private ListVertex<Integer> lv1;
//	private ListVertex<Integer> lv2;
//	
//	private Edge edge1;
//	private Edge edge2;
//	private Edge edge3;
//	
//	
//	@Before
//	public void setUp() {
//		listStringifyVcoords.setVcoordTransformer((AbstractTransformVcoords<Integer>)integerVcoordinates);
//		ListVertex<Integer> tlv = new ListVertex<Integer>();
//		tlv.setStringifyVcoords(listStringifyVcoords);
//
//		listOf2.add(new Integer(-1));
//		listOf2.add(new Integer(2));
//
//		listOf5.add(new Integer(1));
//		listOf5.add(new Integer(2));
//		listOf5.add(new Integer(3));
//		listOf5.add(new Integer(4));
//		listOf5.add(new Integer(5));
//		
//		lv1 = new ListVertex<Integer>(VertexType.IS_REAL, listOf2);
//		lv2 = new ListVertex<Integer>(VertexType.IS_VIRTUAL, listOf5);
//		
//		edge1 = new Edge(lv1, lv1.getVname(), lv2, lv2.getVname(), EdgeWay.FORWARDS);
//		edge2 = new Edge(lv1, lv1.getVname(), lv2, lv2.getVname(), EdgeWay.BOTH);
//		edge3 = new Edge(lv2, lv2.getVname(), lv1, lv1.getVname(), EdgeWay.BACKWARDS);
//	}
//	
//	@Test
//	public void test_GetVertices() {
//		assertEquals(edge1.getVertices(), lv1.getVname() + EdgeWay.FORWARDS.getWay() + lv2.getVname());
//		System.out.println(lv1.getVname() + EdgeWay.FORWARDS.getWay() + lv2.getVname());
//	}
//
////	@Test
////	public void testGetVstart() {
////		fail("Not yet implemented");
////	}
////
////	@Test
////	public void testGetVstartName() {
////		fail("Not yet implemented");
////	}
////
////	@Test
////	public void testGetVend() {
////		fail("Not yet implemented");
////	}
////
////	@Test
////	public void testGetVendName() {
////		fail("Not yet implemented");
////	}
////
////	@Test
////	public void testGetOtherVend() {
////		fail("Not yet implemented");
////	}
////
////	@Test
////	public void testGetEway() {
////		fail("Not yet implemented");
////	}
////
////	@Test
////	public void testHasEdge() {
////		fail("Not yet implemented");
////	}
////
////	@Test
////	public void testHasEndVertex() {
////		fail("Not yet implemented");
////	}
////
////	@Test
////	public void testAddEdgeToPathEnd() {
////		fail("Not yet implemented");
////	}
//
//}
