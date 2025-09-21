package com.ex.queue.rundimentary;

import java.util.ArrayDeque;
import java.util.Deque;

public class ArrayDequeMixEx {

	public static void main(String[] args) {
        // 제네릭 타입을 Object로 지정하여 모든 타입의 객체를 담을 수 있음
        Deque<Object> mixedQueue = new ArrayDeque<>();

        // 문자열과 숫자를 섞어서 삽입
        mixedQueue.add("Hello");
        mixedQueue.add(123);
        mixedQueue.add("World");
        mixedQueue.add(45.67);
        System.out.println("큐에 삽입된 데이터: " + mixedQueue);

        // 데이터를 꺼내고 형 변환
        Object firstItem = mixedQueue.poll();
        System.out.println("제거된 아이템: " + firstItem); // Hello

        Object secondItem = mixedQueue.poll();
        if (secondItem instanceof Integer) { // Integer 타입인지 확인
            int number = (Integer) secondItem;  // secondItem에 String 같은 다른 타입의 객체가 들어있을 경우 ClassCastException이라는 심각한 런타임 오류가 발생
            System.out.println("제거된 숫자: " + number); // 123
        }
    }

}

//일반적으로 이런 복잡한 타입 확인은 코드의 가독성을 해치기 때문에, 앞서 설명했던 제네릭(Deque<Integer>)이나 커스텀 클래스(Deque<Student>)를 사용하는 것이 더 좋은 방법
