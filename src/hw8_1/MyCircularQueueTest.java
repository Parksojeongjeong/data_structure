//***************************
// ���ϸ�: hw8_1
// �ۼ���: �ڼ���
// �ۼ���: 11/1
// ����:�迭�� �̿��� ���� ť ����
//***************************
package hw8_1;

import java.util.Scanner;

public class MyCircularQueueTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyCircularQueue queue = new MyCircularQueue(5);
		Scanner input = new Scanner(System.in);
		int menu,number;
		do {
			System.out.print("1:���� 2:���� 3:��ȸ 4:ũ�� 5:��ü���� 6:����");
			menu=input.nextInt();

			switch(menu){
			case 1:
				System.out.println("����");
				number = input.nextInt();
				queue.enQueue(number);
				break;
			case 2:
				System.out.println("����");
				System.out.println(queue.deQueue());
				break;
			case 3:
				System.out.println("��ȸ");
				System.out.println(queue.peek());
				break;
			case 4:
				System.out.println("ũ��");
				System.out.println(queue.size());
				break;
			case 5:
				System.out.println("��ü����");
				while(!queue.isEmpty())
					System.out.println(queue.deQueue());
				break;
			case 6:
				System.out.println("����");
				break;
			default:
				System.out.println("�޴� ���� ����: �ٽ� �����ϼ���.");
			}
		}while(menu != 6);
	}
}
