package com.ex.condition;

import java.util.Scanner;

public class Run2884 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//지각쟁이
		// 추천
		// 45분 일찍 알람 설정
		int h = sc.nextInt();
		int m = sc.nextInt();
		
		if(m < 45) {
			h--;
			
			m= 60 - (45 - m);
			
			if(h < 0) {
				h = 23;
			}
			System.out.println(h + " " + m);
		} else {
			System.out.println(h + " " + (m - 45));
		}
		
	}

}
