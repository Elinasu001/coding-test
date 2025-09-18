package com.ex.condition;

import java.util.Scanner;

public class Run9498 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		
		boolean scoreA = a >= 90 && a <= 100;
		boolean scoreB = a >= 80 && a <= 89;
		boolean scoreC = a >= 70 && a <= 79;
		boolean scoreD = a >= 60 && a <= 69;
		
		if(scoreA) {
			System.out.println("A");
		} else if(scoreB) {
			System.out.println("B");
		} else if(scoreC) {
			System.out.println("C");
		} else if(scoreD) {
			System.out.println("D");
		} else {
			System.out.println("F");
		}
	}

}
