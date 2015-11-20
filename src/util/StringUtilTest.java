package util;

import static org.junit.Assert.*;

import org.junit.Test;

import gc.common.structures.OrderedIntTuple;

public class StringUtilTest {


	@Test
	public void testPeel() {
		assertEquals("", StringUtil.peel(""));
		assertEquals("", StringUtil.peel("."));
		assertEquals("", StringUtil.peel(".."));
		assertEquals("!", StringUtil.peel(".!."));
		assertEquals("!", StringUtil.peel(".!+"));
		assertEquals("!!", StringUtil.peel(".!!."));
	}
	
	@Test
	public void testReplace() {
		assertEquals("X", StringUtil.replace(null, interval(0,0), "X"));
		assertEquals("X", StringUtil.replace("", interval(0,0), "X"));
		assertEquals("X", StringUtil.replace("", interval(1,1), "X"));
		
		assertEquals("X", StringUtil.replace("a", interval(0,0), "X"));
		assertEquals("aX", StringUtil.replace("a", interval(1,1), "X"));
		
		assertEquals("bXb", StringUtil.replace("bab", interval(1,1), "X"));
		assertEquals("bXXb", StringUtil.replace("bab", interval(1,1), "XX"));
		
		assertEquals("baXXXab", StringUtil.replace("baaaab", interval(2,3), "XXX"));
		
	}

	@Test
	public void testInsert() {
		assertEquals("X", StringUtil.insert(null, 0, "X"));
		assertEquals("X", StringUtil.insert("", 0, "X"));
		assertEquals("X", StringUtil.insert("", 1, "X"));
		
		assertEquals("Xa", StringUtil.insert("a", 0, "X"));
		assertEquals("aX", StringUtil.insert("a", 1, "X"));
		
		assertEquals("bXb", StringUtil.insert("bb", 1, "X"));
		
	}

	
	private OrderedIntTuple interval(int lo, int hi) {
		return OrderedIntTuple.create(lo, hi);
	}

}
