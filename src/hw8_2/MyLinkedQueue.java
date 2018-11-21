package hw8_2;

import java.util.NoSuchElementException;

public class MyLinkedQueue {

	private int count=0;
	private Node front = null;
	private Node rear = null;

	private class Node{
		int data;
		Node link;
		Node(int data){
			this.data = data;
		}
	}
	public boolean isEmpty() {
		return count == 0;
	}

	public int deQueue() {
		if(isEmpty()) 
			throw new NoSuchElementException(); 
		else {
			int num = front.data;
			count--;
			front=front.link;
			return num;
		}
	}
	public void enQueue(int n) {
		Node newNode = new Node(n);
		if(front == null) {
			front=newNode;
			rear=newNode;
		}
		else {
			rear.link=newNode;
			rear=newNode;
		}
		count++;
	}
	public int peek() {
		if(isEmpty()) 
			throw new NoSuchElementException(); 
		return front.data;
	}
	public int size() {
		return count;
	}
}