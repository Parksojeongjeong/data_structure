package lab9_1;

public class Main {
	public static void main(String[] args) {
		System.out.println("lab9_1: 박소정");
		System.out.println();
		// 연결자료구조로 구현한 노드 7개 예제 트리를 만들고 메소드 호출
		System.out.println(" 연결자료구조 구현 트리1");
		MyLinkedTree tree7 = new MyLinkedTree(7, null, null);
		MyLinkedTree tree6 = new MyLinkedTree(6, null, null);
		MyLinkedTree tree5 = new MyLinkedTree(5, null, null);
		MyLinkedTree tree4 = new MyLinkedTree(4, null, null);
		MyLinkedTree tree3 = new MyLinkedTree(3, tree6, tree7);
		MyLinkedTree tree2 = new MyLinkedTree(2, tree4, tree5);
		MyLinkedTree linkedTree1 = new MyLinkedTree(1, tree2, tree3);

		System.out.print("preorder:");
		linkedTree1.printPreorder(); // 전위순회하며 출력
		System.out.print("inorder:");
		linkedTree1.printInorder(); // 중위순회하며 출력
		System.out.print("left:");
		linkedTree1.printLeft(); // 왼쪽 자식들을 출력
		System.out.println("\n");

		// 연결자료구조로 구현한 공백 예제 트리를 만들고 메소드 호출
		System.out.println(" 연결자료구조 구현 트리2");
		MyLinkedTree linkedTree2 = new MyLinkedTree();

		System.out.print("preorder:");
		linkedTree2.printPreorder(); // 전위순회하며 출력
		System.out.print("inorder:");
		linkedTree2.printInorder(); // 중위순회하며 출력
		System.out.print("left:");
		linkedTree2.printLeft(); // 왼쪽 자식들을 출력
		System.out.println("\n");

		// 배열로 구현한 노드 8개 예제 트리를 만들고 메소드 호출
		System.out.println(" 배열 구현 트리1");
		MyArrayTree arrayTree1 = new MyArrayTree(new int[] { 1, 2, 3, 4, 5, 6, 7, 8 });
		System.out.print("preorder:");
		arrayTree1.printPreorder(); // 전위순회하며 출력
		System.out.print("inorder:");
		arrayTree1.printInorder(); // 중위순회하며 출력
		System.out.print("left:");
		arrayTree1.printLeft(); // 왼쪽 자식들을 출력
		System.out.println("\n");
		// 배열로 구현한 공백 예제 트리를 만들고 메소드 호출
		System.out.println(" 배열 구현 트리2");
		MyArrayTree arrayTree2 = new MyArrayTree();
		System.out.print("preorder:");
		arrayTree2.printPreorder(); // 전위순회하며 출력
		System.out.print("inorder:");
		arrayTree2.printInorder(); // 중위순회하며 출력
		System.out.print("left:");
		arrayTree2.printLeft(); // 왼쪽 자식들을 출력
	}
}

//정수 데이터를 저장하기 위해 연결자료구조로 구현한 이진 트리 클래스
class MyLinkedTree {
	// 트리 노드 클래스 -- data, leftChild, rightChild 필드를 지님
	private class Node {
		private int data;
		Node leftChild;
		Node rightChild;
	}

	// 트리의 루트 노드를 가리키는 인스턴스 변수 root
	private Node root;

	// 공백 트리로 초기화 하는 생성자
	public MyLinkedTree() {
		root = null;
	}

	// 루트 노드의 데이터가 data이고, leftSubtree, rightSubtree를 좌우 서브트리로 하도록 트리를 초기화 하는 생성자
	public MyLinkedTree(int data, MyLinkedTree leftSubtree, MyLinkedTree rightSubtree) {
		root = new Node();
		root.data = data;

		if (leftSubtree == null)
			root.leftChild = null;
		else
			root.leftChild = leftSubtree.root;

		if (rightSubtree == null)
			root.rightChild = null;
		else
			root.rightChild = rightSubtree.root;
	}

	// 트리 전체를 전위 순회하며 노드의 데이터를 출력
	public void printPreorder() {
		preorder(root);
		System.out.println();
	}

	// p를 루트로 하는 트리를 전위 순회하는 메소드
	private void preorder(Node p) {
		if (p != null) {
			System.out.print(p.data);
			preorder(p.leftChild);
			preorder(p.rightChild);
		}
	}

	// 트리 전체를 중위 순회하며 노드의 데이터를 출력
	public void printInorder() {
		inorder(root);
		System.out.println();
	}

	// p를 루트로 하는 트리를 중위 순회하는 메소드
	private void inorder(Node p) {
		if (p != null) {
			inorder(p.leftChild);
			System.out.print(p.data);
			inorder(p.rightChild);
		}
	}

	// 루트노드부터 리프노드에 이르기까지 왼쪽 자식들을 출력하는 메소드(재귀 메소드 아님. 반복문 이용할 것)
	public void printLeft() {
		Node p = root;
		while (p != null) {
			System.out.print(p.data);
			p = p.leftChild;

		}
	}
}

//정수 데이터를 저장하기 위해 배열로 구현한 이진 트리 클래스
class MyArrayTree {
	private int[] treeArray; // 트리를 구현한 배열
	private int number; // 트리의 원소 수

	// 공백 트리로 초기화 하는 생성자
	public MyArrayTree() {
		number = 0;
		treeArray = new int[100];
	}

	// 매개변수로 받은 배열로 트리를 초기화하는 생성자
	public MyArrayTree(int[] array) {
		number = array.length;
		treeArray = new int[number];
		for (int i = 0; i < number; i++) {
			treeArray[i] = array[i];
		}
	}

	// 트리 전체를 전위 순회하며 노드의 데이터를 출력
	public void printPreorder() {
		preorder(0);
		System.out.println();
	}

	// 인덱스 index인 노드를 루트로 하는 트리를 전위 순회하는 메소드
	private void preorder(int index) {
		if (index < number) {
			System.out.print(treeArray[index]);
			preorder(2 * index + 1);
			preorder(2 * index + 2);
		}
	}

	// 트리 전체를 중위 순회하며 노드의 데이터를 출력
	public void printInorder() {
		inorder(0);
		System.out.println();
	}

	// 인덱스 index인 노드를 루트로 하는 트리를 중위 순회하는 메소드
	private void inorder(int index) {
		if (index < number) {
			inorder(2 * index + 1);
			System.out.print(treeArray[index]);
			inorder(2 * index + 2);
		} else
			return;
	}

	// 루트노드부터 리프노드에 이르기까지 왼쪽 자식들을 출력하는 메소드(재귀 메소드 아님. 반복문 이용할 것)
	public void printLeft() {
		for (int i = 0; i < number; i = 2 * i + 1)
			if (treeArray[i] != 0)
				System.out.print(treeArray[i]);

	}
}
