package hw7_1;

public class MyArrayStack {

	private int top;
	private int [] stack;
	private int stackSize;

	public MyArrayStack(){
		top=-1;
		stackSize = 5;
		stack = new int[5];
	}

	public MyArrayStack(int size) {
		top = -1;
		stackSize = size;
		stack = new int [size];
	}
	public boolean isEmpty() {
		return (top == -1);
	}
	public boolean isFull() {
		return (top == stackSize-1);
	}
	public void push(int num) {
		stack[++top]=num; // top++ -> stack[top]=num
	}
	public int pop() {
		int j=stack[top--];
		return j;	
	}
	public int peek() {
		return stack[top];
	}


}
