//***************************
// 파일명: hw8_2
// 작성자: 박소정
// 작성일: 11/05
// 설명:연결자료구조를 이용한 큐 구현
//***************************
package hw8_2;

import java.util.Scanner;

public class MyLinkedQueueTest {
	
	public static void main(String[] args) {
		
		MyLinkedQueue queue = new MyLinkedQueue();
		Scanner input = new Scanner(System.in);
		int menu,number;
		do {
			System.out.print("1:삽입 2:삭제 3:조회 4:크기 5:전체삭제 6:종료");
			menu=input.nextInt();

			switch(menu){
			case 1:
				System.out.println("삽입");
				number = input.nextInt();
				queue.enQueue(number);
				break;
			case 2:
				System.out.println("삭제");
				System.out.println(queue.deQueue());
				break;
			case 3:
				System.out.println("조회");
				System.out.println(queue.peek());
				break;
			case 4:
				System.out.println("크기");
				System.out.println(queue.size());
				break;
			case 5:
				System.out.println("전체삭제");
				while(!queue.isEmpty())
					System.out.println(queue.deQueue());
				break;
			case 6:
				System.out.println("종료");
				break;
			default:
				System.out.println("메뉴 선택 오류: 다시 선택하세요.");
			}
		}while(menu != 6);
	}

}