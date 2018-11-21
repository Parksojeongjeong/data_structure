package course9;
import java.util.NoSuchElementException;

//�迭�� ������ Ʈ���� �����ڷᱸ���� ������ Ʈ���� ����� �׽�Ʈ�ϴ� ���α׷�
public class MyTreeTest {
	public static void main(String[] args) {
		System.out.println("course9: �ڼ���");

		// ��尡 7���� ���� Ʈ���� ����� �޼ҵ� ȣ��
		System.out.println(" Ʈ��1");
		MyTree tree7 = new MyTree(70, null, null);
		MyTree tree6 = new MyTree(60, null, null);
		MyTree tree5 = new MyTree(50, null, null);
		MyTree tree4 = new MyTree(40, null, null);
		MyTree tree3 = new MyTree(30, tree6, tree7);
		MyTree tree2 = new MyTree(20, tree4, tree5);
		MyTree myTree1 = new MyTree(10, tree2, tree3);

		System.out.println("��� ���� = " + myTree1.size());  // ���: 7
		System.out.println("������ ������  = " + myTree1.getRight()); // ���: 70

		// ��尡 �ϳ��� ���� Ʈ���� ����� �޼ҵ� ȣ��
		System.out.println(" Ʈ��2");
		MyTree myTree2 = new MyTree(99, null, null);

		System.out.println("��� ���� = " + myTree2.size());  // ���: 1
		System.out.println("������ ������  = " + myTree2.getRight()); // ���: 99

		// ���� ���� Ʈ���� ����� �޼ҵ� ȣ��
		System.out.println(" Ʈ��3");
		MyTree myTree3 = new MyTree();

		System.out.println("��� ���� = " + myTree3.size());  // ���: 0
		System.out.println("������ ������  = " + myTree3.getRight()); // ���� �߻�
	}
}



//���� �����͸� �����ϱ� ���� �����ڷᱸ���� ������ ���� Ʈ�� Ŭ����


class MyTree {
	// Ʈ�� ��� Ŭ����
	private class Node {
		int data;
		Node leftChild;
		Node rightChild;
	}

	// Ʈ���� ��Ʈ ��带 ����Ű�� �ν��Ͻ� ���� root
	Node root = null;

	// ���� Ʈ���� �ʱ�ȭ �ϴ� ������
	public MyTree() {
		root = null;
	}

	// ��Ʈ ����� �����Ͱ� data�̰�, leftSubtree, rightSubtree�� �¿� ����Ʈ���� �ϵ��� Ʈ���� �ʱ�ȭ �ϴ� ������
	public MyTree(int data, MyTree leftSubtree, MyTree rightSubtree)  {
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

	// ��� ������ �����ϴ� �޼ҵ�
	public int size() {
		return count(root);
	}

	// (1) p�� ��Ʈ�� �ϴ� Ʈ���� ��� ������ �����ϴ� �޼ҵ� **** ��� �˰������� �ۼ��� ��
	private int count(Node p) {
		if(p != null) 
			return 1+count(p.leftChild)+count(p.rightChild);
		else
			return 0; // ���α׷� �ϼ� ���� ���α׷��� ������ �� �� �ֵ��� �ӽ÷� �߰��� �����̹Ƿ� ���߿� �����ϸ� ��
	}

	// (2) ���� ���� ������ �ڽ��� ���� �����ϴ� �޼ҵ� **** �ݺ� �˰������� �ۼ��� ��
	public int getRight() {
		// ���� Ʈ���� ��� ���� �߻�
		Node temp = root;
		if(root == null)
			throw new NoSuchElementException();
		else {
			while(temp.rightChild != null)
				temp = temp.rightChild;
			return temp.data;
		}

	}
}
