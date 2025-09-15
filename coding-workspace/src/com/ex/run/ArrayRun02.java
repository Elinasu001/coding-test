package com.ex.run;

import java.util.*;
import java.io.*;

/*
 * **2차원 배열
 * <배열 원소 합산 알고리즘> : "배열 순회 (Array Traversal)" 알고리즘의 한 종류
 * - 시간 복잡도 == O(N*M)
 * 
 */
public class ArrayRun02 {

	static int[][] problems;
	
	public static void main(String[] args) {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		// 2차원 배열의 크기가 3행 2열 고정
		int[][] arr = new int[][]{{5, 40}, {3, 50}, {1, 30}};
		
		// 합계 저장 변수
		int totalSum = 0;
		
		// 바깥쪽 for문 : 행(row)순회
		for(int i = 0; i < arr.length; i++) { //  0, 1, 2 실행
			// 안쪽 for문 : 열(column) 순회
			for(int j = 0; j < arr[i].length; j++) { 
				totalSum += arr[i][j];
			}
		}
		
		/*
		 *  i = 0 (첫 번째 행)

			안쪽 루프가 시작됩니다.
			
			j = 0: totalSum에 arr[0][0] (값: 5)을 더합니다.
			
			j = 1: totalSum에 arr[0][1] (값: 40)을 더합니다.
			
			안쪽 루프가 종료됩니다. totalSum은 현재 45가 됩니다.
			
			i = 1 (두 번째 행)

			안쪽 루프가 다시 j = 0부터 시작됩니다.
			
			j = 0: totalSum에 arr[1][0] (값: 3)을 더합니다.
			
			j = 1: totalSum에 arr[1][1] (값: 50)을 더합니다.
			
			안쪽 루프가 종료됩니다. totalSum은 현재 45 + 3 + 50 = 98이 됩니다.
			
			i = 2 (세 번째 행)
			
			안쪽 루프가 다시 j = 0부터 시작됩니다.
			
			j = 0: totalSum에 arr[2][0] (값: 1)을 더합니다.
			
			j = 1: totalSum에 arr[2][1] (값: 30)을 더합니다.
			
			안쪽 루프가 종료됩니다. totalSum은 현재 98 + 1 + 30 = 129가 됩니다.
			
			i가 3이 됨: 바깥쪽 루프의 조건 (i < 3)이 거짓이 되어 루프 전체가 종료됩니다.
		 * 
		 * 
		 */
		
		// 최종 합계 출력
		System.out.println(totalSum); // 129
		
	}

}
