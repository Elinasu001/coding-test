package com.ex.run;

public class JaggedArrayExample {
    public static void main(String[] args) {
        // 1. 2차원 배열 변수 선언
        int[][] twoDArray; 

        // 2. 3개의 행을 저장할 공간 할당
        // 이 시점에서 각 행은 아직 null 상태입니다.
        twoDArray = new int[3][]; 
        //=
        //=
        //=

        // 3. 각 행에 해당하는 1차원 배열(열)에 실제 요소를 저장할 공간 할당
        twoDArray[0] = new int[3]; // 0번째 행은 3칸짜리 1차원 배열
        twoDArray[1] = new int[3]; // 1번째 행은 3칸짜리 1차원 배열
        twoDArray[2] = new int[3]; // 2번째 행은 3칸짜리 1차원 배열
        // ===
        // ===
        // ===

        // 4. 배열에 값 할당 (예시)
        int value = 1;
        for (int i = 0; i < twoDArray.length; i++) {
            for (int j = 0; j < twoDArray[i].length; j++) {
                twoDArray[i][j] = value++;
            }
        }

        // 5. 배열 값 출력
        System.out.println("2차원 배열 출력:");
        for (int i = 0; i < twoDArray.length; i++) {
            for (int j = 0; j < twoDArray[i].length; j++) {
                System.out.print(twoDArray[i][j] + " ");
            }
            System.out.println(); // 한 행이 끝나면 줄바꿈
        }
    }
}
