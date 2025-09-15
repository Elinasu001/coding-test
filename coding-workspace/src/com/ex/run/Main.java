package com.ex.run;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		
	 	Scanner sc = new Scanner(System.in);
	 	
	 	int a = sc.nextInt();
	 	
	 	int b = sc.nextInt();
	 	
	 	int c = sc.nextInt();
	 	
	 	int result1 = (a+b)%c;
	 	
	 	int result2 = ((a%c)+(b%c))%c;
	 	
	 	int result3 = (a*b)%c;
	 	
	 	int result4 = ((a%c)*(b%c)%c);
	 	
	 	List<Integer> list = new ArrayList<>();
	 	
	 	list.add(result1);
	 	list.add(result2);
	 	list.add(result3);
	 	list.add(result4);
	 	
	 	list.stream().forEach(e -> {
	 		System.out.println(e);
	 	});
	 	
	 	
	}

}
