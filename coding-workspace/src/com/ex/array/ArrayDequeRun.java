package com.ex.array;
import java.util.ArrayDeque;
import java.util.Deque;


public class ArrayDequeRun {

	public static void main(String[] args) {
        
        // Deque 인터페이스를 ArrayDeque로 구현
        // ArrayDeque가 Stack 클래스보다 성능이 좋고 현대적인 방식입니다.
        Deque<String> stack = new ArrayDeque<>();

        // 1. push() 연산: 스택에 데이터 추가
        System.out.println("--- push() 연산 시작 ---");
        stack.push("첫 번째");
        stack.push("두 번째");
        stack.push("세 번째");
        System.out.println("현재 스택: " + stack); // [세 번째, 두 번째, 첫 번째]
        System.out.println("-------------------------");

        // 2. peek() 연산: 가장 위의 데이터 확인
        System.out.println("--- peek() 연산 ---");
        System.out.println("가장 위의 데이터: " + stack.peek());
        System.out.println("peek 후 스택: " + stack); // 변화 없음
        System.out.println("-------------------------");
        
        // 3. pop() 연산: 가장 위의 데이터 제거 및 반환
        System.out.println("--- pop() 연산 시작 ---");
        String removedItem = stack.pop();
        System.out.println("제거된 데이터: " + removedItem);
        System.out.println("pop 후 스택: " + stack); // [두 번째, 첫 번째]
        
        removedItem = stack.pop();
        System.out.println("제거된 데이터: " + removedItem);
        System.out.println("pop 후 스택: " + stack); // [첫 번째]
        System.out.println("-------------------------");

        // 4. isEmpty() 연산: 스택이 비어있는지 확인
        System.out.println("--- isEmpty() 연산 ---");
        System.out.println("스택이 비어있나요? " + stack.isEmpty());
        stack.pop(); // 마지막 요소 제거
        System.out.println("마지막 pop 후 스택이 비어있나요? " + stack.isEmpty());
        System.out.println("-------------------------");
    }

}

