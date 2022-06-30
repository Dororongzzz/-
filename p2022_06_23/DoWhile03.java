package p2022_06_23;

import java.util.Scanner;

public class DoWhile03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//p.130
		
		
		System.out.println("메세지를 입력하세요?");
		System.out.println("프로그램을 종료하려면 q를 입력하세요?");
		
		Scanner sc = new Scanner(System.in);
		String input;    	//정수가 아니라  문자열을 입력받기 때문
		
		do {
			System.out.print(">");
			input = sc.nextLine();     //정수가 아니므로 nextInt가아닌 nextLine으로 문자를 입력받는다.
										//사용자가 입력한 문자를 string문자로 받는다.
										//띄어쓰기가 있어도 한 줄을 통채로 입력 받는다
			System.out.println("입력 문자:"+input);
		} while(!input.equals("q"));    //equas 문자열을 비교 !(not연산자) 만나서 반대로 false가 나오기 때문에 빠져나온다.
		
		System.out.println("프로그램 종료");
		sc.close();
		
		
		
		
		
	}

}
