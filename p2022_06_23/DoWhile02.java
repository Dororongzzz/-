package p2022_06_23;

public class DoWhile02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//do ~ while문을 이용해서 1~100까지 홀수,짝수의 합을 구하는 프로그램을 작성하세요?
		
		int i=1, odd=0,even=0;		//초기값
		do {
			if(i%2 == 1) {		//홀수
				odd +=i;        //odd변수에 홀수 값 누적
			}else {				//짝수
				even +=i;		//even변수에 짝수 값 누적
			}
			i++;			//증감식
		}while(i<=100);		//조건식
		
		System.out.println("1~100 홀수의 합 ="+odd );
		System.out.println("1~100 짝수의 합 ="+even);
		
		
	}
		
		
		
		
		
		
	}


