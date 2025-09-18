package com.ex.condition;

import java.util.Scanner;

public class Run14681 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int x = 0;
		x = sc.nextInt();	
		
		int y = 0;
		y = sc.nextInt();	
		
		
		if(x > 0 && y > 0 ) {
			System.out.println("1");
		} else if(x < 0 && y > 0) {
			System.out.println("2");
		} else if(x < 0 && y < 0) {
			System.out.println("3");
		} else {
			System.out.println("4");
		}
			
	}

}
