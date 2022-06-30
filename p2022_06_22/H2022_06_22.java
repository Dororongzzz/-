package p2022_06_22;

import java.util.Scanner;

public class H2022_06_22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int n1, n2, n3, max, min, result1, result2;
		System.out.println("정수 3개를 입력하세요?");
		
	

		Scanner sc = new Scanner(System.in);
		n1 = sc.nextInt();
		n2 =sc.nextInt();
		n3 =sc.nextInt();
		
		
		
		result1 =(n1 > n2) ? n1 : n2; 
		max = (result1 > n3) ? result1 : n3; 
		
		result2 =(n1 < n2) ? n1 : n2; 
		min = (result2 < n3) ? result2 : n3; 
		
		System.out.println("max="+max);
		System.out.println("min="+min);
		
	}

}
