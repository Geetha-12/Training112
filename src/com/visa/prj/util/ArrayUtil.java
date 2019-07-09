package com.visa.prj.util;

public class ArrayUtil {
	public static int getSum(int[] data) {
		int sum=0;
		for (int i = 0; i < data.length; i++) {
			sum+=data[i];
		}
		return sum;
	}
	
	public static void sort(int[] elems) {
		
	}
	
	/**
	 * method to return no.of occurences of "no " in an array
	 * @param elems , no
	 * 
	 * 
	 */
	public static int getCount(int[] elems, int no) {
		int cnt =0;
		for (int i = 0; i < elems.length; i++) {
			if(elems[i] == no) cnt++;
			
		}
		return cnt;
	}
	public static int[] convert(int[][] data) {
		int size =  0;
		for (int i = 0; i < data.length; i++) {
			size += data[i].length;
		}
		int[] combo;
		combo = new int[size];
		int k=0;
		for (int i = 0; i < data.length; i++) {
			for (int j = 0; j < data[i].length; j++) {
				combo[k++] = data[i][j];
			}
			
		}
		return combo;
	}
}