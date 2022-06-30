package p2022_06_23;

public class For02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 1 ~ 10까지 합을 구하는 프로그램을 작성하세요?
		
		int sum =0;   	//지역 변수(local variale) / 합이 누적되는 변수
							// 자동 초기값 설정x
							//메인 메소드 안에서만 사용 가능
							//초기값 0으로 하는 이유: 더하기 연산에 영향을 주지 않기 때문
		
		for(int i=1; i<=10; i++)  {//i : for문 안에서만 사용 가능
			sum = sum + i;  	//합을 누적시켜주는 알고리즘
								//sum += i; (확장대입 연산자로 표현한 식)
			           		
//			1   = 0  + 1	1까지 누적해야 하는데 0으로 초기화하지 않으면 누적 할 수가 없어 오류	
//			3   = 1  + 2
//			6   = 3  + 3
//			10  = 6  + 4
			
			System.out.println("1~"+i+"="+sum);      //1~10까지의 합을 보여주는 코드
			
			
			
		}
		System.out.println("sum="+sum);
//		System.out.println(i);    지역변수 i는 for문 안에서만 사용 가능  밖에 찍으면 오류발생
		
		//같은 지역 변수지만 i는 for문 안에서 정의 되었고 sum은 메인 메소드 안에서 정의 되었기 떄문에 오류x
		
		
		
		
		
		
		
		
	}

}
