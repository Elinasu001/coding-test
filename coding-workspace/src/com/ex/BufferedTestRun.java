package com.ex;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class BufferedTestRun {


    public static void main(String[] args) throws IOException {
        // BufferedReader 객체 생성 (키보드 입력)
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        // BufferedWriter 객체 생성 (콘솔 출력)
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        System.out.println("문자열을 입력하세요:");
        
        // BufferedReader로 한 줄 읽기
        String inputLine = br.readLine();
        
        // BufferedWriter로 읽은 내용을 버퍼에 쓰기
        bw.write("입력받은 내용: " + inputLine);
        bw.newLine(); // 줄바꿈
        
        System.out.println("숫자를 입력하세요:");

        // BufferedReader로 숫자 입력받아 변환
        String numberString = br.readLine();
        int number = Integer.parseInt(numberString);
        
        bw.write("입력받은 숫자: " + number);
        bw.newLine();
        
        // 버퍼에 있는 모든 내용을 실제로 출력
        bw.flush();
        
        // 스트림 닫기 (자원 해제)
        br.close();
        bw.close();
    }

}
