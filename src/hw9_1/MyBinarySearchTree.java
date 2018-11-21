/*
 * ���ϸ�: MyBinarySearchTree.java
 * �ۼ���: 2018.11.13
 * �ۼ���: �ڼ���
 * ����: int�� Ű�� �����ϴ� ����Ž��Ʈ���� �����ڷᱸ���� ������ Ŭ����
 */
package hw9_1;
import java.util.NoSuchElementException;
public class MyBinarySearchTree {
	// (1) Ʈ���� ��带 ǥ���ϴ� private Ŭ���� Node - �ʵ�(int�� key, leftChild, rightChild),
	// ������(key���� �Ű������� �޾� �ʱ�ȭ)
	public class Node{
		int key;
		Node leftChild = null;
		Node rightChild = null;
		Node(int key){
			this.key=key;
		}
	}
	// (2) private �ν��Ͻ� ���� Ʈ���� ��Ʈ ��带 ��ų ����(root)�� �����ϰ� null�� �ʱ�ȭ
	private Node root = null;
	// Ʈ���� Ű�� key�� �����ϴ� �޼ҵ�

	public void insert(int key) {
		root = insertKey(root, key);
	}

	// p�� ��Ʈ�� �ϴ� Ʈ���� Ű�� key�� �����ϰ�, ���� �� ��Ʈ�� �����ϴ� �޼ҵ�(��� �˰���)
	private Node insertKey(Node p, int key) {
		if (p == null) {
			Node newNode = new Node(key);
			return newNode;
		} else if (key < p.key) {
			p.leftChild = insertKey(p.leftChild, key);
			return p; // ��Ʈ �Һ�
		} else if (key > p.key) {
			p.rightChild = insertKey(p.rightChild, key);
			return p; // ��Ʈ �Һ�
		} else { // key = p.key �� ��� ���� ����
			System.out.println("���� ����. �ߺ��� Ű���� �����մϴ�: " + key);
			return p; // ��Ʈ �Һ�
		}
	}

	// Ʈ���� ������ȸ�ϸ� ����ϴ� �޼ҵ�
	public void printInorder() {
		inorder(root);
		System.out.println();
	}

	// (3) p�� ��Ʈ�� �ϴ� Ʈ���� ���� ��ȸ�ϸ� Ű���� ����ϴ� �޼ҵ�(��� �˰���)
	private void inorder(Node p) { 
		if(p != null) {
			inorder(p.leftChild);
			System.out.println(p.key + " ");
			inorder(p.rightChild);
		}
	}

	// (4) Ʈ���� �ִ� Ű���� �����ϴ� �޼ҵ�(�ݺ� �˰���) - ���� Ʈ���� ��� NoSuchElementException ���� �߻�
	public int max() {
		Node temp = root;
		if (root == null) {
			throw new NoSuchElementException();
		}
		else
			while(temp.rightChild != null) 
				temp=temp.rightChild;
		return temp.key;
	}

	// Ʈ���� Ű�� key�� �����ϴ��� ���θ� �����ϴ� �޼ҵ�
	public boolean contains(int key) {
		return search(root, key);
	}

	// (5) p�� ��Ʈ�� �ϴ� Ʈ���� Ű�� key�� �����ϴ��� ���θ� �����ϴ� �޼ҵ�(��� �˰���)
	private boolean search(Node p, int key) {
		if(p == null)
			return false;
		else if(p.key < key)
			return search(p.rightChild,key);
		else if(p.key > key)
			return search(p.leftChild,key);
		else
			return true;
	}

	// (6) Ʈ���� Ű�� key�� �����ϴ� �޼ҵ�(�ݺ� �˰���) - ���� ��������(true/false)�� ����
	public boolean add(int key) {
		Node temp = root;
		Node pre = null;
		Node newNode = new Node(key);
		if(root == null) {
			root=newNode;
			return true;
		}
		while(temp != null) {
			if(temp.key == key)
				return false;
			else {
				pre=temp;
				if(key > temp.key)
					temp = temp.rightChild;
				else
					temp=temp.leftChild;
			}
		}
		if(newNode.key < pre.key)
			pre.leftChild = newNode;
		else
			pre.rightChild = newNode;
		return true;
	}
//	public int remove(int item) {
//		
//		return ;
//	}
}
