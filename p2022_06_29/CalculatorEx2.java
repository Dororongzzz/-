package p2022_06_29;

//P.232
//메소드 오버로딩(Method Overloading) 예제)
//:한 개의 클래스 안에 동일한 이름을 가진 메소드를 여러개 정의 하는 것

//<메소드 오버로딩 바르게 하는 법>
//* 셋 중 하나 만족
//1.매개변수의 자료형   :자료형을 다르게 기술 
//2.매개변수의 갯수    :매개변수 갯수 다르게 기술
//3.매개변수의 순서    :매개변수 여러개일 때 순서를 바꿔 구분하는 법

//정사각형의 면적을 구하는 메소드)
//2개 메소드 이름 같음
//메소드 오버로딩 type 2):매개 변수 갯수 다르게 기술
//매개변수 1개
class Calculator2 {
	double areaRectangle(double width) {
		return width * width;
	}

//직사각형의 면적을 구하는 메소드)
//매개변수 2개
	double areaRectangle(double width, double height) {
		return width * height;
	}
}

	// 메인 메소드
	public class CalculatorEx2 {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Calculator2 mycal = new Calculator2();

			// 정사각형의 넓이
			// double형 변수 일치
			double result1 = mycal.areaRectangle(10); // width값 전달

			// 직사각형의 넓이
			// double형 변수 일치
			double result2 = mycal.areaRectangle(10, 20); // width, height값 전달

			System.out.println("정사각형의 넓이:" + result1);
			System.out.println("직사각형의 넓이:" + result2);

		}

	}
