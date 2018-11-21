//***************************
// 파일명: hw7_4
// 작성자: 박소정
// 작성일: 10-25
// 설명: 스택을 이용한 후위표기 수식
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
		System.out.println("hw7_4: 박소정");
		System.out.println("후위표기수식 입력: ");
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
						System.out.println("잘못된 수식 입력");
						return;
					}

				}
			}
			if(stack.size()!=1)
				System.out.println("잘못된 수식 입력");
			else
				System.out.println("result="+stack.pop());
		}
		catch(EmptyStackException e) {
			System.out.println("잘못된 수식 입력");
		}

	}

}
