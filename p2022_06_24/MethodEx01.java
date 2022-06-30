package p2022_06_24;


//메소드 : 여러가지 코드를 묶어 놓은 것
//메소드를 사용하는 이유는 코드를 재사용하기 위해서 사용된다.


public class MethodEx01 {
	
	//사용자 정의 메소드
	//자동x 직접 호출
	//사용자 정의 메소드는 프로그래머가 직접 호출해야만 실행된다.
	
	static void check() {		//public 생략 가능:자바에서는 생략시 default로 지정           static: 정적 메소드 
		//check():매개변수x시 이름만으로 호출 가능
		//void or 자료형 
		System.out.println("함수 호출 성공");
		return;					//void의 경우에는 return 생략 가능 함.
								// 자바의 경우 메소드 위치 상관앖이 싱행됨
		} 

	
	//매개변수가 있는 경우
	// call by value방식: 값 전달에 의한 메소드 호출 방식
	//위 메소드와 지금 메소드 이름은 같지만 아래 메소드는 매개변수가 다른 경우 :메소드 오버로딩
	 static void check(int a) { 			//매개변수(parameter): int a =30  /메소드 안에서 사용되는 변수=지역 변수
		 									//매개변수의 자료형과 일치하는 값 전달
		 									//int 정수형으로 정의 했기 때문에 맞는 값을 입력 함
		 System.out.println("전달된 값:"+a);
	 }
	
	
	 //int, double형
	 static void check(int a, double d) {   //큰 값으로 변환 됨
		 double result = a + d;
		 System.out.println("전달된 값의 합:"+ result);
	 }
	 
	 
	 //문자형
	 static void check(char c) {		//char c ='A'
		 System.out.println("전달된 값:"+ c);
	 }
	 
	 
	 
	 //boolean형
	 static void check(boolean b) {		//boolean b = true;
		 System.out.println("전달된 값:"+ b);
	 }
	 
	 
	 //String 클래스 사용 
	 //String 클래스 : 1.new객체 선언 가능    2.문자열 가능
	 //call by reference방식 : 주소 값 전달에 의한 메소드 호출 방식 
	 static void check(String s) {			//String s= "자바"   : 주소 값 전달
		 System.out.println("전달된 값:" + s); 
	 }										////String s= new String("파이썬")
	
	 
	 
	 // return문 : 메소드를 호출한 곳에 값을 돌려주는 역할
	 // return문은 메소드 가장 마지막 줄에 사용해야 한다.
	 static int check01()  {     //check x 
		 						 //int형으로 선언했기 때문에 아래 메인 메소드에서도 int형으로 일치해야한다.
		 System.out.println("출력");
		 return 50;
	 }
	 
	 
	 
	 //매개변수 + 자료형 둘 다 있는 경우
	 static double check02(int a, double d) {
		 double result = a + d;     // 큰 자료형으로 처리
		 return result;
	 }
	 
	 
	 
	 
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//메인 메소드: 자바 가상 머신만 호출 되는 특별한 메소드
		MethodEx01.check(); 	//check() 메소드 호출
								//같은 메소드 안에 있는 정적 메소드는 클래스명을 생략할 수 있음
								//원칙: 클래스명 일치
		
		check(30);
		check(10, 20.5);
		check('A');
		check(true);
		check("자바");
		check(new String("파이썬"));
		
		check01();		// return문으로 돌려받은 값이 출력되지 않는다.
		int result =check01(); //sol 1>돌려 받은 값을 result변수로 받아서 출력
							   //돌려 받는 값도 int로 일치
		System.out.println("돌려 받은 값1:"+ result);
		System.out.println("돌려 받은 값2:"+ check01());  //sol 2> check01에 돌려 받자마자 syso로 출력함
		
		
		double result2 =check02(50, 3.14);
		System.out.println("돌려 받은 값3:" + result2);
		System.out.println("돌려 받은 값4:" + check02(50, 3.14));
	}

}


