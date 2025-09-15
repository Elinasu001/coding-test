package com.ex.run;

import java.util.Arrays;

public class ArraySlice {
	// 배열 슬라이싱
	public static void main(String[] args) {
		int[] arr = {0, 1, 2, 3, 4, 5};
		
		arr = Arrays.copyOfRange(arr, 2, 4);
		System.out.println(Arrays.toString(arr)); // 2, 3
	}

}
