package hw7_2;

import java.util.EmptyStackException;

public class MyLinkedStack {
	private Node top = null;
	private class Node{
		int data;
		Node link;

		Node(int data){
			this.data = data;
		}
	}

	public boolean isEmpty() {
		return (top==null);
	}
	public void push(int data) {
		Node temp = new Node(data);
		temp.link=top;
		top=temp;
	}
	public int pop() {
		if(top==null)
			throw new EmptyStackException();
		else {
			int temp=top.data;
			top=top.link;
			return temp;
		}
	}
	public int peek() {
		if(top==null)
			throw new EmptyStackException();
		else
			return top.data;
	}

}
