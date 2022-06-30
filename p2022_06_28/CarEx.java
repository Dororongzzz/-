package p2022_06_28;

//p.201
//한 개의 파일에 클래스가 2개 있는 예제)
//바이트 코드가 따로 생성되기 때문에 여러개여도 상관 없음
//클래스) 멤버변수 + 생성자 +메소드

class Car{
	//필드(Field)
	String company = "현대 자동차";
	String model = "그랜저";
	String color = "검정";
	int maxSpeed =350;
	int speed;
	
	
	//이 클래스는 메인 메소드가 없어서 컴파일까지만 가능 독립적으로 실행될 수 x 
	public Car() {	// 접근 제어자 + 기본 생성자 : 매개변수x
		System.out.println("생성자 호출 성공");
	}
	
}


//메인 메소드 = 파일명 일치
//소스 코드는 하나지만 파일명을 일치 하지 않으면 바이트 코드 오류 발생
//접근제어자  public은 파일 당 1번만 사용  
public class CarEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//객체 생성
		CarEx car = new CarEx();//멤버가 없는 클래스 호출 : 의미없는 작업
		                        //필드 메소드 생성자 있는 클래스  호출:의미있는 작업 
		Car mycar = new Car();  //heap메모리에 새로운 공간 생성
								//*객체를 생성할 때 생성자가 호출된다.

		System.out.println("제작회사:" + mycar.company);
		System.out.println("모델명:" + mycar.model);
		System.out.println("색깔:" + mycar.color);
		System.out.println("최고속도:" + mycar.maxSpeed);
		System.out.println("현재속도:" + mycar.speed);		//int형이라 자동 0 초기화
		
		//필드 값 변경
		mycar.speed = 60; //필드는 변수이기 때문에 최종값으로 반영 
						  //초기값 수정
		System.out.println("수정된 속도" +mycar.speed);   //60
		
		
		
		
	}

}
