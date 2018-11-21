package hw7_3;

import java.util.EmptyStackException;

public class MyCharacterStack {

	class Node{
		private char str;
		private Node link;
		Node(char str){
			this.str=str;
		}
	}
	
	private Node top;

	public boolean isEmpty() {
		return top == null;
	}

	public void push(char par) {
		Node newNode = new Node(par);
		newNode.link=top;
		top=newNode;
		
	}
	public char pop() {
		if(isEmpty()) {
			
			throw new EmptyStackException();
		}

		else {
			char a = top.str;
			top=top.link;
			return a;
		}
	}
	public char peek() {
		if(isEmpty()) {
		
			throw new EmptyStackException();
		}
		else {
			return top.str;
		}
	}


}

