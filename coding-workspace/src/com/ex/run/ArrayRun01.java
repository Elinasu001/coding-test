package com.ex.run;

import java.util.*;
import java.io.*;
/*
 * **1차원 배열
 * 
 * <카운팅 정렬(Counting Sort) 알고리즘의 개념을 활용한 간단한 탐색 방법>
 * - 시간 복잡도 == O(N) ==  O(1)
 * 
 * 주어진 N개의 숫자(1부터 N까지의 정수) 중에서 특정 값 K가 존재하는지 확인하는 프로그램을 작성하세요. 
 * 효율적인 탐색을 위해 boolean 타입의 visited 배열을 사용하세요.
 * 
 *  [입력]
	첫 번째 줄에 숫자의 최대 크기 N이 주어집니다.
	두 번째 줄에 N개의 숫자가 공백으로 구분되어 주어집니다.
	세 번째 줄에 찾아야 할 값 K가 주어집니다.
	
	[입력 예시]
	5
	1 3 5 2 4
	3
	
	[출력 예시]
	true
 * 
 */



public class ArrayRun01 {
	// 방문 여부 체크할 배열 전역 변수 선언
	static boolean[] visited;
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		// 1. 첫 번째 줄에서 배열의 최대 크기 n을 읽어옴
		int n = Integer.parseInt(br.readLine());
		
		// 2. n+1 크기의 boolean 배열을 초기화 (인덱스를 값으로 사용하기 위해)
		visited = new boolean[n+1];
		
		// 3. 두 번째 줄의 숫자들을 StringTokenizer로 읽음
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		// 4. 입력받은 숫자들을 visited 배열에 '방문' 표시
		for(int i = 0; i < n; i++) {
			int num = Integer.parseInt(st.nextToken());
			if(num >= 1 && num <= n) {
				visited[num] = true;
			} 
		}
		
		// 5. 세 번째 줄에서 찾아야 할 값 k를 읽어옴
		int k = Integer.parseInt(br.readLine());
		
		// 6. visited 배열을 통해 k의 존재 여부를 확인하고 출력
		System.out.println(visited[k]); // true
		
		br.close();
		
	}

}
