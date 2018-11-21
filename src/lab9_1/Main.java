package lab9_1;

public class Main {
	public static void main(String[] args) {
		System.out.println("lab9_1: �ڼ���");
		System.out.println();
		// �����ڷᱸ���� ������ ��� 7�� ���� Ʈ���� ����� �޼ҵ� ȣ��
		System.out.println(" �����ڷᱸ�� ���� Ʈ��1");
		MyLinkedTree tree7 = new MyLinkedTree(7, null, null);
		MyLinkedTree tree6 = new MyLinkedTree(6, null, null);
		MyLinkedTree tree5 = new MyLinkedTree(5, null, null);
		MyLinkedTree tree4 = new MyLinkedTree(4, null, null);
		MyLinkedTree tree3 = new MyLinkedTree(3, tree6, tree7);
		MyLinkedTree tree2 = new MyLinkedTree(2, tree4, tree5);
		MyLinkedTree linkedTree1 = new MyLinkedTree(1, tree2, tree3);

		System.out.print("preorder:");
		linkedTree1.printPreorder(); // ������ȸ�ϸ� ���
		System.out.print("inorder:");
		linkedTree1.printInorder(); // ������ȸ�ϸ� ���
		System.out.print("left:");
		linkedTree1.printLeft(); // ���� �ڽĵ��� ���
		System.out.println("\n");

		// �����ڷᱸ���� ������ ���� ���� Ʈ���� ����� �޼ҵ� ȣ��
		System.out.println(" �����ڷᱸ�� ���� Ʈ��2");
		MyLinkedTree linkedTree2 = new MyLinkedTree();

		System.out.print("preorder:");
		linkedTree2.printPreorder(); // ������ȸ�ϸ� ���
		System.out.print("inorder:");
		linkedTree2.printInorder(); // ������ȸ�ϸ� ���
		System.out.print("left:");
		linkedTree2.printLeft(); // ���� �ڽĵ��� ���
		System.out.println("\n");

		// �迭�� ������ ��� 8�� ���� Ʈ���� ����� �޼ҵ� ȣ��
		System.out.println(" �迭 ���� Ʈ��1");
		MyArrayTree arrayTree1 = new MyArrayTree(new int[] { 1, 2, 3, 4, 5, 6, 7, 8 });
		System.out.print("preorder:");
		arrayTree1.printPreorder(); // ������ȸ�ϸ� ���
		System.out.print("inorder:");
		arrayTree1.printInorder(); // ������ȸ�ϸ� ���
		System.out.print("left:");
		arrayTree1.printLeft(); // ���� �ڽĵ��� ���
		System.out.println("\n");
		// �迭�� ������ ���� ���� Ʈ���� ����� �޼ҵ� ȣ��
		System.out.println(" �迭 ���� Ʈ��2");
		MyArrayTree arrayTree2 = new MyArrayTree();
		System.out.print("preorder:");
		arrayTree2.printPreorder(); // ������ȸ�ϸ� ���
		System.out.print("inorder:");
		arrayTree2.printInorder(); // ������ȸ�ϸ� ���
		System.out.print("left:");
		arrayTree2.printLeft(); // ���� �ڽĵ��� ���
	}
}

//���� �����͸� �����ϱ� ���� �����ڷᱸ���� ������ ���� Ʈ�� Ŭ����
class MyLinkedTree {
	// Ʈ�� ��� Ŭ���� -- data, leftChild, rightChild �ʵ带 ����
	private class Node {
		private int data;
		Node leftChild;
		Node rightChild;
	}

	// Ʈ���� ��Ʈ ��带 ����Ű�� �ν��Ͻ� ���� root
	private Node root;

	// ���� Ʈ���� �ʱ�ȭ �ϴ� ������
	public MyLinkedTree() {
		root = null;
	}

	// ��Ʈ ����� �����Ͱ� data�̰�, leftSubtree, rightSubtree�� �¿� ����Ʈ���� �ϵ��� Ʈ���� �ʱ�ȭ �ϴ� ������
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

	// Ʈ�� ��ü�� ���� ��ȸ�ϸ� ����� �����͸� ���
	public void printPreorder() {
		preorder(root);
		System.out.println();
	}

	// p�� ��Ʈ�� �ϴ� Ʈ���� ���� ��ȸ�ϴ� �޼ҵ�
	private void preorder(Node p) {
		if (p != null) {
			System.out.print(p.data);
			preorder(p.leftChild);
			preorder(p.rightChild);
		}
	}

	// Ʈ�� ��ü�� ���� ��ȸ�ϸ� ����� �����͸� ���
	public void printInorder() {
		inorder(root);
		System.out.println();
	}

	// p�� ��Ʈ�� �ϴ� Ʈ���� ���� ��ȸ�ϴ� �޼ҵ�
	private void inorder(Node p) {
		if (p != null) {
			inorder(p.leftChild);
			System.out.print(p.data);
			inorder(p.rightChild);
		}
	}

	// ��Ʈ������ ������忡 �̸������ ���� �ڽĵ��� ����ϴ� �޼ҵ�(��� �޼ҵ� �ƴ�. �ݺ��� �̿��� ��)
	public void printLeft() {
		Node p = root;
		while (p != null) {
			System.out.print(p.data);
			p = p.leftChild;

		}
	}
}

//���� �����͸� �����ϱ� ���� �迭�� ������ ���� Ʈ�� Ŭ����
class MyArrayTree {
	private int[] treeArray; // Ʈ���� ������ �迭
	private int number; // Ʈ���� ���� ��

	// ���� Ʈ���� �ʱ�ȭ �ϴ� ������
	public MyArrayTree() {
		number = 0;
		treeArray = new int[100];
	}

	// �Ű������� ���� �迭�� Ʈ���� �ʱ�ȭ�ϴ� ������
	public MyArrayTree(int[] array) {
		number = array.length;
		treeArray = new int[number];
		for (int i = 0; i < number; i++) {
			treeArray[i] = array[i];
		}
	}

	// Ʈ�� ��ü�� ���� ��ȸ�ϸ� ����� �����͸� ���
	public void printPreorder() {
		preorder(0);
		System.out.println();
	}

	// �ε��� index�� ��带 ��Ʈ�� �ϴ� Ʈ���� ���� ��ȸ�ϴ� �޼ҵ�
	private void preorder(int index) {
		if (index < number) {
			System.out.print(treeArray[index]);
			preorder(2 * index + 1);
			preorder(2 * index + 2);
		}
	}

	// Ʈ�� ��ü�� ���� ��ȸ�ϸ� ����� �����͸� ���
	public void printInorder() {
		inorder(0);
		System.out.println();
	}

	// �ε��� index�� ��带 ��Ʈ�� �ϴ� Ʈ���� ���� ��ȸ�ϴ� �޼ҵ�
	private void inorder(int index) {
		if (index < number) {
			inorder(2 * index + 1);
			System.out.print(treeArray[index]);
			inorder(2 * index + 2);
		} else
			return;
	}

	// ��Ʈ������ ������忡 �̸������ ���� �ڽĵ��� ����ϴ� �޼ҵ�(��� �޼ҵ� �ƴ�. �ݺ��� �̿��� ��)
	public void printLeft() {
		for (int i = 0; i < number; i = 2 * i + 1)
			if (treeArray[i] != 0)
				System.out.print(treeArray[i]);

	}
}
