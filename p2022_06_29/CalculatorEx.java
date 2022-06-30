package p2022_06_29;

//p.217 ~ 218
//메소드 예제 1)메소드의 매개변수  기본자료형: 값으로 전달 :call by value
//2개의 클래스(클래스 1(in 사용자 정의 메소드 4개)+클래스2(메인 메소드)) 

class Calculator{
	//메소드 1)default접근제어자 + void 
	//사용자 정의 메소드 + default 접근제어자(자신의 클래스 ,같은 패키지(폴더)))
	//ex> 접근제어자 	(static)   void/자료형            사용자 정의 메소드(매개변수)      +return
	void powerOn() {
		System.out.println("전원을 켭니다.");
		 return; //생략 가능
	}

	//메소드 2)default접근제어자 + 자료형 + return(메소드 맨 마지막)
int plus (int x, int y) {   //매개변수, 지역 변수(메소드 안에서 정의됐으므로:메소드 종료 후 스택에서 제외): x, y, result
	int result = x +y;
	return result;
	//System.out.println("");  return 구문 메소드 맨 마지막x 시 오류 발생
}
//return 문: plus()메소드를 호출한  곳에 값을 돌려주는 역할
//return 문은메소드 가장 마지막 줄에 사용해야 한다.


//메소드3)default접근제어자 + 자료형 + return(메소드 맨 마지막)
//자동형 변환 일어남 2):10/4=2.5 소숫점 이하 버리므로 double로 처리
//분모, 분자 중 하나에 (double)붙여줌
//double(8byte) >  int(4byte)  : 더 큰 자료형으로 처리 
//→ 자료형에 맞는 매개변수 전달
double divide (int x, int y) {
	double result = x / (double)y;
	return result;
}
//메소드 4)default접근제어자 + void 
void powerOff() {
	System.out.println("전원을 끕니다.");
}



}
//메인 메소드
public class CalculatorEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator cal = new Calculator();
		cal.powerOn();
		
		int result1 = cal.plus(5, 6);   //int형 값 전달: call by value 
		System.out.println("result1:" + result1);
		
		//자동형 변환 일어남 1)
		//int(4byte) >  byte(1byte)  : 더 큰 자료형으로 처리 
		byte x = 10;
		byte y = 4;
		
		//자동형 변환 일어남 2) 때문에 결과를 받는 변수 double로 처리
		double result2 =cal.divide(x, y);
		System.out.println("result2:" + result2);
		
		cal.powerOff();
		
	
		
		
		
		

	}

}
