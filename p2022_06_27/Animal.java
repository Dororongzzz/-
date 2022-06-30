package p2022_06_27;

public class Animal {
	  	//사용자 정의 클래스(자료형)
		
	int age;  // (=필드(field), 멤버 변수, 전역변수) :heap메모리에 저장
			  //: 메소드 밖에서 정의 된 변수
			  //:int형 자동 0으로 초기화 (배열과 비슷)
	
	//생성자
	public Animal() {   //멤버 함수 중 하나 (괄호 가짐)
						//반드시 클래스 명과 일치
						// 기본 생성자(Default constructor):매개변수x 생성자
		System.out.println("생성자 호출 성공");   //생성자 역할: 객체 생성과 동시에 호출되어  초기화 
	}
	

	//메인 메소드
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a = 10;   //지역변수 : stack 메모리 영역에 저장
		
		String str = new String("자바");
		

		Animal 			a1	   = 	 new		 Animal();
		//클래스		레퍼러스 변수                  연산자		  생성자 호출 코드 (Animal은 생성자x)
		//생성자가 없으면? : 자동으로 만들어 줌
		
		//System.out.println(age);   //a1이 가진 주소로 "."으로 참조 접근 해야함				
		System.out.println(a1.age);	 //0
		a1.age = 5;                  //초기값 수정
		System.out.println(a1.age);  //5
		
		Animal 		a2	= new 	Animal();
		System.out.println(a2.age);
		
		//a1-a2 주소 값 비교)
		if (a1 == a2) {
			System.out.println("같은 주소");
		} else {
			System.out.println("다른주소");
		}
				

		 
		
	}

}
