//***************************
// ���ϸ�: hw7_3
// �ۼ���: �ڼ���
// �ۼ���: 10-21
// ����: ���Ḯ��Ʈ�� �̿��Ͽ� ������ ���� ����Ŭ����
//***************************
package hw7_3;

import java.util.EmptyStackException;
import java.util.Scanner;

public class MyCharacterStackTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("hw7_3: �ڼ���");

		System.out.print("���� �Է�");
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
						System.out.println("�߸��� ��ȣ �����Դϴ�.");
						return;
					}
				case'>':
					if(stack.pop()=='<')
						break;
					else {
						System.out.println("�߸��� ��ȣ �����Դϴ�.");
						return;
					}
				default:
					continue;
				}
			}catch(EmptyStackException e) {
				System.out.println("�߸��� ��ȣ �����Դϴ�.");
				return;
			}
		}
		if(stack.isEmpty()==true)
			System.out.println("�ùٸ� ��ȣ �����Դϴ�.");
		else 
			System.out.println("�߸��� ��ȣ �����Դϴ�.");

	}

}
