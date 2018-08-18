package com.nissan;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestProj {

	@Test
	public void testAddFloat() {
		AddServlet obj=new AddServlet();
		assertEquals(10,obj.add(5,5),0.001);
	}
	@Test
	public void testAddInt() {
		AddServlet obj=new AddServlet();
		assertEquals(10,obj.add(5,5),0);
	}
	

}