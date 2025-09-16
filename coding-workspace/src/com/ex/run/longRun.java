package com.ex.run;

import java.util.Scanner;

public class longRun {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// long 타입을 사용하여 A, B, C를 입력받습니다.
        long a = sc.nextLong();
        long b = sc.nextLong();
        long c = sc.nextLong();
        
        // 세 수의 합을 계산하여 출력합니다.
        System.out.println(a + b + c);
        
        sc.close();
	}

}


/*
	A = 77
	B = 77
	C = 7777
	A+B+C=77+77+7777
	먼저, 앞의 두 숫자를 더합니다: 77+77=154.
	그다음, 그 결과에 세 번째 숫자를 더합니다: 154+7777=7931.
	단순히 세 숫자를 더하는 것이며, 프로그래밍 관점에서는 숫자의 크기가 매우 크기 때문에 **long**과 같은 큰 정수 타입을 사용

 */