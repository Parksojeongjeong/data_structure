package course7;

import java.util.NoSuchElementException;

//MyArrayQueue Ŭ������ �׽�Ʈ�ϴ� Ŭ����
public class MyArrayQueueTest {
	public static void main(String[] args) {
		System.out.println("course7: �ڼ���");

		// MyArrayQueue ��ü�� �����ϰ�, ����, ���� ������ ����
		MyArrayQueue queue = new MyArrayQueue();

		queue.enQueue(1);
		queue.enQueue(2);

		System.out.println(queue.deQueue()); // ���: 1
		System.out.println(queue.deQueue()); // ���: 2

		queue.enQueue(3);
		queue.enQueue(4);

		System.out.println(queue.deQueue()); // ���: 3
		System.out.println(queue.deQueue()); // ���: 4

		queue.enQueue(5);
		queue.enQueue(6);
		queue.enQueue(7);
		queue.enQueue(8);
		queue.enQueue(9); // ���� �����Ͽ� ���� �޽��� ����� ����
		queue.enQueue(10); // ���� �����Ͽ� ���� �޽��� ����� ����

		while(!queue.isEmpty())
			System.out.print(queue.deQueue() + " "); // ���: 5 6 7 8
		System.out.println();

		System.out.println(queue.deQueue()); // ���� �����Ͽ� ���ܹ߻��� ����

		System.out.println("�������� ���� ������");
	}
}



//ũ�Ⱑ 5�� �迭�� ���� ť�� ������ Ŭ���� - �ִ� 4���� ���Ҹ� ������ �� ����
class MyArrayQueue {
	// (1) private �ν��Ͻ� ���� ����: �迭(array), �迭 ũ��(arraySize), front, rear
	private int front;
	private int rear;
	private int arraySize;
	private int [] array;


	// (2) ������ : ũ�Ⱑ 5�� �迭�� ť�� �����ϵ��� �ν��Ͻ� �������� �ʱ�ȭ
	public MyArrayQueue() {
		front = 0;
		rear = 0;
		array = new int[5];
		arraySize = 5;
	}


	// ť�� ����ִ����� �˻�
	public boolean isEmpty() {
		return rear == front;
	}

	// ť�� ����á������ �˻�
	public boolean isFull() {
		return (rear + 1) % arraySize == front;
	}

	// (3) ť�� data�� ����
	public void enQueue(int data) {
		if(isFull())
			System.out.println("ť�� �������� ���� ����: " + data);
		else {
			array[(++rear)%arraySize]=data;
		}
	}

	// (4) ť���� ���Ҹ� �ϳ� �����Ͽ� ����
	public int deQueue() {
		if(isEmpty())
			throw new NoSuchElementException();
		else {
	
			return array[(++front)%arraySize];
		}
	}
}