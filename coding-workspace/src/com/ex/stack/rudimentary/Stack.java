package com.ex.stack.rudimentary;

import java.util.Scanner;

public class Stack {
	// 초기화
	private int top; // 항목 위치 변수
	private int maxSize; // 저장할 수 있는 최대 요소 개수
	private Object[] stackArray; // 정수 항목 저장할 배열
	
	// 배열 스택 생성
	public Stack(int maxSize) {
		this.maxSize = maxSize;
		this.top = -1;
		this.stackArray = new Object[maxSize];
	}
	
	// 스택 비어있는지 확인
	public boolean isEmpty() {
		return (top == -1); // -1 : 요소가 하나도 없을 경우
	}
	
	// 스택 찼는지 확인
	public boolean isFull() {
		return (top == maxSize - 1);
	}
	
	// 스택 요소 삽입 push()
	public boolean push(Object item) {
		if(isFull()) { // 요소 삽입 전 스택 찼는지 확인
			for(int i = 0; i < maxSize; i++) {
				System.out.println("---isFull---");
				break;
			}
			return false;
		}
		
		stackArray[++top] = item; 
		// 1. top 먼저 1 증가 : top = top + 1;	
	    // 2. 증가된 top 위치에 데이터 넣기 : satackArray[top] = item;
		return true;
	}
	
	// 스택 가장 위에 있는 데이터 반환 : pop() 연산 시 사용
	public Object peek() {
		if(isEmpty()) { // 비어있다면
			System.out.println("--isEmpty--");
			return null;
		} else {
			Object item = stackArray[top];
			return item;
		}
	}
	
	// 스택의 가장 위의 데이터 제거 (LIFO)
	public Object pop() {
		Object item = peek();
		top--; // 0 -> -1
		return item;
	}
	
	// 스택 출력
	public void printStack(Stack stack) {
		if(top != -1) { // 비어있지 않다면
			for(int i = top; i >= 0; i--) {
				System.out.println("--- 스택 : " + stack.stackArray[i] + "---");
			}
		} else {
			System.out.println("---isEmpty---");
		}
	}
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("스택의 '크기' 입력 > ");
		int size = sc.nextInt();
		
		Stack arrayStack = new Stack(size);
		
		while(true) {
			
			System.out.println("1. push");
			System.out.println("2. pop");
			System.out.println("3. peek");
			System.out.println("4. stack");
			System.out.println("10. 종료");
			
			int menuNo = sc.nextInt();
			sc.nextLine();
			
			switch(menuNo) {
			
				case 1:
					System.out.println("push > ");
					String data = sc.next();
					arrayStack.push(data);
					break;
	
				// pop()
				case 2:
					System.out.println("---pop[LIFO] : " + arrayStack.pop() + "---"); // 뺴고 싶은 요소를 지정 할 수 x
					break;
	
				// peek()
				case 3:
					System.out.println("-- 가장 위의 데이터 : " + arrayStack.peek() + "---");
					break;
	
				// 스택 데이터 출력
				case 4:
					arrayStack.printStack(arrayStack);
					break;
				
				// 종료
				case 10:
					System.out.println("종료");
					break;
			}
		
		}
			
	}
	
	

}
	