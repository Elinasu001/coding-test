package com.ex.run;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;


public class StringTokenizerRun {

	public static void main(String[] args) throws IOException {
			
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 입력받기 (예: "3 4")
        StringTokenizer st = new StringTokenizer(br.readLine());

        // 첫 번째 토큰을 정수로 변환하여 x에 저장
        int x = Integer.parseInt(st.nextToken());
        
        // 두 번째 토큰을 정수로 변환하여 y에 저장
        int y = Integer.parseInt(st.nextToken());

        // 거리 계산 (Math.hypot()을 사용하면 더 간결)
        double distance = Math.hypot(x, y);

        // 결과 출력
        System.out.println(distance);

        br.close();
      
	}

}
