package com.ex.queue.rundimentary;

import java.util.LinkedList;
import java.util.NoSuchElementException;
import java.util.Queue;

public class CircularQueueUtil {

    public static void main(String[] args) {
        // 큐를 사용하는 가장 일반적인 방법: 인터페이스 타입으로 선언
        // LinkedList는 Queue 인터페이스를 구현합니다.
        Queue<Integer> queue = new LinkedList<>();

        System.out.println("--- 데이터 삽입 (enqueue) ---");
        // offer()는 큐에 데이터를 추가하며, 성공 시 true를 반환합니다.
        queue.offer(10);
        queue.offer(20);
        queue.offer(30);
        System.out.println("현재 큐: " + queue);

        System.out.println("\n--- 데이터 삭제 및 반환 (dequeue) ---");
        // poll()은 큐의 맨 앞 요소를 제거하고 반환합니다.
        // 큐가 비어있으면 null을 반환하여 예외를 방지합니다.
        int removedValue = queue.poll();
        System.out.println("제거된 값: " + removedValue);
        System.out.println("삭제 후 큐: " + queue);

        System.out.println("\n--- 맨 앞 데이터 확인 (peek) ---");
        // peek()은 큐의 맨 앞 요소를 반환하지만, 제거하지는 않습니다.
        // 큐가 비어있으면 null을 반환합니다.
        int peekedValue = queue.peek();
        System.out.println("맨 앞 값: " + peekedValue);
        System.out.println("확인 후 큐: " + queue);
        
        System.out.println("\n--- 빈 큐에서 삭제 시도 ---");
        queue.poll(); // 20 제거
        queue.poll(); // 30 제거
        // 큐가 비어있으므로 null 반환
        System.out.println("빈 큐에서 poll() 시도: " + queue.poll());

        // remove()는 큐가 비어있을 때 예외를 발생시킵니다.
        try {
            queue.remove();
        } catch (NoSuchElementException e) {
            System.out.println("빈 큐에서 remove() 호출 시 예외 발생: " + e.getClass().getName());
        }
    }
}
