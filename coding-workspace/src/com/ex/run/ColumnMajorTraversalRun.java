package com.ex.run;

public class ColumnMajorTraversalRun {

	public static void main(String[] args) {
		
	    int[][] matrix = {
	        {1, 2, 3},
	        {4, 5, 6},
	        {7, 8, 9}
	    };
	
	    // 열 우선 순서로 탐색
	    System.out.println("열 우선 탐색:");
	    for (int j = 0; j < matrix[0].length; j++) { // 열(column) 인덱스가 먼저
	        for (int i = 0; i < matrix.length; i++) { // 행(row) 인덱스가 나중
	            System.out.print(matrix[i][j] + " ");
	        }
	    }
	}

}
