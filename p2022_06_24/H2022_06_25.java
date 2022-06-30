package p2022_06_24;

import java.util.Scanner;

public class H2022_06_25 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
//	       키보드를 이용해서 정수 5개를 입력 받은 후 int형 배열에 저장한다. 
//		이 때 배열에 저장된 값 중에서  최대값과 최소값을 구하는 프로그램을 작성하세요?

//1차원 배열 형식1)	
		int [] s = new int [5];
		
		
		System.out.println("5과목의 점수를 입력하세요?");
		Scanner sc = new Scanner(System.in);
		
		int max, min;
 			
		s[0] = sc.nextInt();
		max = s[0];  
		min = s[0];  
				
				for(int i=1; i<s.length; i++) {
					s[i] = sc.nextInt();
					if(s[i] > max ) max =s[i];
					if(s[i] < min ) min =s[i];
				}
			System.out.println("max:" +max);
			System.out.println("min:" +min);
				
		
		
	}

}
