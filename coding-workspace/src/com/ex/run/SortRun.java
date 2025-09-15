package com.ex.run;

import java.util.Arrays;
import java.util.Collections;

public class SortRun {

	public static void main(String[] args) {
		int[] arr = {5, 3, 2, 1, 4, 9, 4, 6};
		Arrays.sort(arr); // 오름차순 정렬
		System.out.println(Arrays.toString(arr)); // [1, 2, 3, 4, 4, 5, 6, 9]
		
		
		int[] arr2 = {5, 3, 2, 1, 4, 9, 4, 6}; 
		Arrays.sort(arr2, 1, 4); //  3, 2, 1, 4  오름차순 정렬
		System.out.println(Arrays.toString(arr2)); // [5, 1, 2, 3, 4, 9, 4, 6]
		
		//Collections.reverseOrder()는 Comparable을 구현한 객체만 정렬할 수 있어 
		//int 형에서 Integer로 변환하여 사용해야한다. 배열에 -1을 곱한 뒤, 오름차순 정렬하는 방법도 있다. 
		int[] arr3 = {5, 3, 2, 1, 4, 9, 4, 6}; 
		Integer[] arr31 = Arrays.stream(arr3).boxed().toArray(Integer[]::new);
		Arrays.sort(arr31, Collections.reverseOrder()); // 내림차순 정렬
		System.out.println(Arrays.toString(arr31)); // [9, 6, 5, 4, 4, 3, 2, 1]
		
		// 1) boxed()란?
		// arr3가 int[]라고 가정하면, Arrays.stream(arr3)은 IntStream(기본형 스트림)을 만든다
		// boxed()는 IntStream 의 각 int를 Wrapper 타입인 Integer로 감싸서 Stream<Integer<로 바꾼다.
		// 즉, int->Integer 박식(boxing)하는 단계 (자동 박싱 개념이지만, 스트림에서는 명시적으로 boxed()호출해야함.
	}

}
