package p2022_06_30;
//Import문 예제)
//자바 난수 발생 2가지) 1.Math.random():java.lang속성 x:import 해야함 
//				 2.Random 클래스
//사용자 정의 클래스일 경우 :같은 패키지 Import x    → 접근제어자와 관련
//                 :다른 패키지 Import o     

import java.util.Date;
import java.util.Random;

//*:java.util의 모든 클래스를 불러온다 
import java.util.*;

public class RandomTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Random r = new Random(); //1.자동 import단축키: ctrl + shift + o
								//2.자동 완성: ctrl + shift
		
		//java.util.Random r = new java.util.Random();   //Random패키지를 불러들여 사용: 번거로움 :잘 x
		
		int n1 = r.nextInt(10);		//0 ~ 9 난수 발생
		System.out.println("n1=" +n1);
		
		//난수발생1):Random 클래스 : 1 ~ 45 난수 발생
		int n2= r.nextInt(45)+1;   
		System.out.println("n2=" +n2);
		
		//난수발생2):Math.random() 
		//0.0 <= Math.Random() <1.0 난수 발생
		int n3 = (int)(Math.random() *45)+1;
		System.out.println("n3=" +n3 );
		
		//날짜,시간 클래스 :java.lang 속성x:import해야함 
		//2개의 패키지에 있어 import시 알림창 뜸  >java.util.data로 선택
		Date d = new Date();
		System.out.println(d);  //영미권 포맷으로 뜸
		
	}

}
