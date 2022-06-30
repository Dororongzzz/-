package p2022_06_23;

import java.util.Scanner;

public class If05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//키보드로 입력한 정수가 어느 학점에 해당 되는지 판별하는 프로그램을 작성하세요?
		//90점 이상 - A학점
		//80점 이상 - B학점
		//70점 이상 - C학점
		//60점 이상 - D학점
		//60점 미만 - F학점
		
		System.out.println("0~100점 사이의 점수를 입력하세요?");
		
		Scanner sc = new Scanner(System.in);
		
		int s =sc.nextInt();  
		// s = 95
		//90,80,70,60 다 만족하는데 만족하는 조건식 중 가장 바로 아래에 있는 것 을 수행하므로 A학점 출력
		//if문 여러개 사용과는 다름
		
		if(s >=90 ) {
			System.out.println("A학점");
		  } else if(s >= 80) {
			System.out.println("B학점");
		  } else if(s >= 70) {
			System.out.println("C학점");
		  }		 else if(s >= 60) {
			System.out.println("D학점");
		  } else {
			System.out.println("F학점");
		  }
		
		
		
		
		
		
		
		
	}

}
