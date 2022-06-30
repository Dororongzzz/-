package p2022_06_29;

import java.util.Scanner;

public class MathEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//정적 메소드 대표적 예)
		//<Math클래스>
		//:정적필드 + 정적 메소드
		//:생성자 제공x : new객체 선언 하면 heap영역이기 때문에  오히려 오류 발생
		//따로 임포트 하지 않아도 됨
	
		
		
		//Math클래스는 생성자가 제공되지 않기때문에, Math 클래스로 직접 객체를 생성할 수 없다 
//		math m = new Math(); //제공하지 않기 때문에 직접 만들면 오류 발생
		
		//정적 필드 클래스명 +"."으로 접근
		System.out.println("E=" +Math.E);
		System.out.println("PI=" +Math.PI);
		
		
		
		//<자주 쓰는 Math클래스들(메소드 오버로딩):서로 다른 자료형을 매개변수로 사용>
		//1.<abs 메소드>:절대 값
		System.out.println("abs()=" +Math.abs(-10));
		
		//2.<ceil 메소드>: 소수점 이하 값 올림
		//			 :double 형으로 돌려줌
		System.out.println("ceil()=" +Math.ceil(3.14));

	    //3.<round 메소드>:반올림
		//			  :long형으로 값 돌려줌
		System.out.println("round()=" +Math.round(10.5));
		
		//4.<floor 메소드>:소수점 이하 버림
		//			  :double형으로 값 돌려줌
		System.out.println("floor()=" +Math.floor(10.9));
		
		
		//5.<max 메소드>:최대값
		//            :(자바)2개 값 비교까지만 가능 //3개부터는 만들어서 사용
		System.out.println("max()=" +Math.max(10,20));
		
		//6.<min 메소드>:최소값
        //      :(자바)2개 값 비교까지만 가능 //3개부터는 만들어서 사용
		System.out.println("min()=" +Math.min(10,20));
	
		
		//7.<pow 메소드>:2의 3승
		//            :double형으로 값 돌려줌
		System.out.println("pow()=" +Math.pow(2,3));
		
		//8.<random 메소드>:0.0 <=Math.random() < 1.0 :범위 실수난수 발생 
		//            :double형으로 값 돌려줌
		System.out.println("random()=" +Math.random());
		
		//9.<sqrt 메소드>:제곱근(루트) 
	    //            :double형으로 값 돌려줌
		System.out.println("sqrt()=" +Math.sqrt(5));
		
		
		//<Scanner객체>
		//static InputStream(=system.in) 생성자 사용
		Scanner sc = new Scanner(System.in);
		
	}

}
