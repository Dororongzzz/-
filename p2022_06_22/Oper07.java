package p2022_06_22;

import java.util.Scanner;

public class Oper07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//논리 연산자 : and(&&), or(||), not(!)
		
		
		//5과목의 점수를 키보드로 입력 받았을 때, 합격, 불합격을 판별하는 프로그램을 작성하세요?
		//각 과목 당 과락은 40점이고, 평균60점 이상 받아야 합격한다.
		
		
		int n1, n2, n3, n4, n5, total;
		double avg;
		System.out.println("5과목의 점수를 입력하세요?");
		
		Scanner sc = new Scanner(System.in);
		
		n1 = sc.nextInt();
		n2= sc.nextInt();
		n3= sc.nextInt();
		n4= sc.nextInt();
        n5 =sc.nextInt();
        
        //int형과 int형을 산술 연산 수행하면, 결과는 int형으로 처리된다.        
        //double형과 double형을 산술 연산 수행하면, 결과는 double형으로 처리된다.
        //int형과 double형을 산술 연산 수행하면,결과는 double형으로 처리된다.
        //(더 큰 자료형으로 처리됨)
        
        
        
        
        total = n1 + n2 + n3 + n4 + n5;    //총점
		avg = (double)total / (double)5;    //평균
		//total /5 둘다 int형이므로 값도int
		//그럼 소수점 이하 버림
		//double을 붙이거나 .0을 붙이면 해결
		//둘중 하나에 double붙이면 둘 다 double형으로 처리 됨
		
		System.out.println("avg="+avg);
		
		
		
		if(n1>=40 && n2>=40 &&  n3>=40 &&   n4>=40  &&n5>=40  &&avg >=60) {
			System.out.println("합격");
		} else {
			System.out.println("불합격");
		}
		
		
		
		
		sc.close();
		
	
		
		
	}

}
