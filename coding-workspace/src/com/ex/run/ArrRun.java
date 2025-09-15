package com.ex.run;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class ArrRun {
	boolean[] visited; // 전역 변수 선언 후, 함수 안에서 초기화
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		// 4 5 7 같이 입력받아야 할 경우
		StringTokenizer st = new StringTokenizer(br.readLine());
		int x = Integer.parseInt(st.nextToken());
		int y = Integer.parseInt(st.nextToken());
		
		// 배열
		// 1차원 배열 정의 [길이 고정]
		int[] arr = {5, 0, 2, 3, 4, 1};
		
		
		
	}

}
