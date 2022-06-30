package p2022_06_22;

public class Oper01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//산술 연산자 :+, -,*, /(몫), %(나머지)
		//%는  나머지로 짞,홀수 판단 시 사용
	
		int a = 10, b =3, c;
		
		c= a + b;
		System.out.println("a+b="+c);
		System.out.println("a+b="+(a+b));		//13
		System.out.println("a+b="+(a-b));		//7
		System.out.println("a+b="+(a*b));		//30
		System.out.println("a+b="+(a/b));		//3(몫) //3.xxx로 나와야 하지만 같은 자료형인
													 	 //int형으로 출력되기때문 
		System.out.println("a+b="+(a%b));		//1(나머지)
 
	//int형과 int형 변수를 산술연산을 수행하면,결과는 int로 처리된다.
	
	}
	}