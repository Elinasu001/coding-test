package com.ex.queue.rundimentary;

// 배열을 이용해 큐를 구현
public class CircularQueue {
    private int[] queue;
    private int front;      // 삭제할 요소의 인덱스
    private int rear;       // 삽입할 위치의 인덱스
    private int size;       // 현재 큐에 있는 요소의 개수
    private int capacity;   // 큐의 최대 크기

    public CircularQueue(int capacity) {
        this.capacity = capacity;
        this.queue = new int[capacity];
        this.front = 0;
        this.rear = 0;
        this.size = 0;
    }

    /**
     * 큐가 비어있는지 확인합니다.
     */
    public boolean isEmpty() {
        return size == 0;
    }

    /**
     * 큐가 가득 찼는지 확인합니다.
     */
    public boolean isFull() {
        return size == capacity;
    }

    /**
     * 큐에 데이터를 삽입합니다.
     */
    public void enqueue(int item) {
        if (isFull()) {
            System.out.println("큐가 가득 찼습니다. 삽입 실패: " + item);
            return;
        }
        queue[rear] = item;
        rear = (rear + 1) % capacity; // rear 포인터를 순환시킴
        size++;
        System.out.println(" Enqueued: " + item);
    }

    /**
     * 큐에서 데이터를 삭제하고 반환합니다.
     */
    public int dequeue() {
        if (isEmpty()) {
            System.out.println("큐가 비어있습니다. 삭제 실패.");
            // 코딩 테스트에서는 -1을 반환하거나 예외를 던지는 것이 일반적입니다.
            return -1; 
        }
        int removedItem = queue[front];
        front = (front + 1) % capacity; // front 포인터를 순환시킴
        size--;
        System.out.println(" Dequeued: " + removedItem);
        return removedItem;
    }

    /**
     * 큐의 맨 앞 요소를 확인합니다.
     */
    public int peek() {
        if (isEmpty()) {
            System.out.println("큐가 비어있습니다.");
            return -1;
        }
        return queue[front];
    }
    
    // 큐의 현재 상태를 출력하는 보조 메서드
    public void printQueue() {
        if (isEmpty()) {
            System.out.println("--- 큐가 비어있습니다. ---");
            return;
        }
        System.out.print("--- 현재 큐 (front -> rear) ---: ");
        int count = 0;
        int current = front;
        while(count < size) {
            System.out.print(queue[current] + " ");
            current = (current + 1) % capacity;
            count++;
        }
        System.out.println();
    }
    
    public static void main(String[] args) {
        System.out.println("--- 큐 생성 (크기 5) ---");
        CircularQueue queue = new CircularQueue(5);
        queue.printQueue();
        
        System.out.println("\n--- 3개 데이터 삽입 ---");
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.printQueue();

        System.out.println("\n--- 2개 데이터 삭제 ---");
        queue.dequeue();
        queue.dequeue();
        queue.printQueue();
        
        System.out.println("\n--- 3개 데이터 추가 삽입 (앞 공간 재활용) ---");
        queue.enqueue(40);
        queue.enqueue(50);
        queue.enqueue(60); // 큐가 가득 차서 삽입 실패
        queue.printQueue();
        
        System.out.println("\n--- 큐의 맨 앞 확인 (peek) ---");
        System.out.println("Peek: " + queue.peek());
        queue.printQueue();
    }
}