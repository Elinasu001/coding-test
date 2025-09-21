package com.ex.queue.rundimentary;

public class ArrayQueue {
    private int[] data;
    private int front;
    private int rear;
    private int maxSize;

    public ArrayQueue(int maxSize) {
        this.maxSize = maxSize;
        this.data = new int[maxSize];
        this.front = -1;
        this.rear = -1;
    }

    public boolean isEmpty() {
        return front == -1;
    }

    public boolean isFull() {
        return rear == maxSize - 1;
    }
    
    public boolean enqueue(int value) {
        if (isFull()) {
            System.out.println("큐가 가득 찼습니다. 삽입 실패.");
            return false;
        }
        if (isEmpty()) {
            front = 0;
        }
        rear++;
        data[rear] = value;
        System.out.println(" Enqueued: " + value + ", 현재 rear: " + rear);
        return true;
    }
    
    /**
     * 큐에서 데이터를 삭제하고 반환합니다. (dequeue)
     * 큐가 비어있으면 관례적으로 -1을 반환합니다.
     * @return 삭제된 데이터 값, 큐가 비어있으면 -1
     */
    public int dequeue() {
        if (isEmpty()) {
            System.out.println("큐가 비어있습니다. 삭제 실패.");
            return -1; // -1 반환으로 수정
        }

        int removedValue = data[front];
        
        if (front == rear) {
            front = -1;
            rear = -1;
        } else {
            front++;
        }

        System.out.println(" Dequeued: " + removedValue + ", 현재 front: " + front);
        return removedValue;
    }

    public void printQueue() {
        if (isEmpty()) {
            System.out.println("--- 큐가 비어있습니다. ---");
            return;
        }
        
        System.out.print("--- 큐 상태 (front -> rear) --- : ");
        for (int i = front; i <= rear; i++) {
            System.out.print(data[i] + " ");
        }
        System.out.println();
    }
    
    public static void main(String[] args) {
        System.out.println("--- 큐 생성 (크기 5) ---");
        ArrayQueue queue = new ArrayQueue(5);
        
        System.out.println("\n--- 3개의 데이터 삽입 ---");
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.printQueue();

        System.out.println("\n--- 큐에서 20을 삭제 ---");
        System.out.println("삭제된 값: " + queue.dequeue());
        queue.printQueue();
        
        System.out.println("\n--- 비어있는 큐에서 삭제 시도 ---");
        int result = queue.dequeue();
        if (result == -1) {
            System.out.println("삭제 실패, 반환 값: " + result);
        }
    }
}