package p2022_06_29;

//p.227
//클래스 내부에서 메소드 호출 예제): 일반 메소드 안에서 다른 메소드 호출(메인x)
//2개의 클래스
//*자바 메소드 위치 상관 x

class Calculator1 {
	int plus(int x, int y) {
		int result = x + y;            //17
		return result;
	}
	
	//일반 메소드 안에서 plus 메소드 호출:이름만으로 호출 가능
	//int형이지만 double로 재정의 17.0 /2 =8.5 
	double avg(int x, int y) {
		double sum = plus(x,y);			// plus() 메소드 호출
		double result = sum / 2;
		return result;
	}
	
	void execute() {
		double result = avg(7,10);		//avg() 메소드 호출
										//avg:호출하라
		println("실행결과:" + result);		//println() 메소드 호츌
	}
	
	//println메소드 만들어 위 println호출
	void println(String message) {
		System.out.println(message);
	}
	


	
}


//메인 메소드
public class CalculatorEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator1 mycal = new Calculator1();
		
		mycal.execute(); 	//execute() 메소드 호출
							//
//		execute();			//오류 발생
		

		//일반메소드:일반메소드 안에서 다른 메소드 호출
		//       :이름만으로 호출 가능
		//메인메소드:cal1 객체 생성하고 나서 호출 가능 /정적메소드가 아니기 때문
		//			생성된 객체.execute 호출

	}   

}
