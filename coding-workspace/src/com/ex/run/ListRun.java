package com.ex.run;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class ListRun {
	// 리스트 : 배열의 크기를 모를 경우 길이가 가변인 리스트 사용 
	// 리스트 3가지 
	// 1. 행의 수는 고정, 열의 수는 가변인 2차원 배열
	// 2. 행의 수는 가변이고, 열의 수는 고정
	// 3. 행과 열 둘다 가변일 경우
	static List<List<Integer>> graph;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		graph = new ArrayList<>();
		for(int i = 0; i < n; i++) {
			graph.add(new ArrayList<>());// 각 행도 ArrayList로 초기화
		}
		
	}

}
