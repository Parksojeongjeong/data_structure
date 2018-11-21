package course9;
import java.util.NoSuchElementException;

//배열로 구현한 트리와 연결자료구조로 구현한 트리를 만들고 테스트하는 프로그램
public class MyTreeTest {
	public static void main(String[] args) {
		System.out.println("course9: 박소정");

		// 노드가 7개인 예제 트리를 만들고 메소드 호출
		System.out.println(" 트리1");
		MyTree tree7 = new MyTree(70, null, null);
		MyTree tree6 = new MyTree(60, null, null);
		MyTree tree5 = new MyTree(50, null, null);
		MyTree tree4 = new MyTree(40, null, null);
		MyTree tree3 = new MyTree(30, tree6, tree7);
		MyTree tree2 = new MyTree(20, tree4, tree5);
		MyTree myTree1 = new MyTree(10, tree2, tree3);

		System.out.println("노드 갯수 = " + myTree1.size());  // 출력: 7
		System.out.println("오른쪽 최하위  = " + myTree1.getRight()); // 출력: 70

		// 노드가 하나인 예제 트리를 만들고 메소드 호출
		System.out.println(" 트리2");
		MyTree myTree2 = new MyTree(99, null, null);

		System.out.println("노드 갯수 = " + myTree2.size());  // 출력: 1
		System.out.println("오른쪽 최하위  = " + myTree2.getRight()); // 출력: 99

		// 공백 예제 트리를 만들고 메소드 호출
		System.out.println(" 트리3");
		MyTree myTree3 = new MyTree();

		System.out.println("노드 갯수 = " + myTree3.size());  // 출력: 0
		System.out.println("오른쪽 최하위  = " + myTree3.getRight()); // 예외 발생
	}
}



//정수 데이터를 저장하기 위해 연결자료구조로 구현한 이진 트리 클래스


class MyTree {
	// 트리 노드 클래스
	private class Node {
		int data;
		Node leftChild;
		Node rightChild;
	}

	// 트리의 루트 노드를 가리키는 인스턴스 변수 root
	Node root = null;

	// 공백 트리로 초기화 하는 생성자
	public MyTree() {
		root = null;
	}

	// 루트 노드의 데이터가 data이고, leftSubtree, rightSubtree를 좌우 서브트리로 하도록 트리를 초기화 하는 생성자
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

	// 노드 갯수를 리턴하는 메소드
	public int size() {
		return count(root);
	}

	// (1) p를 루트로 하는 트리의 노드 갯수를 리턴하는 메소드 **** 재귀 알고리즘으로 작성할 것
	private int count(Node p) {
		if(p != null) 
			return 1+count(p.leftChild)+count(p.rightChild);
		else
			return 0; // 프로그램 완성 전에 프로그램을 실행해 볼 수 있도록 임시로 추가한 문장이므로 나중에 삭제하면 됨
	}

	// (2) 가장 하위 오른쪽 자식의 값을 리턴하는 메소드 **** 반복 알고리즘으로 작성할 것
	public int getRight() {
		// 공백 트리인 경우 예외 발생
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
