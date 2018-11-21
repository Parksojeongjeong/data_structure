//***************************
// 파일명: hw7_3
// 작성자: 박소정
// 작성일: 10-21
// 설명: 연결리스트를 이용하여 구현한 문자 스택클래스
//***************************
package hw7_3;

import java.util.EmptyStackException;
import java.util.Scanner;

public class MyCharacterStackTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("hw7_3: 박소정");

		System.out.print("수식 입력");
		MyCharacterStack stack = new MyCharacterStack();
		Scanner input = new Scanner(System.in);
		String str =input.nextLine();
		for(int i=0;i<str.length();i++) {
			if((str.charAt(i)=='(') || (str.charAt(i)=='<'))
				stack.push(str.charAt(i));
			try {
				switch(str.charAt(i)) {
				case ')':
					if(stack.pop()=='(')
						break;
					else {
						System.out.println("잘못된 괄호 수식입니다.");
						return;
					}
				case'>':
					if(stack.pop()=='<')
						break;
					else {
						System.out.println("잘못된 괄호 수식입니다.");
						return;
					}
				default:
					continue;
				}
			}catch(EmptyStackException e) {
				System.out.println("잘못된 괄호 수식입니다.");
				return;
			}
		}
		if(stack.isEmpty()==true)
			System.out.println("올바른 괄호 수식입니다.");
		else 
			System.out.println("잘못된 괄호 수식입니다.");

	}

}
