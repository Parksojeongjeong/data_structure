//***************************
 // ���ϸ�: hw7_1
 // �ۼ���: �ڼ���
 // �ۼ���: 10-11
 // ����: ������ ���� �ڷᱸ���� �����Ѵ�.
 //***************************
package hw7_1;

import java.util.Scanner;
import java.util.Stack;

public class MyArrayStackTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("lab7_1:�ڼ���");
		
		MyArrayStack stack = new MyArrayStack(5);
		Scanner input = new Scanner(System.in);
	
		int menu = 0;
		int number = 0;
		int a;
		do {
			System.out.print("1:���� 2:���� 3:��ȸ 4:�հ� 5:����");
			menu=input.nextInt();

			switch(menu){
			case 1:
				System.out.println("����");
				number = input.nextInt();
				stack.push(number);
				break;
			case 2:
				System.out.println("����");
				a = stack.pop();
				System.out.println(a);
				break;
			case 3:
				System.out.println("��ȸ");
				a=stack.peek();
				System.out.println(a);
				break;
			case 4:
				System.out.println("�հ�");
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
				System.out.println("����");
				break;
			default:
				System.out.println("�޴� ���� ����: �ٽ� �����ϼ���.");
			}
		}while(menu != 5);


	}

}