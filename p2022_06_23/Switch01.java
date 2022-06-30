package p2022_06_23;

import java.util.Scanner;

public class Switch01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//키보드로 입력한 정수가 어느 학점에 해당 되는지 판별하는 프로그램을 작성하세요?
				//90점 이상 - A학점
				//80점 이상 - B학점
				//70점 이상 - C학점
				//60점 이상 - D학점
				//60점 미만 - F학점
		
		
		// 1.고정된 값의 정수 형태   
		// 2.키보드로 정수 값을 입력 받은 형태
		
		System.out.println("0~100점 사이의 점수를 입력하세요.");
		 Scanner sc = new Scanner(System.in);
		 
		 int s =sc.nextInt();  		// s = 85
		 s = s / 10;				// s /= 10
		 
		 //9대입 시 9.5가 나오지만 int형이라 소수점 이하 버림
		 //int형과 int형을 산술연산 수행 시 int형으로 처리된다는 점을 활용
	
		 
		
		
		switch(s) {					//// ***위 코드를 입력하지 않을 시 95점 입력하면 F학점 나옴
			case 10:    
				  //100점 만드는 법
	              //수행 할 코드가 없음+break문이 없으므로 아래의 A학점을 산출 함	
			case 9 : System.out.println("A학점");
					break;
			case 8 : System.out.println("B학점");
					break;
			case 7 : System.out.println("C학점");
					break;
 			case 6 : System.out.println("D학점");
 					break;
 			default:  System.out.println("F학점");
	
 		
		}
		
		//break문(보조제어문)을 반드시 사용
		//사용하지 않을 시 모든 학점이 출력됨
		

		
		
		
		
		
		
		
//		switch(s) {									//// *** 95점 입력하면 F학점 나옴
//			case 90 : System.out.println("A학점");
//					break;
//			case 80 : System.out.println("B학점");
//					break;
//			case 70 : System.out.println("C학점");
//					break;
// 			case 60 : System.out.println("D학점");
// 					break;
// 			default:  System.out.println("F학점");
	
 		
	
	}

}
