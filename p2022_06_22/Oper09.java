package p2022_06_22;

public class Oper09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		5. 확장 대입 연산자(복합 대입 연산자)
//	     +=, -=, *=, /=, %=
//
//	     ex)   a+=b;	// a = a + b;         
//	            a-=b; 	// a = a - b;
//	            a*=b; 	// a = a * b;
//	            a/=b; 	// a = a / b;
//	            a%=b;	// a = a % b;
		
		int a = 10, b = 3;
		System.out.println(a+=b);  //a=a+b      13
		System.out.println(a-=b);  //a=a-b      10   //가장 마지막 값이 13이므로
		System.out.println(a*=b);  //a=a*b      30
		System.out.println(a/=b);  //a=a/b      10
		System.out.println(a%=b);  //a=a%b      1
		

	}

}
