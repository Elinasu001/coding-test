package com.ex.run;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class MainRun {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] arr = new int[10];
		List<Integer> list = new ArrayList<>();
		
		for(int i = 0; i < 10; i++) {
			arr[i] = i;
			list.add(arr[i]);
		}
		
//		for(int j = 0; j < arr.length; j++) { // 기본적인 반복문
//			System.out.println(arr[j]);
//		}
		
//		for(int j = 0; j < list.size(); j++) { // 기본적이 반복문 컬렉션
//			System.out.println(list.get(j));
//		}
		
//		for(int i : arr) { // 향상된 for문 배열일 때 배열의 담겨있는 자료형
//			System.out.println(i);
//		}
		
		for(int j : list) {	// 컬렉셩일 경우 컬렉션일 떄 담겨있는 자료형
			System.out.println(j);
		}
		
		
		Arrays.stream(arr).forEach(System.out::println);
		// int 형은 기본자료형이라 객체형으로 다룰려는 람다식을 사용하려면
		// stream 으로 변환해야함
		
		list.forEach(e -> System.out.print(e));
		list.forEach(System.out::println); // 컬렉션일 때 람다식 단순 출력은 이런 형태로 써도 됨.
		//list.forEach(e -> System.out.print(e))와 같음
		
		list.stream().map(e -> e*e).forEach(System.out::println);
		// 스트림 형태로 바꾸는 이유는 값을 변환하기 윟마 map 으로 제공
		
		
		
	}

}
