//***************************
// ���ϸ�: hw8_2
// �ۼ���: �ڼ���
// �ۼ���: 11/05
// ����:�����ڷᱸ���� �̿��� ť ����
//***************************
package hw8_2;

import java.util.Scanner;

public class MyLinkedQueueTest {
	
	public static void main(String[] args) {
		
		MyLinkedQueue queue = new MyLinkedQueue();
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