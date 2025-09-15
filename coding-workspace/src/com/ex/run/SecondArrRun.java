package com.ex.run;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SecondArrRun {
	
	static int[][] problems; // 전역변수
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		problems = new int[n][2]; // 초기화
		
	}

}
