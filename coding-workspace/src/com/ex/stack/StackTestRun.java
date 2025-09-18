package com.ex.stack;

import java.util.Scanner;

public class StackTestRun {
/*
 * 주의 * stack의 top 삭제 연산 할 경우 적용순서에 따라 값이 달라지니 주의 
 * 
 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("스택의 '최대 크기' 입력 > ");
		int maxSize = sc.nextInt();
		
		
		// 1. 스택 생성 초기화
		int[] data = new int[maxSize];
		int top = -1; // 스택이 비어있음을 의미
		
		System.out.println("스택 생성 (최대 크기 :" + maxSize + ")");
		System.out.println("-----------------------------------");
		
		while(true) {
			System.out.println("원하는 작업을 선택하세요: 1(push), 2(pop), 0(종료)");
            System.out.print(">>> ");
            int command = sc.nextInt();
            
            // push 연산
            if(command == 1) {
            	//ifFull()확인
            	if(top == maxSize -1) {
            		System.out.println("스택이 가득차서 더 이상 추가할 수 없습니다.");
            	} else {
            		System.out.println("스택에 추가할 숫자를 입력하세요  > ");
            		int pushValue = sc.nextInt();
            		
            		// 추가 했으니 top -1 -> 0 올린다.
            		top++;
            		// push한 pushValue 을 data 배열의 top 위치에 삽입
            		data[top] = pushValue;
            		
            		System.out.println(pushValue +"를 스택에 삽입 완료. 현재 top: " + top);
            	}
            } else if (command == 2) {
            	//isEmpty() 확인
            	if(top == -1) {
            		System.out.println("스택이 비어있어 꺼낼 데이터가 없습니다.");
            	} else {
            		// 비어있지 않으니 "0" 가장 위에 있는 값을 꺼내기 위해 변수에 임시 저장 후 반환
            		int popupValue = data[top];
            		// top을 0 -> -1로 내린다.
            		top--;
            		
            		System.out.println(popupValue +"를 스택에서 꺼냈습니다. 현재 top : " + top);
            	}
            } else if (command == 0) {
            	
            	System.out.println("프로그램을 종료합니다.");
            	 break; 
            	
            } else {
                System.out.println("❌ 잘못된 명령어입니다. 다시 입력해주세요.");
            }
            
            System.out.println("----------------------------------------");
            
            
		}
		

	}

}
