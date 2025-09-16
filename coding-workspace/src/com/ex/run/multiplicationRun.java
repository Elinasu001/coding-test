package com.ex.run;

import java.util.Scanner;

public class multiplicationRun {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        
        // num2의 각 자릿수를 분리합니다.
        int units = num2 % 10; //  385를 10으로 나누면 몫은 38이고 나머지는 5 => units 변수에는 5가 저장
        int tens = (num2 / 10) % 10; // 먼저 num2 / 10은 385를 10으로 나눈 몫인 38, 그다음 38 % 10은 38을 10으로 나눈 나머지인 8 => tens 변수에는 8이 저장
        int hundreds = num2 / 100; // 385를 100으로 나눈 몫입니다. 몫은 3 => hundreds 변수에는 3이 저장
		
		
        // 각 자릿수와 num1을 곱한 결과를 출력합니다.
        System.out.println(num1 * units);
        System.out.println(num1 * tens);
        System.out.println(num1 * hundreds);
        
        // 최종 곱셈 결과를 출력합니다.
        System.out.println(num1 * num2);

        sc.close();
	}

}
