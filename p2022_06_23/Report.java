package p2022_06_23;

import java.util.Scanner;

public class Report {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.print("3개의 정수를 입력 하세요?");
		int n1, n2, n3, max, min;

		Scanner sc = new Scanner(System.in);
		//생성자와 클래스 명은 동일해야 함 ex>Scanner
		//괄호 포함
		n1 = sc.nextInt(); // n1=20;
		n2 = sc.nextInt(); // n2=10;
		n3 = sc.nextInt();
        //정수형태로 받는 것이기 때문
		//double 형은 nextdouoble
		//Scanner객체 =sc
	
		
		
        // 최대값
		max = (n1 > n2) ? n1 : n2;
		max = (max > n3) ? max : n3;		
//		max = (n1>n2 && n1>n3) ? n1 : (n2>n3) ? n2: n3;
		//(n1>n2 && n1>n3)비교해서 n1이 크면 n1값 할당 아니면 (n2>n3) 다시 비교 후 n2,n3 대입
		
		
		// 최소값		
		min = (n1 < n2) ? n1 : n2;
		min = (min < n3) ? min : n3;		
//		min = (n1<n2 && n1<n3) ? n1 : (n2<n3) ? n2: n3;
		
		System.out.println("max=" + max);
		System.out.println("min=" + min);		
		
	}

}
