/*
 * 파일명: MyTreeMapTest.java
 * 작성일: 2018.11.20
 * 작성자: 박소정
 * 설명: 쌍을 저장하는 이진탐색트리를 생성하고 연산을 수행하는 프로그램
 */

package course10;

public class MyTreeMapTest {
	public static void main(String[] args) {
		System.out.println("course10 : 박소정");

		// 공백 이진탐색트리 tree를 생성
		MyTreeMap tree = new MyTreeMap();

		// 공백 tree에서 key 값에 해당하는 value를 조회
		System.out.println("kim=" + tree.get("kim"));
		System.out.println();

		// tree에  쌍을 삽입  
		tree.put("kim", "Seoul");
		tree.put("park", "Pusan");
		tree.put("choi", "Incheon");
		tree.put("hong", "Seoul");
		tree.put("seo", "Pusan");
		tree.put("lee", "Suwon");
		tree.put("kim", "Jeju");

		// tree에서 key 값에 해당하는 value를 조회
		System.out.println("kim=" + tree.get("kim"));
		System.out.println("park=" + tree.get("park"));
		System.out.println("choi=" + tree.get("choi"));
		System.out.println("hong=" + tree.get("hong"));
		System.out.println("seo=" + tree.get("seo"));
		System.out.println("lee=" + tree.get("lee"));

		// (1) tree에 <본인성명, 도시> 쌍을 삽입
		tree.put("park so jeong", "incheon");
		// (2) tree에서 본인성명을 키값으로 하여 조회하여 결과(도시)를 출력
		System.out.println("park so jeong=" + tree.get("park so jeong"));


	}
}
