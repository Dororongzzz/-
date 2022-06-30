package p2022_06_23;

import java.util.Scanner;

public class p2022_06_23_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		
//		1. 키보드를 이용해서 입력한 정수의 팩토리얼을
//		   구하는 프로그램을 작성 하세요?(for문을 활용하여)
//			ex) 3! = 3 * 2 * 1
//		        5! = 5 * 4 * 3 * 2 * 1

		//저장 변수 초기값 1로 설정(곱하기 연산에 영향x)
		
		
		
		  Scanner sc = new Scanner(System.in);

		  System.out.print("팩토리얼 정수를 입력하세요? : ");
		  int n= sc.nextInt();
		  int fac=1;

		  for(int i=n; i>=1; i--) {
		   fac=fac * i;
		  }

		  System.out.print(n + "! = " + fac);
		
		
		
		


	}

}
