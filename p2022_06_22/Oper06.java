//조건 연산자

package p2022_06_22;

import java.util.Scanner;

public class Oper06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//	     변수 = (조건식) ?  값1 :  값2;
//	      조건식이 참이면 값1을 변수에 할당하고, 
//	      조건식이 거짓이면 값2를 변수에 할당한다.

//키보드로 입력한 정수 2개 중에서 최대값과 최소값을 출력하는 프로그램을 작성하세요?
		
		int n1, n2, max, min;
		//자바는 변수 선언을 해도 되고 안해도 됨
		//스택에 4byte 처리 공간 만들어라
		System.out.println("정수 2개를 입력 하세요?");
		
		Scanner sc = new Scanner(System.in);
		//입력처리 클래스
		//임포트 처리해야함
		n1 =sc.nextInt();
		n2 =sc.nextInt();
		
		max = (n1 > n2) ? n1 : n2;   //최대값 
		min = (n1 < n2) ? n1 : n2;   //최소값
		//if else값 대신 조건 연산자로
		

	System.out.println("max="+max);
	System.out.println("min="+min);
	
	
	
	sc.close();
	
	}
}
