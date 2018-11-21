//***************************
 // 파일명: hw7_1
 // 작성자: 박소정
 // 작성일: 10-11
 // 설명: 스택을 순차 자료구조로 구현한다.
 //***************************
package hw7_1;

import java.util.Scanner;
import java.util.Stack;

public class MyArrayStackTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("lab7_1:박소정");
		
		MyArrayStack stack = new MyArrayStack(5);
		Scanner input = new Scanner(System.in);
	
		int menu = 0;
		int number = 0;
		int a;
		do {
			System.out.print("1:삽입 2:삭제 3:조회 4:합계 5:종료");
			menu=input.nextInt();

			switch(menu){
			case 1:
				System.out.println("삽입");
				number = input.nextInt();
				stack.push(number);
				break;
			case 2:
				System.out.println("삭제");
				a = stack.pop();
				System.out.println(a);
				break;
			case 3:
				System.out.println("조회");
				a=stack.peek();
				System.out.println(a);
				break;
			case 4:
				System.out.println("합계");
				if(stack.isEmpty()==true)
					System.out.println("0");
				else {
					int sum=0;
					while(!stack.isEmpty())
						sum += stack.pop();
					System.out.println(sum);
				}
				break;
			case 5:
				System.out.println("종료");
				break;
			default:
				System.out.println("메뉴 선택 오류: 다시 선택하세요.");
			}
		}while(menu != 5);


	}

}