package hw8_1;

import java.util.NoSuchElementException;

public class MyCircularQueue {

	private int front;
	private int rear;
	private int queueSize;
	private int [] queue;
	private int count;

	public MyCircularQueue(int n) {
		front = 0;
		rear = 0;
		count = 0;
		queue = new int[n];
		queueSize = n;
	}
	public boolean isEmpty() {
		return count == 0;
	}
	public boolean isFull() {
		return count == queueSize;
	}
	public int deQueue() {
		if(isEmpty()) 
			throw new NoSuchElementException(); 
		else {
			count--;
			return queue[(++front)%queueSize];
		}
	}
	public void enQueue(int n) {
		if(isFull()) 
			System.out.println("큐가 가득차서 삽입할 수 없습니다."); 
		else {
			queue[++rear]=n;
			count++;
		}			
	}
	public int peek() {
		if(isEmpty()) 
			throw new NoSuchElementException(); 
		return queue[(front+1)%queueSize];
	}
	public int size() {
		return count;
	}
}