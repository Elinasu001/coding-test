package com.ex.run;
import java.util.ArrayList;
import java.util.List;

//0이 아닌 요소를 저장할 클래스
class MatrixTerm {
	 int row, col, value;
	
	 public MatrixTerm(int row, int col, int value) {
	     this.row = row;
	     this.col = col;
	     this.value = value;
	 }
}


public class SparseMatrixRun {

	public static void main(String[] args) {
		// 희소 행렬 (3행 4열)
        // 0  0  3  0
        // 0  0  5  7
        // 0  0  0  0
        
        int[][] originalMatrix = {
            {0, 0, 3, 0},
            {0, 0, 5, 7},
            {0, 0, 0, 0}
        };

        // 0이 아닌 값만 저장할 리스트
        List<MatrixTerm> sparseMatrix = new ArrayList<>();

        // 0이 아닌 값을 찾아서 (행, 열, 값)으로 저장
        for (int i = 0; i < originalMatrix.length; i++) {
            for (int j = 0; j < originalMatrix[i].length; j++) {
                if (originalMatrix[i][j] != 0) {
                    sparseMatrix.add(new MatrixTerm(i, j, originalMatrix[i][j]));
                }
            }
        }

        // 희소 행렬 출력 (COO 방식)
        System.out.println("희소 행렬 표현 (COO 방식):");
        for (MatrixTerm term : sparseMatrix) {
            System.out.println("행: " + term.row + ", 열: " + term.col + ", 값: " + term.value);
        }

	}

}
