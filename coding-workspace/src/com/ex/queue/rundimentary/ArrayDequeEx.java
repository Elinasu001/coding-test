package com.ex.queue.rundimentary;

import java.util.ArrayDeque;
import java.util.Deque;


public class ArrayDequeEx{

    public static void main(String[] args) {
        // Deque 인터페이스를 ArrayDeque로 구현
        // 큐로 사용하려면 add/offer(뒤에 추가), remove/poll(앞에서 제거) 사용
        Deque<String> queue = new ArrayDeque<>();

        // 데이터 삽입
        queue.add("Apple");
        queue.add("Banana");
        queue.add("Cherry");
        System.out.println("큐에 데이터 삽입: " + queue);

        // 데이터 삭제
        String firstItem = queue.poll();
        System.out.println("큐에서 제거된 데이터: " + firstItem);
        System.out.println("삭제 후 큐: " + queue);

        // 앞뒤로 삽입/삭제 가능 (Deque의 특징)
        queue.addFirst("Grape");
        queue.addLast("Orange");
        System.out.println("양쪽 끝에 추가: " + queue);
    }
}