//***************************
// ���ϸ�: hw7_4
// �ۼ���: �ڼ���
// �ۼ���: 10-25
// ����: ������ �̿��� ����ǥ�� ����
//***************************
package hw7_4;
import java.util.Scanner;
import java.util.Stack;
import java.util.StringTokenizer;
import java.util.EmptyStackException;

public class doublyStackTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		Stack<Double>stack = new Stack<Double>();
		System.out.println("hw7_4: �ڼ���");
		System.out.println("����ǥ����� �Է�: ");
		String str = input.nextLine();
		StringTokenizer token = new StringTokenizer(str);
		double num1,num2,result;

		try {
			while(token.hasMoreTokens()) {
				String a = token.nextToken();
				if (!a.equals("+") && !a.equals("-") && !a.equals("*") && !a.equals("/"))
					stack.push(Double.parseDouble(a));
				else
				{
					num1=stack.pop();
					num2=stack.pop();

					switch(a) {
					case "+":
						stack.push(num2+num1);
						break;

					case "-":
						stack.push(num2-num1);
						break;
					case "*":
						stack.push(num2*num1);
						break;
					case "/":
						stack.push(num2/num1);
						break;
					default:
						System.out.println("�߸��� ���� �Է�");
						return;
					}

				}
			}
			if(stack.size()!=1)
				System.out.println("�߸��� ���� �Է�");
			else
				System.out.println("result="+stack.pop());
		}
		catch(EmptyStackException e) {
			System.out.println("�߸��� ���� �Է�");
		}

	}

}
