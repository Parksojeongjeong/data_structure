/*
 * ���ϸ�: MyTreeMapTest.java
 * �ۼ���: 2018.11.20
 * �ۼ���: �ڼ���
 * ����: ���� �����ϴ� ����Ž��Ʈ���� �����ϰ� ������ �����ϴ� ���α׷�
 */

package course10;

public class MyTreeMapTest {
	public static void main(String[] args) {
		System.out.println("course10 : �ڼ���");

		// ���� ����Ž��Ʈ�� tree�� ����
		MyTreeMap tree = new MyTreeMap();

		// ���� tree���� key ���� �ش��ϴ� value�� ��ȸ
		System.out.println("kim=" + tree.get("kim"));
		System.out.println();

		// tree��  ���� ����  
		tree.put("kim", "Seoul");
		tree.put("park", "Pusan");
		tree.put("choi", "Incheon");
		tree.put("hong", "Seoul");
		tree.put("seo", "Pusan");
		tree.put("lee", "Suwon");
		tree.put("kim", "Jeju");

		// tree���� key ���� �ش��ϴ� value�� ��ȸ
		System.out.println("kim=" + tree.get("kim"));
		System.out.println("park=" + tree.get("park"));
		System.out.println("choi=" + tree.get("choi"));
		System.out.println("hong=" + tree.get("hong"));
		System.out.println("seo=" + tree.get("seo"));
		System.out.println("lee=" + tree.get("lee"));

		// (1) tree�� <���μ���, ����> ���� ����
		tree.put("park so jeong", "incheon");
		// (2) tree���� ���μ����� Ű������ �Ͽ� ��ȸ�Ͽ� ���(����)�� ���
		System.out.println("park so jeong=" + tree.get("park so jeong"));


	}
}
