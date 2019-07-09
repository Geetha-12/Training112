package com.visa.prj.util;

import static org.junit.Assert.*;

import org.junit.Test;

public class ArrayUtilTest {

	@Test
	public void testGetSum() {
		int[] data = {1,2,3,4,5,6};
		int expected = 21;
		assertEquals(expected, ArrayUtil.getSum(data));
	}

	@Test
	public void testSort() {
		int[] data = {6,4,3,5,1,2};
		int[] expected = {1,2,3,4,5,6};
		ArrayUtil.sort(data);
		assertArrayEquals(expected,data);
	}

	@Test
	public void testGetCount() {
		int[] data = {66,2,66,23,55,66};
		int expected = 3;
		assertEquals(expected, ArrayUtil.getCount(data,66));
	}
	
	@Test
	public void testconvert() {
		int[][] data = { {6,4,3,5,1,2}, {7,8,9} };
		int[] expected = {6,4,3,5,1,2,7,8,9};
		assertArrayEquals(expected,ArrayUtil.convert(data));
	}

}
