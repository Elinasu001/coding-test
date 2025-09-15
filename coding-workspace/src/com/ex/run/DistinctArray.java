package com.ex.run;

import java.util.Arrays;

public class DistinctArray {
	// 배열 중복 제거
	public static void main(String[] args) {
		int[] arr = {0, 1, 2, 3, 4, 5, 1, 2, 3};
		
		arr = Arrays.stream(arr).distinct().toArray();
		System.out.println(Arrays.toString(arr)); // 0, 1, 2, 3, 4, 5

	}

}
